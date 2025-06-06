package acciones;

import entidad.Alumno;
import java.util.List;

public interface Calculable {

	public abstract double calcularNotaIndividual(Alumno alumno);

	public abstract double calcularPromedio();

	public abstract double calcularMaximaNota();

	public abstract double calcularMinimaNota();

	public abstract List<Double> listarNotas();

}
