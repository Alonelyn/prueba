package Formularios;


import estudio.Pregunta;
import javax.swing.JOptionPane;
import seguimiento.*;
import estudio.*;
import javax.swing.Timer;
import Utilitario.*;
import estudio.PreguntaManager;

//Importamos lo necesario para las clases
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.*;
import javax.imageio.ImageIO;
import java.util.List;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// Terminamos de importar


public class Jugable extends javax.swing.JFrame {
    
    private List<Pregunta> preguntas;
    private int preguntaActual = 0;
    private int puntaje = 0;
    private boolean preguntaRespondida = false;

    private String nivelAcademico;
    private String dificultad;
    private String area;
    private String curso;

    private Timer temporizador;
    private int tiempoRestante;
    private int tiempoTotal;
    
    private PreguntaManager preguntaManager;

    /**
     * Creates new form Jugable
     */
    public Jugable() {
        //this("Secundaria", "Normal", "Matemáticas", "Álgebra");
    }

    public Jugable(String nivelAcademico, String dificultad, String area, String curso) {
        this.nivelAcademico = nivelAcademico;
        this.dificultad = dificultad;
        this.area = area;
        this.curso = curso;
        initComponents();
        this.setLocationRelativeTo(null);

        // Inicializar gestor de preguntas
        preguntaManager = new PreguntaManager();

        // Cargar preguntas y empezar el quiz
        cargarPreguntas();
        
        // PROBLEMA
        if (!preguntas.isEmpty()) {
            iniciarPregunta();
        } else {
            JOptionPane.showMessageDialog(this, "No hay preguntas disponibles para esta configuración", "Error", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }
    }

    private void cargarPreguntas() {
        preguntaManager = new PreguntaManager();

        System.out.println("Valores usados para cargar preguntas:");
        System.out.println("Nivel Académico: " + nivelAcademico);
        System.out.println("Dificultad: " + dificultad);
        System.out.println("Área: " + area);
        System.out.println("Curso: " + curso);

        preguntas = preguntaManager.getPreguntas(nivelAcademico, area, curso);

        System.out.println("Preguntas encontradas: " + preguntas.size());

        if (preguntas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay preguntas disponibles para esta configuración.");
            this.dispose();
            return;
        }

        iniciarPregunta();
    }

    private void iniciarPregunta() {
        if (preguntaActual < preguntas.size()) {
            preguntaRespondida = false;
            Pregunta pregunta = preguntas.get(preguntaActual);

            // Actualizar UI
            lblNumeroPregunta.setText("Pregunta " + (preguntaActual + 1) + " de " + preguntas.size());
            lblPregunta.setText(pregunta.getTexto());

            List<String> opciones = pregunta.getOpciones();
            btn1.setText(opciones.get(0));
            btn2.setText(opciones.get(1));
            btn3.setText(opciones.get(2));
            btn4.setText(opciones.get(3));

            // Habilitar botones
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);

            // Configurar temporizador
            tiempoTotal = obtenerTiempoBasePorDificultad();
            tiempoRestante = tiempoTotal;
            lblTemporizador.setText(String.valueOf(tiempoRestante));
            jProgressBar1.setMaximum(tiempoTotal);
            jProgressBar1.setValue(tiempoRestante);

            iniciarTemporizador();
        } else {
            mostrarResultados();
        }
    }

