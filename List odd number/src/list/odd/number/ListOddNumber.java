/*
 this program is writr for odd number 
 */
package list.odd.number;
import java.util.Scanner;
/**
 *
 * @author RM
 */
public class ListOddNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.print("enter the odd value\n ");
        int counter,limit ;
           limit = 5000;
         for (counter=1;  counter<=limit;counter+=2)       {   //* this is the use for print */
               
                 System.out.print(" \t"+counter );
                 
      
      } 
         System.out.print("\n this all are even number\n" );
          int x,lim ;
           lim = 100;
         for (x=0;  x<=limit;x+=2 )       {   //* this is the use for print */
               
                 System.out.print(" \t"+x );
   }
 }
}