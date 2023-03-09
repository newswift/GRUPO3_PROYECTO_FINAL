/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pConexion.Conexion;
import pModelo.Producto;

/**
 *
 * @author LOAIZA
 */
public class ProductoDAO {

    private Conexion conexion;

    public ProductoDAO() {
        this.conexion = new Conexion();
    }

    public List<Producto> listar() {

        List<Producto> listaProducto = new ArrayList<>();

        try {

            String select_all = "SELECT * FROM apple.productos;";
            Connection conexion = this.conexion.getConnection();

            PreparedStatement sentencia = conexion.prepareStatement(select_all);

            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {

                Producto Producto = new Producto();

                Producto.setNombre(rs.getString(2));
                Producto.setDescripcion(rs.getString(3));

                listaProducto.add(Producto);
            }

            rs.close();
            sentencia.close();

        } catch (SQLException e) {

            System.out.println("Error al mostrar productos.");
            System.out.println("Error: " + e);

        }

        return listaProducto;
    }

}
