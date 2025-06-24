/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimiento;

import Interfaces.Acumulador;
import Juego.Juego;
import java.util.List;

/**
 *
 * @author JOSE
 */
public class Puntajes implements Acumulador{
    private int puntajeTotal;

	private List<Integer> historialPuntaje;

	private Respuesta respuesta;

	private Juego juego;


	/**
	 * @see entidad.Acumulador#acumularPuntajes()
	 * 
	 *  
	 */
	public void acumularPuntajes() {

	}


	/**
	 * @see entidad.Acumulador#guardarPuntajes(int)
	 * 
	 *  
	 */
	public void guardarPuntajes(int puntos) {

	}


	/**
	 * @see entidad.Acumulador#reiniciarPuntaje()
	 * 
	 *  
	 */
	public void reiniciarPuntaje() {

	}
        @Override
        public int obtenerPuntaje() {
        return puntajeTotal; 
    }
    
}
