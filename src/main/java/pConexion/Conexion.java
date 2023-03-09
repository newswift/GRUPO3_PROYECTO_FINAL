/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vlik35
 */
public class Conexion {

    private Connection connection;

    public Conexion() {
        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            String url = "jdbc:mysql://localhost:3306/apple";
            String username = "root";
            String password = "123456";
            connection = DriverManager.getConnection(url, username, password);
            
        } catch (ClassNotFoundException ex) {
            // Handle the error
        } catch (SQLException ex) {
            // Handle the error
        }
    }

    public Connection getConnection() {
        return connection;
    }

}
