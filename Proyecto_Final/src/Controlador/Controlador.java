/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conector;
import Modelo.Alumno;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Controlador {
    
    PreparedStatement ps=null;
    Conector conn=new Conector();
    
    public void IngresarAlumno(Alumno ingreso){
    
    String ingresar = "insert into "+"alumno (CI_A,NOMBRES,APELLIDOS) "+"values (?,?,?) "; 
        try {
            ps = conn.getConexion().prepareStatement(ingresar);
            ps.setInt(1, ingreso.getCI());
            ps.setString(2, ingreso.getNombres());
            ps.setString(3, ingreso.getApellidos());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Ingresados");
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("ERROR no se ingresaron los datos");
        }
    
    }
    
}
