/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.organizadordetareas.Vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.mycompany.organizadordetareas.Controlador.*;
/**
 *
 * @author Usuario
 */
public class MenuUsuario extends javax.swing.JFrame {
//Atributo Usuario para poder acceder a su nombre y su ruta
   private CrearEvento crearEv;
   private CrearTarea crearTar;
   private EditarEvento editEvento;
   private EditarTarea editTarea;
    Usuario user;
   GestorGeneral g;
   
    /**
     * Creates new form MenuUsuario
     * @param u es el usuario que inicio sesion
     */
    public MenuUsuario(Usuario u) {
        user = u;
        g = new GestorGeneral(u);
        initComponents();
        setLocationRelativeTo(null);
        //actualizadores
        //buscadores();
        setLocation(400,500);
        setSize(1000,700);
        jDChoose.setVisible(false);
        jDEvento.setVisible(false);
        jDTarea.setVisible(false);
        jDEvEncontrado.setVisible(false);
        setMaximumSize(new Dimension(1000,700));
        setMinimumSize(new Dimension(1000,700));
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(55, 57, 63));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDChoose = new javax.swing.JDialog();
        lblEvento1 = new javax.swing.JLabel();
        bttnBuscarEvento = new javax.swing.JButton();
        bttnBuscarTarea = new javax.swing.JButton();
        lblEvento2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jDEvento = new javax.swing.JDialog();
        lblEvento3 = new javax.swing.JLabel();
        txtEventoBuscar = new javax.swing.JTextField();
        btnCancelar1 = new javax.swing.JButton();
        bttnBuscarEv = new javax.swing.JButton();
        jDTarea = new javax.swing.JDialog();
        lblEvento4 = new javax.swing.JLabel();
        txtTareaBuscar = new javax.swing.JTextField();
        btnCancelar2 = new javax.swing.JButton();
        bttnBuscarTar = new javax.swing.JButton();
        jDEvEncontrado = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblEvento5 = new javax.swing.JLabel();
        btnCancelar3 = new javax.swing.JButton();
        jDTarEncontrado = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        lblEvento6 = new javax.swing.JLabel();
        btnCancelar4 = new javax.swing.JButton();
        jdNoTarEncontrado = new javax.swing.JDialog();
        lblEvento7 = new javax.swing.JLabel();
        btnCancelar5 = new javax.swing.JButton();
        jdNoEvEncontrado = new javax.swing.JDialog();
        lblEvento8 = new javax.swing.JLabel();
        btnCancelar6 = new javax.swing.JButton();
        lblBienvenida = new javax.swing.JLabel();
        lblTarea = new javax.swing.JLabel();
        lblEvento = new javax.swing.JLabel();
        bttnAddEvento = new javax.swing.JButton();
        bttnAddTarea = new javax.swing.JButton();
        bttnEliminarTarea = new javax.swing.JButton();
        bttnEditarTarea = new javax.swing.JButton();
        bttnEliminarEvento = new javax.swing.JButton();
        bttnEditarEvento = new javax.swing.JButton();
        bttnCerrarSesion = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listTarea = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listEvento = new javax.swing.JList<>();
        bttnBuscar = new javax.swing.JButton();

        jDChoose.setBackground(new java.awt.Color(55, 57, 63));

        lblEvento1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblEvento1.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento1.setText("Desea buscar un:");

