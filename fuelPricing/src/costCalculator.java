/**
 *
 * @author AliGalipSekeroglu
 * Calculating the total cost according to given distance and consumption of your car per km
 */
import java.util.Scanner;
public class costCalculator {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.print("Enter your car's consumption per km (i.e 0.60) :");
        double consumption = input.nextDouble();
        System.out.print("Enter the distance as km :");
        int km = input.nextInt();
        double total = km * consumption;
        System.out.println("Total cost of your trip: " + total + " $");
    
    
    }
    
    
}
