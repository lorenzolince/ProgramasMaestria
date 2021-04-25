/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.tareaclase2.service.impl;

import com.maestria.programacionI_2021_01.tareaclase2.service.Fahrenheit;

/**
 *
 * @author lorenzolince
 */
public class FahrenheitImpl implements Fahrenheit{

    @Override
    public double cacular(double centigrado) {
        double respuesta = 0;
        System.out.println(" F= 9/5(C+32)"); 
        System.out.println("C = "+centigrado); 
        respuesta = (9/5) * (centigrado + 32);
        System.out.println("F = "+respuesta); 
        return respuesta;
    }
    
}
