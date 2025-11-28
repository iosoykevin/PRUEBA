package controlador;

import modelo.Usuario;
import vista.Vista;
import services.Metodos;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 * Clase que actúa como el controlador principal del sistema.
 * Conecta la vista con la lógica de negocio por medio del
 * patrón Facade y la clase Metodos.
 */
public class Controlador {

  private Facade facade;
  private Vista vista;
  private Metodos metodos;

  /**
   * Constructor principal. Inicializa vista, usuarios únicos y eventos.
   */
  public Controlador() {
    facade = new Facade();
    iniciarVista();
    inicializarUsuariosUnicos();
    metodos = new Metodos(facade, vista);
    agregarRestriccionesTexto();
    asociarEventos();
  }

  /** Inicializo la ventana principal y la hago visible. */
  private void iniciarVista() {
    vista = new Vista();
    vista.setVisible(true);
  }

  /**
   * Devuelve el usuario que actualmente está usando el sistema.
   *
   * @return el usuario activo (Administrador, Cliente o Repartidor)
   */
  public Usuario getUsuarioActual() {
    return facade.getUsuarioActual();
  }

  /** Creo los usuarios que deben existir por defecto al iniciar el sistema. */
  private void inicializarUsuariosUnicos() {
    facade.crearAdministradorUnico("Admin", "100");
    facade.crearRepartidorUnico("Juan", "200");
  }

  /** 
   * Asocio todos los botones de la vista con las acciones que deben ejecutar.
   */
  private void asociarEventos() {

    // Evento para crear un nuevo cliente
    vista.btncrear.addActionListener(e -> metodos.crearCliente(
        vista.txtnombre.getText(),
        vista.txtid.getText(),
        vista.txtdireccion.getText(),
        vista.txttelefono.getText()));

    // Evento para ingresar al sistema
    vista.btningresar.addActionListener(e -> {
      metodos.ingresarUsuario(
          vista.txtnombreingresar.getText(),
          vista.txtidingresar.getText(),
          vista.cbusuarioingresar.getSelectedItem().toString());

      // Limpio campos después de ingresar
      limpiarCamposIngreso();
    });

    // Evento para crear un pedido
    vista.btncomprar.addActionListener(e -> metodos.comprar(
        (String) vista.cbcontenido.getSelectedItem(),
        vista.txtdireccion.getText(),
        vista.txttelefono.getText()));

    // Eventos para mostrar información
    vista.btnmostrarusuarios.addActionListener(e -> metodos.mostrarUsuariosEnTabla());
    vista.btnmostrarpedidos.addActionListener(e -> metodos.mostrarPedidosEnTabla());
    vista.btnmostrarpedidosrepartidor.addActionListener(e -> metodos.mostrarPedidosRepartidor());
    vista.btnactualizar.addActionListener(e -> metodos.eliminarPrimerPedidoRepartidor());
  }

  /**
   * Agrega restricciones de entrada a los campos de texto.
   */
  private void agregarRestriccionesTexto() {
    // Solo letras
    soloLetras(vista.txtnombre);
    soloLetras(vista.txtnombreingresar);

    // Solo números sin espacios
    soloNumeros(vista.txtid);
    soloNumeros(vista.txtidingresar);
    soloNumeros(vista.txttelefono);

    // Letras y números sin símbolos
    letrasYNumeros(vista.txtdireccion);
  }

  /** Permite solo letras (sin números, ni símbolos, ni espacios múltiples). */
  private void soloLetras(JTextField campo) {
    campo.addKeyListener(new KeyAdapter() {
      @Override
      public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
          e.consume(); // No se escribe
        }
      }
    });
  }

  /** Permite solo números sin espacios ni letras. */
  private void soloNumeros(JTextField campo) {
    campo.addKeyListener(new KeyAdapter() {
      @Override
      public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!Character.isDigit(c)) {
          e.consume();
        }
      }
    });
  }

  /** Permite letras y números, sin símbolos ni caracteres especiales. */
  private void letrasYNumeros(JTextField campo) {
    campo.addKeyListener(new KeyAdapter() {
      @Override
      public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
          e.consume();
        }
      }
    });
  }

  /** Limpia los campos del formulario de ingreso. */
  private void limpiarCamposIngreso() {
    vista.txtnombreingresar.setText("");
    vista.txtidingresar.setText("");
    vista.cbusuarioingresar.setSelectedIndex(0);
  }
}

