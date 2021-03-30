/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even.and.odd.number;
import java.util.Scanner;
/**
 *
 * @author RM
 */
public class EvenAndOddNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner value = new Scanner (System.in);
       
       System.out.print("Enter the value\n");
       int num = value.nextInt();
       
       for (num = 2  ; num >=10 ; num ++);           
      
       if(num%2  == 0 ) {
         System.out.print(num+"this is even value\n ");
         
       }else {
           System.out.print(num+"this is odd value \n");
       }if (num%3==0){
           System.out.print(num+"this is odd value \n");      
       }
         
    }
    
}
