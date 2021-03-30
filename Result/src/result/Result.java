 //* Result makeing */

package result;
import java.util.Scanner;


public class Result {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner sc = new Scanner (System.in);
        
       int maths,science,computer;
       
       float Avrage,total ,percentage;
       
       
       System.out.print("#\tSubject name \t matks\n  ");
       System.out.print("-----------------------------\n  ");
       
       System.out.print("1\t maths\t\t");
       maths = sc.nextInt();                                    //* this is useing for input value*/
       System.out.print("  2\t science\t");
       science = sc.nextInt();
       System.out.print("  3\t computer\t");
       computer = sc.nextInt();
       sc.close () ; 
                    
          total = maths +science + computer ;
          Avrage = total/3;
          percentage = (total/3)%100 ;
         
        System.out.print("  total marks = "+total);
        System.out.print(" \n Avrage marks= "+ Avrage );
        System.out.print("\n percentage = "+percentage);
      
        if (percentage>60){
            System.out.print("\nyour r a good student" );
            
        }else{
            System.out.print("\nyour r avrage student\n" );          
        }
    }
    
}
