package services;

import controlador.Facade;
import modelo.Usuario;
import modelo.Pedido;
import modelo.Cliente;
import vista.Vista;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 * En esta clase manejo todos los métodos que conectan la vista con la lógica del sistema.
 *
 * Básicamente, aquí gestiono las acciones de los botones del JFrame, trabajo con la
 * {@link Facade} para acceder a la lógica del negocio y actualizo las tablas y mensajes
 * que se muestran al usuario.
 */
public class Metodos {

  /** Objeto fachada que centraliza las operaciones del sistema. */
  private Facade facade;

  /** Vista principal que contiene todos los elementos gráficos. */
  private Vista vista;

  /**
   * Constructor principal donde recibo la fachada y la vista.
   *
   * @param facade Objeto que se encarga de coordinar la lógica del sistema.
   * @param vista Ventana principal (JFrame) que muestra la interfaz al usuario.
   */
  public Metodos(Facade facade, Vista vista) {
    this.facade = facade;
    this.vista = vista;
  }

  /**
   * Creo un nuevo cliente a partir de los datos ingresados en la vista.
   *
   * @param nombre Nombre del cliente.
   * @param id Identificación del cliente.
   * @param direccion Dirección del cliente.
   * @param telefono Teléfono del cliente.
   */
  public void crearCliente(String nombre, String id, String direccion, String telefono) {
    boolean exito = facade.registrarUsuario("Cliente", nombre, id, direccion, telefono);
    if (exito) {
      limpiarCamposCrearUsuario();
      mostrarMensaje("Cliente creado correctamente.");
    } else {
      mostrarMensaje("Error: El cliente ya existe o los datos son inválidos.");
    }
  }

  /**
   * Permito el ingreso de un usuario validando su tipo, nombre e identificación.
   *
   * @param nombre Nombre del usuario que intenta ingresar.
   * @param id Identificación del usuario.
   * @param tipo Tipo de usuario (Cliente, Administrador o Repartidor).
   */
  public void ingresarUsuario(String nombre, String id, String tipo) {
    boolean exito = facade.ingresarUsuario(nombre, id, tipo);
    if (exito) {
      mostrarPestanaSegunTipo(tipo);
      mostrarMensaje("Ingreso exitoso.");
    } else {
      mostrarMensaje("Error en usuario o credenciales.");
    }
  }

  /**
   * Permito que un cliente realice un pedido nuevo.
   *
   * @param contenido Contenido del pedido.
   * @param direccion Dirección de entrega.
   * @param telefono Teléfono de contacto.
   */
  public void comprar(String contenido, String direccion, String telefono) {
    Usuario usuarioActual = facade.getUsuarioActual();

    if (usuarioActual != null
        && usuarioActual.getTipoUsuario().equalsIgnoreCase("Cliente")) {

      Cliente cliente = (Cliente) usuarioActual;
      cliente.setDireccion(direccion);
      cliente.setTelefono(telefono);

      String idPedido = "PED-" + System.currentTimeMillis();
      boolean exito = facade.crearPedido(idPedido, contenido, cliente);

      if (exito) {
        limpiarCamposCompra();
        mostrarMensaje("Pedido creado exitosamente.");
      } else {
        mostrarMensaje("Error al crear el pedido.");
      }

    } else {
      mostrarMensaje("Usuario no autorizado para crear pedidos.");
    }
  }

  /** Actualizo la tabla del repartidor para mostrar los pedidos asignados. */
  public void actualizarTablaRepartidor() {
    DefaultTableModel model = (DefaultTableModel) vista.tablarepartidor.getModel();
    model.setRowCount(0);
    llenarTablaRepartidor();
  }

  /** Lleno la tabla de repartidor con los pedidos actuales. */
  private void llenarTablaRepartidor() {
    DefaultTableModel model = (DefaultTableModel) vista.tablarepartidor.getModel();
    model.setRowCount(0);

    List<Pedido> pedidos = facade.verPedidosAsignados();

    for (Pedido pedido : pedidos) {
      Object[] fila = new Object[] {
        pedido.getCliente().getNombre(),
        pedido.getCliente().getDireccion(),
        pedido.getContenido()
      };
      model.addRow(fila);
    }
    
    
  }

