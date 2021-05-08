/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase5;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author lorenzolince
 */
public class SwingFileChooser extends JFrame implements ActionListener {

    JButton bt1 = new JButton("Save As");
    JButton bt2 = new JButton("Cancel");
    JLabel lb1 = new JLabel("Muestra de FileChooser");
    JTextField tf1 = new JTextField();
    JLabel lb2 = new JLabel("Introduce tu Nombre");
    JTextField tf2 = new JTextField();
    JLabel lb3 = new JLabel("Introduce tu Direccion");

    SwingFileChooser() {
        setTitle("Seminario de Java - UI - 2007");
        setBounds(1000, 300, 350, 350);
        getContentPane().setLayout(null);
        lb1.setBounds(new Rectangle(50, 1, 230, 20));
        lb2.setBounds(new Rectangle(20, 30, 150, 20));
        tf1.setBounds(new Rectangle(150, 30, 100, 20));
        lb3.setBounds(new Rectangle(20, 60, 150, 20));
        tf2.setBounds(new Rectangle(150, 60, 100, 20));
        bt1.setBounds(new Rectangle(20, 120, 100, 20));
        bt2.setBounds(new Rectangle(150, 120, 100, 20));
        getContentPane().add(lb1, null);
        getContentPane().add(bt1, null);
        getContentPane().add(bt2, null);
        getContentPane().add(lb2, null);
        getContentPane().add(tf1, null);
        getContentPane().add(lb3, null);
        getContentPane().add(tf2, null);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // este es el metodo para manejo de eventos

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Save As")) {
            try {
                metodo_guardar();
            } catch (IOException ex) {
                Logger.getLogger(SwingFileChooser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getActionCommand().equals("Cancel")) {
            setVisible(false);
        }
    }

    public void metodo_guardar() throws IOException {
        JFileChooser fileChooser = new JFileChooser();
        FileOutputStream file =null;
//Modo de seleccion, Files
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
// Elegimos el estilo del dialogo
        int result = fileChooser.showSaveDialog(this);
// si presiono el boton cancelar
        if (result == JFileChooser.CANCEL_OPTION) {
            return;
        }
        File fileName = fileChooser.getSelectedFile();
        System.out.println(" " + fileName);
        if (fileName != null) {
            try {
                file = new FileOutputStream(fileName, true);
                DataOutputStream archivo = new DataOutputStream(file);
                String wnombre;
                String wdireccion;
                wnombre = tf1.getText();
                wdireccion = tf2.getText();
                archivo.writeBytes(wnombre);
                archivo.writeBytes(wdireccion);
            } catch (IOException ie) {
                System.out.print("Error Opening File");
            } finally{
             file.close();
            }
        }
    }
}
