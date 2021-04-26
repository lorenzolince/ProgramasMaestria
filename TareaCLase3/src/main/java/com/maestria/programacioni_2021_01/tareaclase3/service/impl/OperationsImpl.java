/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase3.service.impl;

import com.maestria.programacioni_2021_01.tareaclase3.service.Operations;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author loren
 */
public class OperationsImpl implements Operations {

    private static final String vowels = "[aeiouAEIOU]";

    @Override
    public boolean isVowel(String cadena) {
        Pattern pattern = Pattern.compile(vowels, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(cadena.substring(0,1));
        return matcher.find();
    }

    @Override
    public boolean isEqual(String c1, String c2) {
        return c1.equals(c2);
    }

    @Override
    public String validString(String cadena) {
        if (cadena.length() < 5) {
            return cadena.concat("XXXXXXXXXX").substring(0, 10);
        } else {
            return cadena;
        }
    }

    @Override
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    @Override
    public void printSquareAndCubeByListNums() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            nums.add(i + 1);
        }
        nums.forEach(n -> System.out.println(n + "  cuadrado : " + Math.pow((n), 2) + " cubo : " + Math.pow((n), 3)));
    }

    @Override
    public int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    @Override
    public void printAverage(List<Double> nums, double notaMinima) {
        System.out.println("Notas desaprobadas:  " + nums.stream().filter(p -> p < notaMinima).count());
        System.out.println("Notas aprobadas:  " + nums.stream().filter(p -> p >= notaMinima).count());
        System.out.println("promedio de notas:  " + ((nums.stream().reduce(0.0, Double::sum)) / nums.stream().count()));
        System.out.println("promedio de notas aprobadas:  " + ((nums.stream().filter(p -> p >= notaMinima).reduce(0.0, Double::sum)) / nums.stream().filter(p -> p >= notaMinima).count()));
        System.out.println("promedio de notas desaprobadas:  " + ((nums.stream().filter(p -> p < notaMinima).reduce(0.0, Double::sum)) / nums.stream().filter(p -> p < notaMinima).count()));

    }

    @Override
    public void validRandomNums() {
        Random random = new Random();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int num = random.nextInt(30 + 10) - 10;
            nums.add(num);
        }
        System.out.println(nums);
        System.out.println("pares: " + nums.stream().filter(n -> n % 2 == 0).count());
        System.out.println("in pares: " + nums.stream().filter(n -> !(n % 2 == 0)).count());
        System.out.println("positivos: " + nums.stream().filter(n -> n > 0).count());
        System.out.println("negativos: " + nums.stream().filter(n -> n < 0).count());
    }

    @Override
    public int countVowel(String cadena) {
        int resultado = 0;
        String result = cadena.substring(0, cadena.indexOf("."));
        int totalVocales = result.replaceAll("[^AEIOUaeiouÁÉÍÓÚáéíóú]", "").length();
        System.out.println("Total Vocales: " + totalVocales);
        return resultado;
    }

    private int applyFibonacci(int num) {
        if (num > 1) {
            return applyFibonacci(num - 1) + applyFibonacci(num - 2);  //función recursiva
        } else if (num == 1) {
            return 1;
        } else if (num == 0) {
            return 0;
        } else { //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }

    @Override
    public void fibonacci(int num) {
        System.out.println("serie de defibonacci ");
        System.out.println("n = n-1 + n-2.");
        for (int i = 0; i < num; i++) {
            System.out.print(applyFibonacci(i) + " ");
        }
    }

}
