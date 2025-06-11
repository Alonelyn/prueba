package juego;

import Juego.Juego;
import entidad.Alumno;

public class jugador extends Alumno {

	private Juego juego;

    public jugador(String usuario, String contraseña, String nombre, String apellido, String dni, String correo, String grado) {
        
        super(usuario,
                contraseña, 
                nombre, 
                apellido, 
                dni, 
                correo, 
                grado);
    }

}
