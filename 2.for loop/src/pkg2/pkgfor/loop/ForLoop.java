/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkgfor.loop;
import java.util.Scanner;
/**
 *
 * @author RM
 */
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,y,z ,limt;
           System.out.print("\nEnter Number\n ");
           
          for (x=1;x<=10; x++){
          System.out.print("\t"+ x);
          }
         System.out.print("\n start to middel number \n  ");
         for (y=1;y<=5; y++){
          System.out.print("\t"+ y);
          } 
         System.out.print("\n uppew to lower case\n  ");
         for (z=10;z>=5; z--){
          System.out.print("\t"+ z);
          } 
    }
    
}
