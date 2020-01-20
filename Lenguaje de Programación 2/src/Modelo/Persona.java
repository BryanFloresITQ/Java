/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.logging.Logger;

/**
 *
 * @author Bryan
 */
public class Persona {
    
    String nombre;
    String apellido;
    int cedula;
    int edad;
    int telefono;
    String direccion;
    char genero;
    boolean EstadoCivil;

    public Persona(String nombre, String apellido, int cedula, int edad, int telefono, String direccion, char genero, boolean EstadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.genero = genero;
        this.EstadoCivil = EstadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public char getGenero() {
        return genero;
    }

    public boolean isEstadoCivil() {
        return EstadoCivil;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEstadoCivil(boolean EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }
    
    
    
    
}
