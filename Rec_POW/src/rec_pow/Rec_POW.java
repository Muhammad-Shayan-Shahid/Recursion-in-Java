/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rec_pow;
import java.util.Scanner;
public class Rec_POW {

    public static int exp(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        return x*exp(x,n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num(x) and its exp(n) separated by spaces :");
        int  x = input.nextInt();
        int  n = input.nextInt();
       
        System.out.println("Power is :"+exp( x, n));
    }
    
}
