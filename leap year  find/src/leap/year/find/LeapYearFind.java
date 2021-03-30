/*
 these program is use to find year is leap or not 
 */
package leap.year.find;
import java.util.*;

public class LeapYearFind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.print("Enter the year \n");
         int year ; 
         Scanner sc = new Scanner (System.in);
         year = sc.nextInt();
 
         if (( year%400==0 ) || (( year%4==0 ) && ( year%100 !=0 ))){   // these is the calculation of find the leap year  
          System.out.print( year + " is a leap year \n " );
        }else {
          System.out.print( year + " is a not leap year " );
         
         }
            
      }
    
}
