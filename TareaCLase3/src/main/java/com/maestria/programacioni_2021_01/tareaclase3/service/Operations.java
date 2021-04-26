/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase3.service;

import java.util.List;

/**
 *
 * @author loren
 */
public interface Operations {

    boolean isVowel(String cadena);

    boolean isEqual(String c1, String c2);

    String validString(String cadena);

    boolean isEven(int num);

    void printSquareAndCubeByListNums();

    int factorial(int num);

    void printAverage(List<Double> nums,double notaMinima);

    void validRandomNums();

    int countVowel(String cadena);

    void fibonacci(int num);

}
