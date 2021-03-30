/*
Eligible voting or not 
 */
package eligible.or.not;
import java.util.*;
public class EligibleOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc =new Scanner (System.in);
        int age;
        
        System .out.print("Enter rhe age\n" );
        age = sc.nextInt();
        
        if (age>17){
            System.out.print("You are eligible for vaot\n" );
        }else{
            System.out.print("You are not for vaot\n" );       
        }
    }
    
}
