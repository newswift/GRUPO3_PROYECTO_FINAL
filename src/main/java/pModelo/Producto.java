/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pModelo;

/**
 *
 * @author LOAIZA
 */
public class Producto {
    
    private String nombre;
    private String descripcion;

    public Producto() {
    }

    public Producto(String nombre, String apellido) {
        this.nombre = nombre;
        this.descripcion = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
