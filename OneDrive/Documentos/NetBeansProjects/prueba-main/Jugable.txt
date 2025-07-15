private void cargarPreguntas() {
        preguntas = new ArrayList<>();
        
        if ("Primaria".equals(nivelAcademico)) {
            cargarPreguntasPrimaria();
        } else {
            cargarPreguntasSecundaria();
        }
        
        // Mezclar preguntas y tomar solo 10
        Collections.shuffle(preguntas);
        if (preguntas.size() > 10) {
            preguntas = preguntas.subList(0, 10);
        }
    }
    
    private void cargarPreguntasPrimaria() {
        int tiempoBase = obtenerTiempoBasePorDificultad();
        
        if ("Matemáticas".equals(area)) {
            if ("Números y Operaciones".equals(curso)) {
                preguntas.add(new Pregunta("¿Cuánto es 5 + 3?", Arrays.asList("6", "8", "9", "7"), 1, tiempoBase, "La respuesta correcta es 8"));
                preguntas.add(new Pregunta("¿Cuánto es 12 - 4?", Arrays.asList("8", "9", "7", "6"), 0, tiempoBase, "La respuesta correcta es 8"));
                preguntas.add(new Pregunta("¿Cuánto es 6 × 2?", Arrays.asList("10", "12", "14", "8"), 1, tiempoBase, "La respuesta correcta es 12"));
                preguntas.add(new Pregunta("¿Cuánto es 15 ÷ 3?", Arrays.asList("4", "5", "6", "3"), 1, tiempoBase, "La respuesta correcta es 5"));
                preguntas.add(new Pregunta("¿Qué número viene después del 19?", Arrays.asList("18", "20", "21", "22"), 1, tiempoBase, "La respuesta correcta es 20"));
                preguntas.add(new Pregunta("¿Cuánto es 7 + 6?", Arrays.asList("12", "13", "14", "11"), 1, tiempoBase, "La respuesta correcta es 13"));
                preguntas.add(new Pregunta("¿Cuánto es 20 - 8?", Arrays.asList("12", "13", "11", "14"), 0, tiempoBase, "La respuesta correcta es 12"));
                preguntas.add(new Pregunta("¿Cuánto es 4 × 5?", Arrays.asList("15", "20", "25", "18"), 1, tiempoBase, "La respuesta correcta es 20"));
                preguntas.add(new Pregunta("¿Cuánto es 24 ÷ 6?", Arrays.asList("3", "4", "5", "6"), 1, tiempoBase, "La respuesta correcta es 4"));
                preguntas.add(new Pregunta("¿Cuál es el número mayor: 45 o 54?", Arrays.asList("45", "54", "Son iguales", "No se puede saber"), 1, tiempoBase, "La respuesta correcta es 54"));
            }
        }
        
        if ("Ciencias Naturales".equals(area)) {
            if ("Los Seres Vivos".equals(curso)) {
                preguntas.add(new Pregunta("¿Qué necesitan las plantas para vivir?", 
                    Arrays.asList("Solo agua", "Agua, luz y aire", "Solo tierra", "Solo luz"), 1,tiempoBase, "Las plantas necesitan agua, luz y aire"));
                preguntas.add(new Pregunta("¿Cuántas patas tiene una araña?", 
                    Arrays.asList("6", "8", "10", "4"), 1,tiempoBase, "Las arañas tienen 8 patas"));
                preguntas.add(new Pregunta("¿Qué animal pone huevos?", 
                    Arrays.asList("Perro", "Gato", "Gallina", "Vaca"), 2,tiempoBase, "La gallina pone huevos"));
                preguntas.add(new Pregunta("¿Dónde viven los peces?", 
                    Arrays.asList("En el aire", "En el agua", "En la tierra", "En los árboles"), 1,tiempoBase, "Los peces viven en el agua"));
                preguntas.add(new Pregunta("¿Qué parte de la planta absorbe el agua?", 
                    Arrays.asList("Hojas", "Flores", "Raíces", "Tallo"), 2,tiempoBase, "Las raíces absorben el agua"));
            }
        }
    }
    
    private void cargarPreguntasSecundaria() {
        int tiempoBase = obtenerTiempoBasePorDificultad();
        
        if ("Matemáticas".equals(area)) {
            if ("Álgebra".equals(curso)) {
                preguntas.add(new Pregunta("Resuelve: 2x + 5 = 13. ¿Cuál es x?", 
                    Arrays.asList("x = 3", "x = 4", "x = 5", "x = 6"), 1,tiempoBase, "2x = 13 - 5 = 8, entonces x = 4"));
                preguntas.add(new Pregunta("¿Cuál es el resultado de (x + 3)²?", 
                    Arrays.asList("x² + 6x + 9", "x² + 3x + 9", "x² + 6x + 6", "x² + 9"), 0,tiempoBase, "La respuesta correcta es x² + 6x + 9"));
                preguntas.add(new Pregunta("Si 3x - 7 = 14, entonces x =", 
                    Arrays.asList("5", "6", "7", "8"), 2,tiempoBase, "3x = 14 + 7 = 21, entonces x = 7"));
                preguntas.add(new Pregunta("¿Cuál es la pendiente de la recta y = 2x + 3?", 
                    Arrays.asList("1", "2", "3", "5"), 1,tiempoBase, "En y = mx + b, m es la pendiente, entonces m = 2"));
                preguntas.add(new Pregunta("Factoriza: x² - 9", 
                    Arrays.asList("(x-3)(x-3)", "(x+3)(x+3)", "(x-3)(x+3)", "No se puede factorizar"), 2,tiempoBase, "x² - 9 = (x-3)(x+3)"));
                preguntas.add(new Pregunta("¿Cuál es la solución de x² = 16?", 
                    Arrays.asList("x = 4", "x = ±4", "x = -4", "x = 8"), 1,tiempoBase, "x² = 16, entonces x = ±4"));
                preguntas.add(new Pregunta("Si f(x) = 2x + 1, ¿cuál es f(3)?", 
                    Arrays.asList("5", "6", "7", "8"), 2,tiempoBase, "f(3) = 2(3) + 1 = 7"));
                preguntas.add(new Pregunta("¿Cuál es el discriminante de x² + 2x + 1?", 
                    Arrays.asList("0", "1", "2", "4"), 0,tiempoBase, "Discriminante = b² - 4ac = 4 - 4 = 0"));
                preguntas.add(new Pregunta("Resuelve: |x - 3| = 5", 
                    Arrays.asList("x = 8", "x = -2", "x = 8 o x = -2", "x = 2 o x = 8"), 2,tiempoBase, "|x - 3| = 5 significa x - 3 = 5 o x - 3 = -5"));
                preguntas.add(new Pregunta("¿Cuál es la forma estándar de y = 2(x - 1)² + 3?", 
                    Arrays.asList("y = 2x² - 4x + 5", "y = 2x² - 4x + 1", "y = 2x² + 4x + 5", "y = x² - 4x + 5"), 0,tiempoBase, "Expandiendo: y = 2(x² - 2x + 1) + 3 = 2x² - 4x + 5"));
            }
            
            if ("Aritmética".equals(curso)) {
                preguntas.add(new Pregunta("¿Cuál es el MCM de 12 y 18?", 
                    Arrays.asList("6", "36", "54", "72"), 1,tiempoBase, "MCM(12,18) = 36"));
                preguntas.add(new Pregunta("¿Cuál es el MCD de 24 y 36?", 
                    Arrays.asList("6", "12", "18", "24"), 1,tiempoBase, "MCD(24,36) = 12"));
                preguntas.add(new Pregunta("¿Cuánto es 3/4 + 1/6?", 
                    Arrays.asList("4/10", "11/12", "4/6", "5/8"), 1,tiempoBase, "3/4 + 1/6 = 9/12 + 2/12 = 11/12"));
                preguntas.add(new Pregunta("¿Cuál es el 25% de 80?", 
                    Arrays.asList("15", "20", "25", "30"), 1,tiempoBase, "25% de 80 = 0.25 × 80 = 20"));
                preguntas.add(new Pregunta("¿Cuánto es 2³ × 2²?", 
                    Arrays.asList("2⁵", "2⁶", "4⁵", "8²"), 0, tiempoBase, "2³ × 2² = 2⁵ = 32"));
            }
        }
        
        if ("Ciencias".equals(area)) {
            if ("Biología".equals(curso)) {
                preguntas.add(new Pregunta("¿Cuál es la función de la mitocondria?", 
                    Arrays.asList("Producir energía", "Almacenar ADN", "Producir proteínas", "Regular la temperatura"), 0, tiempoBase, "La mitocondria produce energía en forma de ATP"));
                preguntas.add(new Pregunta("¿Cuántos cromosomas tiene el ser humano?", 
                    Arrays.asList("44", "46", "48", "50"), 1, tiempoBase, "El ser humano tiene 46 cromosomas"));
                preguntas.add(new Pregunta("¿Qué es la fotosíntesis?", 
                    Arrays.asList("Respiración celular", "Producción de glucosa", "División celular", "Digestión"), 1, tiempoBase, "La fotosíntesis produce glucosa usando luz solar"));
                preguntas.add(new Pregunta("¿Cuál es la unidad básica de la vida?", 
                    Arrays.asList("Átomo", "Molécula", "Célula", "Tejido"), 2, tiempoBase, "La célula es la unidad básica de la vida"));
                preguntas.add(new Pregunta("¿Qué tipo de sangre es donante universal?", 
                    Arrays.asList("A", "B", "AB", "O"), 3, tiempoBase, "El tipo O es donante universal"));
            }

            if ("Química".equals(curso)) {
                preguntas.add(new Pregunta("¿Cuál es el símbolo químico del sodio?", 
                    Arrays.asList("So", "Na", "Sd", "Sn"), 1, tiempoBase, "El símbolo del sodio es Na"));
                preguntas.add(new Pregunta("¿Cuántos protones tiene el carbono?", 
                    Arrays.asList("4", "6", "8", "12"), 1, tiempoBase, "El carbono tiene 6 protones"));
                preguntas.add(new Pregunta("¿Cuál es la fórmula del agua?", 
                    Arrays.asList("H₂O", "CO₂", "NaCl", "CH₄"), 0, tiempoBase, "La fórmula del agua es H₂O"));
                preguntas.add(new Pregunta("¿Qué gas respiramos principalmente?", 
                    Arrays.asList("Oxígeno", "Nitrógeno", "Dióxido de carbono", "Hidrógeno"), 0, tiempoBase, "Respiramos principalmente oxígeno"));
                preguntas.add(new Pregunta("¿Cuál es el pH del agua pura?", 
                    Arrays.asList("6", "7", "8", "9"), 1, tiempoBase, "El pH del agua pura es 7"));
            }
        }
    }


