/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie;

import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class Serie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Calcular_Serie total=new Calcular_Serie();
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Ingrese número");
        num=scan.nextInt();
        
        Series s=new Series(num);
        
        System.out.println("2^"+num+" = "+ total.Calculo(num));
    }
    
}