        bttnBuscarEvento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnBuscarEvento.setText("Evento");
        bttnBuscarEvento.setBorder(null);
        bttnBuscarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBuscarEventoActionPerformed(evt);
            }
        });

        bttnBuscarTarea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnBuscarTarea.setText("Tarea");
        bttnBuscarTarea.setBorder(null);
        bttnBuscarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBuscarTareaActionPerformed(evt);
            }
        });

        lblEvento2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblEvento2.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento2.setText("ó");

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jDChoose.setSize(330, 200); // Fija el tamaño del diálogo
        jDChoose.setResizable(false); // No permite redimensionar el diálogo
        jDChoose.setLocationRelativeTo(null);
        jDChoose.getContentPane().setBackground(new java.awt.Color(55, 57, 63));

        javax.swing.GroupLayout jDChooseLayout = new javax.swing.GroupLayout(jDChoose.getContentPane());
        jDChoose.getContentPane().setLayout(jDChooseLayout);
        jDChooseLayout.setHorizontalGroup(
            jDChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDChooseLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lblEvento1)
                .addGap(90, 90, 90))
            .addGroup(jDChooseLayout.createSequentialGroup()
                .addGroup(jDChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDChooseLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(bttnBuscarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(lblEvento2)
                        .addGap(18, 18, 18)
                        .addComponent(bttnBuscarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDChooseLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jDChooseLayout.setVerticalGroup(
            jDChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDChooseLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblEvento1)
                .addGap(15, 15, 15)
                .addGroup(jDChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnBuscarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnBuscarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEvento2))
                .addGap(25, 25, 25)
                .addComponent(btnCancelar)
                .addGap(25, 25, 25))
        );

        jDEvento.setBackground(new java.awt.Color(55, 57, 63));

        lblEvento3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblEvento3.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento3.setText("Ingrese el titulo que desea buscar:");

        txtEventoBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEventoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEventoBuscarActionPerformed(evt);
            }
        });

        btnCancelar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar1.setText("CANCELAR");
        btnCancelar1.setBorder(null);
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        bttnBuscarEv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bttnBuscarEv.setText("BUSCAR");
        bttnBuscarEv.setBorder(null);
        bttnBuscarEv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBuscarEvActionPerformed(evt);
            }
        });

        jDEvento.setSize(366, 200); // Fija el tamaño del diálogo
        jDEvento.setResizable(false); // No permite redimensionar el diálogo
        jDEvento.setLocationRelativeTo(null);
        jDEvento.getContentPane().setBackground(new java.awt.Color(55, 57, 63));

        javax.swing.GroupLayout jDEventoLayout = new javax.swing.GroupLayout(jDEvento.getContentPane());
        jDEvento.getContentPane().setLayout(jDEventoLayout);
        jDEventoLayout.setHorizontalGroup(
            jDEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEventoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jDEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblEvento3)
                    .addGroup(jDEventoLayout.createSequentialGroup()
                        .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnBuscarEv, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEventoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        jDEventoLayout.setVerticalGroup(
            jDEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEventoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblEvento3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEventoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar1)
                    .addComponent(bttnBuscarEv))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jDTarea.setTitle("BuscarEvento");
        jDTarea.setBackground(new java.awt.Color(55, 57, 63));

        lblEvento4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblEvento4.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento4.setText("Ingrese el titulo que desea buscar:");

        txtTareaBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTareaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTareaBuscarActionPerformed(evt);
            }
        });

        btnCancelar2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar2.setText("CANCELAR");
        btnCancelar2.setBorder(null);
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });

        bttnBuscarTar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bttnBuscarTar.setText("BUSCAR");
        bttnBuscarTar.setBorder(null);
        bttnBuscarTar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBuscarTarActionPerformed(evt);
            }
        });

        jDTarea.setSize(366, 200); // Fija el tamaño del diálogo
        jDTarea.setResizable(false); // No permite redimensionar el diálogo
        jDTarea.setLocationRelativeTo(null);
        jDTarea.getContentPane().setBackground(new java.awt.Color(55, 57, 63));

        javax.swing.GroupLayout jDTareaLayout = new javax.swing.GroupLayout(jDTarea.getContentPane());
        jDTarea.getContentPane().setLayout(jDTareaLayout);
        jDTareaLayout.setHorizontalGroup(
            jDTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDTareaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jDTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEvento4)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDTareaLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(txtTareaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jDTareaLayout.createSequentialGroup()
                        .addComponent(btnCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(bttnBuscarTar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jDTareaLayout.setVerticalGroup(
            jDTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDTareaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblEvento4)
                .addGap(18, 18, 18)
                .addComponent(txtTareaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar2)
                    .addComponent(bttnBuscarTar))
                .addGap(40, 40, 40))
        );

        jDEvEncontrado.setBackground(new java.awt.Color(55, 57, 63));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText(g.buscarTarea(txtTareaBuscar.getText()));
        jScrollPane1.setViewportView(jTextArea1);

        lblEvento5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblEvento5.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento5.setText("Su hallo su evento:");

        btnCancelar3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar3.setText("ACEPTAR");
        btnCancelar3.setBorder(null);
        btnCancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar3ActionPerformed(evt);
            }
        });

        jDEvEncontrado.setSize(400, 300); // Fija el tamaño del diálogo
        jDEvEncontrado.setResizable(false); // No permite redimensionar el diálogo
        jDEvEncontrado.setLocationRelativeTo(null);
        jDEvEncontrado.getContentPane().setBackground(new java.awt.Color(55, 57, 63));

        javax.swing.GroupLayout jDEvEncontradoLayout = new javax.swing.GroupLayout(jDEvEncontrado.getContentPane());
        jDEvEncontrado.getContentPane().setLayout(jDEvEncontradoLayout);
        jDEvEncontradoLayout.setHorizontalGroup(
            jDEvEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEvEncontradoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jDEvEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCancelar3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDEvEncontradoLayout.createSequentialGroup()
                        .addComponent(lblEvento5)
                        .addGap(145, 145, 145))
                    .addComponent(jScrollPane1))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jDEvEncontradoLayout.setVerticalGroup(
            jDEvEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEvEncontradoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblEvento5)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnCancelar3)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jDTarEncontrado.setBackground(new java.awt.Color(55, 57, 63));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText(g.buscarEvento(txtEventoBuscar.getText()));
        jScrollPane3.setViewportView(jTextArea2);

        lblEvento6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblEvento6.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento6.setText("Su hallo su tarea:");

        btnCancelar4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar4.setText("ACEPTAR");
        btnCancelar4.setBorder(null);
        btnCancelar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar4ActionPerformed(evt);
            }
        });

        jDTarEncontrado.setSize(400, 300); // Fija el tamaño del diálogo
        jDTarEncontrado.setResizable(false); // No permite redimensionar el diálogo
        jDTarEncontrado.setLocationRelativeTo(null);
        jDTarEncontrado.getContentPane().setBackground(new java.awt.Color(55, 57, 63));

        javax.swing.GroupLayout jDTarEncontradoLayout = new javax.swing.GroupLayout(jDTarEncontrado.getContentPane());
        jDTarEncontrado.getContentPane().setLayout(jDTarEncontradoLayout);
        jDTarEncontradoLayout.setHorizontalGroup(
            jDTarEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDTarEncontradoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jDTarEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDTarEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCancelar4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDTarEncontradoLayout.createSequentialGroup()
                            .addComponent(lblEvento6)
                            .addGap(160, 160, 160))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jDTarEncontradoLayout.setVerticalGroup(
            jDTarEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDTarEncontradoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblEvento6)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnCancelar4)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jdNoTarEncontrado.setBackground(new java.awt.Color(55, 57, 63));

        lblEvento7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblEvento7.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento7.setText("No se hallo su tarea");

        btnCancelar5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar5.setText("ACEPTAR");
        btnCancelar5.setBorder(null);
        btnCancelar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar5ActionPerformed(evt);
            }
        });

        jdNoTarEncontrado.setSize(275, 136); // Fija el tamaño del diálogo
        jdNoTarEncontrado.setResizable(false); // No permite redimensionar el diálogo
        jdNoTarEncontrado.setLocationRelativeTo(null);
        jdNoTarEncontrado.getContentPane().setBackground(new java.awt.Color(55, 57, 63));

        javax.swing.GroupLayout jdNoTarEncontradoLayout = new javax.swing.GroupLayout(jdNoTarEncontrado.getContentPane());
        jdNoTarEncontrado.getContentPane().setLayout(jdNoTarEncontradoLayout);
        jdNoTarEncontradoLayout.setHorizontalGroup(
            jdNoTarEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdNoTarEncontradoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jdNoTarEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEvento7))
                .addGap(50, 50, 50))
        );
        jdNoTarEncontradoLayout.setVerticalGroup(
            jdNoTarEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdNoTarEncontradoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblEvento7)
                .addGap(30, 30, 30)
                .addComponent(btnCancelar5)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jdNoEvEncontrado.setBackground(new java.awt.Color(55, 57, 63));

        lblEvento8.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblEvento8.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento8.setText("No se hallo su evento");

        btnCancelar6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar6.setText("ACEPTAR");
        btnCancelar6.setBorder(null);
        btnCancelar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar6ActionPerformed(evt);
            }
        });

        jdNoEvEncontrado.setSize(290, 136); // Fija el tamaño del diálogo
        jdNoEvEncontrado.setResizable(false); // No permite redimensionar el diálogo
        jdNoEvEncontrado.setLocationRelativeTo(null);
        jdNoEvEncontrado.getContentPane().setBackground(new java.awt.Color(55, 57, 63));

        javax.swing.GroupLayout jdNoEvEncontradoLayout = new javax.swing.GroupLayout(jdNoEvEncontrado.getContentPane());
        jdNoEvEncontrado.getContentPane().setLayout(jdNoEvEncontradoLayout);
        jdNoEvEncontradoLayout.setHorizontalGroup(
            jdNoEvEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdNoEvEncontradoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jdNoEvEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEvento8))
                .addGap(50, 50, 50))
        );
        jdNoEvEncontradoLayout.setVerticalGroup(
            jdNoEvEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdNoEvEncontradoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblEvento8)
                .addGap(30, 30, 30)
                .addComponent(btnCancelar6)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(55, 57, 63));

        lblBienvenida.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(234, 234, 235));
        lblBienvenida.setText("Bienvenido "+user.getNombre()+"!");
        lblBienvenida.setToolTipText("");

        lblTarea.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblTarea.setForeground(new java.awt.Color(234, 234, 235));
        lblTarea.setText("Tarea");

        lblEvento.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblEvento.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento.setText("Evento");
        lblEvento.setToolTipText("");

        bttnAddEvento.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        bttnAddEvento.setText("+");
        bttnAddEvento.setBorder(null);
        bttnAddEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAddEventoActionPerformed(evt);
            }
        });

        bttnAddTarea.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bttnAddTarea.setText("+");
        bttnAddTarea.setBorder(null);
        bttnAddTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAddTareaActionPerformed(evt);
            }
        });

        bttnEliminarTarea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnEliminarTarea.setText("Eliminar");
        bttnEliminarTarea.setBorder(null);
        bttnEliminarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEliminarTareaActionPerformed(evt);
            }
        });

        bttnEditarTarea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnEditarTarea.setText("Editar");
        bttnEditarTarea.setBorder(null);
        bttnEditarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEditarTareaActionPerformed(evt);
            }
        });

        bttnEliminarEvento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnEliminarEvento.setText("Eliminar");
        bttnEliminarEvento.setBorder(null);
        bttnEliminarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEliminarEventoActionPerformed(evt);
            }
        });

        bttnEditarEvento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnEditarEvento.setText("Editar");
        bttnEditarEvento.setBorder(null);
        bttnEditarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEditarEventoActionPerformed(evt);
            }
        });

        bttnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnCerrarSesion.setText("Cerrar Sesión");
        bttnCerrarSesion.setBorder(null);
        bttnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCerrarSesionActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/organizadordetareas/Vista/oficial.png"))); // NOI18N

        listTarea.setBackground(new java.awt.Color(221, 221, 221));
        listTarea.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listTarea.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        listTarea.setForeground(new java.awt.Color(55, 57, 63));
        listTarea.setPreferredSize(new java.awt.Dimension(262, 393)); // Ancho = 300, Alto = 200

        // Puedes también usar setMinimumSize y setMaximumSize si es necesario
        listTarea.setMinimumSize(new java.awt.Dimension(262, 393));
        listTarea.setMaximumSize(new java.awt.Dimension(262, 393));
        listTarea.setModel(new javax.swing.DefaultListModel<String>() {

            String titulos = g.imprimirOrdenadoTarea();
            String[] strings = titulos.split("\n");
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listTarea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane4.setViewportView(listTarea);

        listEvento.setBackground(new java.awt.Color(221, 221, 221));
        listEvento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listEvento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        listEvento.setForeground(new java.awt.Color(55, 57, 63));
        listEvento.setModel(new javax.swing.DefaultListModel<String>() {

            String titulos = g.imprimirOrdenadoEvento();
            String[] strings = titulos.split("\n");
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listEvento.setPreferredSize(new java.awt.Dimension(262, 393)); // Ancho = 300, Alto = 200

        listEvento.setMinimumSize(new java.awt.Dimension(262, 393));
        listEvento.setMaximumSize(new java.awt.Dimension(262, 393));
        listEvento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                listEventoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                listEventoAncestorRemoved(evt);
            }
        });
        jScrollPane2.setViewportView(listEvento);

        bttnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnBuscar.setText("BUSCAR");
        bttnBuscar.setBorder(null);
        bttnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(bttnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(lblEvento)
                                        .addGap(89, 89, 89)
                                        .addComponent(bttnAddEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bttnEliminarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(bttnEditarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bttnEliminarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(bttnEditarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTarea)
                                        .addGap(111, 111, 111)
                                        .addComponent(bttnAddTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31))))
                            .addComponent(lblBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTarea)
                                .addComponent(bttnAddTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblEvento)
                                .addComponent(bttnAddEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208)
                        .addComponent(bttnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnEliminarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnEditarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnEditarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnEliminarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bttnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnAddEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAddEventoActionPerformed
        crearEv = new CrearEvento();
        //Se instancia el MenuUsuario asi que las demas clases pueden usar a libertad el MenuUsuario actualizado automaticamente.
        crearEv.setMenuUs(this);
        crearEv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttnAddEventoActionPerformed

    private void bttnAddTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAddTareaActionPerformed
        crearTar = new CrearTarea();
        //Se instancia el MenuUsuario asi que las demas clases pueden usar a libertad el MenuUsuario actualizado automaticamente.
        crearTar.setMenuUs(this);
        crearTar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttnAddTareaActionPerformed

    private void bttnEditarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEditarTareaActionPerformed
            String nombre = (listTarea.getSelectedIndex()!=-1?listTarea.getModel().getElementAt(listTarea.getSelectedIndex()):null);
            if(nombre!=null){
                Tarea posibleTarea = g.buscarTareaObjeto(nombre);
                if(posibleTarea!=null){
                    editTarea = new EditarTarea(posibleTarea, g);
                    editTarea.setVisible(true);
                    this.dispose();
                    }
                }
    }//GEN-LAST:event_bttnEditarTareaActionPerformed

    private void bttnEliminarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEliminarTareaActionPerformed
        int index = listTarea.getSelectedIndex();
        if(index!=-1){
            var model = listTarea.getModel();
            String causa = model.getElementAt(index);
            g.eliminarTarea(causa);
            releerTarea();
            }
    }//GEN-LAST:event_bttnEliminarTareaActionPerformed

    public void releerTarea(){
    listTarea.setModel(new javax.swing.DefaultListModel<String>(){
            String titulos = g.imprimirOrdenadoTarea();
            String[] strings = titulos.split("\n");
            @Override
            public int getSize() { return strings.length; }
            @Override
            public String getElementAt(int i) { return strings[i]; }
            });
    }
    
    private void bttnEliminarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEliminarEventoActionPerformed
        int index = listEvento.getSelectedIndex();
        if(index!=-1){var model = listEvento.getModel();
            String causa = model.getElementAt(index);
            g.eliminarEvento(causa);
            releerEvento();
            }
    }//GEN-LAST:event_bttnEliminarEventoActionPerformed

    public void releerEvento(){
        listEvento.setModel(new javax.swing.DefaultListModel<String>(){
            String titulos = g.imprimirOrdenadoEvento();
            String[] strings = titulos.split("\n");
            @Override
            public int getSize() { return strings.length; }
            @Override
            public String getElementAt(int i) { return strings[i]; }
            });
    }
    private void bttnEditarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEditarEventoActionPerformed
                String nombre = (listEvento.getSelectedIndex()!=-1?listEvento.getModel().getElementAt(listEvento.getSelectedIndex()):null);
                if(nombre!=null){
                    Evento posibleEvento = g.buscarEventoObjeto(nombre);
                    if(posibleEvento!=null){
                        editEvento = new EditarEvento(posibleEvento, g);
                        editEvento.setVisible(true);
                        this.dispose();
                    }
                }
    }//GEN-LAST:event_bttnEditarEventoActionPerformed

    private void bttnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCerrarSesionActionPerformed
        new VentanaInicio().setVisible(true);   
        this.dispose();
    }//GEN-LAST:event_bttnCerrarSesionActionPerformed

    private void listEventoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listEventoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_listEventoAncestorAdded

    private void listEventoAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listEventoAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_listEventoAncestorRemoved

    private void bttnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBuscarActionPerformed
        jDChoose.setVisible(true);
    }//GEN-LAST:event_bttnBuscarActionPerformed

    private void bttnBuscarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBuscarEventoActionPerformed
        jDChoose.dispose();
        jDEvento.setVisible(true);
    }//GEN-LAST:event_bttnBuscarEventoActionPerformed

    private void bttnBuscarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBuscarTareaActionPerformed
        jDChoose.dispose();
        jDTarea.setVisible(true);
    }//GEN-LAST:event_bttnBuscarTareaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        jDChoose.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtEventoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEventoBuscarActionPerformed
        
    }//GEN-LAST:event_txtEventoBuscarActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        jDEvento.dispose();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        jDTarea.dispose();
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    private void bttnBuscarTarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBuscarTarActionPerformed
        if(!g.buscarEvento(txtEventoBuscar.getText()).equals("No se encontró su Tarea")){
            jDTarea.dispose();
            jDEvEncontrado.setVisible(true);
        }
    }//GEN-LAST:event_bttnBuscarTarActionPerformed

    private void txtTareaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTareaBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTareaBuscarActionPerformed

    private void bttnBuscarEvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBuscarEvActionPerformed
        if(!g.buscarEvento(txtEventoBuscar.getText()).equals("No se encontró su Evento")){
            jDEvento.dispose();
            jDEvEncontrado.setVisible(true);
        }else{
            
        }
    }//GEN-LAST:event_bttnBuscarEvActionPerformed

    private void btnCancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar3ActionPerformed
        jDEvEncontrado.dispose();
    }//GEN-LAST:event_btnCancelar3ActionPerformed

    private void btnCancelar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar4ActionPerformed
        jDTarEncontrado.dispose();
    }//GEN-LAST:event_btnCancelar4ActionPerformed

    private void btnCancelar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar5ActionPerformed
        jdNoTarEncontrado.dispose();
    }//GEN-LAST:event_btnCancelar5ActionPerformed

    private void btnCancelar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar6ActionPerformed
        jdNoEvEncontrado.dispose();
    }//GEN-LAST:event_btnCancelar6ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuario(new Usuario("Arrick", "netBeans@123","a",5)).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnCancelar3;
    private javax.swing.JButton btnCancelar4;
    private javax.swing.JButton btnCancelar5;
    private javax.swing.JButton btnCancelar6;
    private javax.swing.JButton bttnAddEvento;
    private javax.swing.JButton bttnAddTarea;
    private javax.swing.JButton bttnBuscar;
    private javax.swing.JButton bttnBuscarEv;
    private javax.swing.JButton bttnBuscarEvento;
    private javax.swing.JButton bttnBuscarTar;
    private javax.swing.JButton bttnBuscarTarea;
    private javax.swing.JButton bttnCerrarSesion;
    private javax.swing.JButton bttnEditarEvento;
    private javax.swing.JButton bttnEditarTarea;
    private javax.swing.JButton bttnEliminarEvento;
    private javax.swing.JButton bttnEliminarTarea;
    private javax.swing.JDialog jDChoose;
    private javax.swing.JDialog jDEvEncontrado;
    private javax.swing.JDialog jDEvento;
    private javax.swing.JDialog jDTarEncontrado;
    private javax.swing.JDialog jDTarea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JDialog jdNoEvEncontrado;
    private javax.swing.JDialog jdNoTarEncontrado;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblEvento;
    private javax.swing.JLabel lblEvento1;
    private javax.swing.JLabel lblEvento2;
    private javax.swing.JLabel lblEvento3;
    private javax.swing.JLabel lblEvento4;
    private javax.swing.JLabel lblEvento5;
    private javax.swing.JLabel lblEvento6;
    private javax.swing.JLabel lblEvento7;
    private javax.swing.JLabel lblEvento8;
    private javax.swing.JLabel lblTarea;
    private javax.swing.JList<String> listEvento;
    private javax.swing.JList<String> listTarea;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtEventoBuscar;
    private javax.swing.JTextField txtTareaBuscar;
    // End of variables declaration//GEN-END:variables
}
