/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lugue
 */
public class Conexion {
    Connection cn;
    public  Connection conectar(){
  
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/a", "root", "" );
            System.out.println("La conexion se realizo");
            JOptionPane.showMessageDialog(null, "La coneccion se realizo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No hubo coneccion");
        } return cn;
    }

            Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}
