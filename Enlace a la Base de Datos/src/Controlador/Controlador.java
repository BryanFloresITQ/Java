/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo;
import Vista.Listar;
import conexion.conector;
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
    conector conn=new conector();
    ResultSet rs=null;
    Listar ls=new Listar();
           
    
    public void ingresarArticulos(Modelo nuevoArticulo){
    
        String sqlInsert = "insert into "+ "articulos(nombre,descripcion,precio) "+ "values(?,?,?) ";
        
        try {
            ps = conn.getConexion().prepareStatement(sqlInsert);
            ps.setString(1, nuevoArticulo.getNombre());
            ps.setString(2, nuevoArticulo.getDescripcion());
            ps.setInt(3, nuevoArticulo.getPrecio());
            ps.executeUpdate();
             conn.Desconectar();
            JOptionPane.showMessageDialog(null, "Datos Ingresados");
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("ERROR no se ingresaron los datos");
        }
    
    
    }
    
    public void BuscarArticuloId(int id){
    
    String sqlBuscarId = "select * from articulos where idArticulo = ?";
    
        try {
            ps = conn.getConexion().prepareStatement(sqlBuscarId);
             ps.setInt(1, id);
             rs = ps.executeQuery();
             
             while (rs.next()) {                
                
                 System.out.println(rs.getString(2));
                 System.out.println(rs.getString(3));
                 System.out.println(rs.getString(4));
        } 
         conn.Desconectar();
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
   
//        conn.Desconectar();
        
}
    
    public void BuscarNombre(String nombre){
    
    String sqlBuscarId = "select * from articulos where nombre = ?";
        try {
            ps = conn.getConexion().prepareStatement(sqlBuscarId);
            ps.setString(1, nombre);
             rs = ps.executeQuery();
             
             while (rs.next()) {                
                
                 System.out.println(rs.getString(2));
                 System.out.println(rs.getString(3));
                 System.out.println(rs.getString(4));
        } 
             conn.Desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
//    conn.Desconectar();
    }

}
