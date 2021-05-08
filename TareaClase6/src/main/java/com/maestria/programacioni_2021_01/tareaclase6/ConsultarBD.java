/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author loren
 */
public class ConsultarBD {

    public Connection con;
    public PreparedStatement pstmt;
    public ResultSet rs; //realizar consulta

    ConsultarBD() {
        con = null;
        pstmt = null;
        rs = null;
    }

    public ConsultarBD conectar() {
        try {
            System.out.println();
            Class.forName(net.ucanaccess.jdbc.UcanaccessDriver.class.getCanonicalName());
            con = DriverManager.getConnection(net.ucanaccess.jdbc.UcanaccessDriver.URL_PREFIX + "PRUEBADB.accdb");
            System.out.println("Se realizo la conexión a la base de datos");
        } catch (Exception sqle) {
            System.out.println("Error sql " + sqle);
        }
        return this;
    }

    public void consultar() {
        try {
            System.out.println("Consultado datos");
            String query;
            query = "SELECT * FROM AUTOMOVIL";
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String mat = rs.getString("MATRICULA");
                String des = rs.getString("DESCRIPCION");
                System.out.println("Matricula :" + mat + " Descripción : " + des);
            }

        } catch (SQLException e) {
            System.out.println("Error sql " + e);
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
