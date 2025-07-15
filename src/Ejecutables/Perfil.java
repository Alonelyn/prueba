/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejecutables;

import javax.swing.JOptionPane;
import entidad.*;
import seguimiento.*;
import javax.swing.Timer;

/**
 *
 * @author Micha
 */
public class Perfil extends javax.swing.JFrame {

    /**
     * Creates new form Bitacora
     */
    public Perfil() {
        initComponents();
        jPanel1.requestFocusInWindow();
        this.setLocationRelativeTo(null);
        Timer timer = new Timer(1000, e -> {Alumno alumno = (Alumno) Sesion.getPersonaActual();
            int porcentaje = alumno.getProgreso().getPorcentaje();
            pbProgreso.setValue(porcentaje);
        });
        cargarDatos();
    }

    private void configurarExit(){
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    
    
    private void cargarDatos() {
        Persona persona = Sesion.getPersonaActual();
        
        if (persona instanceof Alumno alumno) {
            lblNombre.setText(alumno.getNombre());
            lblApellido.setText(alumno.getApellido());
            lblGrado.setText(String.valueOf(alumno.getGrado()));
            lblCorreo.setText(alumno.getCorreo());
            
            
            int porcentaje = alumno.getProgreso().getPorcentaje();
            pbProgreso.setValue(porcentaje);
        } else {
            JOptionPane.showMessageDialog(this, "No hay un alumno activo en sesión.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblGrado = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pbMate = new javax.swing.JProgressBar();
        pbCiencias = new javax.swing.JProgressBar();
        pbLetras = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        progresoMate = new javax.swing.JLabel();
        progresoCiencias = new javax.swing.JLabel();
        progresoLetras = new javax.swing.JLabel();
        pbProgreso = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(58, 158, 197));
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
        Title.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 21, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Perfil de usuario");
        Title.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 140));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Apellidos");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Grado");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Correo");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("NOMBRE");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        lblApellido.setForeground(new java.awt.Color(0, 0, 0));
        lblApellido.setText("APELLIDOS");
        jPanel2.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lblGrado.setForeground(new java.awt.Color(0, 0, 0));
        lblGrado.setText("GRADO");
        jPanel2.add(lblGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        lblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreo.setText("CORREO");
        jPanel2.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 310, 190));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sugerencias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setText("Mostrar resultados académicos");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 200, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 310, 220));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calificacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 450, 220));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Progreso Académico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ciencias");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Letras");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel5.add(pbMate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 220, 20));
        jPanel5.add(pbCiencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 220, 20));
        jPanel5.add(pbLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 220, 20));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Matemática");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        progresoMate.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        progresoMate.setForeground(new java.awt.Color(0, 0, 0));
        progresoMate.setText("50%");
        jPanel5.add(progresoMate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        progresoCiencias.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        progresoCiencias.setForeground(new java.awt.Color(0, 0, 0));
        progresoCiencias.setText("50%");
        jPanel5.add(progresoCiencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        progresoLetras.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        progresoLetras.setForeground(new java.awt.Color(0, 0, 0));
        progresoLetras.setText("50%");
        jPanel5.add(progresoLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));
        jPanel5.add(pbProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 300, 20));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Progreso General");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 450, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 590));

        getAccessibleContext().setAccessibleName("Bitacora del Viajero");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    int px, py;
    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        this.dispose();

    }//GEN-LAST:event_exitMousePressed

    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - px, y - py);
    }//GEN-LAST:event_TitleMouseDragged

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        px = evt.getX();
        py = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Title;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblGrado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JProgressBar pbCiencias;
    private javax.swing.JProgressBar pbLetras;
    private javax.swing.JProgressBar pbMate;
    private javax.swing.JProgressBar pbProgreso;
    private javax.swing.JLabel progresoCiencias;
    private javax.swing.JLabel progresoLetras;
    private javax.swing.JLabel progresoMate;
    // End of variables declaration//GEN-END:variables
}
