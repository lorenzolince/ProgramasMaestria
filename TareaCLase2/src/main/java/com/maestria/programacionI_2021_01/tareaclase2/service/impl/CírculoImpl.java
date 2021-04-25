/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.tareaclase2.service.impl;

import com.maestria.programacionI_2021_01.tareaclase2.service.Círculo;

/**
 *
 * @author loren
 */
public class CírculoImpl implements Círculo {

    @Override
    public double calcularArea(double radio) {
        double respuesta = 0;
        double pi = Math.PI;
        double r2 = Math.pow(radio, 2);
        
        System.out.println("Carcular Area del Circulo");
        System.out.println("A = pi * r^2");
        System.out.println("R= " + radio);
        System.out.println("pi= " + pi);
        System.out.println("r^2= " + r2);
        respuesta = pi * r2;
        System.out.println("Area= " + respuesta);
        return respuesta;
    }

}
