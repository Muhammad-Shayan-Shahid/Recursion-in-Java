/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recfactorial;
import java.util.Scanner;
public class RECFactorial {

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter a number whose fact you want to calculated:");
         int  n = input.nextInt();
         
         int result = fact(n);
         System.out.println("Factorial of "+n+" is : "+result);
    }
    
}
