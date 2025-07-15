package Grado;

import javax.swing.JOptionPane;

public class lvPrimaria {
    private String areaSeleccionada;
    private String cursoSeleccionado;

    public lvPrimaria() {
        seleccionarArea();
    }

    // Método para mostrar las áreas académicas
    public void seleccionarArea() {
        String[] areas = {"Matemática", "Letras", "Ciencias"};
        String seleccion = (String) JOptionPane.showInputDialog(
            null,
            "Selecciona un área académica:",
            "Selección de Área",
            JOptionPane.QUESTION_MESSAGE,
            null,
            areas,
            areas[0]
        );

        if (seleccion != null) {
            this.areaSeleccionada = seleccion;
            seleccionarCurso(seleccion);
        } else {
            JOptionPane.showMessageDialog(null, "No seleccionaste ninguna área.");
        }
    }

    // Método para seleccionar un curso según el área
    public void seleccionarCurso(String area) {
        String[] cursos = {};
        switch (area) {
            case "Matemática":
                cursos = new String[]{"Aritmética", "Álgebra", "Geometría", "Razonamiento Matemático"};
                break;
            case "Letras":
                cursos = new String[]{"Comunicación", "Literatura", "Razonamiento Verbal"};
                break;
            case "Ciencias":
                cursos = new String[]{"Anatomía", "Biología", "Química"};
                break;
        }

        String seleccion = (String) JOptionPane.showInputDialog(
            null,
            "Selecciona un curso:",
            "Selección de Curso",
            JOptionPane.QUESTION_MESSAGE,
            null,
            cursos,
            cursos[0]
        );

        if (seleccion != null) {
            this.cursoSeleccionado = seleccion;
            JOptionPane.showMessageDialog(null, "Área: " + areaSeleccionada + "\nCurso: " + cursoSeleccionado);
        }
    }

    // Getters para acceder desde otras clases
    public String getAreaSeleccionada() {
        return areaSeleccionada;
    }

    public String getCursoSeleccionado() {
        return cursoSeleccionado;
    }
}