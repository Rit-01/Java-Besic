/*
 These is the program of armstrong number
 */
package armsrong.number;
import java.util.Scanner;

 public class ArmsrongNumber {

        public static void main(String[] args) {
       Scanner sc =new Scanner (System.in);
      
      int a, sum =0 ,temp ,r ;
      
      System.out.print("Enter the number chek armstrong number or not  \n");
      a = sc.nextInt();
      
      temp = a ;
      
      while(temp != 0 )        
          {
          r=temp%10;                  
          sum= sum + r*r*r ;
          temp=temp/10;        
         }     
      if (a == sum)
      System.out.print("this is the armstrong number");
      else 
      System.out.print("this is not armstrong number ");
      
      
      } 
      
      
    }
    

    
    

