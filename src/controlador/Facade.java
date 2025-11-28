package controlador;

import java.util.Collections;
import java.util.List;
import modelo.*;
import modelo.Factory.UsuarioConcretoFactory;
import modelo.Factory.UsuarioFactory;
import services.Mediator;

/**
 * Clase Facade que uso como punto de entrada para toda la lógica del sistema.
 *
 * Básicamente esta clase simplifica la comunicación entre la vista/controlador
 * y el resto de las clases del modelo. En lugar de que la vista o el controlador
 * hablen directamente con varias clases, yo centralizo esas llamadas acá.
 *
 * Aplico el patrón Facade para mantener el código más limpio y fácil de entender.
 */
public class Facade {

  private Mediator mediator;
  private Usuario usuarioActual;
  private UsuarioFactory factory;

  /** 
   * Constructor principal. 
   * Aquí inicializo el mediador, el usuario actual (vacío) y la fábrica de usuarios.
   */
  public Facade() {
    this.mediator = new Mediator();
    this.usuarioActual = null;
    this.factory = new UsuarioConcretoFactory();
  }

  /**
   * Crea un administrador único al iniciar el sistema.
   *
   * @param nombre Nombre del administrador
   * @param id Identificación del administrador
   */
  public void crearAdministradorUnico(String nombre, String id) {
    Administrador administrador = new Administrador(nombre, id);
    mediator.registrarUsuario(administrador);
  }

  /**
   * Crea un repartidor único al iniciar el sistema.
   *
   * @param nombre Nombre del repartidor
   * @param id Identificación del repartidor
   */
  public void crearRepartidorUnico(String nombre, String id) {
    Repartidor repartidor = new Repartidor(nombre, id);
    mediator.registrarUsuario(repartidor);
  }

  /**
   * Registra un nuevo usuario en el sistema usando la fábrica.
   * 
   * @param tipo Tipo de usuario (Cliente, Administrador o Repartidor)
   * @param nombre Nombre del usuario
   * @param id Identificación del usuario
   * @param direccion Dirección del usuario
   * @param telefono Teléfono del usuario
   * @return true si el registro fue exitoso, false si hubo algún problema
   */
  public boolean registrarUsuario(String tipo, String nombre, String id, String direccion, String telefono) {
    Usuario nuevo = factory.crearUsuario(tipo, nombre, id, direccion, telefono);
    return mediator.registrarUsuario(nuevo);
  }

  /**
   * Permite que un usuario inicie sesión en el sistema.
   *
   * @param nombre Nombre ingresado por el usuario
   * @param id Identificación ingresada
   * @param tipo Tipo de usuario que intenta ingresar
   * @return true si las credenciales coinciden, false en caso contrario
   */
  public boolean ingresarUsuario(String nombre, String id, String tipo) {
    for (Usuario usuario : mediator.getUsuarios()) {
      if (usuario.getIdentificacion().equals(id)
          && usuario.getNombre().equalsIgnoreCase(nombre)
          && usuario.getTipoUsuario().equalsIgnoreCase(tipo)) {
        usuarioActual = usuario;
        return true;
      }
    }
    return false;
  }

  /**
   * Crea un pedido y lo envía a través del mediador.
   *
   * @param idPedido Identificador del pedido
   * @param contenido Contenido del pedido
   * @param cliente Cliente que realiza el pedido
   * @return true si se pudo crear el pedido, false si el cliente era nulo
   */
  public boolean crearPedido(String idPedido, String contenido, Cliente cliente) {
    if (cliente == null) return false;

    Pedido pedido = new Pedido(idPedido, contenido, cliente, null);
    mediator.enviarPedido(pedido);
    cliente.agregarPedido(pedido);
    return true;
  }

  /**
   * Devuelve la lista de pedidos que pertenecen a un cliente específico.
   *
   * @param cliente Cliente del cual quiero ver sus pedidos
   * @return Lista con los pedidos del cliente
   */
  public List<Pedido> verPedidosCliente(Cliente cliente) {
    return mediator.getPedidos().stream()
        .filter(p -> p.getCliente().equals(cliente))
        .toList();
  }

  /**
   * Devuelve los pedidos asignados al repartidor actual.
   *
   * @return Lista de pedidos si el usuario actual es repartidor,
   *         o una lista vacía en caso contrario.
   */
  public List<Pedido> verPedidosAsignados() {
    if (!(usuarioActual instanceof Repartidor)) {
      return Collections.emptyList();
    }
    List<Pedido> pedidosAsignados = ((Repartidor) usuarioActual).getPedidosAsignados();
    return pedidosAsignados != null ? pedidosAsignados : Collections.emptyList();
  }

  /**
   * Obtiene la lista de todos los usuarios registrados.
   *
   * @return Lista con todos los usuarios
   */
  public List<Usuario> obtenerTodosUsuarios() {
    return mediator.getUsuarios();
  }

  /**
   * Obtiene todos los pedidos realizados en el sistema.
   *
   * @return Lista con todos los pedidos
   */
  public List<Pedido> obtenerTodosPedidos() {
    return mediator.getPedidos();
  }

  /**
   * Obtiene los pedidos que pertenecen a un cliente por su identificación.
   *
   * @param idCliente Identificación del cliente
   * @return Lista de pedidos filtrada por cliente
   */
  public List<Pedido> obtenerPedidosPorCliente(String idCliente) {
    return mediator.getPedidos().stream()
        .filter(p -> p.getCliente().getIdentificacion().equals(idCliente))
        .toList();
  }

  /**
   * Elimina un pedido del sistema según su ID.
   *
   * @param idPedido Identificador del pedido a eliminar
   */
  public void eliminarPedido(String idPedido) {
    boolean exito = mediator.eliminarPedido(idPedido);
    if (exito) {
      System.out.println("Pedido eliminado correctamente.");
    } else {
      System.out.println("No se encontró el pedido con ese ID.");
    }
  }

  /**
   * Devuelve el usuario que está actualmente activo en el sistema.
   *
   * @return Usuario actual (o null si no hay sesión iniciada)
   */
  public Usuario getUsuarioActual() {
    return usuarioActual;
  }
}
