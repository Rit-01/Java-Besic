/*
 2D ARRAY 
 */
package pkg2d.array;
import java.util.*;

public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x ,y ,z ;
        int arr [][]={{3, 2 ,1},{2, 4 , 2},{3, 9 , 6}};
        for ( x=0;x<2;x++){
           for ( y=0;y<4;y++){
           System.out.print(arr[x]+"\n"+arr[y]+"\n"+arr);
           }
           System.out.println();
        }
    }
    
}
