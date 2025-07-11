/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejecutables;

import javax.swing.JOptionPane;
import entidad.*;

/**
 *
 * @author Micha
 */
public class Bitacora extends javax.swing.JFrame {
    
    // Variables para almacenar las selecciones
    private String nivelAcademico = "";
    private String dificultad = "";
    private String area = "";
    private String curso = "";

    /**
     * Creates new form Bitacora
     */
    public Bitacora() {
        initComponents();
        jPanel1.requestFocusInWindow();
        this.setLocationRelativeTo(null);
        iniciar();
        cargarDatos();
    }
    
    private void cargarDatos() {
        Persona persona = Sesion.getPersonaActual();
        
        if (persona instanceof Alumno alumno) {
            lblAlumno.setText(alumno.getNombre());
        } else {
            JOptionPane.showMessageDialog(this, "No hay alumno activo en sesión", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void configurarExit(){
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    private void iniciar(){
        lblNivelAcademico.setText("");
        lblDificultad.setText("");
        lblCurso.setText("");
        lblArea.setText("");
    }
    
    // Método para obtener áreas según el nivel académico
    private String[] obtenerAreasPorNivel(String nivel) {
        if ("Primaria".equals(nivel)) {
            return new String[]{"Matemáticas", "Ciencias Naturales", "Lenguaje", "Estudios Sociales"};
        } else { // Secundaria
            return new String[]{"Matemáticas", "Ciencias", "Letras"};
        }
    }
    
    // Método para obtener cursos según área y nivel
    private String[] obtenerCursosPorAreaYNivel(String area, String nivel) {
        if ("Primaria".equals(nivel)) {
            switch (area) {
                case "Matemáticas":
                    return new String[]{"Números y Operaciones", "Geometría Básica", "Medidas y Tiempo"};
                case "Ciencias Naturales":
                    return new String[]{"Los Seres Vivos", "El Cuerpo Humano", "La Naturaleza"};
                case "Lenguaje":
                    return new String[]{"Lectura y Comprensión", "Gramática Básica", "Escritura Creativa"};
                case "Estudios Sociales":
                    return new String[]{"Mi Comunidad", "Historia Patria", "Geografía Nacional"};
            }
        } else { // Secundaria
            switch (area) {
                case "Matemáticas":
                    return new String[]{"Aritmética", "Álgebra", "Geometría", "Razonamiento Matemático"};
                case "Ciencias":
                    return new String[]{"Anatomía", "Biología", "Química"};
                case "Letras":
                    return new String[]{"Comunicación", "Literatura", "Razonamiento Verbal"};
            }
        }
        return new String[]{"Curso General"};
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblAlumno = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();
        pnlPerfil = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblDificultad = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNivelAcademico = new javax.swing.JLabel();
        btnDificultad = new javax.swing.JButton();
        btnNivelAcademico = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblCurso = new javax.swing.JLabel();
        btnMateria = new javax.swing.JButton();
        btnEmpezar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(540, 470));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.setMinimumSize(new java.awt.Dimension(540, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(31, 199, 136));
        Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleMouseDragged(evt);
            }
        });
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleMousePressed(evt);
            }
        });
        Title.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.setToolTipText("");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        Title.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 21, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");
        Title.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblAlumno.setBackground(new java.awt.Color(255, 255, 255));
        lblAlumno.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblAlumno.setForeground(new java.awt.Color(255, 255, 255));
        lblAlumno.setText("user");
        Title.add(lblAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 80));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contenedor.setFocusable(false);
        contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPerfil.setBackground(new java.awt.Color(255, 255, 255));
        pnlPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccion"));
        pnlPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Nivel:");
        pnlPerfil.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        lblDificultad.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblDificultad.setText("Normal");
        pnlPerfil.add(lblDificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Dificultad:");
        pnlPerfil.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        lblNivelAcademico.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblNivelAcademico.setText("Primaria");
        pnlPerfil.add(lblNivelAcademico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        btnDificultad.setText("Dificultad");
        btnDificultad.setFocusable(false);
        btnDificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificultadActionPerformed(evt);
            }
        });
        pnlPerfil.add(btnDificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, 30));

        btnNivelAcademico.setText("Nivel académico");
        btnNivelAcademico.setFocusable(false);
        btnNivelAcademico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNivelAcademicoActionPerformed(evt);
            }
        });
        pnlPerfil.add(btnNivelAcademico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 140, 30));

        contenedor.add(pnlPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 200));

        btnPerfil.setText("Perfil de estudiante");
        btnPerfil.setFocusable(false);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        contenedor.add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Materia"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Area de estudio: ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Curso: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        lblArea.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblArea.setText("Matematica");
        jPanel2.add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        lblCurso.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblCurso.setText("Curso");
        jPanel2.add(lblCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        btnMateria.setText("Selecciona tu materia y curso");
        btnMateria.setFocusable(false);
        btnMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriaActionPerformed(evt);
            }
        });
        jPanel2.add(btnMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 30));

        contenedor.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 280, 200));

        btnEmpezar.setText("¿Empezamos la aventura?");
        btnEmpezar.setFocusable(false);
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });
        contenedor.add(btnEmpezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 280, -1));

        jPanel1.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 500, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 440));

        getAccessibleContext().setAccessibleName("Bitacora del Viajero");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    int px, py;
    
    private void exitMousePressed(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(this, "Project by José & Michael");

        System.exit(0);
    }                                 
    
    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - px, y - py);
    }//GEN-LAST:event_TitleMouseDragged

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        px = evt.getX();
        py = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void btnNivelAcademicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNivelAcademicoActionPerformed
        String[] seleccion = {"Primaria", "Secundaria"};
        
        int opcion = JOptionPane.showOptionDialog(null, "Selecciona tu nivel escolar", "Nivel Académico", 0, JOptionPane.QUESTION_MESSAGE, null, seleccion, "");
        switch (opcion) {
            case 0 -> {
                nivelAcademico = seleccion[0];
                lblNivelAcademico.setText(seleccion[0]);
                // Reset área y curso cuando cambia el nivel
                area = "";
                curso = "";
                lblArea.setText("No seleccionada");
                lblCurso.setText("No seleccionado");
            }
            case 1 -> {
                nivelAcademico = seleccion[1];
                lblNivelAcademico.setText(seleccion[1]);
                // Reset área y curso cuando cambia el nivel
                area = "";
                curso = "";
                lblArea.setText("No seleccionada");
                lblCurso.setText("No seleccionado");
            }
        }
        //verificarConfiguracionCompleta();
    }//GEN-LAST:event_btnNivelAcademicoActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        Perfil pc = new Perfil();
        pc.setVisible(true);
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnDificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificultadActionPerformed
        String[] dificultadOp = {"Fácil", "Normal", "Avanzado"};
        
        int nivel = JOptionPane.showOptionDialog(null, "Selecciona tu nivel de dificultad", "Dificultad", 0, JOptionPane.QUESTION_MESSAGE, null, dificultadOp, "");
        switch (nivel) {
            case 0 -> {
                dificultad = dificultadOp[0];
                lblDificultad.setText(dificultadOp[0]);
            }
            case 1 -> {
                dificultad = dificultadOp[1];
                lblDificultad.setText(dificultadOp[1]);
            }
            case 2 -> {
                dificultad = dificultadOp[2];
                lblDificultad.setText(dificultadOp[2]);
            }
        }
    }//GEN-LAST:event_btnDificultadActionPerformed

    private void btnMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriaActionPerformed
        
        if (nivelAcademico.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Primero selecciona el nivel académico", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String[] areas = obtenerAreasPorNivel(nivelAcademico);
        
        int materiaIndex = JOptionPane.showOptionDialog(null, "Selecciona tu área de estudio", "Área de Estudio", 0, JOptionPane.QUESTION_MESSAGE, null, areas, "");
        
        if (materiaIndex >= 0 && materiaIndex < areas.length) {
            area = areas[materiaIndex];
            lblArea.setText(area);
            
            // Ahora seleccionar el curso
            String[] cursos = obtenerCursosPorAreaYNivel(area, nivelAcademico);
            int cursoIndex = JOptionPane.showOptionDialog(null, "Selecciona tu curso", "Curso", 0, JOptionPane.QUESTION_MESSAGE, null, cursos, "");
            
            if (cursoIndex >= 0 && cursoIndex < cursos.length) {
                curso = cursos[cursoIndex];
                lblCurso.setText(curso);
            }
        }
        
        
    }//GEN-LAST:event_btnMateriaActionPerformed

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
        Jugable pc= new Jugable(nivelAcademico, dificultad, area, curso);
        pc.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnEmpezarActionPerformed

    /**
     * @param args the command line arguments
     *//*
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bitacora().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Title;
    private javax.swing.JButton btnDificultad;
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JButton btnMateria;
    private javax.swing.JButton btnNivelAcademico;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAlumno;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblDificultad;
    private javax.swing.JLabel lblNivelAcademico;
    private javax.swing.JPanel pnlPerfil;
    // End of variables declaration//GEN-END:variables
}
