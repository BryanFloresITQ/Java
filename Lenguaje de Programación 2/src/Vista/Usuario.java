/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.User;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Usuario {

    public void menu() {
        
        
                User metodo = new User();

        int opcion = 0;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU \n" + "1. Agregar Persona \n" + "2. Listar Personas \n" + "3. Salir \n", this));

        switch (opcion) {

            case 1:
                String nombre = JOptionPane.showInputDialog(null, "INGRESE EL NOMBRE", this);
                metodo.agregarPersona(nombre);
                break;

            case 2:
                
                System.out.println(metodo.listarPersonas());

                break;
                
            case 3:
                System.out.println("Ejecucuón Finalizada");
                break;
            default:
                System.out.println("Ejecucuón Finalizada");
                break;
        }
    }

}
