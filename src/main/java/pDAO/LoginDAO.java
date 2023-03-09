/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pConexion.Conexion;
import pModelo.Usuario;

/**
 *
 * @author Vlik35
 */
public class LoginDAO {
    
    private Conexion conexion;
    
    public LoginDAO() {
        this.conexion = new Conexion();
    }
    
    public boolean iniciarSesion(Usuario user) {
        
        try {
            
            String SQL = "SELECT count(*) FROM apple.user WHERE usuario = ? AND contrasena = ?;";
            
            Connection connection = this.conexion.getConnection();
            
            PreparedStatement sentencia = connection.prepareStatement(SQL);
            
            sentencia.setString(1, user.getUsuario());
            sentencia.setString(2, user.getContrasena());
            
            ResultSet rs = sentencia.executeQuery();
            
            while(rs.next()) {
                if (rs.getInt("count(*)") == 1) {
                    return true;
                }
                return false;
            }
            
            sentencia.close();
            
            return true;
            
        } catch (Exception e) {
        
            System.err.println("Ocurrio un error al encontrar al usuario");
            e.printStackTrace();
            return false;
            
        }

    }
    
}
