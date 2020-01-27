/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryan
 */
public class conector {
    
    Connection conexion = null;
    
    String url="jdbc:mysql://localhost:3306/base?useSSL=false"; //puerto generalmente 3306 y el nombre de la base
    String usuario="root"; 
    String password="Listo123";
    
    
    public conector(){
    
        try {
            conexion=(Connection) DriverManager.getConnection(url,usuario,password);
            if(conexion!=null){
            
                System.out.println("Conexión Exitosa");
            
            }else{
            
                System.out.println("No hubo conexión");
            
            }
        } catch (SQLException ex) {
            
            System.err.println("No se pudo conectar");
            ex.printStackTrace();
        }
    
    }
    
    public Connection getConexion(){
    
        return conexion;
    
    }
    
    public void Desconectar(){
    
        conexion = null;
    
    }
    
}
