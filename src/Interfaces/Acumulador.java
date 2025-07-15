/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author JOSE
 */
public interface Acumulador {
    //int obtenerPuntaje(); no puede tener atributos las interfaces
    void acumularPuntajes();
    void guardarPuntajes(int puntos);
    void reiniciarPuntaje();
}
