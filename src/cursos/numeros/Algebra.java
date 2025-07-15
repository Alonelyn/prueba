/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursos.numeros;

import Dificultad.Dificultad;
import estudio.Pregunta;
import entidad.Alumno;
import estudio.Curso;
import java.util.*;

/**
 *
 * @author Micha
 */
public class Algebra extends Curso {

    public Algebra(Dificultad dificultad) {
        super("Álgebra", "Ecuaciones Lineales", dificultad);
    }

    @Override
    public void cargarPreguntas() {
        int tiempo = dificultad.getTiempoBase();

        // Preguntas sobre ecuaciones lineales
        preguntas.add(new Pregunta("Resuelve: 2x + 5 = 13. ¿Cuál es x?",
                Arrays.asList("x = 3", "x = 4", "x = 5", "x = 6"), 1, tiempo,
                "2x = 13 - 5 = 8 → x = 4"));

        preguntas.add(new Pregunta("¿Cuál es el resultado de (x + 3)²?",
                Arrays.asList("x² + 6x + 9", "x² + 3x + 9", "x² + 6x + 6", "x² + 9"), 0, tiempo,
                "(x + 3)² = x² + 2·x·3 + 3² = x² + 6x + 9"));

        preguntas.add(new Pregunta("Si 3x - 7 = 14, entonces x =",
                Arrays.asList("5", "6", "7", "8"), 2, tiempo,
                "3x = 14 + 7 = 21 → x = 7"));

        preguntas.add(new Pregunta("¿Cuál es la pendiente de la recta y = 2x + 3?",
                Arrays.asList("1", "2", "3", "5"), 1, tiempo,
                "En y = mx + b, m es la pendiente → m = 2"));

        preguntas.add(new Pregunta("Factoriza: x² - 9",
                Arrays.asList("(x-3)(x-3)", "(x+3)(x+3)", "(x-3)(x+3)", "No se puede factorizar"), 2, tiempo,
                "x² - 9 = (x - 3)(x + 3)"));

        preguntas.add(new Pregunta("¿Cuál es la solución de x² = 16?",
                Arrays.asList("x = 4", "x = ±4", "x = -4", "x = 8"), 1, tiempo,
                "x² = 16 → x = ±√16 = ±4"));

        preguntas.add(new Pregunta("Si f(x) = 2x + 1, ¿cuál es f(3)?",
                Arrays.asList("5", "6", "7", "8"), 2, tiempo,
                "f(3) = 2×3 + 1 = 7"));

        preguntas.add(new Pregunta("¿Cuál es el discriminante de x² + 2x + 1?",
                Arrays.asList("0", "1", "2", "4"), 0, tiempo,
                "Discriminante = b² - 4ac = 4 - 4 = 0"));

        preguntas.add(new Pregunta("Resuelve: |x - 3| = 5",
                Arrays.asList("x = 8", "x = -2", "x = 8 o x = -2", "x = 2 o x = 8"), 2, tiempo,
                "|x - 3| = 5 → x - 3 = 5 o x - 3 = -5 → x = 8 o x = -2"));

        preguntas.add(new Pregunta("¿Cuál es la forma estándar de y = 2(x - 1)² + 3?",
                Arrays.asList("y = 2x² - 4x + 5", "y = 2x² - 4x + 1", "y = 2x² + 4x + 5", "y = x² - 4x + 5"), 0, tiempo,
                "y = 2(x² - 2x + 1) + 3 = 2x² - 4x + 5"));

        preguntas.add(new Pregunta("Resuelve: 5x - 10 = 0",
                Arrays.asList("x = 0", "x = 1", "x = 2", "x = 5"), 2, tiempo,
                "5x = 10 → x = 2"));

        preguntas.add(new Pregunta("¿Cuál es la solución de 4x + 8 = 2x + 12?",
                Arrays.asList("x = 1", "x = 2", "x = 3", "x = 4"), 1, tiempo,
                "4x - 2x = 12 - 8 → 2x = 4 → x = 2"));

        preguntas.add(new Pregunta("Resuelve: 3(x + 2) = 15",
                Arrays.asList("x = 3", "x = 4", "x = 5", "x = 6"), 1, tiempo,
                "x + 2 = 5 → x = 3"));

        preguntas.add(new Pregunta("¿Qué valor de x satisface 2(x - 4) = 6?",
                Arrays.asList("x = 5", "x = 6", "x = 7", "x = 8"), 1, tiempo,
                "x - 4 = 3 → x = 7"));

        preguntas.add(new Pregunta("Resuelve: 7x - 4 = 3x + 8",
                Arrays.asList("x = 2", "x = 3", "x = 4", "x = 5"), 1, tiempo,
                "7x - 3x = 8 + 4 → 4x = 12 → x = 3"));

        preguntas.add(new Pregunta("¿Cuál es el valor de x en 5(x - 1) = 20?",
                Arrays.asList("x = 3", "x = 4", "x = 5", "x = 6"), 2, tiempo,
                "x - 1 = 4 → x = 5"));

        preguntas.add(new Pregunta("Resuelve: 2x + 3 = x + 7",
                Arrays.asList("x = 2", "x = 3", "x = 4", "x = 5"), 2, tiempo,
                "2x - x = 7 - 3 → x = 4"));

        preguntas.add(new Pregunta("¿Cuál es la solución de 4x + 2 = 2(x + 3)?",
                Arrays.asList("x = 1", "x = 2", "x = 3", "x = 4"), 1, tiempo,
                "4x + 2 = 2x + 6 → 2x = 4 → x = 2"));

        preguntas.add(new Pregunta("Resuelve: 3x + 5 = 2x + 10",
                Arrays.asList("x = 3", "x = 4", "x = 5", "x = 6"), 2, tiempo,
                "3x - 2x = 10 - 5 → x = 5"));

        preguntas.add(new Pregunta("¿Cuál es el valor de x en 2(x + 3) = 16?",
                Arrays.asList("x = 4", "x = 5", "x = 6", "x = 7"), 2, tiempo,
                "x + 3 = 8 → x = 5"));
    }

    // Métodos de Calculable (pueden ser simulados por ahora)
    @Override
    public double calcularNotaIndividual(Alumno alumno) {
        return Math.random() * 20; // Simulación básica
    }

    @Override
    public double calcularPromedio() {
        return 14.5;
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