    private void iniciarTemporizador() {
        if (temporizador != null) {
            temporizador.stop();
        }

        temporizador = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tiempoRestante--;
                lblTemporizador.setText(String.valueOf(tiempoRestante));
                jProgressBar1.setValue(tiempoRestante);

                if (tiempoRestante <= 10) {
                    lblTemporizador.setForeground(Color.RED);
                } else if (tiempoRestante <= 30) {
                    lblTemporizador.setForeground(Color.ORANGE);
                } else {
                    lblTemporizador.setForeground(Color.BLACK);
                }

                if (tiempoRestante <= 0) {
                    temporizador.stop();
                    tiempoAgotado();
                }
            }
        });

        temporizador.start();
    }

    private void responderPregunta(int opcionSeleccionada) {
        if (preguntaRespondida) return;
        temporizador.stop();
        preguntaRespondida = true;

        Pregunta pregunta = preguntas.get(preguntaActual);
        boolean esCorrecta = (opcionSeleccionada == pregunta.getRespuestaCorrecta());

        if (esCorrecta) {
            puntaje += calcularPuntos();
            JOptionPane.showMessageDialog(this, "¡Correcto! 🎉\n" +
                            "Respuesta: " + pregunta.getOpciones().get(pregunta.getRespuestaCorrecta()),
                    "Respuesta Correcta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "❌ Incorrecto\n" +
                            "La respuesta correcta era: " + pregunta.getOpciones().get(pregunta.getRespuestaCorrecta()),
                    "Respuesta Incorrecta", JOptionPane.ERROR_MESSAGE);
        }

        lblScore.setText(String.format("%05d", puntaje));

        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);

        Timer delay = new Timer(2000, e -> {
            preguntaActual++;
            iniciarPregunta();
        });
        delay.setRepeats(false);
        delay.start();
    }

    private void tiempoAgotado() {
        if (preguntaRespondida) return;
        preguntaRespondida = true;

        Pregunta pregunta = preguntas.get(preguntaActual);
        JOptionPane.showMessageDialog(this,
                "⏰ ¡Tiempo agotado!\n" +
                        "La respuesta correcta era: " + pregunta.getOpciones().get(pregunta.getRespuestaCorrecta()),
                "Tiempo Agotado", JOptionPane.WARNING_MESSAGE);

        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);

        Timer delay = new Timer(2000, e -> {
            preguntaActual++;
            iniciarPregunta();
        });
        delay.setRepeats(false);
        delay.start();
    }

    private void mostrarResultados() {
        if (temporizador != null) {
            temporizador.stop();
        }

        String nivel = "";
        String emoji = "";
        if (puntaje >= 900) {
            nivel = "¡EXCELENTE!";
            emoji = "🏆";
        } else if (puntaje >= 700) {
            nivel = "¡MUY BIEN!";
            emoji = "🥇";
        } else if (puntaje >= 500) {
            nivel = "BIEN";
            emoji = "👍";
        } else {
            nivel = "NECESITAS PRACTICAR";
            emoji = "📚";
        }

        String mensaje = String.format(
                "%s %s%nConfiguración: %s - %s%nÁrea: %s - %s%nPuntuación Final: %d",
                emoji, nivel, nivelAcademico, dificultad, area, curso, puntaje);

        JOptionPane.showMessageDialog(this, mensaje, "Resultados Finales", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        new Bitacora().setVisible(true);
    }

    private int calcularPuntos() {
        int puntosBase = switch (dificultad) {
            case "Fácil" -> 50;
            case "Normal" -> 100;
            case "Avanzado" -> 150;
            default -> 100;
        };

        double porcentajeTiempo = (double) tiempoRestante / tiempoTotal;
        int bonusTiempo = (int) (puntosBase * porcentajeTiempo * 0.5);
        return puntosBase + bonusTiempo;
    }

    private int obtenerTiempoBasePorDificultad() {
        return switch (dificultad) {
            case "Fácil" -> 90;
            case "Normal" -> 120;
            case "Avanzado" -> 180;
            default -> 120;
        };
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new FondoPanel();
        exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        pnlContador = new Clases.PanelRound();
        lblTemporizador = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        lblNumeroPregunta = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.setToolTipText("");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 40));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("SCORE: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        lblScore.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblScore.setForeground(new java.awt.Color(0, 51, 51));
        lblScore.setText("00000");
        jPanel1.add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        lblPregunta.setBackground(new java.awt.Color(204, 255, 255));
        lblPregunta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPregunta.setText("Pregunta");
        lblPregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 480, 250));

        btn2.setBackground(new java.awt.Color(51, 255, 204));
        btn2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn2.setText("Na");
        btn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 110, 40));

        btn3.setBackground(new java.awt.Color(255, 255, 0));
        btn3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn3.setText("Sd");
        btn3.setToolTipText("");
        btn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 110, 40));

        btn4.setBackground(new java.awt.Color(51, 51, 255));
        btn4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn4.setText("Sn");
        btn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 110, 40));

        btn1.setBackground(new java.awt.Color(255, 0, 0));
        btn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn1.setText("So");
        btn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 110, 40));

        pnlContador.setBackground(new java.awt.Color(220, 212, 212));
        pnlContador.setRoundBottomLeft(100);
        pnlContador.setRoundBottomRight(100);
        pnlContador.setRoundTopLeft(100);
        pnlContador.setRoundTopRight(100);

        lblTemporizador.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTemporizador.setText("60");

        javax.swing.GroupLayout pnlContadorLayout = new javax.swing.GroupLayout(pnlContador);
        pnlContador.setLayout(pnlContadorLayout);
        pnlContadorLayout.setHorizontalGroup(
            pnlContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(pnlContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlContadorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblTemporizador)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlContadorLayout.setVerticalGroup(
            pnlContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(pnlContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlContadorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblTemporizador)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(pnlContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, 70));

        jProgressBar1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 290, 20));

        lblNumeroPregunta.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblNumeroPregunta.setText("Pregunta 1 de 10");
        jPanel1.add(lblNumeroPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        this.dispose();
        Bitacora panel = new Bitacora();
        panel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitMousePressed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        responderPregunta(0);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        responderPregunta(1);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        responderPregunta(2);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       responderPregunta(3);
    }//GEN-LAST:event_btn4ActionPerformed
    
    int px, py;
    
    
    /**
     * @param args the command line arguments
    /*s
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
            java.util.logging.Logger.getLogger(Jugable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jugable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugable().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblNumeroPregunta;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblTemporizador;
    private Clases.PanelRound pnlContador;
    // End of variables declaration//GEN-END:variables
    
    class FondoPanel extends JPanel {
        private Image imagen;
        
        @Override
        public void paint(Graphics g) {
            // Obtener la ruta de la imagen según el curso seleccionado
            String rutaImagen = obtenerRutaFondoPorCurso();
            
            try {
                imagen = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
            } catch (Exception e) {
                // Si no encuentra la imagen específica, usar una imagen por defecto
                System.out.println("No se encontró la imagen: " + rutaImagen + ". Usando imagen por defecto.");
                try {
                    imagen = new ImageIcon(getClass().getResource("/Media/background_default.jpg")).getImage();
                } catch (Exception ex) {
                    // Si tampoco encuentra la imagen por defecto, crear un fondo de color
                    g.setColor(new Color(204, 255, 255));
                    g.fillRect(0, 0, getWidth(), getHeight());
                    setOpaque(true);
                    super.paint(g);
                    return;
                }
            }
            
            // Dibujar la imagen de fondo
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
        
        /**
         * Método que determina qué imagen de fondo usar según el curso
         */
        private String obtenerRutaFondoPorCurso() {
            // Mapeo de cursos a imágenes de fondo
            switch (curso.toLowerCase()) {
                // Matemáticas
                case "álgebra":
                case "algebra":
                    return "/Media/background_algebra.jpg";
                case "aritmética":
                case "aritmetica":
                    return "/Media/background_aritmetica.jpg";
                case "geometría":
                case "geometria":
                    return "/Media/background_geometria.jpg";
                case "números y operaciones":
                case "numeros y operaciones":
                    return "/Media/background_matematicas_primaria.jpg";
                case "razonamiento matemático":
                case "razonamiento matematico":
                    return "/Media/background_razonamiento_mat.jpg";
                
                // Ciencias
                case "química":
                case "quimica":
                    return "/Media/background_quimica.jpg";
                case "biología":
                case "biologia":
                    return "/Media/background_biologia.jpg";
                case "anatomía":
                case "anatomia":
                    return "/Media/background_anatomia.jpg";
                case "los seres vivos":
                    return "/Media/background_seres_vivos.jpg";
                case "el cuerpo humano":
                    return "/Media/background_cuerpo_humano.jpg";
                case "la naturaleza":
                    return "/Media/background_naturaleza.jpg";
                
                // Letras
                case "literatura":
                    return "/Media/background_literatura.jpg";
                case "comunicación":
                case "comunicacion":
                    return "/Media/background_comunicacion.jpg";
                case "razonamiento verbal":
                    return "/Media/background_razonamiento_verbal.jpg";
                case "lectura y comprensión":
                case "lectura y comprension":
                    return "/Media/background_lectura.jpg";
                case "gramática básica":
                case "gramatica basica":
                    return "/Media/background_gramatica.jpg";
                case "escritura creativa":
                    return "/Media/background_escritura.jpg";
                
                // Estudios Sociales
                case "mi comunidad":
                    return "/Media/background_comunidad.jpg";
                case "historia patria":
                    return "/Media/background_historia.jpg";
                case "geografía nacional":
                case "geografia nacional":
                    return "/Media/background_geografia.jpg";
                
                // Fondo por defecto si no encuentra el curso específico
                default:
                    // Intentar por área si no encuentra por curso específico
                    return obtenerRutaFondoPorArea();
            }
        }
        
        /**
         * Método de respaldo que usa el área si no encuentra imagen específica del curso
         */
        private String obtenerRutaFondoPorArea() {
            switch (area.toLowerCase()) {
                case "matemáticas":
                case "matematicas":
                    return "/Media/background_matematicas.jpg";
                case "ciencias":
                case "ciencias naturales":
                    return "/Media/background_ciencias.jpg";
                case "letras":
                    return "/Media/background_letras.jpg";
                case "lenguaje":
                    return "/Media/background_lenguaje.jpg";
                case "estudios sociales":
                    return "/Media/background_sociales.jpg";
                default:
                    return "/Media/background_default.jpg";
            }
        }
    }
}
