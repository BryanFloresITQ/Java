/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conector;
import Modelo.Ingreso_Usuario;
import Modelo.Usuario;
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
    
    
    ArrayList nombres=new ArrayList();
    ArrayList apellidos=new ArrayList();
    ArrayList cedulas=new ArrayList();
    ArrayList roles=new ArrayList();
    ArrayList telefonos=new ArrayList();
    ArrayList direcciones=new ArrayList();
    ArrayList usuarios=new ArrayList();
    ArrayList contrasenias=new ArrayList();
    PreparedStatement ps=null;
    Conector conn=new Conector();
    ResultSet rs=null;
    
     public void Logueo(Usuario datos, String id_Rol){
         
       
        String traer = "SELECT * FROM usuario";
        
        if(id_Rol != null){
        
            traer = "SELECT * FROM usuario WHERE ID_ROLL = "+id_Rol;
            
        }
        
        try {
            ps = conn.getConexion().prepareStatement(traer);
            rs = ps.executeQuery();
             
             while (rs.next()) {                
                
                 nombres.add(rs.getString(1)); 
                 apellidos.add(rs.getString(2));
                 cedulas.add(rs.getInt(3));
                 roles.add(rs.getInt(4));
                 telefonos.add(rs.getInt(5));
                 direcciones.add(rs.getString(6));
                 usuarios.add(rs.getString(7));
                 contrasenias.add(rs.getString(8));
                 
        }
             
             datos.setNombres(nombres);
             datos.setApellidos(apellidos);
             datos.setCedulas(cedulas);
             datos.setRoles(roles);
             datos.setTelefonos(telefonos);
             datos.setDirecciones(direcciones);
             datos.setUsuarios(usuarios);
             datos.setContrasenias(contrasenias);
             
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
    }
     
     public void ingresarUsuario(Ingreso_Usuario datos){
     
         String ingresar = "insert into "+"usuario (NOMBRE, APELLIDO, CEDULA_DE_IDENTIDAD, ID_ROLL, TELEFONO, DIRECCION, NOMBRE_DE_USUARIO, CONTRASENIA)"
                 +" values (?,?,?,?,?,?,?,?) "; 
         
        try {
            ps = conn.getConexion().prepareStatement(ingresar);
            ps.setString(1, datos.getNombre());
            ps.setString(2, datos.getApellido());
            ps.setInt(3,datos.getCedula());
            ps.setInt(4,datos.getRol());
            ps.setInt(5,datos.getTelefono());
            ps.setString(6, datos.getDireccion());
            ps.setString(7, datos.getUsuario());
            ps.setString(8, datos.getContrasenia());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos Ingresados");
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
     
     public void Eliminar (int ci){
     
         String delete= "delete from usuario where CEDULA_DE_IDENTIDAD= ?";
         
        try {
            ps = conn.getConexion().prepareStatement(delete);
            ps.setInt(1, ci);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
     
          public void LlenarActualizar(Usuario datos, String Ci){
         
       
        
        
         String traer = "SELECT * FROM usuario WHERE CEDULA_DE_IDENTIDAD = "+Ci;
            
        
        
        try {
            ps = conn.getConexion().prepareStatement(traer);
            rs = ps.executeQuery();
             
             while (rs.next()) {                
                
                 nombres.add(rs.getString(1)); 
                 apellidos.add(rs.getString(2));
                 cedulas.add(rs.getInt(3));
                 roles.add(rs.getInt(4));
                 telefonos.add(rs.getInt(5));
                 direcciones.add(rs.getString(6));
                 usuarios.add(rs.getString(7));
                 contrasenias.add(rs.getString(8));
                 
        }
             
             datos.setNombres(nombres);
             datos.setApellidos(apellidos);
             datos.setCedulas(cedulas);
             datos.setRoles(roles);
             datos.setTelefonos(telefonos);
             datos.setDirecciones(direcciones);
             datos.setUsuarios(usuarios);
             datos.setContrasenias(contrasenias);
             
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
    }
          
          public void Actualizar(int ci, Ingreso_Usuario datos){
              
              String Update = "UPDATE usuario SET NOMBRE= ?, APELLIDO= ?, ID_ROLL= ?, TELEFONO= ?, DIRECCION= ?, "
                      + "NOMBRE_DE_USUARIO= ?, CONTRASENIA= ? WHERE CEDULA_DE_IDENTIDAD= "+ci;
              
        try {
            ps = conn.getConexion().prepareStatement(Update);
            ps.setString(1, datos.getNombre());
            ps.setString(2, datos.getApellido());
            ps.setInt(3, datos.getRol());
            ps.setInt(4, datos.getTelefono());
            ps.setString(5, datos.getDireccion());
            ps.setString(6, datos.getUsuario());
            ps.setString(7, datos.getContrasenia());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos Actualizados", "Actualizar", 1);
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
              
          }
    
}
