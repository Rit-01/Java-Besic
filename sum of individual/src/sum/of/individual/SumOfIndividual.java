/*
 sum of 3 individual digits like (389  = sum of 20 ) like this 
 */
package sum.of.individual;
import java.util.*;

public class SumOfIndividual {

     public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc = new Scanner (System.in);
     int number ,reminder,sum=0 ;
     
     System.out.print("Enter the number\n");
     number  = sc.nextInt();
    
     for (sum = 0; number > 0; number=number/10 ){
      reminder = number %10;
      sum=sum + reminder;
          }
     System.out.print("these is the sun of given digit = " + sum +"\n");
     }
    
}
