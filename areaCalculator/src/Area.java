/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AliGalipSekeroglu
 * Compute area of a circle with console input by the user.
 */
import java.util.Scanner;
public class Area {
    public static void main (String[] args){
       Scanner input = new Scanner (System.in); 
       final double PI =3.14159;
        System.out.print("Enter the radius of the circle : ");
        double radius = input.nextDouble();
        double area=Math.pow(radius, 2)*PI;
        System.out.println("Area of the circle is : "+area);
        
        
    
    
    
    
    
    }
}
