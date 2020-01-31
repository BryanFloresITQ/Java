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
import java.util.ArrayList;
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
    Modelo mo=new Modelo();
    
    String nombre;
    String descripcion;
    int precio;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
           
    
    public void ingresarArticulos(Modelo nuevoArticulo){
    
        String sqlInsert = "insert into "+ "articulos(nombre,descripcion,precio) "+ "values(?,?,?) ";
        
        try {
            ps = conn.getConexion().prepareStatement(sqlInsert);
            ps.setString(1, nuevoArticulo.getNombre());
            ps.setString(2, nuevoArticulo.getDescripcion());
            ps.setInt(3, nuevoArticulo.getPrecio());
            ps.executeUpdate();
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
                
                 this.nombre = rs.getString(2);
                 this.descripcion = rs.getString(3);
                 this.precio = rs.getInt(4);
        } 
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        
}
    
    public void BuscarNombre(String nombre){
    
    String sqlBuscarNombre = "select * from articulos where nombre LIKE "+"'%"+nombre+"%'"+"";
        try {
            ps = conn.getConexion().prepareStatement(sqlBuscarNombre);
             rs = ps.executeQuery();
             
             while (rs.next()) {                
                
                 System.out.println(rs.getString(2));
                 System.out.println(rs.getString(3));
                 System.out.println(rs.getString(4));
        } 
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void BuscarTodo(){
    
        try {
            String sqlBuscarTodo = "select * from articulos";
            
            ps = conn.getConexion().prepareStatement(sqlBuscarTodo);
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    }
    
    public ArrayList obtenerDatos() throws SQLException{
        ArrayList<Modelo> listaId = new ArrayList<>();        
        String selectDatos = "select * from articulos";
        ps = conn.getConexion().prepareStatement(selectDatos);
        rs = ps.executeQuery();        
        while (rs.next()) {            
            Modelo art = new Modelo();
            art.setId(rs.getInt(1));
            art.setNombre(rs.getString(2));
            art.setDescripcion(rs.getString(3));
            art.setPrecio(rs.getInt(4));
            listaId.add(art);
        }
        return listaId;
    }
    
    public void Actualizar(int id){
    
    
    String sqlUpdate = "UPDATE articulos SET nombre= ? , descripcion= ?, precio= ? WHERE idArticulo= "+id;
        try {
            ps = conn.getConexion().prepareStatement(sqlUpdate);
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setInt(3, precio);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    public void Eliminar(String nombre){
    
        try {
            String delete= "delete from articulos where nombre= ?";
            ps = conn.getConexion().prepareStatement(delete);
            ps.setString(1, nombre);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

}
