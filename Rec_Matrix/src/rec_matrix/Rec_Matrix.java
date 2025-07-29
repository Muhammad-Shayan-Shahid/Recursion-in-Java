/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rec_matrix;
import java.util.Scanner;
public class Rec_Matrix {

    public static void Matrix(int n, int i){
        if(i>n){
            return;
        }
        for(int k=1 ;k<=n ; k++){
           int m = (int)(Math.random()*2);
            System.out.print(m+" ");  
        }
        System.out.println (); 
        
        Matrix(n, i+1);
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter a num (n) whose matrix you want to print :");
        int n = input.nextInt();
        
       Matrix( n, 1);
    }
    
}
