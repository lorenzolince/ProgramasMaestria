/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase6;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lorenzolince
 */
public class ClaseBusca {

    DataInputStream archivo = null;
    FileInputStream file = null;

    private String cedula;
    private String nombre;
    private int edad;

    void buscar() {
        try {
            System.out.println();
            file = new FileInputStream("estudiantes.txt");
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Cedula a buscar: ");
            String cedulabuscar = teclado.readLine();

            archivo = new DataInputStream(file);

            while (true) {
                cedula = archivo.readLine();
                nombre = archivo.readLine();
                edad = Integer.valueOf(archivo.readLine());
                if (cedulabuscar.equals(cedula)) {
                    System.out.println("Cedula del Estudiante : " + cedula + " ");
                    System.out.println("Nombre de Estudiante: " + nombre + " ");
                    System.out.println("Edad de Estudiante: " + edad + " ");
                    System.out.println('\n');
                    break;
                }
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
