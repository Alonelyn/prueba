package entidad;

public abstract class Persona {

	protected String nombre;
	protected String apellido;
	protected String dni;
	protected String correo;
	protected String usuario;
	protected String contraseña;
        
        public Persona(String nombre, String apellido, String dni, String correo, String usuario, String contraseña) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.correo = correo;
            this.usuario = usuario;
            this.contraseña = contraseña;
        }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contrasena) {
        this.contraseña = contrasena;
    }
        
        

}
