/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import Modelo.Persona;
import Vista.Usuario;

/**
 *
 * @author Bryan
 */
public class MVC {
    
    public static void main(String[] args) {
        
        Usuario inicio=new Usuario();
        
        Persona Bryan=new Persona("Bryan", "Flores", "1724440092", 20, "5112608", "Comite del Pueblo", 'M', false); 
        
        System.out.println(Bryan);
        
        inicio.menu();
        
    }
    
        
    }
    

