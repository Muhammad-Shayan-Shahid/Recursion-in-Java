/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rescursive2;

/**
 *
 * @author HP
 */
public class Rescursive2 {

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int result = sum(n);
        System.out.println("Sum from 1 to 5:"+result);
    }
    
}
