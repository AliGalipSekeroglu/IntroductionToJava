/**
 *
 * @author AliGalipSekeroglu
 */
import java.util.Scanner;
public class OpeningProblem {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many numbers are you going to write : ");
    int howManyNumbers = input.nextInt();
    double[] numbers = new double[howManyNumbers];
    double sum =0 ;
   
    
    for (int i = 0 ;i<howManyNumbers;i++){
    numbers[i] = Math.random()*howManyNumbers;
    sum = sum + numbers[i];
    }
    
    for (int i =0 ; i< howManyNumbers ; i++){
        System.out.println("Random numbers are : "+ numbers[i]);
    }
    
    double average = sum / howManyNumbers ;
    
     int counter = 0;
    for (int i =0 ; i<howManyNumbers; i++){
    if (numbers[i] > average)
        counter++;
    }
        System.out.println("Average is : " + average);
        System.out.println("Number of elements greater than the average : " + counter);
    
    }
}
