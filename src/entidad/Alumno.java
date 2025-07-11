package entidad;

import acciones.Calculable;
import java.util.List;
import estudio.Curso;
import seguimiento.*;

public class Alumno extends Persona {

    
    private Progreso progreso;
    private Bitacora bitacora;
    private String id;
    private List<Double> notas;
    private Curso cursoActual;
    private int grado;


        // constructor para Alumno en base de Persona [Clase padre]
        public Alumno(String usuario,
                String contraseña, 
                String nombre, 
                String apellido, 
                String dni, 
                String correo, 
                String grado) {
        super(nombre, apellido, dni, correo, usuario, contraseña);
        this.grado = Integer.parseInt(grado);
        this.progreso = new Progreso();
        this.bitacora = new Bitacora();
        }
        
        public Progreso getProgreso(){
            return progreso;
        }
        public int getGrado() {
            return grado;
        }
	public List<Double> consultarNotas() {
		return null;
	}
	public void registrarse(Curso curso) {

	}

	public double obtenerPromedio() {
            if (notas.isEmpty()) return 0;
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
		//return 0;
	}

}
