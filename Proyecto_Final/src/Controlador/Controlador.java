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
    
    public void BuscarCI(Notas add, int ci){
        
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
    
    String sqlBuscarCI = "select * from notas where CI_A LIKE "+"'%"+ci+"%'"+"";
    
        try {
            ps = conn.getConexion().prepareStatement(sqlBuscarCI);
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
    
    public void LlenarActualizar(int ci, Notas notas, Alumno alumno){
    
        String llenar = "select * from notas where CI_A= ?";
        String llenarA = "select * from alumno where CI_A= ?";
        
        try {
            ps = conn.getConexion().prepareStatement(llenar);
            ps.setInt(1, ci);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                notas.setCi(rs.getInt(2));
                notas.setInglesN((float) rs.getDouble(3));
                notas.setLenguajeN((float) rs.getDouble(4));
                notas.setFisicaN((float) rs.getDouble(5));
                notas.setMatematicaN((float) rs.getDouble(6));
                notas.setQuimicaN((float) rs.getDouble(7));
                notas.setEfisicaN((float) rs.getDouble(8));
                notas.setGeometriaN((float) rs.getDouble(9));
                notas.setComputacionN((float) rs.getDouble(10));
                notas.setBiologiaN((float) rs.getDouble(11));
                notas.setAnatomiaN((float) rs.getDouble(12));
                notas.setPromedioN((float) rs.getDouble(13));
                
            }
            
            ps = conn.getConexion().prepareStatement(llenarA);
            ps.setInt(1, ci);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                alumno.setNombres(rs.getString(4));
                alumno.setApellidos(rs.getString(5));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    
    }
    
    public void Actualizar(int ci, Alumno alumno, Notas notas){
    
    
    String sqlUpdate = "UPDATE alumno SET NOMBRES= ?, APELLIDOS= ? WHERE CI_A= "+ci;
    String sqlUpdateNotas = "UPDATE notas SET INGLES= ?, LENGUAJE= ?, FISICA= ?, MATEMATICA= ?, QUIMICA= ?, EDUCACION_FISICA= ?, GEOMETRIA= ?, COMPUTACION= ?, BIOLOGIA= ?, ANATOMIA= ?, PROMEDIO_FINAL= ? WHERE CI_A= "+ci;
    
        try {
            ps = conn.getConexion().prepareStatement(sqlUpdate);
            ps.setString(1, alumno.getNombres());
            ps.setString(2, alumno.getApellidos());
            
            ps.executeUpdate();
            
            ps = conn.getConexion().prepareStatement(sqlUpdateNotas);
            ps.setDouble(1, notas.getInglesN());
            ps.setDouble(2, notas.getLenguajeN());
            ps.setDouble(3, notas.getFisicaN());
            ps.setDouble(4, notas.getMatematicaN());
            ps.setDouble(5, notas.getQuimicaN());
            ps.setDouble(6, notas.getEfisicaN());
            ps.setDouble(7, notas.getGeometriaN());
            ps.setDouble(8, notas.getComputacionN());
            ps.setDouble(9, notas.getBiologiaN());
            ps.setDouble(10, notas.getAnatomiaN());
            ps.setDouble(11, notas.getPromedioN());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos Actualizados", "Actualizar", 1);
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    
}
