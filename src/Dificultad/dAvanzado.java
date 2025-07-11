/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dificultad;

/**
 *
 * @author Micha
 */
public class dAvanzado implements Dificultad {
    @Override
    public int getTiempoBase() {
        return 5;
    }

    @Override
    public double getBonusPorcentaje() {
        return 0.2; // +20%
    }
}
