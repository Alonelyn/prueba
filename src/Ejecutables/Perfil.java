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
            pgrsbarAritmetica.setValue(porcentaje);
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
            pgrsbarAritmetica.setValue(porcentaje);
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
        pgrsbarAritmetica = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pgrsbarAlgebra = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        pgrsbarGeometria = new javax.swing.JProgressBar();
        jLabel11 = new javax.swing.JLabel();
        pgrsbarRazonamientoMate = new javax.swing.JProgressBar();
        jLabel12 = new javax.swing.JLabel();
        pgrsbarAnatomia = new javax.swing.JProgressBar();
        jLabel13 = new javax.swing.JLabel();
        pgrsbarBiologia = new javax.swing.JProgressBar();
        lblporcentajeAritmetica = new javax.swing.JLabel();
        lblporcentajeAlgebra = new javax.swing.JLabel();
        lblporcentajeGeometria = new javax.swing.JLabel();
        lblporcentajeBiologia = new javax.swing.JLabel();
        lblporcentajeAnatomia = new javax.swing.JLabel();
        lblporcentajeRazonMatematico = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pgrsbarGeneral = new javax.swing.JProgressBar();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pgrsbarMatematica = new javax.swing.JProgressBar();
        jLabel15 = new javax.swing.JLabel();
        pgrsbarCiencias = new javax.swing.JProgressBar();
        lblporcentajeMate = new javax.swing.JLabel();
        lblporcentajeCiencias = new javax.swing.JLabel();
        lblporcentajeGeneral = new javax.swing.JLabel();

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

        lblNombre.setText("NOMBRE");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        lblApellido.setText("APELLIDOS");
        jPanel2.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lblGrado.setText("GRADO");
        jPanel2.add(lblGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        lblCorreo.setText("CORREO");
        jPanel2.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 310, 190));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(pgrsbarAritmetica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 270, 20));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Progreso Aritmetica");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Progreso Algebra");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanel3.add(pgrsbarAlgebra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 270, 20));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("Progreso Geometría");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel3.add(pgrsbarGeometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 270, 20));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setText("Progreso Razonamiento Matematico");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jPanel3.add(pgrsbarRazonamientoMate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 270, 20));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setText("Progreso Anatomía");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        jPanel3.add(pgrsbarAnatomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 270, 20));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel13.setText("Progreso Biologia");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));
        jPanel3.add(pgrsbarBiologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 270, 20));

        lblporcentajeAritmetica.setText("0%");
        jPanel3.add(lblporcentajeAritmetica, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        lblporcentajeAlgebra.setText("0%");
        jPanel3.add(lblporcentajeAlgebra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        lblporcentajeGeometria.setText("0%");
        jPanel3.add(lblporcentajeGeometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        lblporcentajeBiologia.setText("0%");
        jPanel3.add(lblporcentajeBiologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        lblporcentajeAnatomia.setText("0%");
        jPanel3.add(lblporcentajeAnatomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        lblporcentajeRazonMatematico.setText("0%");
        jPanel3.add(lblporcentajeRazonMatematico, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 310, 420));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(pgrsbarGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 270, 20));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Progreso General");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel14.setText("Progreso Matematica");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanel5.add(pgrsbarMatematica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 270, 20));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel15.setText("Progreso Ciencias");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel5.add(pgrsbarCiencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 270, 20));

        lblporcentajeMate.setText("0%");
        jPanel5.add(lblporcentajeMate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        lblporcentajeCiencias.setText("0%");
        jPanel5.add(lblporcentajeCiencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        lblporcentajeGeneral.setText("0%");
        jPanel5.add(lblporcentajeGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 310, 210));

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

    /**
     * @param args the command line arguments
     */
    
    /*
    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Title;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblGrado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblporcentajeAlgebra;
    private javax.swing.JLabel lblporcentajeAnatomia;
    private javax.swing.JLabel lblporcentajeAritmetica;
    private javax.swing.JLabel lblporcentajeBiologia;
    private javax.swing.JLabel lblporcentajeCiencias;
    private javax.swing.JLabel lblporcentajeGeneral;
    private javax.swing.JLabel lblporcentajeGeometria;
    private javax.swing.JLabel lblporcentajeMate;
    private javax.swing.JLabel lblporcentajeRazonMatematico;
    private javax.swing.JProgressBar pgrsbarAlgebra;
    private javax.swing.JProgressBar pgrsbarAnatomia;
    private javax.swing.JProgressBar pgrsbarAritmetica;
    private javax.swing.JProgressBar pgrsbarBiologia;
    private javax.swing.JProgressBar pgrsbarCiencias;
    private javax.swing.JProgressBar pgrsbarGeneral;
    private javax.swing.JProgressBar pgrsbarGeometria;
    private javax.swing.JProgressBar pgrsbarMatematica;
    private javax.swing.JProgressBar pgrsbarRazonamientoMate;
    // End of variables declaration//GEN-END:variables
}
