package Ejecutables;


// Imports para DB

/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;}
*/ //Detalles previos
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.*;
import java.io.IOException;
import java.util.List;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import entidad.*;



/**
 *
 * @author Micha
 */
public class Login extends javax.swing.JFrame {

    
    public Login() {
        
        initComponents();
        jPanel1.requestFocusInWindow();
        this.setLocationRelativeTo(null);
        txtPassword.setEchoChar('\u25cf');
        
    }
    
    
    private void iniciarSesion() {
        String username = txtUsuario.getText().trim();
        String password = new String(txtPassword.getPassword()).trim();

        File carpeta = new File("Registro/Alumnos");
        File archivo = new File(carpeta, username + ".txt");

        if (!archivo.exists()) {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            String usuario = "", pass = "", nombre = "", apellido = "", dni = "", correo = "", grado = "";
            boolean loginExitoso = false;

            while ((linea = reader.readLine()) != null) {
                linea = linea.trim();

                if (linea.startsWith("Usuario:")) {
                    usuario = linea.split(":", 2)[1].trim();
                } else if (linea.startsWith("Contraseña:")) {
                    pass = linea.split(":", 2)[1].trim();
                } else if (linea.startsWith("Nombres:")) {
                    nombre = linea.split(":", 2)[1].trim();
                } else if (linea.startsWith("Apellidos:")) {
                    apellido = linea.split(":", 2)[1].trim();
                } else if (linea.startsWith("DNI:")) {
                    dni = linea.split(":", 2)[1].trim();
                } else if (linea.startsWith("Correo:")) {
                    correo = linea.split(":", 2)[1].trim();
                } else if (linea.startsWith("Grado:")) {
                    grado = linea.split(":", 2)[1].trim();
                }
            }

            // Validar que todos los datos estén presentes
            if (usuario.isEmpty() || pass.isEmpty() || nombre.isEmpty() || apellido.isEmpty() ||
                dni.isEmpty() || correo.isEmpty() || grado.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Datos incompletos en el archivo de usuario.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

           // Verificar credenciales
            if (usuario.equals(username) && pass.equals(password)) {
                Alumno alumno = new Alumno(usuario, pass, nombre, apellido, dni, correo, grado);
                Sesion.iniciarSesion(alumno);
                loginExitoso = true;
            }

            if (loginExitoso) {
                JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso", "Información", JOptionPane.INFORMATION_MESSAGE);
                Bitacora panel = new Bitacora();
                panel.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    
    
    // configurar la función de cerrar el programa
    private void configurarExit(){
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    @SuppressWarnings("unchecked")
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        Title = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IconLog = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        showPass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setText("Ingresar");
        btnLogin.setFocusable(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 90, 30));

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
        Title.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 6, 21, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        Title.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home_48px_1.png"))); // NOI18N
        Title.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 35, -1, 60));

        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 140));

        IconLog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_52px.png"))); // NOI18N
        jPanel1.add(IconLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 60, 80));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 200, 10));

        txtUsuario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 200, 30));

        lblPassword.setText("Contraseña");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 110, -1));

        lblUsuario.setText("Usuario");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 90, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 200, 10));

        jButton2.setText("Registrate");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 90, 30));

        txtPassword.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 252, 200, 30));

        showPass.setBackground(new java.awt.Color(255, 255, 255));
        showPass.setForeground(new java.awt.Color(0, 0, 0));
        showPass.setText("Mostrar contraseña");
        showPass.setFocusable(false);
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });
        jPanel1.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 393));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        iniciarSesion();
    }//GEN-LAST:event_btnLoginActionPerformed
    // definir variables x & y para ventana
    int px, py;    
    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CrearUsuario cr = new CrearUsuario();
        cr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        px = evt.getX();
        py = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - px, y - py);
    }//GEN-LAST:event_TitleMouseDragged

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        JOptionPane.showMessageDialog(this, "Project by José & Michael");
        
        System.exit(0);
        
    }//GEN-LAST:event_exitMousePressed

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        
        if (showPass.isSelected()){
            txtPassword.setEchoChar((char)0);
            showPass.setText("Ocultar contraseña");
        } else {
            txtPassword.setEchoChar('\u25cf');
            showPass.setText("Mostrar contraseña");
        }
    }//GEN-LAST:event_showPassActionPerformed

    public static void main(String args[]) {
        JPasswordField p = new JPasswordField();
        p.setVisible(true);
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconLog;
    private javax.swing.JPanel Title;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JCheckBox showPass;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables


    
}
