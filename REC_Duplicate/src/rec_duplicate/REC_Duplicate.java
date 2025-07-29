/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rec_duplicate;
import java.util.Scanner;
public class REC_Duplicate {

     public static void Remove_Duplicate(String str,int idx,String newstr){
          if(idx == str.length()){
            System.out.print("Reversed String :"+newstr);
            return;
        }
          if(newstr.contains(String.valueOf(str.charAt(idx)))){
              
          }
          else{
              newstr+=str.charAt(idx);
          }
          Remove_Duplicate(str,idx+1,newstr);
     }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter string to remove dulicate :");
        String  str = input.nextLine();
        
        Remove_Duplicate(str,0,"");
    }
    
}
