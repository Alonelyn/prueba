package estudio;

import acciones.Calculable;
import entidad.Alumno;
import java.util.List;
import Utilitario.*;
import Dificultad.*;

import java.util.*;

public abstract class Curso implements Calculable {

    private String nombre;
    private String tema;
    private int sesionesPorSemana;
    private String contenido;

    // Nuevos atributos
    protected List<Pregunta> preguntas; // Lista de preguntas del curso
    public Dificultad dificultad; // Dificultad del curso
    private int cantidadPreguntas = 10; // Por defecto 10 preguntas

    public Curso(String nombre, String tema){
        this.nombre = nombre;
        this.tema = tema;
        this.preguntas = new ArrayList<>();
    }
    
    public Curso(String nombre, String tema, Dificultad dificultad) {
        this(nombre,tema);
        this.dificultad = dificultad;
    }
    

    // Método para cargar preguntas específicas (debe ser implementado en subclases)
    public abstract void cargarPreguntas();

    // Método para obtener preguntas aleatorias
    public List<Pregunta> getPreguntasAleatorias(int cantidad) {
        Collections.shuffle(preguntas);
        return preguntas.size() > cantidad ? preguntas.subList(0, cantidad) : new ArrayList<>(preguntas);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }
}
