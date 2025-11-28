package modelo;

/**
 * Clase abstracta que representa a un usuario dentro del sistema.
 *
 * Decidí hacerla abstracta porque no necesito crear usuarios genéricos,
 * sino que quiero que de aquí hereden las clases específicas
 * como {@link Cliente}, {@link Administrador} y {@link Repartidor}.
 */
public abstract class Usuario {

  /** Nombre del usuario. */
  protected String nombre;

  /** Identificación del usuario. */
  protected String identificacion;

  /** Teléfono del usuario. */
  protected String telefono;

  /** Dirección del usuario. */
  protected String direccion;

  /** Tipo de usuario (Cliente, Administrador o Repartidor). */
  protected String tipoUsuario;

  /**
   * Constructor de la clase Usuario.
   *
   * Aquí guardo los datos básicos que todo usuario debe tener.
   *
   * @param nombre Nombre del usuario
   * @param identificacion Identificación única del usuario
   * @param telefono Teléfono de contacto
   * @param direccion Dirección del usuario
   * @param tipoUsuario Tipo de usuario (por ejemplo: "Cliente", "Administrador", "Repartidor")
   */
  public Usuario(String nombre, String identificacion, String telefono,
      String direccion, String tipoUsuario) {
    this.nombre = nombre;
    this.identificacion = identificacion;
    this.telefono = telefono;
    this.direccion = direccion;
    this.tipoUsuario = tipoUsuario;
  }

  /** @return el nombre del usuario */
  public String getNombre() {
    return nombre;
  }

  /** @param nombre asigna un nuevo nombre al usuario */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /** @return la identificación del usuario */
  public String getIdentificacion() {
    return identificacion;
  }

  /** @param identificacion asigna una nueva identificación */
  public void setIdentificacion(String identificacion) {
    this.identificacion = identificacion;
  }

  /** @return el teléfono del usuario */
  public String getTelefono() {
    return telefono;
  }

  /** @param telefono asigna un nuevo teléfono */
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /** @return la dirección del usuario */
  public String getDireccion() {
    return direccion;
  }

  /** @param direccion asigna una nueva dirección */
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  /** @return el tipo de usuario */
  public String getTipoUsuario() {
    return tipoUsuario;
  }

  /** @param tipoUsuario asigna un nuevo tipo de usuario */
  public void setTipoUsuario(String tipoUsuario) {
    this.tipoUsuario = tipoUsuario;
  }
}
