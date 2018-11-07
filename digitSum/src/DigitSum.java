/**
 *
 * @author AliGalipSekeroglu
 * 
Write a program that reads an integer between 0 and 1000 and adds all the digits in the
integer. For example, if an integer is 932, the sum of all its digits is 14.
 */

import java.util.Scanner;


public class DigitSum {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Write a number :");
    int number = input.nextInt();
    
    int lastDigit = number %10;
    int secondDigit = (number / 10)%10;
    int firstDigit = number /100;
    int total = firstDigit + secondDigit + lastDigit;
    System.out.println("First digit is : "+ firstDigit);
    System.out.println("Second digit is : "+ secondDigit);
    System.out.println("Last digit is : "+ lastDigit);
    System.out.println("Sum of all digits is : "+ total);
    }
    
}
