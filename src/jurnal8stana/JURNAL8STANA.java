/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal8stana;

import static java.lang.Double.sum;
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
    System.out.println("Jumlah Deret Fibonacci:");
        Scanner inputFibonacci = new Scanner(System.in);
        
        int fibonacciCount = inputFibonacci.nextInt();
        
        for (int ii=0; ii < fibonacciCount; ii++)
        {
            System.out.println("Bilangan Fibonacci: " + methodFibonacci(ii));
        }
    }
      public static int methodFibonacci(int fibonacciInput)
    {   
        int sum=0;
// Initialize some variables
    int current, prev = 1, prevprev = 0;
// Loop exactly 10 times 
   for(int i = 0; i < fibonacciInput; i++)           
    {
// Next number is sum of previous two 
      current = prev + prevprev;        
      System.out.println(current + " ");// Print it out
       sum+=current;
// First previous becomes 2nd previous 
      prevprev = prev;
// And current number becomes previous                  
      prev = current;                   
    }
// Terminate the line, and flush output 
    System.out.println();               
    System.out.print("Result= " + sum);
    
    return sum;
  }
          }
      
         
