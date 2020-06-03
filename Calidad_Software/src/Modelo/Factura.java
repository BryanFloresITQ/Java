/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Bryan
 */
public class Factura {
    
    int cedula;
    int codigo;
    String nombre;
    String descripcion;
    float Total;
    int cantidad;

    public Factura() {
    }

    public Factura(int cedula, int codigo, String nombre, String descripcion, float Total, int cantidad) {
        this.cedula = cedula;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.Total = Total;
        this.cantidad = cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCedula() {
        return cedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getTotal() {
        return Total;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }
    
    
    
}
