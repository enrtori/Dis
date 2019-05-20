/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;

/**
 *
 * @author Dabiz
 */
public class Conexion {
    private static Conexion Conexionuno;
    private static final String DRIVER_NOMBRE = "org.apache.derby.jdbc.ClientDriver";
    private static final String DRIVER_URL = "jdbc:derby://localhost:1527/db";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "root";

    private Connection connection;
}
