package define.exception;
import java.util.Scanner;

public class DefineException {
   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       
    try{
          System.out.print("Enter the number\n");
          int n1 = input.nextInt();
          System.out.print("Enter the 2nd number number\n");
          int n2 = input.nextInt();
           System.out.print("Enter the 3rd number number\n");
          int n3 = input.nextInt();
           System.out.print("Enter the 4th number number\n");
          int n4 = input.nextInt();
          int sum = n1+n2+(n3-n4) ;
          
          System.out.print(sum);
    }catch (Exception e){
         System.out.print("you cant do it" );
       
    }
    
}
    
}