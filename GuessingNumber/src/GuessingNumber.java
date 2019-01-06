/**
 *
 * @author AliGalipSekeroglu
 * Guessing number between 1 and 100 with loops.
 */
import java.util.Scanner;
public class GuessingNumber {
    public static void main(String[] args){
    int randomNumber = 1+ (int)(Math.random()*101);
    Scanner input = new Scanner(System.in);
    int guess = 0;
    
    while (randomNumber != guess ){
    System.out.println("Enter your guess: ");
    guess = input.nextInt();
    
    if (guess ==randomNumber)
            System.out.println("Correct number!");
    else if (guess>randomNumber)
            System.out.println("Too much,try smaller numbers.");
    else
            System.out.println("Too small,try bigger numbers.");
    }
    }
}
