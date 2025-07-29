/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rec_palindrome;
import java.util.Scanner;
public class REC_PAlindrome {

    public static void Palindrome(String str,int idx,String reverse){
        if(idx < 0){
            if(str.equalsIgnoreCase(reverse)){
                System.out.println("Yes it is a palindrome.");
            }
            else{
                System.out.println("It is not a palindrome.");
            }
            return;
        }
        reverse+=str.charAt(idx);
        Palindrome(str,idx-1,reverse);
    }
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        System.out.println("Enter a string :");
        String  str = input.nextLine();
        
        Palindrome(str,str.length()-1,"");
    }
    
}
