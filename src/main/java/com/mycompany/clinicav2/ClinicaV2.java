package com.mycompany.clinicav2;


import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.*;
public class ClinicaV2 {

    public static void main(String[] args) {

        CConexion c = new CConexion();
        Connection conectado = c.establecerConexion();
        
        String consulta = "SELECT * FROM usuarios";
        try{
            
            Statement s = conectado.createStatement();
            ResultSet r = s.executeQuery(consulta);
            r.next();
            
            System.out.println(r.getInt("id_usuario"));
            System.out.println(r.getString(2));
            
            
        }catch(Exception e){
            System.out.println("ERROR" + e.getMessage());
        }
        
        
    }
}
