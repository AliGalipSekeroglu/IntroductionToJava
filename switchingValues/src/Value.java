/**
 *
 * @author AliGalipSekeroglu
 * Switching values of two variables which are given by the user.
 */
import java.util.Scanner;
public class Value {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int firstNumber;
    int secondNumber;
    int flag=0;
    
    System.out.print("Enter the first number :");
    firstNumber = input.nextInt();
    System.out.print("Enter the second number :");
    secondNumber = input.nextInt();
    
    flag=firstNumber;
    firstNumber=secondNumber;
    secondNumber=flag;
    
        System.out.println("New first number = "+firstNumber);
        System.out.println("New second number = "+secondNumber);
    }
}
