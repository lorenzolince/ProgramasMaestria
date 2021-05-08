/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase5;

import javax.swing.*;

/**
 *
 * @author lorenzolince
 */
public class JTabbedPaneTest extends JFrame {

    JTabbedPane tab = new JTabbedPane();
//  JTabbedPane tab = new JTabbedPane( (SwingConstants.RIGHT));

    void buildtab() {
        tab.addTab("Ingresar Datos", null);
        tab.addTab("Buscar Informacion", null);
        tab.addTab("Consultas Varias", null);
        getContentPane().add(tab);
        this.setTitle("Swing: TabbedPane");
        this.setBounds(200, 10, 400, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
