/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.service.impl;

import com.maestria.programacionI_2021_01.service.CalcularService;

/**
 *
 * @author loren
 */
public class CalcularServiceImpl implements CalcularService {

    @Override
    public int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    @Override
    public int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    @Override
    public int multiplicacion(int numero1, int numero2) {
        return numero1 * numero2;
    }

    @Override
    public int division(int numero1, int numero2) {
        return numero1 / numero2;
    }

}
