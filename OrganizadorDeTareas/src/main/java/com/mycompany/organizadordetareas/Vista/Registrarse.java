/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.organizadordetareas.Vista;

import com.mycompany.organizadordetareas.Controlador.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Arrick
 */
public class Registrarse extends javax.swing.JFrame {
    private final GestorUser gestorUsuarios = new GestorUser();
    private VentanaInicio v1;
    /**
     * Creates new form Registrarse
     */
    public Registrarse() {
        initComponents();
        setLocation(400,500);
        setSize(1000,800);
        setResizable(false);
        errContra.setVisible(false); 
     errContras.setVisible(false);
     errUsuario.setVisible(false);
     exito.setVisible(false);
    rellenar_label.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text_usuario = new javax.swing.JTextField();
        text_contrase = new javax.swing.JTextField();
        text_recontra = new javax.swing.JTextField();
        usuarioLabel = new javax.swing.JLabel();
        contraLabel = new javax.swing.JLabel();
        reescribrirLabel = new javax.swing.JLabel();
        btn_registrarse = new javax.swing.JButton();
        errUsuario = new javax.swing.JLabel();
        errContra = new javax.swing.JLabel();
        errContras = new javax.swing.JLabel();
        rellenar_label = new javax.swing.JLabel();
        exito = new javax.swing.JLabel();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        text_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_usuarioActionPerformed(evt);
            }
        });

        text_recontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_recontraActionPerformed(evt);
            }
        });

        usuarioLabel.setText("Usuario");

        contraLabel.setText("Escriba una contraseña:");

        reescribrirLabel.setText("Reescriba su contraseña:");

        btn_registrarse.setText("Registrarse");
        btn_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarseActionPerformed(evt);
            }
        });

        errUsuario.setText("Usuario ya existente");

        errContra.setText("La contraseña debe contener al menos 8 caracteres, incluyendo al menos una letra mayúscula, una minúscula, un número y un carácter especial.");

        errContras.setText("Las contraseñas no coinciden");

        rellenar_label.setText("Rellene los espacios por favor");

        exito.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        exito.setText("Excitante");

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(errContra)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exito, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(310, 310, 310))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuarioLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(text_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(text_recontra, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                .addComponent(text_contrase, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                                        .addComponent(reescribrirLabel))
                                    .addComponent(contraLabel))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(errUsuario))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(errContras))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(rellenar_label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(446, 446, 446)
                        .addComponent(btn_registrarse))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(volver)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(usuarioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errUsuario))
                .addGap(39, 39, 39)
                .addComponent(contraLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_contrase, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(errContras))
                .addGap(26, 26, 26)
                .addComponent(reescribrirLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_recontra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(errContra, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rellenar_label)
                .addGap(18, 18, 18)
                .addComponent(btn_registrarse)
                .addGap(18, 18, 18)
                .addComponent(exito, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(volver)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_usuarioActionPerformed

    private void text_recontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_recontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_recontraActionPerformed
    
    public  boolean validarContraSegura(String contrasena) {
        // Al menos 8 caracteres, una mayúscula, una minúscula, un número y un carácter
        // especial
        String pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(contrasena);

        return m.matches();
    }

    private void btn_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarseActionPerformed
        String tex_usuario = text_usuario.getText();
        String tex_contra = text_contrase.getText();
        String tex_recontra = text_recontra.getText();
        
        errContra.setVisible(false); 
     errContras.setVisible(false);
     errUsuario.setVisible(false);
     
    rellenar_label.setVisible(false);
        boolean valida = validarContraSegura(tex_contra);
        if(tex_usuario.equals("") || tex_contra.equals("")){
            rellenar_label.setVisible(true);
        }else{
            if(!valida){             
                errContra.setVisible(true);            
            }else{                
                if(!tex_contra.equals(tex_recontra)){
                    errContras.setVisible(true);
                  
                }else{
                   Usuario user = gestorUsuarios.buscarUsuarioNom(tex_usuario);
                   if (!gestorUsuarios.registrarUsuario(new Usuario(tex_usuario, tex_contra))) {
                        errUsuario.setVisible(true);
                    } else {
                        exito.setVisible(true);
                    }
                }
        }
}
        
           
        
        
    }//GEN-LAST:event_btn_registrarseActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
                                              
        v1.setVisible(true);
        this.setVisible(false);
   
    }//GEN-LAST:event_volverActionPerformed
    public void setV1(VentanaInicio v1){
        this.v1 = v1;
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
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrarse;
    private javax.swing.JLabel contraLabel;
    private javax.swing.JLabel errContra;
    private javax.swing.JLabel errContras;
    private javax.swing.JLabel errUsuario;
    private javax.swing.JLabel exito;
    private javax.swing.JLabel reescribrirLabel;
    private javax.swing.JLabel rellenar_label;
    private javax.swing.JTextField text_contrase;
    private javax.swing.JTextField text_recontra;
    private javax.swing.JTextField text_usuario;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
