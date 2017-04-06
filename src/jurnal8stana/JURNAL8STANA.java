/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal8stana;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JURNAL8STANA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.print("Jumlah Deret Fibonacci:");
        Scanner inputFibonacci = new Scanner(System.in);
        
        int fibonacciCount = inputFibonacci.nextInt();
        
        for (int ii=0; ii < fibonacciCount; ii++)
        {
            System.out.println("Bilangan Fibonacci: " + methodFibonacci(ii));
        }
    }
      public static int methodFibonacci(int fibonacciInput)
    {   
        int x;
        int n = fibonacciInput;
        if(n <=0 || n<=1)
        {
           return n; 
        }
       
        else
        {
            return methodFibonacci(n-2) + methodFibonacci(n-1) ;
        }
            
    }
}
