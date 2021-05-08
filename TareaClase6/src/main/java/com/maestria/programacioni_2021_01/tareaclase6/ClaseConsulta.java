/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase6;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lorenzolince
 */
public class ClaseConsulta {

    DataInputStream archivo = null;
    FileInputStream file = null;

    private String cedula;
    private String nombre;
    private int edad;

    void desplegar() {
        try {
            System.out.println();
            file = new FileInputStream("estudiantes.txt");
            archivo = new DataInputStream(file);

            while (true) {
                cedula = archivo.readLine();
                if (cedula == null) {
                    break;
                }
                System.out.println("Cedula del Estudiante : " + cedula + " ");
                nombre = archivo.readLine();
                System.out.println("Nombre de Estudiante: " + nombre + " ");
                edad = Integer.valueOf(archivo.readLine());
                System.out.println("Edad de Estudiante: " + edad + " ");
                System.out.println('\n');
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            try {
                archivo.close();
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(ClaseConsulta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
