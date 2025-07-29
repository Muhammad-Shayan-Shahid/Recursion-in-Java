/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rec_pattern2;
public class Rec_pattern2 {

    public static void StarP(int n, int i){
        if(i>n){
            return;
        }
        for(int j=n ;j>=i ; j--){
            System.out.print("*"+" ");
        }
        System.out.println (); 
        
        StarP(n, i+1);
    }
    public static void main(String[] args) {
         int n=5;
        StarP( n, 1);
    }
}
