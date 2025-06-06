package seguimiento;

import java.util.ArrayList;
import java.util.List;
import seguimiento.*;




public class Bitacora {
    private List<String> decisionesTomadas;
    private List<LocalDateTime> tiemposAcceso;
    
    public Bitacora() {
        decisionesTomadas = new ArrayList<>();
        tiemposAcceso = new ArrayList<>();
    }
    /*
    public void registrarDecion(String decisiones) {
        decisionesTomadas.add(decision);
        tiemposAcceso.add(LocalDateTime.now());
    }*/

	private LocalDateTime fechaHora;

	private String descripcion;

	private String accion;

	public void registrarEntrada() {

	}

}
