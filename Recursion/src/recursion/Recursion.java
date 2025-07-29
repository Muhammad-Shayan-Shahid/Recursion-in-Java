/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion;

/**
 *
 * @author HP
 */
public class Recursion {
    
    public static void number(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        number(n-1);
    }
    public static void main(String[] args) {
        int n =5; 
        number(n);
    }
    
}
