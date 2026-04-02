/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicav2;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author owenv
 */
public class CConexion {
    Connection conectar  = null;
    String usuario = "sa";
    String contraseña = "0123456789";
    String bd = "Clinica";
    String ip ="localhost";
    String puerto = "1433";
    
    String cadena2 = "jdbc:sqlserver://" + ip +":"+puerto+"/"+bd;
    
    public Connection establecerConexion() {
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String cadena = "jdbc:sqlserver://localhost:" + puerto + ";databaseName=" + bd +";encrypt=true;trustServerCertificate=true";
        conectar = DriverManager.getConnection(cadena, usuario, contraseña);

        System.out.println("CONECTADO");
    } catch (Exception e) {
        System.out.println("Error al conectar: " + e.getMessage());
    }

    return conectar;
}
    
    public boolean testConexion() {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:"+puerto+";"+"databasename="+bd, usuario, contraseña)) {
            return true;
        } catch (SQLException e) {
            System.err.println("No se pudo conectar: " + e.getMessage());
            return false;
        }
    }
    
}
    