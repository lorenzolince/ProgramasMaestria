/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.tareaclase2.service.impl;

import com.maestria.programacionI_2021_01.tareaclase2.service.Salario;

/**
 *
 * @author lorenzolince
 */
public class SalarioImpl implements Salario {

    @Override
    public double cacular(String nombre, int horas, double tarifa, double deducciones) {
        double respuesta = 0;
        System.out.println("Salario");
        System.out.println("S= (horas * tarifa) - deducciones ");

        System.out.println("NOmbre : " + nombre);
        System.out.println("Horas trabajadas: " + horas);
        System.out.println("Tarifa por hora: " + tarifa);
        System.out.println("Deducciones: " + deducciones);
        respuesta = (horas * tarifa) - deducciones;
        System.out.println("Salario de " + nombre + ": " + respuesta);

        return respuesta;
    }

}
