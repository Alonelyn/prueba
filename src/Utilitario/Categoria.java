/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilitario;

import java.util.ArrayList;
import java.util.List;
import estudio.*;

/**
 *
 * @author Micha
 */
public class Categoria {
    private String nombre;
    private List<Curso> cursos;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    
}
