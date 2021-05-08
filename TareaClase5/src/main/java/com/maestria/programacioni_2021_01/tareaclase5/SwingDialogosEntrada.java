/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase5;

import javax.swing.JOptionPane;

/**
 *
 * @author lorenzolince
 */
public class SwingDialogosEntrada {

    public  void run() {
        String nombre, apellido, nombre_completo;
        nombre
                = JOptionPane.showInputDialog(
                        null,
                        "Escribe tu Nombre:",
                        "Muestra de Dialogo de Entrada",
                        JOptionPane.INFORMATION_MESSAGE);
        apellido
                = JOptionPane.showInputDialog(
                        null,
                        "Escribe tu Apellido:",
                        "Muestra de Dialogo de Entrada",
                        JOptionPane.INFORMATION_MESSAGE);
        nombre_completo = nombre + " " + apellido;
        JOptionPane.showMessageDialog(
                null,
                nombre_completo,
                "Tu Nombre Completo es:",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