  /** Elimino el primer pedido asignado al repartidor y actualizo la tabla. */
  public void eliminarPrimerPedidoRepartidor() {
    List<Pedido> pedidos = facade.verPedidosAsignados();
    

    if (pedidos.isEmpty()) {
      mostrarMensaje("No hay pedidos para eliminar.");
      return;
    }

    Pedido eliminado = pedidos.remove(0);
    actualizarTablaRepartidor();
    mostrarMensaje("Pedido de " + eliminado.getCliente().getNombre() + " eliminado correctamente.");
  }

  /** Muestro todos los pedidos existentes en la tabla del administrador. */
  public void mostrarPedidosEnTabla() {
    Usuario usuarioActual = facade.getUsuarioActual();
    if (usuarioActual == null
        || !usuarioActual.getTipoUsuario().equalsIgnoreCase("Administrador")) {
      mostrarMensaje("Acceso denegado. Solo el administrador puede ver los pedidos.");
      return;
    }

    DefaultTableModel model = (DefaultTableModel) vista.tablamostrarpedidos.getModel();
    model.setRowCount(0);

    List<Pedido> pedidos = facade.obtenerTodosPedidos();
    for (Pedido p : pedidos) {
      Object[] fila = new Object[] {p.getCliente().getNombre(), p.getContenido()};
      model.addRow(fila);
    }
  }

  /** Muestro todos los usuarios registrados en la tabla del administrador. */
  public void mostrarUsuariosEnTabla() {
    Usuario usuarioActual = facade.getUsuarioActual();
    if (usuarioActual == null
        || !usuarioActual.getTipoUsuario().equalsIgnoreCase("Administrador")) {
      mostrarMensaje("Acceso denegado. Solo el administrador puede ver esta información.");
      return;
    }

    DefaultTableModel model = (DefaultTableModel) vista.tablamostrarusuarios.getModel();
    model.setRowCount(0);

    List<Usuario> usuarios = facade.obtenerTodosUsuarios();

    for (Usuario u : usuarios) {
      Object[] fila =
          new Object[] {
            u.getIdentificacion(),
            u.getNombre(),
            u.getTipoUsuario(),
            u.getDireccion(),
            u.getTelefono()
          };
      model.addRow(fila);
    }
  }

  /** Limpio los campos del formulario de creación de usuario. */
  public void limpiarCamposCrearUsuario() {
    vista.txtnombre.setText("");
    vista.txtid.setText("");
    vista.cbusuario.setSelectedIndex(0);
    vista.txtdireccion.setText("");
    vista.txttelefono.setText("");
  }

  /** Limpio los campos del formulario de compra. */
  public void limpiarCamposCompra() {
    vista.cbcontenido.setSelectedIndex(0);
    vista.txtdireccion.setText("");
    vista.txttelefono.setText("");
  }

  /**
   * Muestro un mensaje emergente con el texto que le paso.
   *
   * @param mensaje Texto a mostrar en el JOptionPane.
   */
  public void mostrarMensaje(String mensaje) {
    JOptionPane.showMessageDialog(vista, mensaje);
  }

  /**
   * Según el tipo de usuario, muestro la pestaña correspondiente.
   *
   * @param tipoUsuario Tipo de usuario actual.
   */
  public void mostrarPestanaSegunTipo(String tipoUsuario) {
    switch (tipoUsuario.toLowerCase()) {
      case "cliente":
        vista.pestaña.setSelectedComponent(vista.panelcliente);
        break;
      case "administrador":
        vista.pestaña.setSelectedComponent(vista.paneladministrador);
        break;
      case "repartidor":
        vista.pestaña.setSelectedComponent(vista.panelrepartidor);
        break;
      default:
        break;
    }
  }

  /** Actualizo todas las tablas de pedidos en la vista. */
  public void actualizarTablasPedidos() {
    mostrarPedidosEnTabla();
  }

  /** Muestro los pedidos asignados al repartidor. */
  public void mostrarPedidosRepartidor() {
    actualizarTablaRepartidor();
  }

  /** Oculto todas las pestañas principales de la vista. */
  public void ocultarTodasPestanas() {
    vista.panelcliente.setVisible(false);
    vista.paneladministrador.setVisible(false);
    vista.panelrepartidor.setVisible(false);
  }

  /** Muestro la pestaña de inicio en la vista. */
  public void mostrarPestanaInicio() {
    vista.pestaña.setSelectedComponent(vista.panelinicio);
  }
}
