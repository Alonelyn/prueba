/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio;

import Utilitario.Pregunta;
import java.util.*;

/**
 *
 * @author Micha
 */
import java.util.*;

public class PreguntaManager {

    private Map<String, Map<String, Map<String, List<Pregunta>>>> baseDePreguntas;

    public PreguntaManager() {
        baseDePreguntas = new HashMap<>();
        cargarTodasLasPreguntas();
    }

    private void cargarTodasLasPreguntas() {
        cargarPreguntasPrimaria();
        cargarPreguntasSecundaria();
    }

    private void cargarPreguntasPrimaria() {
        int tiempoBase = 90; // Fácil

        // Matemáticas - Números y Operaciones
        agregarPreguntas("Primaria", "Matemáticas", "Números y Operaciones", Arrays.asList(
            new Pregunta("¿Cuánto es 5 + 3?", Arrays.asList("6", "8", "9", "7"), 1, tiempoBase, "La respuesta correcta es 8"),
            new Pregunta("¿Cuánto es 12 - 4?", Arrays.asList("8", "9", "7", "6"), 0, tiempoBase, "La respuesta correcta es 8")
        ));

        // Ciencias Naturales - Los Seres Vivos
        agregarPreguntas("Primaria", "Ciencias Naturales", "Los Seres Vivos", Arrays.asList(
            new Pregunta("¿Qué necesitan las plantas para vivir?", 
                Arrays.asList("Solo agua", "Agua, luz y aire", "Solo tierra", "Solo luz"), 1, tiempoBase, "Las plantas necesitan agua, luz y aire"),
            new Pregunta("¿Cuántas patas tiene una araña?", 
                Arrays.asList("6", "8", "10", "4"), 1, tiempoBase, "Las arañas tienen 8 patas")
        ));
    }

    private void cargarPreguntasSecundaria() {
        int tiempoBase = 120; // Normal

        // Matemáticas - Álgebra
        agregarPreguntas("Secundaria", "Matemáticas", "Álgebra", Arrays.asList(
            new Pregunta("Resuelve: 2x + 5 = 13. ¿Cuál es x?", 
                Arrays.asList("x = 3", "x = 4", "x = 5", "x = 6"), 1, tiempoBase, "2x = 13 - 5 = 8 → x = 4"),
            new Pregunta("¿Cuál es el resultado de (x + 3)²?", 
                Arrays.asList("x² + 6x + 9", "x² + 3x + 9", "x² + 6x + 6", "x² + 9"), 0, tiempoBase, "La respuesta correcta es x² + 6x + 9")
        ));

        // Matemáticas - Aritmética
        agregarPreguntas("Secundaria", "Matemáticas", "Aritmética", Arrays.asList(
            new Pregunta("¿Cuál es el MCM de 12 y 18?", 
                Arrays.asList("6", "36", "54", "72"), 1, tiempoBase, "MCM(12,18) = 36"),
            new Pregunta("¿Cuál es el MCD de 24 y 36?", 
                Arrays.asList("6", "12", "18", "24"), 1, tiempoBase, "MCD(24,36) = 12")
        ));

        // Ciencias - Biología
        agregarPreguntas("Secundaria", "Ciencias", "Biología", Arrays.asList(
            new Pregunta("¿Cuál es la función de la mitocondria?", 
                Arrays.asList("Producir energía", "Almacenar ADN", "Producir proteínas", "Regular la temperatura"), 0, tiempoBase, "La mitocondria produce energía en forma de ATP"),
            new Pregunta("¿Cuántos cromosomas tiene el ser humano?", 
                Arrays.asList("44", "46", "48", "50"), 1, tiempoBase, "El ser humano tiene 46 cromosomas")
        ));

        // Ciencias - Química
        agregarPreguntas("Secundaria", "Ciencias", "Química", Arrays.asList(
            new Pregunta("¿Cuál es el símbolo químico del sodio?", 
                Arrays.asList("So", "Na", "Sd", "Sn"), 1, tiempoBase, "El símbolo del sodio es Na"),
            new Pregunta("¿Cuántos protones tiene el carbono?", 
                Arrays.asList("4", "6", "8", "12"), 1, tiempoBase, "El carbono tiene 6 protones")
        ));
    }

    private void agregarPreguntas(String nivel, String area, String curso, List<Pregunta> preguntas) {
        baseDePreguntas.putIfAbsent(nivel, new HashMap<>());
        baseDePreguntas.get(nivel).putIfAbsent(area, new HashMap<>());
        baseDePreguntas.get(nivel).get(area).put(curso, preguntas);
    }

    public List<Pregunta> getPreguntas(String nivel, String area, String curso) {
        List<Pregunta> lista = baseDePreguntas
            .getOrDefault(nivel, Collections.emptyMap())
            .getOrDefault(area, Collections.emptyMap())
            .getOrDefault(curso, new ArrayList<>());

        List<Pregunta> copia = new ArrayList<>(lista);
        Collections.shuffle(copia);
        return copia.size() > 10 ? copia.subList(0, 10) : copia;
    }
}