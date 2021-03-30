    
package basic.calculator;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
      Scanner value = new Scanner (System.in);
      double fnum,snum,rnum,unum,answer;
      System.out.println("Enter first num:");
      fnum=value.nextDouble();
      System.out.println("Enter secound num:");
      snum=value.nextDouble();
      System.out.println("Enter third num:");
      rnum=value.nextDouble();
      System.out.println("Enter forth num:");
      unum=value.nextDouble();
      answer=fnum*snum+rnum-unum;
      System.out.println(answer);
              
    }
    
}
