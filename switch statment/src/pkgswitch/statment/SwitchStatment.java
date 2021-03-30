package pkgswitch.statment;
import java.util.Scanner;

public class SwitchStatment {

    public static void main(String[] args) {
      int age ;
      age = 20;
      
      switch(age){
      case 20:
          System.out.print("ohh you are 20\n");
          break;
      case 19:
          System.out.print("waht ! you r not 20\n");
          break;   
      default:
          System.out.print("you are not 20\n,");
          break;
      
       }
      
    }
    
}
