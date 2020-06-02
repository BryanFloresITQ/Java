/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Bryan
 */
public class Usuario {
    
    ArrayList nombres=new ArrayList();
    ArrayList apellidos=new ArrayList();
    ArrayList cedulas=new ArrayList();
    ArrayList roles=new ArrayList();
    ArrayList telefonos=new ArrayList();
    ArrayList direcciones=new ArrayList();
    ArrayList usuarios=new ArrayList();
    ArrayList contrasenias=new ArrayList();

    public Usuario() {
    }

    public ArrayList getNombres() {
        return nombres;
    }

    public ArrayList getApellidos() {
        return apellidos;
    }

    public ArrayList getCedulas() {
        return cedulas;
    }

    public ArrayList getRoles() {
        return roles;
    }

    public ArrayList getTelefonos() {
        return telefonos;
    }

    public ArrayList getDirecciones() {
        return direcciones;
    }

    public ArrayList getUsuarios() {
        return usuarios;
    }

    public ArrayList getContrasenias() {
        return contrasenias;
    }

    public void setNombres(ArrayList nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(ArrayList apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedulas(ArrayList cedulas) {
        this.cedulas = cedulas;
    }

    public void setRoles(ArrayList roles) {
        this.roles = roles;
    }

    public void setTelefonos(ArrayList telefonos) {
        this.telefonos = telefonos;
    }

    public void setDirecciones(ArrayList direcciones) {
        this.direcciones = direcciones;
    }

    public void setUsuarios(ArrayList usuarios) {
        this.usuarios = usuarios;
    }

    public void setContrasenias(ArrayList contrasenias) {
        this.contrasenias = contrasenias;
    }

    
    
}


