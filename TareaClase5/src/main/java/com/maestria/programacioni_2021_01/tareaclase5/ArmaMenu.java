/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author lorenzolice
 */
public class ArmaMenu extends JFrame implements ActionListener {

    JMenuBar mbarra = new JMenuBar();
    JMenu mfile = new JMenu("File");
    JMenuItem mnew = new JMenuItem("New");
    JMenuItem mopen = new JMenuItem("Open");
    JMenuItem msave = new JMenuItem("Save As");
    JMenuItem mexit = new JMenuItem("Exit");
    JMenu medit = new JMenu("Edit");
    JMenuItem mcut = new JMenuItem("Cut");
    JMenuItem mcopy = new JMenuItem("Copy");
    JMenuItem mpaste = new JMenuItem("Paste");
    JMenuItem mfind = new JMenuItem("Find");

    public ArmaMenu() {
//Menu 
        mfile.add(mnew);
        mfile.add(mopen);
        mfile.add(msave);
        mfile.add(mexit);
        medit.add(mcut);
        medit.add(mcopy);
        medit.add(mpaste);
        medit.addSeparator();
//Pone una linea horizontal de separacion 
        medit.add(mfind);
        mbarra.add(mfile);
        mbarra.add(medit);
//Añadimos la barra al JFrame
        setJMenuBar(mbarra);
        setTitle("Ejemplo de JMenu en java");
        this.setBounds(10, 400, 400, 200);
        setVisible(true);
        mopen.addActionListener(this);
        mexit.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Open")) {
            JOptionPane.showMessageDialog(this,
                    "Éste es un ejemplo\ndel uso de menús",
                    "Opcion Open-Menu File", JOptionPane.PLAIN_MESSAGE);
        }
        if (e.getActionCommand().equals("Exit")) {
// dispose();
            setVisible(false);
        }
    }
}
