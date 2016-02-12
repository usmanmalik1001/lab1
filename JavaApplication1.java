/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import abc.Multiply;
import java.util.*;

/**
 *
 * @author shirazi1
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int matrixA [][] = new int[2][2];
        int matrixB [][] = new int[2][2];
        
        for (int i = 0; i < matrixA.length; i++) 
        {
            for (int j = 0; j < matrixA[i].length; j++) 
            {
                matrixA[i][j] = (int)(Math.random()*10);
                matrixB[i][j] = (int)(Math.random()*10);
            }
        }
        
        int result[][] = Multiply.strassen(matrixA, matrixB);
     
    }
   
}
