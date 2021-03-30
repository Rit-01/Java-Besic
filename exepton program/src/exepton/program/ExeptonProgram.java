
package exepton.program;
import java.util.Scanner;
public class ExeptonProgram {
    public static void main(String[] args) {
         System.out.print("traingal in numbers form");
              int a,b,c,r=1;
          
              for(a=0; a<5; a++)
           {
              if(a%3==0) {
	        b=3*c+r;
		for(b=0;b<a;b++){
             System.out.print("%d"+b);
		b--;
	        }
	   }              	
	  else
              {
                  c=3*a+r;
                  for(b=0;b<a;b++)
	{
	     System.out.print("%d"+c);
	     c++;
      	  }
           }       
            r++;
            System.out.print("\n");                    		

                 }
              
	}
       
  
    
}
