package Ejecutables;

import entidad.*;
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Micha
 */
public class CrearUsuario extends javax.swing.JFrame {

    
    public CrearUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnCompletar.setEnabled(false);
        habilitarBoton();
    }
    
    private boolean esUsuarioValido(String usuario) {
        return usuario.matches("^[a-zA-Z0-9._-]{3,20}$");
    }
    
    public static boolean esCorreoValido(String correo) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern patron = Pattern.compile(regex);
        Matcher coincidencia = patron.matcher(correo);           
        return coincidencia.matches();
    }
    
    private boolean validarCampos() {
        
        //obtenemos los valores directamente
        String usuario = txtUsuario.getText().trim();
        String password = txtPassword.getText().trim();
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String dni = txtDni.getText().trim();
        String correo = txtCorreo.getText().trim();
        
        
        if (txtUsuario.getText().trim().isEmpty() || txtPassword.getText().trim().isEmpty() ||  txtNombre.getText().trim().isEmpty() || 
                txtApellido.getText().trim().isEmpty() || txtDni.getText().trim().isEmpty() ||  txtCorreo.getText().trim().isEmpty() ||
                txtUsuario.getText().trim().isEmpty() || txtUsuario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos");
            return false;
        }
        if (txtDni.getText().length() != 8 || !txtDni.getText().matches("\\d{8}")) {
            JOptionPane.showMessageDialog(this, "El DNI debe tener exactamente 8 dígitos.");
            return false;
        }
        if (txtPassword.getText().length() != 8 || !txtPassword.getText().matches("\\d{8}")) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener exactamente 8 dígitos.");
            return false;
        }
        // Validar correo
        if (!esCorreoValido(correo)) {
            JOptionPane.showMessageDialog(this, "El correo ingresado no es válido.");
            return false;
        }
        return true;
    }
    
    private Alumno crearAlumnoDesdeFormulario() {
        String usuario = txtUsuario.getText().trim();
        String contraseña = txtPassword.getText().trim();
        String nombres = txtNombre.getText().trim();
        String apellidos = txtApellido.getText().trim();
        String dni = txtDni.getText().trim();
        String correo = txtCorreo.getText().trim();
        String grado = String.valueOf(cmbGrado.getSelectedIndex());
        
        

        Alumno nuevo = new Alumno(usuario, contraseña, nombres, apellidos, dni, correo, grado);
        return nuevo;
    }

    
    private void guardarAlumnoEnArchivo(Alumno alumno) {
        try {
            File carpeta = new File("Registro/Alumnos");
            if (!carpeta.exists()) carpeta.mkdirs();

            File archivo = new File(carpeta, alumno.getUsuario() + ".txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));

            writer.write("Usuario: " + alumno.getUsuario());
            writer.newLine();
            writer.write("Contraseña: " + alumno.getContraseña());
            writer.newLine();
            writer.write("Nombres: " + alumno.getNombre());
            writer.newLine();
            writer.write("Apellidos: " + alumno.getApellido());
            writer.newLine();
            writer.write("DNI: " + alumno.getDni());
            writer.newLine();
            writer.write("Correo: " + alumno.getCorreo());
            writer.newLine();
            writer.write("Grado: " + alumno.getGrado());
            writer.newLine();

            writer.close();
            JOptionPane.showMessageDialog(this, "Alumno registrado correctamente.");
            this.dispose();
            Login log = new Login();
            log.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage());
        }
    }
    
    
    private void registrarAlumno() {
        if (validarCampos()) {
            Alumno alumno = crearAlumnoDesdeFormulario();
            guardarAlumnoEnArchivo(alumno);
            
        }
    }  
    
    
   
    public void habilitarBoton(){
        // Si los siguientes campos no están completados no se activa el boton
        if(!txtUsuario.getText().isEmpty() && !txtPassword.getText().isEmpty()
                && !txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty() 
                && !txtDni.getText().isEmpty() && !txtCorreo.getText().isEmpty()){
            
            //cuando se llenen todos los campos requeridos se desbloquea
            btnCompletar.setEnabled(true);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCompletar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        cmbGrado = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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
        Title.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 21, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO");
        Title.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home_48px_1.png"))); // NOI18N
        Title.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 60));

        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 140));

        txtUsuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 170, -1));

        jLabel4.setText("Apellidos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 110, -1));

        jLabel5.setText("Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, -1));

        btnCompletar.setText("Completar");
        btnCompletar.setEnabled(false);
        btnCompletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCompletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 170, 30));

        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 110, -1));

        jLabel7.setText("Nombres");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, -1));

        txtNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 360, -1));

        txtApellido.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 360, -1));

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 160, -1));

        jLabel2.setText("DNI");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        txtDni.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniKeyReleased(evt);
            }
        });
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 190, -1));

        jLabel8.setText("Correo Electrónico");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 310, -1));

        cmbGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" }));
        jPanel1.add(cmbGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jLabel9.setText("Grado");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
       //configuro la función de cerrar el proyecto
    private void configurarExit(){
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        Login login = new Login();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_exitMousePressed

    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - px, y - py);
    }//GEN-LAST:event_TitleMouseDragged
    int px, py;
    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        px = evt.getX();
        py = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnCompletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletarActionPerformed
        registrarAlumno();
    }//GEN-LAST:event_btnCompletarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_txtDniKeyReleased

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_txtCorreoKeyReleased

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
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Title;
    private javax.swing.JButton btnCompletar;
    private javax.swing.JComboBox<String> cmbGrado;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
