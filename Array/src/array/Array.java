/*
  these is basic array 
 */
package array;
import java.util.Scanner;

public class Array {

       public static void main(String[] args) {
       int i =0 ,sum = 0;      
       int rit [] = {36,36,24,54,56,95,22,52,5};
       
       for (i=0;i<rit.length;i++){
           
       System.out.print("\n"+rit[i]+"\n");
       sum = sum + rit[i] ;
       System.out.print("\n "+sum);
         
          
         } 
    
    }
}
