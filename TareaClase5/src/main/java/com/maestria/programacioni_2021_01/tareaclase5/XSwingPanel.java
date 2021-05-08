/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase5;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author lorenzolince
 */
public class XSwingPanel
        extends JFrame {

    private JPanel panelBotones;
    private JPanel panelEtiquetas;
    private JButton botones[];
    private JLabel etiquetas[];

    void mostrar() {
        setTitle("Demostración JPanel");
        botones = new JButton[5];
        etiquetas = new JLabel[4];
        panelEtiquetas = new JPanel();
        panelEtiquetas.setLayout(new FlowLayout());
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, botones.length));
        for (int cuenta = 0; cuenta < botones.length; cuenta++) {
            botones[cuenta] = new JButton("Botón " + (cuenta + 1));
            panelBotones.add(botones[cuenta]);
        }
        for (int cuenta = 0; cuenta < etiquetas.length; cuenta++) {
            etiquetas[cuenta] = new JLabel("Etiqueta " + (cuenta + 1));
            panelEtiquetas.add(etiquetas[cuenta]);
        }
        getContentPane().add(panelBotones, BorderLayout.SOUTH);
        getContentPane().add(panelEtiquetas, BorderLayout.NORTH);
         this.setBounds(600, 10, 425, 200);
        setVisible(true);
    }
}
