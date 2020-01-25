/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Datos {
    
    private String vector[][];
    private int in[][];
    private int nac[][];
    
    int guia;
    int guias;

    public String[][] getVector() {
        return vector;
    }

    public void setVector() {
        
        String datosVector; 
        
        for (int p=0; p<5; p++){
        
        datosVector = JOptionPane.showInputDialog(null, "Ingrese los Datos separados por espacio (Nombre Apellido Salario)");
        
        StringTokenizer tokkens=new StringTokenizer(datosVector, " "); //datos,separador
        
        for (int i = 0; i < 3&&tokkens.hasMoreTokens(); i++) {
            
            this.vector[p][i] = tokkens.nextToken();
            
        }
    }
        
    }

    public Datos(String[][] vector) {
        
        super();
        
        this.vector = vector;
    }
    
   
    
    public Datos() {
    }
    
     @Override
    public String toString() {
        return "vector: "+Arrays.toString(vector); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void fecha(){
    
        int mayor=0;
        int mayors=0;
        
        if(in[0][2]>mayor){
        
        mayor=in[0][2];
        
        guia=0;
        
        }
        
        if(in[1][2]>mayor){
        
        mayor=in[1][2];
        
        guia=1;
        
        }
        
        if(in[2][2]>mayor){
        
        mayor=in[2][2];
        
        guia=2;
        
        }
        
        if(in[3][2]>mayor){
        
        mayor=in[3][2];
        
        guia=3;
        
        }
        
        if(in[4][2]>mayor){
        
        mayor=in[4][2];
        
        guia=4;
        
        }
        
        
        
        if(Integer.parseInt(vector[0][3]) > mayors){
        
        mayors=Integer.parseInt(vector[0][3]);
        
        guias=0;
        
        }
        
        if(Integer.parseInt(vector[1][3]) > mayors){
        
        mayors=Integer.parseInt(vector[1][3]);
        
        guias=1;
        
        }
        
        if(Integer.parseInt(vector[2][3]) > mayors){
        
        mayors=Integer.parseInt(vector[2][3]);
        
        guias=2;
        
        }
        
        if(Integer.parseInt(vector[3][3]) > mayors){
        
        mayors=Integer.parseInt(vector[3][3]);
        
        guias=3;
        
        }
        
        if(Integer.parseInt(vector[4][3]) > mayors){
        
        mayors=Integer.parseInt(vector[4][3]);
        
        guias=4;
        
        }
        
        
    }
    
     public String listarEmpleados(){
    
         for(int i=0; i<5; i++){
         System.out.println("Empleado "+(i+1)+": "+vector[i][0]+" "+vector[i][1]+" Fecha de Ingreso: "+ in[i][0]+"/"+ in[i][1]+"/"+ in[i][2] + " Fecha de Nacimiento: "+nac[i][0]+"/"+nac[i][1]+"/"+nac[i][2]+" Salario: "+vector[i][2]);
         }
         
         System.out.println("Más Antiguo: "+ vector[guia][0]+" "+vector[guia][1]+" Fecha de Ingreso: "+ in[guia][0]+"/"+ in[guia][1]+"/"+ in[guia][2] + " Fecha de Nacimiento: "+nac[guia][0]+"/"+nac[guia][1]+"/"+nac[guia][2]+" Salario: "+vector[guia][2]);
         System.out.println("Más Pagado: "+ vector[guias][0]+" "+vector[guias][1]+" Fecha de Ingreso: "+ in[guias][0]+"/"+ in[guias][1]+"/"+ in[guias][2] + " Fecha de Nacimiento: "+nac[guias][0]+"/"+nac[guias][1]+"/"+nac[guias][2]+" Salario: "+vector[guias][2]);
    
         
    return "";
    }

    public int[][] getIn() {
        return in;
    }

    public int[][] getNac() {
        return nac;
    }

    public void setIn() {
        
        String datosIngreso;
        
        for (int p=0; p<5; p++){
        
        datosIngreso = JOptionPane.showInputDialog(null, "Ingrese los Datos separados por / (dia/mes/año)");
        
        StringTokenizer tokken=new StringTokenizer(datosIngreso, "/"); //datos,separador
        
        for (int i = 0; i < 3&&tokken.hasMoreTokens(); i++) {
            
            this.in[p][i] = Integer.parseInt(tokken.nextToken());
            
        }
        }
    }

    public void setNac() {
        
        String datosNacimiento; 
        for (int p=0; p<5; p++){
        datosNacimiento = JOptionPane.showInputDialog(null, "Ingrese los Datos separados por / (dia/mes/año)");
        
        StringTokenizer tok=new StringTokenizer(datosNacimiento, "/"); //datos,separador
        
        for (int i = 0; i < 3&&tok.hasMoreTokens(); i++) {
            
            this.nac[p][i] = Integer.parseInt(tok.nextToken());
        }
        }
    }
     
     
     
}
