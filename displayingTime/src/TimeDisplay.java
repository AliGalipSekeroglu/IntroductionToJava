
/**
 *
 * @author AliGalipSekeroglu
 *
 * Write a program that obtains minutes and seconds from seconds which user prompt.
 */
import java.util.Scanner;

public class TimeDisplay {

    public static void main(String[] args) {
        int minute = 60; //1 minute is 60 seconds.
        System.out.print("Enter seconds: ");
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();
        System.out.println(seconds+ " second is " + seconds/minute +" minutes and " + seconds%minute +" seconds" );

    }
}