private void iniciarPregunta() {
        if (preguntaActual < preguntas.size()) {
            preguntaRespondida = false;
            Pregunta pregunta = preguntas.get(preguntaActual);
            
            // Actualizar en que pregunta se encuentra
            lblNumeroPregunta.setText("Pregunta " + (preguntaActual + 1) + " de " + preguntas.size());

            // Actualizar la pregunta
            lblPregunta.setText(pregunta.getTexto());
            
            // Actualizar las opciones en los botones
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

private void responderPregunta(int opcionSeleccionada) {
        if (preguntaRespondida) return;
        
        temporizador.stop();
        preguntaRespondida = true;
        
        Pregunta pregunta = preguntas.get(preguntaActual);
        boolean esCorrecta = (opcionSeleccionada == pregunta.getRespuestaCorrecta());
        
        if (esCorrecta) {
            puntaje += calcularPuntos();
            JOptionPane.showMessageDialog(this, "¡Correcto! 🎉\nRespuesta: " + 
                                        pregunta.getOpciones().get(pregunta.getRespuestaCorrecta()), 
                                        "Respuesta Correcta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "❌ Incorrecto.\nLa respuesta correcta era: " + 
                    pregunta.getOpciones().get(pregunta.getRespuestaCorrecta()), 
                                        "Respuesta Incorrecta", JOptionPane.ERROR_MESSAGE);
        }
        
        // Actualizar score
        lblScore.setText(String.format("%05d", puntaje));
        
        // Deshabilitar botones
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        
        // Continuar con la siguiente pregunta después de 2 segundos
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
        
        JOptionPane.showMessageDialog(this, "⏰ ¡Tiempo agotado!\nLa respuesta correcta era: " + 
                pregunta.getOpciones().get(pregunta.getRespuestaCorrecta()), 
                                    "Tiempo Agotado", JOptionPane.WARNING_MESSAGE);
        
        // Deshabilitar botones
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        
        // Continuar con la siguiente pregunta después de 2 segundos
        Timer delay = new Timer(2000, e -> {
            preguntaActual++;
            iniciarPregunta();
        });
        delay.setRepeats(false);
        delay.start();
    }
    
    private int calcularPuntos() {
        int puntosBase = 100;
        
        // Bonus por dificultad
        switch (dificultad) {
            case "Fácil": puntosBase = 50; break;
            case "Normal": puntosBase = 100; break;
            case "Avanzado": puntosBase = 150; break;
        }
        
        // Bonus por tiempo restante
        double porcentajeTiempo = (double) tiempoRestante / tiempoTotal;
        int bonusTiempo = (int) (puntosBase * porcentajeTiempo * 0.5);
        
        return puntosBase + bonusTiempo;
    }
    
    private void mostrarResultados() {
        if (temporizador != null) {
            temporizador.stop();
        }
        
        int preguntasCorrectas = 0;
        // Calcular preguntas correctas basado en el puntaje
        
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
            "%s %s\n\n" +
            "Configuración: %s - %s\n" +
            "Área: %s - %s\n\n" +
            "Puntuación Final: %d\n" +
            "Preguntas Respondidas: %d/10",
            emoji, nivel, nivelAcademico, dificultad, area, curso,
            puntaje, preguntaActual
        );
        
        JOptionPane.showMessageDialog(this, mensaje, "Resultados Finales", JOptionPane.INFORMATION_MESSAGE);
        
        // Volver a la bitácora
        this.dispose();
        Bitacora bitacora = new Bitacora();
        bitacora.setVisible(true);
    }