/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase6;

/**
 *
 * @author lorenzolince
 */
public class Application {

    public static void main(String[] args) {
        new ArchivoClaseFile()
                .asignar_archivo()
                .desplegar_info();
        new ClaseCrea().grabar();
        new ClaseConsulta().desplegar();
        new ClaseBusca().buscar();
        new Conexion().conectar();
        new ConsultarBD()
                .conectar()
                .consultar();
        new Insertar()
                .inserta();
        new Eliminar()
                .conectar()
                .delete();
        new Modificar()
                .conectar()
                .update();

    }
}
