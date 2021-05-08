/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase5;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author lorenzolince
 */
public class SwingDialogos extends JFrame implements ActionListener {

    static final long serialVersionUID = 0L;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;

    SwingDialogos() {
        setTitle("Seminario de Java");
        b1 = new JButton("Modelo1");
        b2 = new JButton("Modelo2");
        b3 = new JButton("Modelo3");
        b4 = new JButton("Modelo4");
    }

    void crear() {
        getContentPane().setLayout(new GridLayout(2, 2));
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
         this.setBounds(10, 300, 400, 100);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Modelo1")) {
            JOptionPane.showMessageDialog(null, "Este es el Modelo Basico");
        }
        if (e.getActionCommand().equals("Modelo2")) {
            JOptionPane.showMessageDialog(null,
                    "Mensaje, icono de Advertencia y titulo de Marco",
                    "Modelo 2 del OptionPane",
                    JOptionPane.WARNING_MESSAGE);
        }
        if (e.getActionCommand().equals("Modelo3")) {
            JOptionPane.showMessageDialog(null,
                    "Mensaje, icono de Error y titulo de Marco",
                    "Modelo 3 del OptionPane",
                    JOptionPane.ERROR_MESSAGE);
        }
        if (e.getActionCommand().equals("Modelo4")) {
            JOptionPane.showMessageDialog(null,
                    "Mensaje y titulo de Marco",
                    "Modelo 4 del OptionPane",
                    JOptionPane.PLAIN_MESSAGE);
        }

    }
}
