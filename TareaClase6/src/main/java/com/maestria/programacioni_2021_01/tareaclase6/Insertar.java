/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author loren
 */
public class Insertar {

    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    private Connection con = null;
    private PreparedStatement pstmt = null;

    private boolean conectar() {
        boolean res = false;
        try {
             System.out.println();
            Class.forName(net.ucanaccess.jdbc.UcanaccessDriver.class.getCanonicalName());
            con = DriverManager.getConnection(net.ucanaccess.jdbc.UcanaccessDriver.URL_PREFIX + "PRUEBADB.accdb");
            System.out.println("Se realizo la conexion de la base de datos");
            res = true;
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error " + cnfe);
        } catch (SQLException sqle) {
            System.out.println("Error sql " + sqle);
        }
        return res;
    }

    private void inserta(String mat, String des) {
        try {
            pstmt = con.prepareStatement("insert into AUTOMOVIL (MATRICULA, DESCRIPCION) values (?, ?)");
            pstmt.setString(1, mat);
            pstmt.setString(2, des);
            pstmt.executeUpdate(); //insert, delete, update
            System.out.println("Se grabo la transaccion");

        } catch (SQLException sqle) {
            System.out.println("Error sql " + sqle);
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public void inserta() {
        try {
            System.out.println();
            System.out.println("Insertar datos");
            System.out.println("Ingrese la Matricula: ");
            String mat = teclado.readLine();
            System.out.println("Ingrese la descripcion: ");
            String des = teclado.readLine();
            if (conectar()) {
                inserta(mat, des);
            } else {
                System.out.print("No se conecto");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
