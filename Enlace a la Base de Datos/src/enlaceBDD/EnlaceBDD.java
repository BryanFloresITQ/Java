
package enlaceBDD;

import Modelo.Modelo;
import Vista.producto;
import conexion.conector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryan
 */
public class EnlaceBDD {

    
    
    
    public static void main(String[] args) {
        
        Modelo modelo=new Modelo();
        
        PreparedStatement ps=null; //Ingresar Datos
        ResultSet rs=null;     // Obtener Datos
        
        conector conn=new conector();
        
        conn.getConexion();
        
        String select = "select * from articulos where idArticulo = ?";
        
        try {
            ps = conn.getConexion().prepareStatement(select);
            
             ps.setInt(1, 1);
             rs = ps.executeQuery();
             
             while (rs.next()) {                
                
                 System.out.println(rs.getString(2));
                 System.out.println(rs.getString(3));
                 System.out.println(rs.getString(4));
                 
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(EnlaceBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }
    
    
    
}
