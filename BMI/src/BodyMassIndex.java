/**
 *
 * @author AliGalipSekeroglu
 * Calculating BMI (Body-Mass Index)
 * 
 */


import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your weight (kg) :");
        int weight =input.nextInt();
        
        System.out.print("Enter your height (m,such as 1.50) : ");
        double height =input.nextDouble();
        
        double bmi  = weight /(height * height);
        System.out.println("Your BMI is : "+bmi);
    
    
    
    }
}
