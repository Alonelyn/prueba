/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author Micha
 */
public class Sesion {
    private static Persona personaActual;
    
    public static void iniciarSesion(Persona persona) {
        personaActual = persona;
    }
    
    public static Persona getPersonaActual() {
        return personaActual;
    }
    
    public static void cerrarSesion() {
        personaActual = null;
    }
    
    public static boolean sesionActiva() {
        return personaActual != null;
    }
}
