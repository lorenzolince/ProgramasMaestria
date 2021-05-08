/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase6;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author lorenzolince
 */
public class ArchivoClaseFile {

    File objcf;

    public ArchivoClaseFile asignar_archivo() {
        objcf = new File("foto.jpg");
        return this;
    }

    void desplegar_info() {
        try {
            System.out.println();
            if (objcf.exists()) {
                System.out.println("Nombre del archivo " + objcf.getName());
                System.out.println("Camino " + objcf.getCanonicalPath());
                System.out.println("Se puede leer " + objcf.canRead());
                System.out.println("Se puede escribir " + objcf.canWrite());
                System.out.println("Tamano en byte " + objcf.length());
            }

            System.out.println("\n\n\n Presione enter para salir");
            System.in.read();
        } catch (Exception e) {
        }
    }
}
