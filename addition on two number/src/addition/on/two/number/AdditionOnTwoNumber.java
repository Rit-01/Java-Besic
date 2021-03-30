
package addition.on.two.number;
import java.util.Scanner;
/**
 *
 * @author RM
 */
public class AdditionOnTwoNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner value = new Scanner(System.in);
        
         double Rahul, Shubham ,Answer;
         
         System.out.print("Enter the rahul have money\n");
         Rahul = value.nextDouble();
         System.out.print("Enter the Shubham have money\n");
         Shubham = value.nextDouble();
         Answer=Rahul+Shubham;
         System.out.print(Answer+"Rahul and shubham have total money");
             
    }
    
}
