/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conector;
import Modelo.Alumno;
import Modelo.Inspector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    ResultSet rs=null;
    
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
    
    public void Logueo(Inspector datos){
       
        String traer = "SELECT * from inspector";
        try {
            ps = conn.getConexion().prepareStatement(traer);
            rs = ps.executeQuery();
             
             while (rs.next()) {                
                
                 datos.setCI(rs.getInt(1)); 
                 datos.setNombres(rs.getString(2));
                 datos.setApellidos(rs.getString(3));
                 datos.setPassword(rs.getString(4));
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void LogueoAlumno(Alumno CI){
    
         String ci = "SELECT * from alumno";
         
        try {
            ps = conn.getConexion().prepareStatement(ci);
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                
                 CI.setCI(rs.getInt(1));
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    
    }
    
}
