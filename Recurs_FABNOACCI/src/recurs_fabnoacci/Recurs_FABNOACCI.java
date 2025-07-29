/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recurs_fabnoacci;
import java.util.Scanner;
public class Recurs_FABNOACCI {

    public static void FAB(int a, int b,int len){
        if(len==0){
            return;
        }
        int sum =a+b;
        System.out.println(sum);
        FAB(b, sum,len-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of FAB sequence you want to print:");
        int  len = input.nextInt();
        int a=0;
        int b=1;
        System.out.println("Fabonacci Sequence :");
        System.out.println(a);
        System.out.println(b);
        FAB(a, b,len-2);
    }
    
}
