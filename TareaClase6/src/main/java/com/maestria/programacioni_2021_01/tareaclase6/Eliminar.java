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
public class Eliminar {

    private Connection con = null;
    private PreparedStatement pstmt = null;
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    public Eliminar conectar() {
        try {
             Class.forName(net.ucanaccess.jdbc.UcanaccessDriver.class.getCanonicalName());
            con = DriverManager.getConnection(net.ucanaccess.jdbc.UcanaccessDriver.URL_PREFIX + "PRUEBADB.accdb");
            System.out.println("Se realizo la conexion de la base de datos");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error " + cnfe);
        } catch (SQLException sqle) {
            System.out.println("Error sql " + sqle);
        }
        return this;
    }

    private void eliminar(String mat) {
        try {
            pstmt = con.prepareStatement("Delete From AUTOMOVIL where MATRICULA = ?");
            pstmt.setString(1, mat);
            pstmt.executeUpdate();
            System.out.println("Registro Eliminado");
            pstmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("error en la Eliminacion: " + e.toString());
        }
    }

    public void delete() {
        try {
            System.out.println();
            System.out.println("Eliminar Registro");
            System.out.println("Ingrese la Matricula a Eliminar: ");
            String mat = (teclado.readLine());
            eliminar(mat);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
