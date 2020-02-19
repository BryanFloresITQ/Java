/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conector;
import Modelo.Alumno;
import Modelo.Inspector;
import Modelo.Notas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Controlador {
    
    ArrayList almacen=new ArrayList();
    PreparedStatement ps=null;
    Conector conn=new Conector();
    ResultSet rs=null;
    
    public void IngresarAlumno(Alumno ingreso){
    
    String ingresar = "insert into "+"alumno (CI_A,NOMBRES,APELLIDOS) "+"values (?,?,?) "; 
    String ingresarNota = "insert into "+"notas (CI_A,INGLES,LENGUAJE,FISICA,MATEMATICA,QUIMICA,EDUCACION_FISICA,GEOMETRIA,COMPUTACION,BIOLOGIA,ANATOMIA,PROMEDIO_FINAL) "+"values (?,?,?,?,?,?,?,?,?,?,?,?) "; 
        try {
            ps = conn.getConexion().prepareStatement(ingresar);
            ps.setInt(1, ingreso.getCI());
            ps.setString(2, ingreso.getNombres());
            ps.setString(3, ingreso.getApellidos());
            
            ps.executeUpdate();
            
            ps = conn.getConexion().prepareStatement(ingresarNota);
            ps.setInt(1, ingreso.getCI());
            ps.setInt(2, 0);
            ps.setInt(3, 0);
            ps.setInt(4, 0);
            ps.setInt(5, 0);
            ps.setInt(6, 0);
            ps.setInt(7, 0);
            ps.setInt(8, 0);
            ps.setInt(9, 0);
            ps.setInt(10, 0);
            ps.setInt(11, 0);
            ps.setInt(12, 0);
            
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
                
                almacen.add(rs.getInt(1));
        }
            
            CI.setCedulas(almacen);
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    
    }
    
    public void obtenerDatos(Notas add){
    
        try {
            ArrayList CI = new ArrayList();
            ArrayList ingles = new ArrayList();
            ArrayList lenguaje = new ArrayList();
            ArrayList fisica = new ArrayList();
            ArrayList matematica = new ArrayList();
            ArrayList quimica = new ArrayList();
            ArrayList efisica = new ArrayList();
            ArrayList geometria = new ArrayList();
            ArrayList computacion = new ArrayList();
            ArrayList biologia = new ArrayList();
            ArrayList anatomia = new ArrayList();
            ArrayList promedio = new ArrayList();
            
            String llenar = "select * from notas";
            
            ps = conn.getConexion().prepareStatement(llenar);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                CI.add(rs.getInt(2));
                ingles.add(rs.getDouble(3));
                lenguaje.add(rs.getDouble(4));
                fisica.add(rs.getDouble(5));
                matematica.add(rs.getDouble(6));
                quimica.add(rs.getDouble(7));
                efisica.add(rs.getDouble(8));
                geometria.add(rs.getDouble(9));
                computacion.add(rs.getDouble(10));
                biologia.add(rs.getDouble(11));
                anatomia.add(rs.getDouble(12));
                promedio.add(rs.getDouble(13));
            }
            
            add.setCI(CI);
            add.setIngles(ingles);
            add.setLenguaje(lenguaje);
            add.setFisica(fisica);
            add.setMatematica(matematica);
            add.setQuimica(quimica);
            add.setEfisica(efisica);
            add.setGeometria(geometria);
            add.setComputacion(computacion);
            add.setBiologia(biologia);
            add.setAnatomia(anatomia);
            add.setPromedio(promedio);
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void Eliminar (int ci){
    
        String delete= "delete from notas where CI_A= ?";
        String borrar= "delete from alumno where CI_A= ?";
        try {
            ps = conn.getConexion().prepareStatement(delete);
            ps.setInt(1, ci);
            ps.executeUpdate();
            
            ps = conn.getConexion().prepareStatement(borrar);
            ps.setInt(1, ci);
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
