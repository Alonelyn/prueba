package estudio;

import Dificultad.Dificultad;
import entidad.Alumno;
import acciones.Calculable;
import Dificultad.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MatematicasNivelPrimario extends Curso implements Calculable {

    private List<Pregunta> preguntas;
    private Dificultad dificultad;

    public MatematicasNivelPrimario(Dificultad dificultad) {
        super("Matemáticas", "Números y Operaciones");
        this.dificultad = dificultad;
        this.preguntas = new ArrayList<>();
        cargarPreguntas(); // Cargar preguntas al instanciar
    }

    @Override
    public void cargarPreguntas() {
        int tiempoBase = dificultad.getTiempoBase();

        preguntas.add(new Pregunta("¿Cuánto es 5 + 3?",
                Arrays.asList("6", "8", "9", "7"),
                1, tiempoBase, "La respuesta correcta es 8"));

        preguntas.add(new Pregunta("¿Cuánto es 12 - 4?",
                Arrays.asList("8", "9", "7", "6"),
                0, tiempoBase, "La respuesta correcta es 8"));

        preguntas.add(new Pregunta("¿Cuánto es 6 × 2?",
                Arrays.asList("10", "12", "14", "8"),
                1, tiempoBase, "La respuesta correcta es 12"));

        preguntas.add(new Pregunta("¿Cuánto es 15 ÷ 3?",
                Arrays.asList("4", "5", "6", "3"),
                1, tiempoBase, "La respuesta correcta es 5"));

        preguntas.add(new Pregunta("¿Qué número viene después del 19?",
                Arrays.asList("18", "20", "21", "22"),
                1, tiempoBase, "La respuesta correcta es 20"));

        preguntas.add(new Pregunta("¿Cuánto es 7 + 6?",
                Arrays.asList("12", "13", "14", "11"),
                1, tiempoBase, "La respuesta correcta es 13"));

        preguntas.add(new Pregunta("¿Cuánto es 20 - 8?",
                Arrays.asList("12", "13", "11", "14"),
                0, tiempoBase, "La respuesta correcta es 12"));

        preguntas.add(new Pregunta("¿Cuánto es 4 × 5?",
                Arrays.asList("15", "20", "25", "18"),
                1, tiempoBase, "La respuesta correcta es 20"));

        preguntas.add(new Pregunta("¿Cuánto es 24 ÷ 6?",
                Arrays.asList("3", "4", "5", "6"),
                1, tiempoBase, "La respuesta correcta es 4"));

        preguntas.add(new Pregunta("¿Cuál es el número mayor: 45 o 54?",
                Arrays.asList("45", "54", "Son iguales", "No se puede saber"),
                1, tiempoBase, "La respuesta correcta es 54"));
    }

    public List<Pregunta> getPreguntasAleatorias(int cantidad) {
        List<Pregunta> copia = new ArrayList<>(preguntas);
        Collections.shuffle(copia);
        return copia.size() > cantidad ? copia.subList(0, cantidad) : copia;
    }

    // Métodos de Calculable - Toca mejorarlo
    @Override
    public double calcularNotaIndividual(Alumno alumno) {
        return Math.random() * 20; // Simulación básica
    }

    @Override
    public double calcularPromedio() {
        return 14.5; // Ejemplo
    }

    @Override
    public double calcularMaximaNota() {
        return 20.0;
    }

    @Override
    public double calcularMinimaNota() {
        return 7.0;
    }

    @Override
    public List<Double> listarNotas() {
        return Arrays.asList(15.0, 18.0, 12.0, 17.0);
    }
}
