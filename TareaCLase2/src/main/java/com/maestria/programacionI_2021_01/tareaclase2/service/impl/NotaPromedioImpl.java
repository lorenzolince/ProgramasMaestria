/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.tareaclase2.service.impl;

import com.maestria.programacionI_2021_01.tareaclase2.service.NotaPromedio;

/**
 *
 * @author lorenzolince
 */
public class NotaPromedioImpl implements NotaPromedio {

    @Override
    public double cacular(Double... notas) {
        double respuesta = 0;
        double totalNotas = 0;
        System.out.println("Calcular nota promedio");
        System.out.println("P = (n + n ..) / n..");
        for (double nota : notas) {
            System.out.println("nota: " + nota);
            totalNotas = totalNotas + nota;
        }
        respuesta = totalNotas / notas.length;
        System.out.println("Promedio: " + respuesta);
        return respuesta;
    }

}
