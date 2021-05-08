/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author loren
 */
public class Modificar {

    private Connection con = null;
    private PreparedStatement pstmt = null;

    public Modificar conectar() {
        try {
            Class.forName(net.ucanaccess.jdbc.UcanaccessDriver.class.getCanonicalName());
            con = DriverManager.getConnection(net.ucanaccess.jdbc.UcanaccessDriver.URL_PREFIX + "PRUEBADB.accdb");
            System.out.println("Se realizo la conexion de la base de datos");
        } catch (Exception cnfe) {
            System.out.println("Error " + cnfe);
        }
        return this;
    }

    public void modificar(String desc, String mat) {
        try {
            pstmt = con.prepareStatement(
                    "update AUTOMOVIL set DESCRIPCION=? where MATRICULA =  ? ");
            pstmt.setString(1, desc);
            pstmt.setString(2, mat);
            pstmt.executeUpdate();
            System.out.println("Registro Modificado");
            pstmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("error en la modificacion: " + e.toString());
        }
    }

    public void update() {
        try {
            System.out.println();
            System.out.println("Modificar Registro");
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese la Matricula a Modificar: ");
            String mat = sc.next();

            System.out.println("Ingrese la Descrpcion: ");
            String desc = sc.next();
            desc = desc + sc.nextLine();
            modificar(desc, mat);
        } catch (Exception e) {
        }

    }
}
