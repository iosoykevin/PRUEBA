package modelo;

import java.util.ArrayList;

/**
 * Representa a un repartidor dentro del sistema.
 *
 * En esta clase manejo la información específica de los repartidores,
 * incluyendo los pedidos que tienen asignados.
 */
public class Repartidor extends Usuario {

  /** Lista de pedidos asignados al repartidor. */
  private ArrayList<Pedido> pedidosAsignados;

  /**
   * Constructor de la clase Repartidor.
   *
   * Aquí inicializo al repartidor con su nombre e identificación.
   * No tiene dirección ni teléfono definidos porque no los necesito
   * para esta parte del sistema, y además le asigno un tipo de usuario "Repartidor".
   *
   * @param nombre Nombre del repartidor
   * @param identificacion Identificación del repartidor
   */
  public Repartidor(String nombre, String identificacion) {
    super(nombre, identificacion, "", "", "Repartidor");
    this.pedidosAsignados = new ArrayList<>();
  }

  /**
   * Devuelve la lista de pedidos asignados al repartidor.
   *
   * @return Lista de pedidos asignados
   */
  public ArrayList<Pedido> getPedidosAsignados() {
    return pedidosAsignados;
  }
}

