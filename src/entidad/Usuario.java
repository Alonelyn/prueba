package entidad;


import java.util.List;

public class Usuario {
    private Persona persona;
    
    public Usuario(Persona persona) {
        this.persona = persona;
    }
    
    public Persona getPersona() { 
        return persona;
    }
    
    public boolean verificarCredenciales(String usuario, String contraseña) {
        return persona.usuario.equals(usuario) && persona.contraseña.equals(contraseña);
    }
}


/*
	private int grado;
	private Enum(Primaria, Secundaria) nivelEducativo;
	private Progreso progreso;
	private Mundo mundoActual;
	private List<Bitacora> historialBitacora;
	private List<Nota> notas;
	public void reoslverDesafio() {}
	public void avanzarNivel() {}
	public void verLeccion() {}
	public void registrarProgreso() {}
	public void escribirNota() {}
	public void consultarNota() {}
    
    */