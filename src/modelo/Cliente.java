package modelo;

import java.util.ArrayList;
import services.Mediator;
import java.util.List;

/**
 * Representa a un usuario de tipo Cliente dentro del sistema.
 *
 * En esta clase manejo la información de los clientes, incluyendo su lista de pedidos.
 * Cada cliente puede tener varios pedidos, los cuales se almacenan en un {@link ArrayList}.
 */
public class Cliente extends Usuario {

  /** Lista de pedidos asociados al cliente. */
  private ArrayList<Pedido> pedidos;

  /**
   * Constructor del cliente.
   *
   * Aquí inicializo los datos del cliente (nombre, identificación, dirección y teléfono)
   * y creo la lista donde voy a guardar los pedidos que realice.
   *
   * @param nombre Nombre del cliente
   * @param identificacion Identificación del cliente
   * @param direccion Dirección del cliente
   * @param telefono Teléfono del cliente
   */
  public Cliente(String nombre, String identificacion, String direccion, String telefono) {
    super(nombre, identificacion, direccion, telefono, "Cliente");
    this.direccion = direccion;
    this.telefono = telefono;
    this.pedidos = new ArrayList<>();
  }

  /**
   * Devuelve la lista de pedidos que tiene este cliente.
   *
   * @return Lista de pedidos del cliente
   */
  public ArrayList<Pedido> getPedidos() {
    return pedidos;
  }

  /**
   * Agrega un pedido nuevo a la lista del cliente.
   *
   * Uso este método cuando el cliente realiza una nueva compra o solicitud.
   *
   * @param pedido Pedido que quiero asociar al cliente
   */
  public void agregarPedido(Pedido pedido) {
    pedidos.add(pedido);
  }
}


