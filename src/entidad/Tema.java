/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import enumeraciones.Categoria;
import estudio.Curso;

/**
 *
 * @author JOSE
 */
public class Tema {
    
    private String nombre;
    private Categoria categoria;
    private Curso curso; 

    public Tema(String nombre, Categoria categoria, Curso curso) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
    @Override
    public String toString() {
        return "Tema{" +
                "nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", curso=" + curso +
                '}';
    }
    
    
}
