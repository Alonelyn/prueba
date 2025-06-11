package acciones;



public interface Acumulador {

	// private int obtenerPuntaje;

	/**
	 *  
	 */
	public abstract void acumularPuntajes();

	/**
	 *  
	 */
	public abstract void guardarPuntajes(int puntos);

	/**
	 *  
	 */
	public abstract void reiniciarPuntaje();

}
