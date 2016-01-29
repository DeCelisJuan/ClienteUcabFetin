package vista;

import java.awt.Color;
import controlador.Validaciones;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controlador.ConexionCliente;
import controlador.ControlInterfazVentas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;
/**
 * @author DrowSoft
 */
public class Ingreso extends javax.swing.JFrame {

    controlador.Validaciones validar = new Validaciones();
    String contra="";
    
    public Ingreso() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelContraseña.setVisible(false); panelOlvido.setVisible(false); panelPregEscrita.setVisible(false);
        textUsuario.setCaretColor(Color.black); textContraseña.setCaretColor(Color.black);
        textUsuario.setCaretPosition(0); textContraseña.setCaretPosition(0);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContraseña = new javax.swing.JPanel();
        textNuevCon = new javax.swing.JTextField();
        textConfCon = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        labelConfCon = new javax.swing.JLabel();
        labelNuevCon = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        panelOlvido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        textUsuarioRecu = new javax.swing.JTextField();
        labelPregunta = new javax.swing.JLabel();
        labelRespuesta = new javax.swing.JLabel();
        textRespuesta = new javax.swing.JTextField();
        botonSig = new javax.swing.JButton();
        botonReg = new javax.swing.JButton();
        labelMensErrRec = new javax.swing.JLabel();
        boxPregSecreta = new javax.swing.JComboBox<>();
        panelPregEscrita = new javax.swing.JPanel();
        textPregunta = new javax.swing.JTextField();
        labelPregunta1 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        textContraseña = new javax.swing.JTextField();
        textUsuario = new javax.swing.JTextField();
        botonSalir = new javax.swing.JButton();
        botonIngresar = new javax.swing.JButton();
        labelOlvido = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContraseña.setOpaque(false);
        panelContraseña.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelContraseña.add(textNuevCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 330, 30));
        panelContraseña.add(textConfCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 330, 30));

        botonAceptar.setFont(new java.awt.Font("Gabriola", 3, 20)); // NOI18N
        botonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        botonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/botonOk.png"))); // NOI18N
        botonAceptar.setText("Aceptar");
        botonAceptar.setBorder(null);
        botonAceptar.setContentAreaFilled(false);
        botonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAceptarMouseExited(evt);
            }
        });
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        panelContraseña.add(botonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 140, 40));

        labelConfCon.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelConfCon.setForeground(new java.awt.Color(255, 255, 255));
        labelConfCon.setText("Confirme su nueva contraseña:");
        panelContraseña.add(labelConfCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 330, 30));

        labelNuevCon.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelNuevCon.setForeground(new java.awt.Color(255, 255, 255));
        labelNuevCon.setText("Ingrese su nueva contraseña:");
        panelContraseña.add(labelNuevCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 330, 30));

        labelTitulo.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Recuperación de contraseña");
        panelContraseña.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, 50));

        botonCancelar.setFont(new java.awt.Font("Gabriola", 3, 20)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/botonX.png"))); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.setBorder(null);
        botonCancelar.setContentAreaFilled(false);
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCancelarMouseExited(evt);
            }
        });
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        panelContraseña.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 140, 40));

        getContentPane().add(panelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        panelOlvido.setOpaque(false);
        panelOlvido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/munecoInterrogacion.png"))); // NOI18N
        jLabel1.setText("Recuperación de contraseña");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelOlvido.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 90));

        labelUsuario.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Introduzca su nombre de usuario:");
        panelOlvido.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 270, 30));

        textUsuarioRecu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textUsuarioRecuKeyTyped(evt);
            }
        });
        panelOlvido.add(textUsuarioRecu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 270, 30));

        labelPregunta.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelPregunta.setForeground(new java.awt.Color(255, 255, 255));
        labelPregunta.setText("Introduzca su pregunta secreta:");
        panelOlvido.add(labelPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 270, 30));

        labelRespuesta.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelRespuesta.setForeground(new java.awt.Color(255, 255, 255));
        labelRespuesta.setText("Introduzca su respuesta secreta:");
        panelOlvido.add(labelRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 270, 30));
        panelOlvido.add(textRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 270, 30));

        botonSig.setFont(new java.awt.Font("Gabriola", 3, 20)); // NOI18N
        botonSig.setForeground(new java.awt.Color(255, 255, 255));
        botonSig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/botonOk.png"))); // NOI18N
        botonSig.setText("Siguiente");
        botonSig.setBorder(null);
        botonSig.setContentAreaFilled(false);
        botonSig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSigMouseExited(evt);
            }
        });
        botonSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSigActionPerformed(evt);
            }
        });
        panelOlvido.add(botonSig, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 140, 40));

        botonReg.setFont(new java.awt.Font("Gabriola", 3, 20)); // NOI18N
        botonReg.setForeground(new java.awt.Color(255, 255, 255));
        botonReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/botonRegresar.png"))); // NOI18N
        botonReg.setText("Regresar");
        botonReg.setBorder(null);
        botonReg.setContentAreaFilled(false);
        botonReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegMouseExited(evt);
            }
        });
        botonReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegActionPerformed(evt);
            }
        });
        panelOlvido.add(botonReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 140, 40));

        labelMensErrRec.setFont(new java.awt.Font("Century", 3, 14)); // NOI18N
        labelMensErrRec.setForeground(new java.awt.Color(255, 0, 0));
        labelMensErrRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelOlvido.add(labelMensErrRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 260, 20));

        boxPregSecreta.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        boxPregSecreta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Nombre de tu primera mascota?", "¿Cuál es tu comida preferida?", "¿Lugar de nacimiento de la madre?", "Escribir otra pregunta..." }));
        boxPregSecreta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxPregSecretaItemStateChanged(evt);
            }
        });
        panelOlvido.add(boxPregSecreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 270, 30));

        panelPregEscrita.setOpaque(false);
        panelPregEscrita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelPregEscrita.add(textPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 270, 30));

        labelPregunta1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelPregunta1.setForeground(new java.awt.Color(255, 255, 255));
        labelPregunta1.setText("Escriba la preguta");
        panelPregEscrita.add(labelPregunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 270, 30));

        panelOlvido.add(panelPregEscrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 300, 100));

        getContentPane().add(panelOlvido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        panelPrincipal.setOpaque(false);
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setFont(new java.awt.Font("Vivaldi", 3, 60)); // NOI18N
        labelLogo.setForeground(new java.awt.Color(255, 255, 255));
        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/LogoFinal.png"))); // NOI18N
        labelLogo.setText("Bienvenido");
        labelLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelLogo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelPrincipal.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 380, 200));

        textContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textContraseña.setForeground(Color.LIGHT_GRAY);
        textContraseña.setText("Contraseña");
        textContraseña.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                textContraseñaMouseDragged(evt);
            }
        });
        textContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textContraseñaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textContraseñaMousePressed(evt);
            }
        });
        textContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textContraseñaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textContraseñaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textContraseñaKeyTyped(evt);
            }
        });
        panelPrincipal.add(textContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 220, 30));

        textUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textUsuario.setForeground(Color.LIGHT_GRAY);
        textUsuario.setText("Usuario");
        textUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                textUsuarioMouseDragged(evt);
            }
        });
        textUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textUsuarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textUsuarioMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textUsuarioMouseReleased(evt);
            }
        });
        textUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textUsuarioKeyTyped(evt);
            }
        });
        panelPrincipal.add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 220, 30));

        botonSalir.setFont(new java.awt.Font("Gabriola", 3, 20)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panelPrincipal.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 110, 30));

        botonIngresar.setFont(new java.awt.Font("Gabriola", 3, 20)); // NOI18N
        botonIngresar.setText("Ingresar");
        botonIngresar.setMargin(new java.awt.Insets(2, 0, 2, 0));
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });
        panelPrincipal.add(botonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 110, 30));

        labelOlvido.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        labelOlvido.setForeground(new java.awt.Color(255, 255, 255));
        labelOlvido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOlvido.setText("Olvidó la contraseña");
        labelOlvido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelOlvido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelOlvidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelOlvidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelOlvidoMouseExited(evt);
            }
        });
        panelPrincipal.add(labelOlvido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 180, 20));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/FondoIngresar.jpg"))); // NOI18N
        labelFondo.setOpaque(true);
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void textUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUsuarioKeyPressed
        if (validar.validarEspeciales(evt.getKeyChar())){
            evt.consume();
        }else{
            validarBorrado(textUsuario, "Usuario", evt.getKeyChar(), 2);
            if (validarTextoFondo(textUsuario,"Usuario",evt.getKeyChar(),false)){ evt.consume();}
            if (evt.getKeyChar()==10){ textUsuario.requestFocus();  evt.consume();}
        }
    }//GEN-LAST:event_textUsuarioKeyPressed

    private void textUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUsuarioKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar())){ evt.consume();}
    }//GEN-LAST:event_textUsuarioKeyTyped

    private void textUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textUsuarioMouseClicked
        if (textUsuario.getText().equals("Usuario")){ textUsuario.setCaretPosition(0);}
    }//GEN-LAST:event_textUsuarioMouseClicked

    private void textUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textUsuarioMouseReleased
      
    }//GEN-LAST:event_textUsuarioMouseReleased

    private void textUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textUsuarioMousePressed
        if (textUsuario.getText().equals("Usuario")){textUsuario.setCaretPosition(0);}
    }//GEN-LAST:event_textUsuarioMousePressed

    private void textUsuarioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textUsuarioMouseDragged
        if (textUsuario.getText().equals("Usuario")){ textUsuario.setCaretPosition(0);}
    }//GEN-LAST:event_textUsuarioMouseDragged

    private void textContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textContraseñaKeyPressed
        if (validarTextoFondo(textContraseña, "Contraseña", evt.getKeyChar(),false)){ evt.consume();}
        if (evt.getKeyChar() == 10 ){  evt.consume();}//ingresa al sistema si es un enter
    }//GEN-LAST:event_textContraseñaKeyPressed

    private void textContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textContraseñaKeyReleased
        validarBorrado(textContraseña, "Contraseña", evt.getKeyChar(), 1);
    }//GEN-LAST:event_textContraseñaKeyReleased

    private void textContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textContraseñaKeyTyped
       char letra=evt.getKeyChar();

        if (validarTextoFondo(textContraseña, "Contraseña", evt.getKeyChar(),true)){
            evt.consume();
        }else{
            if(letra!=8 && letra!=127 && letra<260 && letra!=10){
                textContraseña.setText(textContraseña.getText()+"*");
                contra=contra+String.valueOf(letra);
                evt.consume();
            }else{
                if(letra==8 || letra==127){
                    if ((letra==127) && (textContraseña.getCaretPosition()==contra.length())){
                        evt.consume();}else{
                        contra=contra.substring(0,(textContraseña.getCaretPosition()))+contra.substring(textContraseña.getCaretPosition()+1,(contra.length()));   }
                }
            }
        }
        validarBorrado(textContraseña, "Contraseña", evt.getKeyChar(), 1);
    }//GEN-LAST:event_textContraseñaKeyTyped

    private void textContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textContraseñaMouseClicked
         if (textContraseña.getText().equals("Contraseña")){textContraseña.setCaretPosition(0);}
    }//GEN-LAST:event_textContraseñaMouseClicked

    private void textContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textContraseñaMousePressed
       if (textContraseña.getText().equals("Contraseña")){textContraseña.setCaretPosition(0);}
    }//GEN-LAST:event_textContraseñaMousePressed

    private void textContraseñaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textContraseñaMouseDragged
       if (textContraseña.getText().equals("Contraseña")){textContraseña.setCaretPosition(0);}
    }//GEN-LAST:event_textContraseñaMouseDragged

    private void labelOlvidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOlvidoMouseClicked
        panelPrincipal.setVisible(false); panelOlvido.setVisible(true);
    }//GEN-LAST:event_labelOlvidoMouseClicked

    private void labelOlvidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOlvidoMouseEntered
        labelOlvido.setForeground(Color.blue);
    }//GEN-LAST:event_labelOlvidoMouseEntered

    private void labelOlvidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOlvidoMouseExited
        labelOlvido.setForeground(Color.white);
    }//GEN-LAST:event_labelOlvidoMouseExited

    private void textUsuarioRecuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUsuarioRecuKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar())){evt.consume();}
    }//GEN-LAST:event_textUsuarioRecuKeyTyped

    private void botonSigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSigMouseEntered
        botonSig.setContentAreaFilled(true); botonSig.setForeground(Color.black);
    }//GEN-LAST:event_botonSigMouseEntered

    private void botonSigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSigMouseExited
        botonSig.setContentAreaFilled(false);  botonSig.setForeground(Color.white);
    }//GEN-LAST:event_botonSigMouseExited

    private void botonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSigActionPerformed
        if (!camposVacios()){
            ConexionCliente conexion = new ConexionCliente();
            String mensaje= conexion.recuperarContraseña(textUsuarioRecu.getText(), enviarPregunta(), textRespuesta.getText());
            if (mensaje.equals("Datos Correctos")){
                    panelContraseña.setVisible(true); panelOlvido.setVisible(false);
                    labelMensErrRec.setText("");
            }else{
                if (mensaje.equals("Servidor caido")){
                    JOptionPane.showMessageDialog(null, mensaje);
                }else{
                    labelMensErrRec.setText("Los datos ingresados no coinciden");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
        }
    }//GEN-LAST:event_botonSigActionPerformed

    private void botonRegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegMouseEntered
        botonReg.setContentAreaFilled(true);  botonReg.setForeground(Color.black);
    }//GEN-LAST:event_botonRegMouseEntered

    private void botonRegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegMouseExited
        botonReg.setContentAreaFilled(false); botonReg.setForeground(Color.white);
    }//GEN-LAST:event_botonRegMouseExited

    private void botonRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegActionPerformed
        panelPrincipal.setVisible(true);  panelOlvido.setVisible(false);
        labelMensErrRec.setText(""); textUsuarioRecu.setText(""); textRespuesta.setText("");
        textPregunta.setText("");boxPregSecreta.setSelectedIndex(0);
    }//GEN-LAST:event_botonRegActionPerformed

    private void botonAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarMouseEntered
        botonAceptar.setContentAreaFilled(true);botonAceptar.setForeground(Color.black);
    }//GEN-LAST:event_botonAceptarMouseEntered

    private void botonAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarMouseExited
        botonAceptar.setContentAreaFilled(false); botonAceptar.setForeground(Color.white);
    }//GEN-LAST:event_botonAceptarMouseExited

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        if (!textNuevCon.getText().equals("")&&!textConfCon.getText().equals("")){
            if (textNuevCon.getText().equals(textConfCon.getText())){
                ConexionCliente conexion = new ConexionCliente();
                String mensaje=conexion.modificarContraseña(textUsuarioRecu.getText(), textNuevCon.getText());
                JOptionPane.showMessageDialog(null, "Contraseña modificada correctamente");
                panelPrincipal.setVisible(true);  panelContraseña.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "No coinciden ambas contraseñas");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseEntered
        botonCancelar.setContentAreaFilled(true); botonCancelar.setForeground(Color.black);
    }//GEN-LAST:event_botonCancelarMouseEntered

    private void botonCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseExited
        botonCancelar.setContentAreaFilled(false); botonCancelar.setForeground(Color.white);
    }//GEN-LAST:event_botonCancelarMouseExited

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        panelContraseña.setVisible(false); panelPrincipal.setVisible(true);
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
    if ((textUsuario.getText().equals("Usuario")&&textUsuario.getForeground().equals(Color.LIGHT_GRAY))
       ||(textContraseña.getText().equals("Contraseña")&&textContraseña.getForeground().equals(Color.LIGHT_GRAY))){   
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
    }else{ 
        ConexionCliente conexion = new ConexionCliente();
        String mensaje= conexion.iniciarSesion(textUsuario.getText(), contra);
        String[] Datos = mensaje.split("/");
        if (Datos[0].equals("Usuario Correcto")){
            PrincipalVentas obj = new PrincipalVentas(Datos[1],textUsuario.getText());
            obj.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, mensaje);
       }
    }  
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void boxPregSecretaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxPregSecretaItemStateChanged
         if (boxPregSecreta.getSelectedItem()!=null){
            if (boxPregSecreta.getSelectedItem().equals("Escribir otra pregunta...")){
                panelPregEscrita.setVisible(true);
            }else{
                panelPregEscrita.setVisible(false);
            }
        }
    }//GEN-LAST:event_boxPregSecretaItemStateChanged
      
    //método que valida que hay que volver a poner el texto de fondo(usuario o contraseña) del jtextfield
    public void validarBorrado(JTextField campo,String palabra,char letra,int num){
        if ((letra == 8)|| (letra==127)){
            if(campo.getText().length()<num){
                campo.setText(palabra);
                campo.setCaretPosition(0);
                campo.setForeground(Color.LIGHT_GRAY);
            }
        }
    }
    //método que valida si hay que quitar el texto del fondo(Usuario o Contraseña) del jtextfield
    public boolean validarTextoFondo(JTextField campo,String palabra,char letra,boolean hacer){            
        if (campo.getText().equals(palabra)){            
            if ((letra>260)||letra==8 || letra==127||letra==10){
                return true;
            }else{
                campo.setText("");
                campo.setForeground(Color.black);
                if(hacer){ contra=String.valueOf(letra);  return true;}
            }        }return false;
    }  
    
    public boolean camposVacios(){
        if (textUsuarioRecu.getText().equals("")||textRespuesta.getText().equals("")){
            return true;
        }else{
            if (boxPregSecreta.getSelectedItem().toString().equals("Escribir otra pregunta...")){
                if (textPregunta.getText().equals("")){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
    }
    
    public String enviarPregunta(){
        if (boxPregSecreta.getSelectedItem().toString().equals("Escribir otra pregunta...")){
                return textPregunta.getText();
            }else{
                return boxPregSecreta.getSelectedItem().toString();
            }
    }
    
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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonReg;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonSig;
    private javax.swing.JComboBox<String> boxPregSecreta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelConfCon;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelMensErrRec;
    private javax.swing.JLabel labelNuevCon;
    private javax.swing.JLabel labelOlvido;
    private javax.swing.JLabel labelPregunta;
    private javax.swing.JLabel labelPregunta1;
    private javax.swing.JLabel labelRespuesta;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelContraseña;
    private javax.swing.JPanel panelOlvido;
    private javax.swing.JPanel panelPregEscrita;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField textConfCon;
    private javax.swing.JTextField textContraseña;
    private javax.swing.JTextField textNuevCon;
    private javax.swing.JTextField textPregunta;
    private javax.swing.JTextField textRespuesta;
    private javax.swing.JTextField textUsuario;
    private javax.swing.JTextField textUsuarioRecu;
    // End of variables declaration//GEN-END:variables
}
