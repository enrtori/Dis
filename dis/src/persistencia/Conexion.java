/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dabiz
 */
public class Conexion {
    private static Conexion Conexionuno;
    private static final String DRIVER_NOMBRE = "org.apache.derby.jdbc.ClientDriver";
    private static final String DRIVER_URL = "jdbc:derby://localhost:1527/dis";
    private static final String USUARIO = "usuario1";
    private static final String CONTRASENA = "rio1";

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
    public static Conexion getInstancia() {
        if (Conexionuno == null) {
            Conexionuno = new Conexion();
        }
        return Conexionuno;
    }

    public void cerrarConexion() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean consultaLogin() {
        boolean results = false;
        try {
            PreparedStatement pstmt = connection.prepareStatement(Consulta.ENTRADA.toString());
            results = pstmt.execute();
        } catch (SQLException sqlExcept) {
            sqlExcept.printStackTrace();
        }
        return results;
    }
}
