/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimiento;

/**
 *
 * @author JOSE
 */
public class Respuesta {
    
     private boolean esCorrecta;

    public Respuesta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }

    public boolean isEsCorrecta() {
        return esCorrecta;
    }

    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }
    
    // Method
    public boolean verificarRespuestas() {
        return esCorrecta;
    }
     
}
