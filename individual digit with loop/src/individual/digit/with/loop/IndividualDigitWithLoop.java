/*
 this progam is make for individual digit like 784 then it is print like 7  8  4 .
 */
package individual.digit.with.loop;
import java.util.*;

public class IndividualDigitWithLoop {

    public static void main(String[] args) {
        // get the value from user  
         Scanner sc =new Scanner (System.in);
      
        int a , temp,digit,count = 0 ;
        
        System.out.print(" Enter the value\n ");
        a =sc.nextInt();
         
        temp = a ;
        
        while(a>0)
        {
                                                            //user input help of this code 
        a=a/10;
        count++;
        
        }
        while (temp>0)
        {
                                                             // this is use for count the digit and in which place the digit show ; 
        digit=temp%10;
        System.out.print(a+"Digit at place "+count+" is:\n "+digit );
        temp =temp/10;
        count--;
        
      
        }
        
    }
    
}
