package modelo.Factory;

import modelo.Usuario;

/**
 * Interfaz del patrón Factory Method para la creación de usuarios.
 *
 * En esta interfaz defino el método que todas las fábricas de usuarios deben implementar.
 * La idea es que cualquier clase que use este contrato sepa cómo crear los distintos tipos de usuarios
 * sin depender directamente de las clases concretas.
 */
public interface UsuarioFactory {

  /**
   * Método que se encarga de crear un usuario según el tipo especificado.
   *
   * Cada implementación de esta interfaz decide cómo construir los objetos.
   * En mi caso, la clase {@link modelo.Factory.UsuarioConcretoFactory} es la que se encarga
   * de hacer la lógica interna y devolver el tipo de usuario correspondiente.
   *
   * @param tipoUsuario Tipo de usuario que quiero crear (por ejemplo: "Cliente", "Administrador" o "Repartidor")
   * @param nombre Nombre del usuario
   * @param id Identificación del usuario
   * @param direccion Dirección del usuario
   * @param telefono Teléfono del usuario
   * @return Un objeto {@link Usuario} del tipo correspondiente al parámetro recibido
   */
  Usuario crearUsuario(String tipoUsuario, String nombre,
      String id, String direccion, String telefono);
}
