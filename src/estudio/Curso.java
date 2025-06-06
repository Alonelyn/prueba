package estudio;

import acciones.Calculable;
import entidad.Alumno;
import java.util.List;

public abstract class Curso implements Calculable {

	private String nombre;

	private String tema;

	private int sesionesPorSemana;

	private String contenido;

	public void agregarAlumno(Alumno a) {

	}

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
