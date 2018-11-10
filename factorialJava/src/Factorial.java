/**
 *
 * @author AliGalipSekeroglu
 * Factorial in Java
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
       
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a value:");
        int value = input.nextInt();
        int total=1;
        for (int i=1;i<=value;i++){
        total=total*i;
        
        /*
        int i=1;
        while(value>0){
        total*=value;
        value--;*/
        }
        
        System.out.println(total);
        
    }
}
