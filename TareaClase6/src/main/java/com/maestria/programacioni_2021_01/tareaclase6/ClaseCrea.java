/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase6;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lorenzolince
 */
public class ClaseCrea {

    DataOutputStream archivo = null;
    FileOutputStream file = null;
    private String cedula;
    private int salir;
    private String nombre;
    private int edad;

    ClaseCrea() {
        cedula = "";
        edad = 0;
        nombre = " ";
        salir = -1;
    }
    // creando objeto teclado para introducir datos
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    // Ciclo que permite: abrir archivo, capturar y grabar datos, dentro de un bloque try
    void grabar() {
        System.out.println();
        try {
            file = new FileOutputStream("estudiantes.txt", true);
            //* Creando y grabando a un archivo */ 
            archivo = new DataOutputStream(file);
            // se capturan datos mientras la cedula sea distinta de 0
            do {
                System.out.println("Introduce la cedula: ");
                cedula = teclado.readLine();

                System.out.println("Introduce el nombre: ");
                nombre = teclado.readLine();
                System.out.println("Introduce la edad: ");
                edad = Integer.parseInt(teclado.readLine());
                //grabando al archivo
                archivo.writeBytes(cedula + "\n");
                archivo.writeBytes(nombre + "\n");
                archivo.writeBytes("" + edad + "\n");
                System.out.println("introdusca cero para salir o cualquier nuemero ara continuar");
                salir = Integer.parseInt(teclado.readLine());
                if (salir == 0) {
                    break;
                }
            } while (salir != 0);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                archivo.close();
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(ClaseCrea.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
