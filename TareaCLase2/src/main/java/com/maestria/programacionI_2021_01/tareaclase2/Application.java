/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.tareaclase2;

import com.maestria.programacionI_2021_01.tareaclase2.service.Círculo;
import com.maestria.programacionI_2021_01.tareaclase2.service.Fahrenheit;
import com.maestria.programacionI_2021_01.tareaclase2.service.NotaPromedio;
import com.maestria.programacionI_2021_01.tareaclase2.service.Salario;
import com.maestria.programacionI_2021_01.tareaclase2.service.Triangulo;
import com.maestria.programacionI_2021_01.tareaclase2.service.impl.CírculoImpl;
import com.maestria.programacionI_2021_01.tareaclase2.service.impl.FahrenheitImpl;
import com.maestria.programacionI_2021_01.tareaclase2.service.impl.NotaPromedioImpl;
import com.maestria.programacionI_2021_01.tareaclase2.service.impl.SalarioImpl;
import com.maestria.programacionI_2021_01.tareaclase2.service.impl.TrianguloImpl;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lorenzolince
 */
public class Application {

    private static final String menuInfo = "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ MENU DE OPCIONES $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n"
            + "$$$$$$$$$$ Prueba tarea 2 $$$$$$$$\n"
            + "1 --> Calcular el área de un triangulo (1/2.b.h) imprimir los datos de entrada y el resultado.\n"
            + "2 --> Calcular los grados Fahrenheit (F=9/5(C+32)) dados los grados centígrados, imprimir el resultado.\n"
            + "3 --> Calcular el salario de un empleado a partir de los siguientes datos: nombre del empleado, horas trabajadas, tarifa por hora, total de deducciones.\n"
            + "4 --> Leer el nombre del estudiante y tres notas, calcular e imprimir la nota promedio.\n"
            + "5 --> Calcular el área de un círculo dado el radio (pi por radio al cuadrado) imprima el área.\n";

    public static void main(String[] args) {
        try {
            System.out.println(menuInfo);
            BufferedReader entradaManu = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("escriba la opcion");
            int num = Integer.parseInt(entradaManu.readLine());
            switch (num) {
                case 1:
                    Triangulo triangulo = new TrianguloImpl();
                    entradaManu = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("escribir la base");
                    int base = Integer.parseInt(entradaManu.readLine());
                    entradaManu = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("escribir la altura");
                    int altura = Integer.parseInt(entradaManu.readLine());
                    triangulo.cacular(base, altura);
                    break;
                case 2:
                    Fahrenheit f = new FahrenheitImpl();
                    entradaManu = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("escribir el centigrado");
                    double centigrado = Double.parseDouble(entradaManu.readLine());
                    f.cacular(centigrado);
                    break;
                case 3:
                    Salario s = new SalarioImpl();
                    entradaManu = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("escribir el nombre");
                    String nombre = entradaManu.readLine();
                    entradaManu = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("escribir cantidad de horas trabajadas");
                    int horas = Integer.parseInt(entradaManu.readLine());
                    entradaManu = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("escribir tarifa salarial por hora");
                    double tarifa = Double.parseDouble(entradaManu.readLine());
                    entradaManu = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("escribir las deducciones");
                    double deducciones = Double.parseDouble(entradaManu.readLine());
                    s.cacular(nombre, horas, tarifa, deducciones);
                    break;
                case 4:
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
                    Double[] nt = notas.toArray(new Double[notas.size()]);
                    NotaPromedio nota = new NotaPromedioImpl();
                    nota.cacular(nt);
                    break;
                case 5:
                    Círculo c = new CírculoImpl();
                    entradaManu = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("escribir radio");
                    double radio = Double.parseDouble(entradaManu.readLine());
                    c.calcularArea(radio);
                    break;
            }
            entradaManu.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
