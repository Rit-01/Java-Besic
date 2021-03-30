
package increment.operator;
import java.util.Scanner;
public class IncrementOperator {

    public static void main(String[] args) {
        Scanner rit = new Scanner (System.in);
        
        int golu = 9;
        int nit  = 12;
        
        System.out.println(golu++);
        System.out.println("this is the real value"+golu);
    }
    
}
