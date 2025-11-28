package modelo.Factory;

import modelo.Administrador;
import modelo.Cliente;
import modelo.Repartidor;
import modelo.Usuario;

/**
 * Implementación concreta del patrón Factory Method para la creación de usuarios.
 *
 * En esta clase me encargo de instanciar los diferentes tipos de usuarios del sistema
 * (Cliente, Administrador o Repartidor) dependiendo del tipo que se solicite.
 * 
 * Esto me ayuda a centralizar la creación de objetos y evitar usar "new" por todo el código.
 */
public class UsuarioConcretoFactory implements UsuarioFactory {

  /**
   * Crea un nuevo usuario según el tipo especificado.
   *
   * Aquí utilizo un switch para decidir qué clase de usuario crear.
   * Si el tipo no coincide con ninguno de los definidos, lanzo una excepción
   * para evitar errores silenciosos.
   *
   * @param tipoUsuario Tipo de usuario que quiero crear (por ejemplo: "Cliente", "Administrador", "Repartidor")
   * @param nombre Nombre del usuario
   * @param id Identificación del usuario
   * @param direccion Dirección del usuario
   * @param telefono Teléfono del usuario
   * @return una instancia del tipo de usuario correspondiente
   * @throws IllegalArgumentException si el tipo de usuario no es válido
   */
  @Override
  public Usuario crearUsuario(String tipoUsuario, String nombre,
      String id, String direccion, String telefono) {

    switch (tipoUsuario) {
      case "Cliente":
        // Creo un cliente con sus datos básicos
        return new Cliente(nombre, id, direccion, telefono);

      case "Administrador":
        // Solo necesita nombre e identificación
        return new Administrador(nombre, id);

      case "Repartidor":
        // En este caso no paso zona, porque se define después
        return new Repartidor(nombre, id);

      default:
        // Si el tipo no existe, lanzo una excepción
        throw new IllegalArgumentException("Tipo de usuario no soportado");
    }
  }
}

