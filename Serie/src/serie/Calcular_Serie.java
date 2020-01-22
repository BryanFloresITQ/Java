/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie;

/**
 *
 * @author Bryan
 */
public class Calcular_Serie {
    
    public int Calculo(int numero){
    
        Series series=new Series(numero);
        
        int total=1;
        
    for(int i=0; i<series.getNumero(); i++){
    
    total=total*2;
    
    }
    
    return total;
    }
    
}
