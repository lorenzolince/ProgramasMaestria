/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase5;

import javax.swing.JFrame;

/**
 *
 * @author lorenzolince
 */
public class Application {

    public static void main(String[] args) {
        ToolTips x = new ToolTips();
        x.mostrar();
        JTabbedPaneTest p = new JTabbedPaneTest();
        p.buildtab();
        XSwingPanel ap = new XSwingPanel();
        ap.mostrar();
        ap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SwingDialogos obj = new SwingDialogos();
        obj.crear();
        new ArmaMenu();
        new Menu();
        new SwingFileChooser();
        new SwingDialogosEntrada().run();

    }

}
