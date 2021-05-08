/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase5;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author lorenzolince
 */
public class ToolTips extends JFrame {

    void mostrar() {
        JButton b1 = new JButton();
        b1.setText("Procesar");
        b1.setBackground(Color.red);
        b1.setForeground(Color.blue);
        b1.setToolTipText("Activa el boton no.1");
        JButton b2 = new JButton("Cancelar");
        this.setTitle("UTP-Java");
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.getContentPane().add(b1);
        this.getContentPane().add(b2);
        this.setBounds(10, 10, 200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
