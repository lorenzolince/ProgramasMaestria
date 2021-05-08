/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase5;

import java.awt.AWTEvent;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

/**
 *
 * @author lorenzolince
 */
public class Menu extends JFrame {

    JPopupMenu popup = new JPopupMenu();
    JTextField txt = new JTextField(10);

    public Menu() {
        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txt.setText(((JMenuItem) evt.getSource()).getText());
            }
        };
        txt.setBounds(new Rectangle(150, 30, 100, 20));
        add(txt);
        setTitle("Seminario de Java - UI - 2007");
        setBounds(400, 300, 350, 350);
        getContentPane().setLayout(null);
        JMenuItem mcut = new JMenuItem("Cut");
        mcut.addActionListener(al);
        popup.add(mcut);
        JMenuItem mcopy = new JMenuItem("Copy");
        mcopy.addActionListener(al);
        popup.add(mcopy);
        JMenuItem mpaste = new JMenuItem("Paste");
        mpaste.addActionListener(al);
        popup.add(mpaste);
        JMenuItem mfind = new JMenuItem("Find");
        mfind.addActionListener(al);
        popup.add(mfind);
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    protected void processMouseEvent(MouseEvent evt) {
// isPopupTrigger() nos dice si se ha hecho clic con el botón derecho.
        if (evt.isPopupTrigger()) {
            popup.show(evt.getComponent(), evt.getX(), evt.getY());
        } else {
            super.processMouseEvent(evt);
        }
    }
}
