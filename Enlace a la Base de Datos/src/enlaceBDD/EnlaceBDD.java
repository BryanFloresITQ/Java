///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package enlaceBDD;
//
//import Modelo.Modelo;
//import Vista.producto;
//import conexion.conector;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
///**
// *
// * @author Bryan
// */
//public class EnlaceBDD {
//
//    
//    
//    
//    public static void main(String[] args) {
//        
//        Modelo modelo=new Modelo();
//        
//        PreparedStatement ps=null;
//        
//        conector conn=new conector();
//        
//        conn.getConexion();
//        
//        String insert="insert into "+ "articulos(nombre,descripcion,precio) "+ "values(?,?,?) ";
//        try {
//            ps = conn.getConexion().prepareStatement(insert);
//            ps.setString(1, modelo.getNombre());
//            ps.setString(2, modelo.getDescripcion());
//            ps.setDouble(3, modelo.getPrecio());
//            ps.executeUpdate();
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(EnlaceBDD.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        
//    }
//    
//    
//    
//}
