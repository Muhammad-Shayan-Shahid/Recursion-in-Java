/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rec_move_x;
import java.util.Scanner;
public class REC_Move_X {

    public static void Move(String str,int idx,String no_X,String X){
        if(idx == str.length()-1){
            System.out.print("Reversed String :"+no_X+X);
            return;
        }
        
        if(str.charAt(idx)=='x'){
            X+=str.charAt(idx);
        }
        else{
            no_X+=str.charAt(idx);
        }
        Move(str,idx+1,no_X,X);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string conatinainig X :");
        String  str = input.nextLine();
        
        Move( str, 0, "" ,"");
    } 
    
}
