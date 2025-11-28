package services;

import modelo.Usuario;
import modelo.Pedido;
import modelo.Repartidor;
import modelo.Administrador;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que actúa como mediador entre los diferentes objetos del sistema.
 *
 * En esta clase centralizo la comunicación entre los usuarios, los pedidos y
 * las clases que dependen de ellos. De esta manera, evito que las clases se
 * comuniquen directamente y reduzco el acoplamiento del sistema.
 */
public class Mediator implements MediatorInterfaz {

  private List<Usuario> usuarios;
  private List<Pedido> pedidos;
  private Repartidor repartidorUnico;
  private Administrador administradorUnico;

  /** 
   * Constructor del mediador.
   *
   * Aquí inicializo las listas de usuarios y pedidos, además de dejar vacías
   * las referencias al repartidor y al administrador únicos.
   */
  public Mediator() {
    usuarios = new ArrayList<>();
    pedidos = new ArrayList<>();
    repartidorUnico = null;
    administradorUnico = null;
  }

  /**
   * Registro un nuevo usuario en el sistema.
   *
   * Antes de registrarlo, verifico que no exista otro usuario con la misma
   * identificación. Si el usuario es un administrador o repartidor, guardo
   * su referencia como instancia única dentro del mediador.
   *
   * @param usuario Objeto del tipo {@link Usuario} que deseo registrar
   * @return {@code true} si el usuario fue agregado correctamente,
   *         {@code false} si ya existía otro con la misma identificación
   */
  @Override
  public boolean registrarUsuario(Usuario usuario) {
    if (usuarios.stream()
        .anyMatch(u -> u.getIdentificacion().equals(usuario.getIdentificacion()))) {
      return false;
    }

    usuarios.add(usuario);

    // Si es un tipo especial lo guardo como instancia única
    if (usuario instanceof Repartidor) {
      repartidorUnico = (Repartidor) usuario;
    } else if (usuario instanceof Administrador) {
      administradorUnico = (Administrador) usuario;
    }

    return true;
  }

  /**
   * Envío un pedido a través del mediador.
   *
   * Aquí agrego el pedido a la lista general y, si existe un repartidor único,
   * se le asigna automáticamente. Además, actualizo la referencia del pedido
   * con el repartidor que lo recibió.
   *
   * @param pedido Objeto del tipo {@link Pedido} que deseo enviar
   */
  @Override
  public void enviarPedido(Pedido pedido) {
    pedidos.add(pedido);
    if (repartidorUnico != null) {
      repartidorUnico.getPedidosAsignados().add(pedido);
      pedido.setRepartidor(repartidorUnico);
    }
  }

  /**
   * Elimino un pedido del sistema según su identificador.
   *
   * @param idPedido Identificador del pedido que quiero eliminar
   * @return {@code true} si el pedido fue eliminado,
   *         {@code false} si no se encontró
   */
  public boolean eliminarPedido(String idPedido) {
    return pedidos.removeIf(p -> p.getIdPedido().equals(idPedido));
  }

  /**
   * Obtengo la lista completa de usuarios registrados.
   *
   * @return Lista de objetos {@link Usuario}
   */
  public List<Usuario> getUsuarios() {
    return usuarios;
  }

  /**
   * Obtengo la lista completa de pedidos registrados.
   *
   * @return Lista de objetos {@link Pedido}
   */
  public List<Pedido> getPedidos() {
    return pedidos;
  }

  /**
   * Devuelvo los pedidos asignados al repartidor único.
   *
   * Si aún no hay un repartidor registrado, retorno una lista vacía.
   *
   * @return Lista de pedidos asignados al repartidor
   */
  public List<Pedido> obtenerPedidosAsignadosRepartidor() {
    if (repartidorUnico != null) {
      return repartidorUnico.getPedidosAsignados();
    }
    return new ArrayList<>();
  }
}
