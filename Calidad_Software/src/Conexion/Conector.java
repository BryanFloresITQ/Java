package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conector {
    Connection conexion = null;
    String url="jdbc:mysql://localhost:3306/calidad?useSSL=false"; //puerto generalmente 3306 y el nombre de la base
    String usuario="root"; 
    String password="";
    public Conector(){
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
    }}
