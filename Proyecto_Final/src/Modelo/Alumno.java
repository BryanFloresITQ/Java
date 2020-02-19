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
public class Alumno extends Modelo{
    
    ArrayList cedulas=new ArrayList();

    public Alumno(int CI, String nombres, String apellidos) {
        super(CI, nombres, apellidos);
    }


    public ArrayList getCedulas() {
        return cedulas;
    }

    public void setCedulas(ArrayList cedulas) {
        this.cedulas = cedulas;
    }
}
