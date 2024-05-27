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
     *
     * @param u es el usuario que inicio sesion
     */
    public MenuUsuario(Usuario u) {
        user = u;
        g = new GestorGeneral(u);
        initComponents();
        setLocationRelativeTo(null);
        //actualizadores
        //buscadores();
        setLocation(400, 500);
        setSize(1000, 700);
        jDChoose.setVisible(false);
        jDEvento.setVisible(false);
        jDTarea.setVisible(false);
        jDEvEncontrado.setVisible(false);
        setMaximumSize(new Dimension(1000, 700));
        setMinimumSize(new Dimension(1000, 700));
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(55, 57, 63));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDChoose = new javax.swing.JDialog();
        lblEvento1 = new javax.swing.JLabel();
        lblEvento2 = new javax.swing.JLabel();
        cancelar8 = new javax.swing.JButton();
        cancelar9 = new javax.swing.JButton();
        cancelar10 = new javax.swing.JButton();
        jDEvento = new javax.swing.JDialog();
        lblEvento3 = new javax.swing.JLabel();
        txtEventoBuscar = new javax.swing.JTextField();
        cancelar12 = new javax.swing.JButton();
        cancelar13 = new javax.swing.JButton();
        jDTarea = new javax.swing.JDialog();
        lblEvento4 = new javax.swing.JLabel();
        txtTareaBuscar = new javax.swing.JTextField();
        cancelar14 = new javax.swing.JButton();
        cancelar15 = new javax.swing.JButton();
        jDEvEncontrado = new javax.swing.JDialog();
        lblEvento5 = new javax.swing.JLabel();
        cancelar16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDTarEncontrado = new javax.swing.JDialog();
        lblEvento6 = new javax.swing.JLabel();
        cancelar17 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jdNoTarEncontrado = new javax.swing.JDialog();
        lblEvento7 = new javax.swing.JLabel();
        cancelar18 = new javax.swing.JButton();
        jdNoEvEncontrado = new javax.swing.JDialog();
        lblEvento8 = new javax.swing.JLabel();
        cancelar19 = new javax.swing.JButton();
        showEvento = new javax.swing.JDialog();
        lblEvento9 = new javax.swing.JLabel();
        cancelar20 = new javax.swing.JButton();
        showEv = new javax.swing.JLabel();
        showTarea = new javax.swing.JDialog();
        lblEvento11 = new javax.swing.JLabel();
        cancelar22 = new javax.swing.JButton();
        showTar = new javax.swing.JLabel();
        lblBienvenida = new javax.swing.JLabel();
        lblTarea = new javax.swing.JLabel();
        lblEvento = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listTarea = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listEvento = new javax.swing.JList<>();
        cancelar = new javax.swing.JButton();
        cancelar1 = new javax.swing.JButton();
        cancelar2 = new javax.swing.JButton();
        cancelar3 = new javax.swing.JButton();
        cancelar4 = new javax.swing.JButton();
        cancelar5 = new javax.swing.JButton();
        cancelar6 = new javax.swing.JButton();
        cancelar7 = new javax.swing.JButton();

        jDChoose.setBackground(new java.awt.Color(55, 57, 63));

        lblEvento1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblEvento1.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento1.setText("Desea buscar un:");

        lblEvento2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblEvento2.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento2.setText("ó");

        cancelar8.setBackground(new java.awt.Color(10, 135, 55));
        cancelar8.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar8.setForeground(new java.awt.Color(234, 234, 235));
        cancelar8.setText("Cancelar");
        cancelar8.setFocusPainted(false);
        cancelar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar8ActionPerformed(evt);
            }
        });

        cancelar9.setBackground(new java.awt.Color(10, 135, 55));
        cancelar9.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar9.setForeground(new java.awt.Color(234, 234, 235));
        cancelar9.setText("Evento");
        cancelar9.setFocusPainted(false);
        cancelar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar9ActionPerformed(evt);
            }
        });

        cancelar10.setBackground(new java.awt.Color(10, 135, 55));
        cancelar10.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar10.setForeground(new java.awt.Color(234, 234, 235));
        cancelar10.setText("Tarea");
        cancelar10.setFocusPainted(false);
        cancelar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar10ActionPerformed(evt);
            }
        });

        jDChoose.setSize(350, 250); // Fija el tamaño del diálogo
        jDChoose.setResizable(false); // No permite redimensionar el diálogo
        jDChoose.setLocationRelativeTo(null);
        jDChoose.getContentPane().setBackground(new java.awt.Color(55, 57, 63));

        javax.swing.GroupLayout jDChooseLayout = new javax.swing.GroupLayout(jDChoose.getContentPane());
        jDChoose.getContentPane().setLayout(jDChooseLayout);
        jDChooseLayout.setHorizontalGroup(
            jDChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDChooseLayout.createSequentialGroup()
                .addGroup(jDChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDChooseLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(cancelar9)
                        .addGap(18, 18, 18)
                        .addComponent(lblEvento2)
                        .addGap(26, 26, 26)
                        .addComponent(cancelar10))
                    .addGroup(jDChooseLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(cancelar8))
                    .addGroup(jDChooseLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblEvento1)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jDChooseLayout.setVerticalGroup(
            jDChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDChooseLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblEvento1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEvento2)
                    .addComponent(cancelar10)
                    .addComponent(cancelar9))
                .addGap(18, 18, 18)
                .addComponent(cancelar8)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jDEvento.setBackground(new java.awt.Color(55, 57, 63));

        lblEvento3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblEvento3.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento3.setText("Ingrese el titulo que desea buscar:");

        txtEventoBuscar.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        txtEventoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEventoBuscarActionPerformed(evt);
            }
        });

        cancelar12.setBackground(new java.awt.Color(10, 135, 55));
        cancelar12.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar12.setForeground(new java.awt.Color(234, 234, 235));
        cancelar12.setText("Cancelar");
        cancelar12.setFocusPainted(false);
        cancelar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar12ActionPerformed(evt);
            }
        });

        cancelar13.setBackground(new java.awt.Color(10, 135, 55));
        cancelar13.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar13.setForeground(new java.awt.Color(234, 234, 235));
        cancelar13.setText("Buscar");
        cancelar13.setFocusPainted(false);
        cancelar13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar13ActionPerformed(evt);
            }
        });

        jDEvento.setSize(450, 220); // Fija el tamaño del diálogo
        jDEvento.setResizable(true); // No permite redimensionar el diálogo
        jDEvento.setLocationRelativeTo(null);
        jDEvento.getContentPane().setBackground(new java.awt.Color(55, 57, 63));

        javax.swing.GroupLayout jDEventoLayout = new javax.swing.GroupLayout(jDEvento.getContentPane());
        jDEvento.getContentPane().setLayout(jDEventoLayout);
        jDEventoLayout.setHorizontalGroup(
            jDEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEventoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jDEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDEventoLayout.createSequentialGroup()
                        .addComponent(lblEvento3)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jDEventoLayout.createSequentialGroup()
                        .addComponent(cancelar12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar13)
                        .addGap(40, 40, 40))))
            .addGroup(jDEventoLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(txtEventoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDEventoLayout.setVerticalGroup(
            jDEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEventoLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(lblEvento3)
                .addGap(18, 18, 18)
                .addComponent(txtEventoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar12)
                    .addComponent(cancelar13))
                .addGap(34, 34, 34))
        );

        jDTarea.setTitle("BuscarTarea");
        jDTarea.setBackground(new java.awt.Color(55, 57, 63));

        lblEvento4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblEvento4.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento4.setText("Ingrese el titulo que desea buscar:");

        txtTareaBuscar.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        txtTareaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTareaBuscarActionPerformed(evt);
            }
        });

        cancelar14.setBackground(new java.awt.Color(10, 135, 55));
        cancelar14.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar14.setForeground(new java.awt.Color(234, 234, 235));
        cancelar14.setText("Cancelar");
        cancelar14.setFocusPainted(false);
        cancelar14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar14ActionPerformed(evt);
            }
        });

        cancelar15.setBackground(new java.awt.Color(10, 135, 55));
        cancelar15.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar15.setForeground(new java.awt.Color(234, 234, 235));
        cancelar15.setText("Buscar");
        cancelar15.setFocusPainted(false);
        cancelar15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar15ActionPerformed(evt);
            }
        });

        jDTarea.setSize(400, 200); // Fija el tamaño del diálogo
        jDTarea.setResizable(false); // No permite redimensionar el diálogo
        jDTarea.setLocationRelativeTo(null);
        jDTarea.getContentPane().setBackground(new java.awt.Color(55, 57, 63));

        javax.swing.GroupLayout jDTareaLayout = new javax.swing.GroupLayout(jDTarea.getContentPane());
        jDTarea.getContentPane().setLayout(jDTareaLayout);
        jDTareaLayout.setHorizontalGroup(
            jDTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDTareaLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(cancelar14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar15)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDTareaLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(lblEvento4)
                .addGap(15, 15, 15))
            .addGroup(jDTareaLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(txtTareaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDTareaLayout.setVerticalGroup(
            jDTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDTareaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblEvento4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTareaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar14)
                    .addComponent(cancelar15))
                .addGap(36, 36, 36))
        );

        jDEvEncontrado.setBackground(new java.awt.Color(55, 57, 63));

        lblEvento5.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblEvento5.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento5.setText("Su hallo su evento:");

        cancelar16.setBackground(new java.awt.Color(10, 135, 55));
        cancelar16.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar16.setForeground(new java.awt.Color(234, 234, 235));
        cancelar16.setText("Aceptar");
        cancelar16.setFocusPainted(false);
        cancelar16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar16ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(234, 234, 235));
        jLabel1.setText("");

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
                .addGroup(jDEvEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDEvEncontradoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDEvEncontradoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelar16)
                        .addGap(74, 74, 74))
                    .addGroup(jDEvEncontradoLayout.createSequentialGroup()
                        .addComponent(lblEvento5)
                        .addContainerGap(160, Short.MAX_VALUE))))
        );
        jDEvEncontradoLayout.setVerticalGroup(
            jDEvEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEvEncontradoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblEvento5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(cancelar16)
                .addGap(36, 36, 36))
        );

        jDTarEncontrado.setBackground(new java.awt.Color(55, 57, 63));

        lblEvento6.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblEvento6.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento6.setText("Su hallo su tarea:");

        cancelar17.setBackground(new java.awt.Color(10, 135, 55));
        cancelar17.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar17.setForeground(new java.awt.Color(234, 234, 235));
        cancelar17.setText("Aceptar");
        cancelar17.setFocusPainted(false);
        cancelar17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar17ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(234, 234, 235));
        jLabel2.setText("");

        jDTarEncontrado.setSize(400, 300); // Fija el tamaño del diálogo
        jDTarEncontrado.setResizable(true); // No permite redimensionar el diálogo
        jDTarEncontrado.setLocationRelativeTo(null);
        jDTarEncontrado.getContentPane().setBackground(new java.awt.Color(55, 57, 63));

        javax.swing.GroupLayout jDTarEncontradoLayout = new javax.swing.GroupLayout(jDTarEncontrado.getContentPane());
        jDTarEncontrado.getContentPane().setLayout(jDTarEncontradoLayout);
        jDTarEncontradoLayout.setHorizontalGroup(
            jDTarEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDTarEncontradoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jDTarEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDTarEncontradoLayout.createSequentialGroup()
                        .addComponent(lblEvento6)
                        .addContainerGap(176, Short.MAX_VALUE))
                    .addGroup(jDTarEncontradoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDTarEncontradoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar17)
                .addGap(71, 71, 71))
        );
        jDTarEncontradoLayout.setVerticalGroup(
            jDTarEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDTarEncontradoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblEvento6)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(cancelar17)
                .addGap(61, 61, 61))
        );

        jdNoTarEncontrado.setBackground(new java.awt.Color(55, 57, 63));

        lblEvento7.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblEvento7.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento7.setText("No se hallo su tarea");

        cancelar18.setBackground(new java.awt.Color(10, 135, 55));
        cancelar18.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar18.setForeground(new java.awt.Color(234, 234, 235));
        cancelar18.setText("Aceptar");
        cancelar18.setFocusPainted(false);
        cancelar18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar18ActionPerformed(evt);
            }
        });

        jdNoTarEncontrado.setSize(400, 250); // Fija el tamaño del diálogo
        jdNoTarEncontrado.setResizable(false); // No permite redimensionar el diálogo
        jdNoTarEncontrado.setLocationRelativeTo(null);
        jdNoTarEncontrado.getContentPane().setBackground(new java.awt.Color(55, 57, 63));

        javax.swing.GroupLayout jdNoTarEncontradoLayout = new javax.swing.GroupLayout(jdNoTarEncontrado.getContentPane());
        jdNoTarEncontrado.getContentPane().setLayout(jdNoTarEncontradoLayout);
        jdNoTarEncontradoLayout.setHorizontalGroup(
            jdNoTarEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdNoTarEncontradoLayout.createSequentialGroup()
                .addGroup(jdNoTarEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdNoTarEncontradoLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(cancelar18)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdNoTarEncontradoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEvento7)
                        .addGap(18, 18, 18)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jdNoTarEncontradoLayout.setVerticalGroup(
            jdNoTarEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdNoTarEncontradoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblEvento7)
                .addGap(18, 18, 18)
                .addComponent(cancelar18)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jdNoEvEncontrado.setBackground(new java.awt.Color(55, 57, 63));

        lblEvento8.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblEvento8.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento8.setText("No se hallo su evento");

        cancelar19.setBackground(new java.awt.Color(10, 135, 55));
        cancelar19.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar19.setForeground(new java.awt.Color(234, 234, 235));
        cancelar19.setText("Aceptar");
        cancelar19.setFocusPainted(false);
        cancelar19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar19ActionPerformed(evt);
            }
        });

        jdNoEvEncontrado.setSize(400, 250); // Fija el tamaño del diálogo
        jdNoEvEncontrado.setResizable(false); // No permite redimensionar el diálogo
        jdNoEvEncontrado.setLocationRelativeTo(null);
        jdNoEvEncontrado.getContentPane().setBackground(new java.awt.Color(55, 57, 63));

        javax.swing.GroupLayout jdNoEvEncontradoLayout = new javax.swing.GroupLayout(jdNoEvEncontrado.getContentPane());
        jdNoEvEncontrado.getContentPane().setLayout(jdNoEvEncontradoLayout);
        jdNoEvEncontradoLayout.setHorizontalGroup(
            jdNoEvEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdNoEvEncontradoLayout.createSequentialGroup()
                .addGroup(jdNoEvEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdNoEvEncontradoLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(cancelar19))
                    .addGroup(jdNoEvEncontradoLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblEvento8)))
                .addContainerGap())
        );
        jdNoEvEncontradoLayout.setVerticalGroup(
            jdNoEvEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdNoEvEncontradoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblEvento8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelar19)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        showEvento.setBackground(new java.awt.Color(55, 57, 63));

        lblEvento9.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblEvento9.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento9.setText("Su evento:");

        cancelar20.setBackground(new java.awt.Color(10, 135, 55));
        cancelar20.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar20.setForeground(new java.awt.Color(234, 234, 235));
        cancelar20.setText("Aceptar");
        cancelar20.setFocusPainted(false);
        cancelar20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar20ActionPerformed(evt);
            }
        });

        showEv.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        showEv.setForeground(new java.awt.Color(234, 234, 235));
        showEv.setText("");

        showEvento.setSize(400, 300); // Fija el tamaño del diálogo
        showEvento.setResizable(true); // No permite redimensionar el diálogo
        showEvento.setLocationRelativeTo(null);
        showEvento.getContentPane().setBackground(new java.awt.Color(55, 57, 63));

        javax.swing.GroupLayout showEventoLayout = new javax.swing.GroupLayout(showEvento.getContentPane());
        showEvento.getContentPane().setLayout(showEventoLayout);
        showEventoLayout.setHorizontalGroup(
            showEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showEventoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(showEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showEventoLayout.createSequentialGroup()
                        .addComponent(showEv)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showEventoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelar20)
                        .addGap(74, 74, 74))
                    .addGroup(showEventoLayout.createSequentialGroup()
                        .addComponent(lblEvento9)
                        .addContainerGap(250, Short.MAX_VALUE))))
        );
        showEventoLayout.setVerticalGroup(
            showEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showEventoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblEvento9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showEv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(cancelar20)
                .addGap(36, 36, 36))
        );

        showTarea.setBackground(new java.awt.Color(55, 57, 63));

        lblEvento11.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblEvento11.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento11.setText("Su tarea:");

        cancelar22.setBackground(new java.awt.Color(10, 135, 55));
        cancelar22.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar22.setForeground(new java.awt.Color(234, 234, 235));
        cancelar22.setText("Aceptar");
        cancelar22.setFocusPainted(false);
        cancelar22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar22ActionPerformed(evt);
            }
        });

        showTar.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        showTar.setForeground(new java.awt.Color(234, 234, 235));
        showTar.setText("");

        showTarea.setSize(400, 300); // Fija el tamaño del diálogo
        showTarea.setResizable(true); // No permite redimensionar el diálogo
        showTarea.setLocationRelativeTo(null);
        showTarea.getContentPane().setBackground(new java.awt.Color(55, 57, 63));

        javax.swing.GroupLayout showTareaLayout = new javax.swing.GroupLayout(showTarea.getContentPane());
        showTarea.getContentPane().setLayout(showTareaLayout);
        showTareaLayout.setHorizontalGroup(
            showTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showTareaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(showTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showTareaLayout.createSequentialGroup()
                        .addComponent(showTar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showTareaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelar22)
                        .addGap(74, 74, 74))
                    .addGroup(showTareaLayout.createSequentialGroup()
                        .addComponent(lblEvento11)
                        .addContainerGap(266, Short.MAX_VALUE))))
        );
        showTareaLayout.setVerticalGroup(
            showTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showTareaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblEvento11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showTar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(cancelar22)
                .addGap(36, 36, 36))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(55, 57, 63));

        lblBienvenida.setFont(new java.awt.Font("Trebuchet MS", 2, 36)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(234, 234, 235));
        lblBienvenida.setText("Bienvenido "+user.getNombre()+"!");
        lblBienvenida.setToolTipText("");

        lblTarea.setFont(new java.awt.Font("Trebuchet MS", 2, 24)); // NOI18N
        lblTarea.setForeground(new java.awt.Color(234, 234, 235));
        lblTarea.setText("Tarea");

        lblEvento.setFont(new java.awt.Font("Trebuchet MS", 2, 24)); // NOI18N
        lblEvento.setForeground(new java.awt.Color(234, 234, 235));
        lblEvento.setText("Evento");
        lblEvento.setToolTipText("");

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
        listTarea.setToolTipText("Detalles (Doble Click)");
        listTarea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listTarea.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    int indexT = listTarea.locationToIndex(evt.getPoint());
                    if (indexT >= 0) {
                        String item2 = listTarea.getModel().getElementAt(indexT);
                        String showStrTar = g.buscarTarea(item2);
                        String htmlTar = "<html>" + showStrTar.replace("\n", "<br>") + "</html>";
                        showTar.setText(htmlTar);
                        showTarea.setVisible(true);
                    }
                }
            }
        });
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
        listEvento.setToolTipText("Detalles (Doble Click)");
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
        listEvento.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    int index = listEvento.locationToIndex(evt.getPoint());
                    if (index >= 0) {
                        String item = listEvento.getModel().getElementAt(index);
                        String showStrEv = g.buscarEvento(item);
                        String htmlEv = "<html>" + showStrEv.replace("\n", "<br>") + "</html>";
                        showEv.setText(htmlEv);
                        showEvento.setVisible(true);
                    }
                }
            }
        });
        jScrollPane2.setViewportView(listEvento);

        cancelar.setBackground(new java.awt.Color(10, 135, 55));
        cancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar.setForeground(new java.awt.Color(234, 234, 235));
        cancelar.setText("+");
        cancelar.setFocusPainted(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        cancelar1.setBackground(new java.awt.Color(10, 135, 55));
        cancelar1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar1.setForeground(new java.awt.Color(234, 234, 235));
        cancelar1.setText("+");
        cancelar1.setFocusPainted(false);
        cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar1ActionPerformed(evt);
            }
        });

        cancelar2.setBackground(new java.awt.Color(10, 135, 55));
        cancelar2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar2.setForeground(new java.awt.Color(234, 234, 235));
        cancelar2.setText("Editar");
        cancelar2.setFocusPainted(false);
        cancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar2ActionPerformed(evt);
            }
        });

        cancelar3.setBackground(new java.awt.Color(10, 135, 55));
        cancelar3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar3.setForeground(new java.awt.Color(234, 234, 235));
        cancelar3.setText("Eliminar");
        cancelar3.setFocusPainted(false);
        cancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar3ActionPerformed(evt);
            }
        });

        cancelar4.setBackground(new java.awt.Color(10, 135, 55));
        cancelar4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar4.setForeground(new java.awt.Color(234, 234, 235));
        cancelar4.setText("Eliminar");
        cancelar4.setFocusPainted(false);
        cancelar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar4ActionPerformed(evt);
            }
        });

        cancelar5.setBackground(new java.awt.Color(10, 135, 55));
        cancelar5.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar5.setForeground(new java.awt.Color(234, 234, 235));
        cancelar5.setText("Editar");
        cancelar5.setFocusPainted(false);
        cancelar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar5ActionPerformed(evt);
            }
        });

        cancelar6.setBackground(new java.awt.Color(10, 135, 55));
        cancelar6.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar6.setForeground(new java.awt.Color(234, 234, 235));
        cancelar6.setText("Cerrar Sesion");
        cancelar6.setFocusPainted(false);
        cancelar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar6ActionPerformed(evt);
            }
        });

        cancelar7.setBackground(new java.awt.Color(10, 135, 55));
        cancelar7.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        cancelar7.setForeground(new java.awt.Color(234, 234, 235));
        cancelar7.setText("Buscar");
        cancelar7.setFocusPainted(false);
        cancelar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(lblEvento)
                                    .addGap(96, 96, 96)
                                    .addComponent(cancelar))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelar4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelar2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTarea)
                                .addGap(134, 134, 134)
                                .addComponent(cancelar1)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelar3)
                                .addGap(71, 71, 71)
                                .addComponent(cancelar5))))
                    .addComponent(lblBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelar7))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar6)
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTarea)
                                .addComponent(cancelar1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblEvento)
                                .addComponent(cancelar)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addComponent(cancelar7)
                        .addGap(38, 38, 38)
                        .addComponent(cancelar6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelar2)
                    .addComponent(cancelar4)
                    .addComponent(cancelar3)
                    .addComponent(cancelar5))
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void releerTarea() {
        listTarea.setModel(new javax.swing.DefaultListModel<String>() {
            String titulos = g.imprimirOrdenadoTarea();
            String[] strings = titulos.split("\n");

            @Override
            public int getSize() {
                return strings.length;
            }

            @Override
            public String getElementAt(int i) {
                return strings[i];
            }
        });
    }

    public void releerEvento() {
        listEvento.setModel(new javax.swing.DefaultListModel<String>() {
            String titulos = g.imprimirOrdenadoEvento();
            String[] strings = titulos.split("\n");

            @Override
            public int getSize() {
                return strings.length;
            }

            @Override
            public String getElementAt(int i) {
                return strings[i];
            }
        });
    }
    private void listEventoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listEventoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_listEventoAncestorAdded

    private void listEventoAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listEventoAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_listEventoAncestorRemoved

    private void txtEventoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEventoBuscarActionPerformed

    }//GEN-LAST:event_txtEventoBuscarActionPerformed

    private void txtTareaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTareaBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTareaBuscarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        crearEv = new CrearEvento();
        //Se instancia el MenuUsuario asi que las demas clases pueden usar a libertad el MenuUsuario actualizado automaticamente.
        crearEv.setMenuUs(this);
        crearEv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar1ActionPerformed
        crearTar = new CrearTarea();
        //Se instancia el MenuUsuario asi que las demas clases pueden usar a libertad el MenuUsuario actualizado automaticamente.
        crearTar.setMenuUs(this);
        crearTar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelar1ActionPerformed

    private void cancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar2ActionPerformed
        String nombre = (listEvento.getSelectedIndex() != -1 ? listEvento.getModel().getElementAt(listEvento.getSelectedIndex()) : null);
        if (nombre != null) {
            Evento posibleEvento = g.buscarEventoObjeto(nombre);
            if (posibleEvento != null) {
                editEvento = new EditarEvento(posibleEvento, g);
                editEvento.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_cancelar2ActionPerformed

    private void cancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar3ActionPerformed
        int index = listTarea.getSelectedIndex();
        if (index != -1) {
            var model = listTarea.getModel();
            String causa = model.getElementAt(index);
            g.eliminarTarea(causa);
            releerTarea();
        }
    }//GEN-LAST:event_cancelar3ActionPerformed

    private void cancelar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar4ActionPerformed
        int index = listEvento.getSelectedIndex();
        if (index != -1) {
            var model = listEvento.getModel();
            String causa = model.getElementAt(index);
            g.eliminarEvento(causa);
            releerEvento();
        }
    }//GEN-LAST:event_cancelar4ActionPerformed

    private void cancelar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar5ActionPerformed
        String nombre = (listTarea.getSelectedIndex() != -1 ? listTarea.getModel().getElementAt(listTarea.getSelectedIndex()) : null);
        if (nombre != null) {
            Tarea posibleTarea = g.buscarTareaObjeto(nombre);
            if (posibleTarea != null) {
                editTarea = new EditarTarea(posibleTarea, g);
                editTarea.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_cancelar5ActionPerformed

    private void cancelar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar6ActionPerformed
        new VentanaInicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelar6ActionPerformed

    private void cancelar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar7ActionPerformed
        jDChoose.setVisible(true);
    }//GEN-LAST:event_cancelar7ActionPerformed

    private void cancelar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar8ActionPerformed
        jDChoose.dispose();
    }//GEN-LAST:event_cancelar8ActionPerformed

    private void cancelar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar9ActionPerformed
        jDChoose.dispose();
        jDEvento.setVisible(true);
    }//GEN-LAST:event_cancelar9ActionPerformed

    private void cancelar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar10ActionPerformed
        jDChoose.dispose();
        jDTarea.setVisible(true);
    }//GEN-LAST:event_cancelar10ActionPerformed

    private void cancelar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar12ActionPerformed
        jDEvento.dispose();
    }//GEN-LAST:event_cancelar12ActionPerformed

    private void cancelar13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar13ActionPerformed
        if (!g.buscarEvento(txtEventoBuscar.getText()).equals("No se encontró su Evento")) {
            jDEvento.dispose();
            jDEvEncontrado.setVisible(true);
            String eventoTextxd = g.buscarEvento(txtEventoBuscar.getText());
            String htmlText1 = "<html>" + eventoTextxd.replace("\n", "<br>") + "</html>";
            jLabel1.setText(htmlText1);
        }else{
            jDEvento.dispose();
            jdNoEvEncontrado.setVisible(true);
        }
    }//GEN-LAST:event_cancelar13ActionPerformed

    private void cancelar14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar14ActionPerformed
        jDTarea.dispose();
    }//GEN-LAST:event_cancelar14ActionPerformed

    private void cancelar15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar15ActionPerformed
        if (!g.buscarTarea(txtTareaBuscar.getText()).equals("No se encontró su Tarea")) {
            jDTarea.dispose();
            jDTarEncontrado.setVisible(true);
            String tareaTextxd = g.buscarTarea(txtTareaBuscar.getText());
            String htmlText2 = "<html>" + tareaTextxd.replace("\n", "<br>") + "</html>";
            jLabel2.setText(htmlText2);
        }else{
            jDTarea.dispose();
            jdNoTarEncontrado.setVisible(true);
        }
    }//GEN-LAST:event_cancelar15ActionPerformed

    private void cancelar16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar16ActionPerformed
        jDEvEncontrado.dispose();
        jLabel1.setText("");
    }//GEN-LAST:event_cancelar16ActionPerformed

    private void cancelar17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar17ActionPerformed
        jDTarEncontrado.dispose();
        jLabel2.setText("");
    }//GEN-LAST:event_cancelar17ActionPerformed

    private void cancelar18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar18ActionPerformed
        jdNoTarEncontrado.dispose();
    }//GEN-LAST:event_cancelar18ActionPerformed

    private void cancelar19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar19ActionPerformed
        jdNoEvEncontrado.dispose();
    }//GEN-LAST:event_cancelar19ActionPerformed

    private void cancelar20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar20ActionPerformed
        showEv.setText("");
        showEvento.dispose();
    }//GEN-LAST:event_cancelar20ActionPerformed

    private void cancelar22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar22ActionPerformed
        showTar.setText("");
        showTarea.dispose();
    }//GEN-LAST:event_cancelar22ActionPerformed

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
                new MenuUsuario(new Usuario("Arrick", "netBeans@123", "a", 5)).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton cancelar1;
    private javax.swing.JButton cancelar10;
    private javax.swing.JButton cancelar12;
    private javax.swing.JButton cancelar13;
    private javax.swing.JButton cancelar14;
    private javax.swing.JButton cancelar15;
    private javax.swing.JButton cancelar16;
    private javax.swing.JButton cancelar17;
    private javax.swing.JButton cancelar18;
    private javax.swing.JButton cancelar19;
    private javax.swing.JButton cancelar2;
    private javax.swing.JButton cancelar20;
    private javax.swing.JButton cancelar22;
    private javax.swing.JButton cancelar3;
    private javax.swing.JButton cancelar4;
    private javax.swing.JButton cancelar5;
    private javax.swing.JButton cancelar6;
    private javax.swing.JButton cancelar7;
    private javax.swing.JButton cancelar8;
    private javax.swing.JButton cancelar9;
    private javax.swing.JDialog jDChoose;
    private javax.swing.JDialog jDEvEncontrado;
    private javax.swing.JDialog jDEvento;
    private javax.swing.JDialog jDTarEncontrado;
    private javax.swing.JDialog jDTarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JDialog jdNoEvEncontrado;
    private javax.swing.JDialog jdNoTarEncontrado;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblEvento;
    private javax.swing.JLabel lblEvento1;
    private javax.swing.JLabel lblEvento11;
    private javax.swing.JLabel lblEvento2;
    private javax.swing.JLabel lblEvento3;
    private javax.swing.JLabel lblEvento4;
    private javax.swing.JLabel lblEvento5;
    private javax.swing.JLabel lblEvento6;
    private javax.swing.JLabel lblEvento7;
    private javax.swing.JLabel lblEvento8;
    private javax.swing.JLabel lblEvento9;
    private javax.swing.JLabel lblTarea;
    private javax.swing.JList<String> listEvento;
    private javax.swing.JList<String> listTarea;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel showEv;
    private javax.swing.JDialog showEvento;
    private javax.swing.JLabel showTar;
    private javax.swing.JDialog showTarea;
    private javax.swing.JTextField txtEventoBuscar;
    private javax.swing.JTextField txtTareaBuscar;
    // End of variables declaration//GEN-END:variables
}
