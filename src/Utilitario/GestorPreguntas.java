/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilitario;

import estudio.Pregunta;
import java.util.List;
import Utilitario.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Micha
 */
public class GestorPreguntas {

    public static List<Pregunta> getPreguntas(String nivel, String area, String curso) {
        List<Pregunta> todas = new ArrayList<>();

        if ("Primaria".equals(nivel)) {
            if ("Matemáticas".equals(area)) {
                if ("Números y Operaciones".equals(curso)) {
                    todas.addAll(getPreguntasPrimariaNumeros());
                }
            } else if ("Ciencias Naturales".equals(area)) {
                if ("Los Seres Vivos".equals(curso)) {
                    todas.addAll(getPreguntasSeresVivos());
                }
            }
        } else if ("Secundaria".equals(nivel)) {
            if ("Matemáticas".equals(area)) {
                if ("Álgebra".equals(curso)) {
                    todas.addAll(getPreguntasAlgebra());
                } else if ("Aritmética".equals(curso)) {
                    todas.addAll(getPreguntasAritmetica());
                }
            } else if ("Ciencias".equals(area)) {
                if ("Biología".equals(curso)) {
                    todas.addAll(getPreguntasBiologia());
                } else if ("Química".equals(curso)) {
                    todas.addAll(getPreguntasQuimica());
                }
            }
        }

        Collections.shuffle(todas);
        return todas.size() > 10 ? todas.subList(0, 10) : todas;
    }

    // Métodos privados para cada grupo de preguntas...
    private static List<Pregunta> getPreguntasPrimariaNumeros() { /* ... */
        return null;
    }
    private static List<Pregunta> getPreguntasSeresVivos() { /* ... */
        return null;
    }
    private static List<Pregunta> getPreguntasAlgebra() { /* ... */
        return null;
    }
    private static List<Pregunta> getPreguntasAritmetica() { /* ... */
        return null;
    }
    private static List<Pregunta> getPreguntasBiologia() { /* ... */
        return null;
    }
    private static List<Pregunta> getPreguntasQuimica() { /* ... */
        return null;
    }
}
