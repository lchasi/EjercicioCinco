/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matri3x3;

import java.util.Scanner;

/**
 *
 * @author lchas
 */
public class Matri3x3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner  (System.in);
        int numeroa1,numeroa2,numeroa3,numerob1,numerob2,numerob3,numeroc1,numeroc2,numeroc3;
        
        System.out.println( "ingrese el primer valor de la matriz a  " );
        numeroa1 = entrada.nextInt ();
        
        System.out.println( "ingrese el segundo valor de la matriz a  " );
        numeroa2 = entrada.nextInt ();
        
        System.out.println( "ingrese el tercer valor de la matriz a  " );
        numeroa3 = entrada.nextInt ();
        
        System.out.println( "ingrese el primer valor de la matriz b  " );
        numerob1 = entrada.nextInt ();
        
        System.out.println( "ingrese el segundo valor de la matriz b  " );
        numerob2 = entrada.nextInt ();
        
        System.out.println( "ingrese el tercer valor de la matriz b  " );
        numerob3 = entrada.nextInt ();
        
        System.out.println( "ingrese el primer valor de la matriz c  " );
        numeroc1 = entrada.nextInt ();
        
        System.out.println( "ingrese el segundo valor de la matriz c  " );
        numeroc2 = entrada.nextInt ();
        
        System.out.println( "ingrese el tercer valor de la matriz c  " );
        numeroc3 = entrada.nextInt ();
        
        
        
        
        
        
        int matrix [][] = {{numeroa1,numeroa2,numeroa3},{numerob1,numerob2,numerob3},{numeroc1,numeroc2,numeroc3}};
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.print("\n");
        }
        
        
        
        
    }
    
}
