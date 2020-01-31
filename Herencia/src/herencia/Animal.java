/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Bryan
 */
public class Animal {
    
    private String especie, genero, nombre;
    private int edad;

    public Animal(String especie, String genero, String nombre, int edad) {
        this.especie = especie;
        this.genero = genero;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public String getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

    public Animal() {
    }
    
    public int suma (int numero1, int numero2){
    
    
    return numero1 + numero2;
    }
    
}
