/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase3;

import com.maestria.programacioni_2021_01.tareaclase3.service.Operations;
import com.maestria.programacioni_2021_01.tareaclase3.service.impl.OperationsImpl;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author lorenzolince
 */
public class Application {

    private static final String menuInfo = "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ MENU DE OPCIONES $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n"
            + "$$$$$$$$$$ Prueba tarea 3 $$$$$$$$\n"
            + "1 -->  a. Ingrese una cadena por teclado y determine si el primer caracter es una vocal o una consonante.\n"
            + "2 -->  b. Haga un programa que lea dos cadenas, por teclado, determine si son iguales.\n"
            + "3 -->  c. Ingrese una cadena por teclado valide su longitud, si tiene menos de 5 caracteres, rellene hasta 10 con una X.\n"
            + "4 -->  d. Escriba un programa que determine si un número leído es par o impar. Envié un mensaje correspondiente.\n"
            + "5 -->  e. Diseñe un programa que calcule e imprima el cuadrado y el cubo de los primeros 25 números.\n"
            + "6 -->  f. Diseñe un programa que permita calcular el factorial de un número positivo dado por el usuario.\n"
            + "7 -->  g. Dadas N notas de un estudiante calcular:\n"
            + "        - Cuantas notas tiene desaprobados.\n"
            + "        - Cuantos aprobados.\n"
            + "        - El promedio de notas.\n"
            + "        - El promedio de notas aprobadas y desaprobadas.\n"
            + "\n"
            + "8 -->  h. Realizar un programa que permita pedir 50 números enteros y determine e imprima cuantos son pares, impares, positivos y negativos.\n"
            + "9 -->  i. Cuente la cantidad de vocales que contiene una frase cuyo final este dado por un punto.\n"
            + "10 --> j. Haga un programa que genere la serie de FIBONACCI. 0 1 1 2 3 5 8 13 21 .......";

    public static void main(String[] args) {
        Operations op = new OperationsImpl();
        try {
            System.out.println(menuInfo);
            BufferedReader entradaManu = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("escriba la opcion");
            int num = Integer.parseInt(entradaManu.readLine());
            switch (num) {
                case 1:
                    System.out.println("escriba un palabra");
                    entradaManu = new BufferedReader(new InputStreamReader(System.in));
                    boolean resultV = op.isVowel(entradaManu.readLine());
                    System.out.println(resultV ? "es voval" : "es consonante");
                    break;
                case 2:
                    System.out.println("escriba un palabra");
                    entradaManu = new BufferedReader(new InputStreamReader(System.in));
                    String c1 = entradaManu.readLine();
                    System.out.println("escriba otra palabra");
                    entradaManu = new BufferedReader(new InputStreamReader(System.in));
                    String c2 = entradaManu.readLine();
                    boolean resultE = op.isEqual(c1, c2);
                    System.out.println(resultE ? "es igual" : "no es igual");
                    break;
                case 3:
                    System.out.println("escriba un palabra");
                    entradaManu = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println(op.validString(entradaManu.readLine()));
                    break;
                case 4:
                    System.out.println("escriba un numero");
                    entradaManu = new BufferedReader(new InputStreamReader(System.in));
                    boolean result = op.isEven(Integer.parseInt(entradaManu.readLine()));
                    System.out.println(result ? "es par" : "es inpar");
                    break;
                case 5:
                    op.printSquareAndCubeByListNums();
                    break;
                case 6:
                    System.out.println("escriba un numero");
                    entradaManu = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println(op.factorial(Integer.parseInt(entradaManu.readLine())));
                    break;
                case 7:
                    List<Double> notas = new ArrayList<Double>();

                    String calcular = "";
                    while (!calcular.equals("exit")) {
                        entradaManu = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("escribir una nota o escibe exit para salir");
                        calcular = entradaManu.readLine();
                        if (!calcular.equals("exit")) {
                            Double n = Double.parseDouble(calcular);
                            notas.add(n);
                        }

                    }
                    System.out.println("escriba cual es la nota minima");
                    entradaManu = new BufferedReader(new InputStreamReader(System.in));
                    op.printAverage(notas, Double.parseDouble(entradaManu.readLine()));
                    break;
                case 8:
                    op.validRandomNums();
                    break;
                case 9:
                    System.out.println("escriba un palabra seguido de un punto");
                    entradaManu = new BufferedReader(new InputStreamReader(System.in));
                    op.countVowel(entradaManu.readLine());
                    break;
                case 10:
                    entradaManu = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("escribir el tamaño numerico a iterar");
                    int tamaño = Integer.parseInt(entradaManu.readLine());
                    op.fibonacci(tamaño);
                    break;
            }
            entradaManu.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
