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
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro p=new Perro(1, "Perro", "Masculino", "Conny", 5);
        
        p.datosPerro();
        
        Gato g=new Gato(30, "Verdes", "Felino", "Femenino", "Michu", 1);
        
        g.datosGato();
        
    }
    
}
