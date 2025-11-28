package mensajeria2;

import controlador.Controlador;
import javax.swing.SwingUtilities;

/**
 * Clase principal del proyecto de mensajería.
 *
 * Desde aquí inicio todo el sistema. El método main se encarga
 * de lanzar la aplicación y crear el controlador, que a su vez
 * genera la vista, la fachada y conecta toda la lógica.
 */
public class Mensajeria2 {

  /**
   * Método principal de la aplicación.
   *
   * Uso SwingUtilities.invokeLater() para asegurarme de que
   * toda la parte gráfica (Swing) se ejecute en el hilo adecuado.
   *
   * @param args Argumentos de línea de comandos (no los uso aquí)
   */
  public static void main(String[] args) {

    SwingUtilities.invokeLater(() -> {
      // El constructor del controlador se encarga de todo el arranque
      new Controlador();
    });
  }
}
