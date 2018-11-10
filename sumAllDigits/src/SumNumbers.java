/**
 *
 * @author AliGalipSekeroglu
 * 
 * Calculating the given number's all digits by using do-while loop.
 * 
 */
import java.util.Scanner;
public class SumNumbers {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    int total=0;
    int number = input.nextInt();
    
    do{
        /*Ignoring the last digit of the given number in each iteration.*/
        total = total + number%10; //Adding last digit to the total sum.
        number = number / 10;
    
    
    }while(number>0);
    
    System.out.println("Sum : "+total);
    
    
    }
 
}
