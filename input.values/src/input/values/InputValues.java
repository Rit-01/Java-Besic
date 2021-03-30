
package input.values;

import java.util.Scanner;

public class InputValues {

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("What is your name ?\n ");
        String yourName = input.nextLine();
        System.out.print( yourName +"Hello \n");
        
        
        
    }
    
}
