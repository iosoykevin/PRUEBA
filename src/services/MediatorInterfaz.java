package services;

import modelo.Usuario;
import modelo.Pedido;

/**
 * Interfaz que define el contrato para la comunicación entre los objetos del sistema.
 *
 * Aquí declaro los métodos que debe implementar el mediador para coordinar
 * la interacción entre usuarios y pedidos sin que las clases se comuniquen directamente.
 */
public interface MediatorInterfaz {

  /**
   * Registro un nuevo usuario dentro del sistema.
   *
   * Cada implementación debe encargarse de validar si el usuario ya existe
   * y de manejar correctamente su almacenamiento.
   *
   * @param usuario Objeto del tipo {@link Usuario} que deseo registrar
   * @return {@code true} si el usuario fue registrado correctamente,
   *         {@code false} si ya existía o no se pudo agregar
   */
  boolean registrarUsuario(Usuario usuario);

  /**
   * Envío un pedido a través del mediador.
   *
   * Este método se encarga de distribuir el pedido al componente correspondiente,
   * por ejemplo, asignarlo automáticamente a un repartidor disponible.
   *
   * @param pedido Objeto del tipo {@link Pedido} que deseo enviar
   */
  void enviarPedido(Pedido pedido);
}
