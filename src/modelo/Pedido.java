package modelo;

/**
 * Representa un pedido dentro del sistema.
 *
 * En esta clase manejo toda la información relacionada con un pedido,
 * incluyendo el cliente que lo realiza y el repartidor que lo entrega.
 */
public class Pedido {

  /** Identificador único del pedido. */
  private String idPedido;

  /** Contenido o descripción del pedido. */
  private String contenido;

  /** Cliente que realizó el pedido. */
  private Cliente cliente;

  /** Repartidor encargado de entregar el pedido. */
  private Repartidor repartidor;

  /**
   * Constructor de la clase Pedido.
   *
   * Aquí inicializo todos los datos del pedido: su ID, contenido,
   * el cliente que lo solicita y el repartidor asignado.
   *
   * @param idPedido Identificador único del pedido
   * @param contenido Descripción o detalle del pedido
   * @param cliente Cliente que realiza el pedido
   * @param repartidor Repartidor asignado (puede ser null si aún no se ha asignado)
   */
  public Pedido(String idPedido, String contenido, Cliente cliente, Repartidor repartidor) {
    this.idPedido = idPedido;
    this.contenido = contenido;
    this.cliente = cliente;
    this.repartidor = repartidor;
  }

  /**
   * Devuelve el ID del pedido.
   *
   * @return ID del pedido
   */
  public String getIdPedido() {
    return idPedido;
  }

  /**
   * Asigna un nuevo ID al pedido.
   *
   * @param idPedido Nuevo identificador del pedido
   */
  public void setIdPedido(String idPedido) {
    this.idPedido = idPedido;
  }

  /**
   * Devuelve el contenido o descripción del pedido.
   *
   * @return Contenido del pedido
   */
  public String getContenido() {
    return contenido;
  }

  /**
   * Asigna el contenido o descripción del pedido.
   *
   * @param contenido Nuevo contenido del pedido
   */
  public void setContenido(String contenido) {
    this.contenido = contenido;
  }

  /**
   * Devuelve el cliente que realizó este pedido.
   *
   * @return Cliente asociado al pedido
   */
  public Cliente getCliente() {
    return cliente;
  }

  /**
   * Asigna un cliente al pedido.
   *
   * @param cliente Cliente asociado al pedido
   */
  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  /**
   * Devuelve el repartidor encargado de entregar este pedido.
   *
   * @return Repartidor asignado al pedido
   */
  public Repartidor getRepartidor() {
    return repartidor;
  }

  /**
   * Asigna un repartidor al pedido.
   *
   * @param repartidor Repartidor encargado del pedido
   */
  public void setRepartidor(Repartidor repartidor) {
    this.repartidor = repartidor;
  }
}
