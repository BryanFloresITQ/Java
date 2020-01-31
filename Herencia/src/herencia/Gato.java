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
public class Gato extends Animal{
    
    private float estatura;
    private String colOjos;

    public float getEstatura() {
        return estatura;
    }

    public String getColOjos() {
        return colOjos;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public void setColOjos(String colOjos) {
        this.colOjos = colOjos;
    }

    public Gato(float estatura, String colOjos, String especie, String genero, String nombre, int edad) {
        super(especie, genero, nombre, edad);
        this.estatura = estatura;
        this.colOjos = colOjos;
    }

    public Gato(float estatura, String colOjos) {
        this.estatura = estatura;
        this.colOjos = colOjos;
    }
    
    public void datosGato(){
    
        System.out.println("Nombre: "+getNombre()+" Género: "+getGenero()+" Color de Ojos: "+getColOjos()+" Especie: "+getEspecie()+" Estatura: "+getEstatura()+" Edad: "+getEdad());
    
    }
    
}
