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
public class Modelo {
    
    private int CI;
    private String nombres;
    private String apellidos;

    public Modelo(int CI, String nombres, String apellidos) {
        this.CI = CI;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    

    public int getCI() {
        return CI;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    } 
}
