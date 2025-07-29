/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rec_str_reverse;
import java.util.Scanner;
public class Rec_STR_Reverse {

    public static void Reverse(String str,int ind){
        if(ind==0){
            System.out.print(str.charAt(ind));
            return;
        }
        System.out.print(str.charAt(ind));
        Reverse(str,ind-1);
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter string you want to reversed :");
        String  str = input.nextLine();
        
        System.out.print("Reversed String:");
        Reverse(str,str.length()-1);
        
    }
    
}
