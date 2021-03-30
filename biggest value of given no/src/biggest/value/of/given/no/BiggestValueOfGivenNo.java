/*
 Find the biggest value with help of this program
 */
package biggest.value.of.given.no;
import java.util.*;
public class BiggestValueOfGivenNo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc =new Scanner (System.in);
       System.out.print("Enter the value\n ");

       int x ;
       x = sc.nextInt();           // this is use for next input value 
       int y ;
       y = sc.nextInt();
       int z ;
       z= sc.nextInt();
       
       if (x>y && x>z){             // in this methord comper the value 
          System.out.print("First is the biggest value " );
          
       }else if (y>x && y>z){
          System.out.print("secound is the biggest value\n " );
       }else if (z>x && z>y)
          System.out.print("third is the biggest value \n" );
        else 
          System.out.print("the number are not distinct\n");          
    
    
  }
