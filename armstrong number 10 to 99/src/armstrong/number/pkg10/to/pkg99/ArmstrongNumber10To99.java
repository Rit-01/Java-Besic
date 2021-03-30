/*
 
 */
package armstrong.number.pkg10.to.pkg99;
import java.util.Scanner;

public class ArmstrongNumber10To99 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
     int  a,number , temp ,total = 0 ;
     
     System.out.print("print the all armstrong number from 1 to 99 ");
     Scanner sc = new Scanner (System.in);
     a=sc.nextInt();
     sc.close();
     number = a ;
     
     for ( a = 0 ; a >  99 ; a /=10 )
     {
        temp = a % 10 ;
        total =total + temp*temp ;
     
                
    }
     
  
    }
    
}
