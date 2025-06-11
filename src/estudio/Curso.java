package estudio;

import acciones.Calculable;
import Juego.iJugable;
import entidad.Alumno;
import seguimiento.Registro;
import java.util.Collection;
import estudio.Contenido;
import java.util.List;

public abstract class Curso implements Calculable, iJugable {

	private String nombre;
	private String tema;
	private int sesionesPorSemana;
	private String contenido;
	private Alumno alumno;
	private Registro registro;
	// private Collection<Tema> tema; ?
	// private Contenido contenido; ---- Esto ya lo definiste arriba

	/**
	 *  
	 */
	public void agregarAlumno(Alumno a) {

	}

	/**
	 *  
	 */
	public void eliminarAlumno(String id) {

	}

	public List<Alumno> listarAlumnos() {
		return null;
	}

	public String mostrarContenido() {
		return null;
	}


	/**
	 * @see acciones.Calculable#calcularNotaIndividual(entidad.Alumno)
	 * 
	 *  
	 */
	public double calcularNotaIndividual(Alumno alumno) {
		return 0;
	}


	/**
	 * @see acciones.Calculable#calcularPromedio()
	 * 
	 *  
	 */
	public double calcularPromedio() {
		return 0;
	}


	/**
	 * @see acciones.Calculable#calcularMaximaNota()
	 */
	public double calcularMaximaNota() {
		return 0;
	}


	/**
	 * @see acciones.Calculable#calcularMinimaNota()
	 */
	public double calcularMinimaNota() {
		return 0;
	}


	/**
	 * @see acciones.Calculable#listarNotas()
	 */
	public List<Double> listarNotas() {
		return null;
	}

}
