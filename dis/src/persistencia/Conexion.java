/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dabiz
 */
public class Conexion {
    private static Conexion Conexionuno;
    private static final String DRIVER_NOMBRE = "org.apache.derby.jdbc.ClientDriver";
    private static final String DRIVER_URL = "jdbc:derby://localhost:1527/db";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "root";

    private Connection connection;
    
    private Conexion(){
        
        try{
            Class.forName(DRIVER_NOMBRE);
        } catch (ClassNotFoundException cnfe){
            System.err.println("Derby driver not found.");
        }
        try{
            
            connection = DriverManager.getConnection(DRIVER_URL, USUARIO, CONTRASENA);
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }
}
