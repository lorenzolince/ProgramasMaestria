/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.tareaclase2.service.impl;

import com.maestria.programacionI_2021_01.tareaclase2.service.Triangulo;

/**
 *
 * @author lorenzolince
 */
public class TrianguloImpl implements Triangulo {

    @Override
    public double cacular(int base, int altura) {
        double respuesta = 0;
        System.out.println("A = b . a / 2");
        System.out.println("base: " + base);
        System.out.println("altura: " + altura);
        respuesta = (base * altura) / 2;
        System.out.println("A : " + respuesta);
        return respuesta;
    }

}
