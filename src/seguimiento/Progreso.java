package seguimiento;
public class Progreso {
    private int porcentajeAvance;
    private int nivelActual;
    private int nivelMaximo;
    private int porcentaje;
    
    public Progreso() {
        this.porcentajeAvance = 0;
        this.nivelActual = 0;
        this.nivelMaximo = 100;
        this.porcentaje = 0;
    }
    
    public void avanzarNivel() {
        nivelActual++;
        porcentajeAvance += 5;
    }

    public int getPorcentajeAvance() {
        if (nivelMaximo == 0) return 0;
        return (nivelActual * 100) / nivelMaximo;
    }

    public void setPorcentajeAvance(int porcentajeAvance) {
        this.porcentajeAvance = porcentajeAvance;
    }

    public int getNivelMaximo() {
        return nivelMaximo;
    }

    public void setNivelMaximo(int nivelMaximo) {
        this.nivelMaximo = nivelMaximo;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getNivelActual() {
        return nivelActual;
    }

    public void setNivelActual(int nivelActual) {
        this.nivelActual = nivelActual;
    }

    public int getNivelesCompletados() {
        return nivelesCompletados;
    }

    public void setNivelesCompletados(int nivelesCompletados) {
        this.nivelesCompletados = nivelesCompletados;
    }

    public double getProcentajeCurso() {
        return procentajeCurso;
    }

    public void setProcentajeCurso(double procentajeCurso) {
        this.procentajeCurso = procentajeCurso;
    }

    public double getTiempoEstudioAcumulado() {
        return tiempoEstudioAcumulado;
    }

    public void setTiempoEstudioAcumulado(double tiempoEstudioAcumulado) {
        this.tiempoEstudioAcumulado = tiempoEstudioAcumulado;
    }
    
    
    
    

	private int nivelesCompletados;

	private double procentajeCurso;

	private double tiempoEstudioAcumulado;

	public void actualizarProgreso(double nuevoPorcentaje) {

	}

	public void reiniciarProgreso() {

	}

}
