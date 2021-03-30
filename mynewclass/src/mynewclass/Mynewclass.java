/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssr;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class area_cuboid { // program to find area of cuboid
    
    float area ;
    
    void cuboid ( float l , float b , float h ){
        area = l * b * h ;
    }
}

class find_cuboid_area extends area_cuboid {
    public static void main ( String args[] ){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println( "Enter length of cuboid: " );
        float l = sc.nextFloat();
        
        System.out.println( "Enter breadth of cuboid: " );
        float b = sc.nextFloat();
        
        System.out.println( "Enter height of cuboid: " );
        float h = sc.nextFloat();
        
        area_cuboid ans = new area_cuboid();
        ans.cuboid(l, b, h);
    
        System.out.println("Area of cuboid: " + ans.area);
    }
}
    
    
    
    
    
    
    
    
}
