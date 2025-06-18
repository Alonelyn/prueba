/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.List;
/**
 *
 * @author JOSE
 */
public class Contenido {
    
    private String descripcion;
    private List<String> unidades;

    public Contenido(String descripcion, List<String> unidades) {
        this.descripcion = descripcion;
        this.unidades = unidades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getUnidades() {
        return unidades;
    }

    public void setUnidades(List<String> unidades) {
        this.unidades = unidades;
    }
    
    
    
}
