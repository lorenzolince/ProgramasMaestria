/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.tareaclase6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lorenzolince
 */
public class Conexion {

    private Connection con;

    Conexion() {
        con = null;
    }

    void conectar() {
        try {
            System.out.println("Estableciendo conexion");
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://PRUEBADB.accdb");
            System.out.println("Se realizo la conexion de la base de datos");
        } catch (Exception sqle) {
            System.out.println(sqle);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
