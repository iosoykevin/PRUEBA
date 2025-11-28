package modelo;

import services.Mediator;
import java.util.List;

/**
 * Representa a un usuario de tipo Administrador dentro del sistema.
 *
 * Desde esta clase manejo las funciones específicas del administrador,
 * aunque por ahora solo extiendo la clase {@link Usuario}. 
 * Más adelante podría agregar métodos que me permitan gestionar pedidos
 * o usuarios a través del {@link Mediator}.
 */
public class Administrador extends Usuario {

  /** Referencia al mediador para coordinar la comunicación entre objetos. */
  private Mediator mediator;

  /**
   * Constructor del Administrador.
   *
   * Aquí inicializo el usuario con su nombre e identificación.
   * No necesito dirección ni teléfono, por eso los dejo vacíos.
   *
   * @param nombre Nombre del administrador
   * @param identificacion ID del administrador
   */
  public Administrador(String nombre, String identificacion) {
    super(nombre, identificacion, "", "", "Administrador");
  }
}
