/**
 *
 * @author AliGalipSekeroglu
 * 
 * Input Format
*The first line contains a string str_1. 
* The second line contains another string str_2 . 
* The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output: 
For the first line, sum the lengths of str_1 and str_2 . 
For the second line, write Yes if str_1 is lexicographically greater than str_2  otherwise print No instead. 
For the third line, capitalize the first letter in both str_1 and str_2  and print them on a single line, separated by a space.
 */
import java.util.Scanner;
public class JavaStringOperations {
    public static void main(String[] args){
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str_1=sc.nextLine();
        System.out.println("Enter one more string : ");
        String str_2=sc.nextLine();
        int toplam = str_1.length() + str_2.length();
        System.out.println(toplam);
        
        char first_letter_a = str_1.charAt(0);
        char first_letter_b = str_2.charAt(0);
        if (first_letter_a>first_letter_b){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    String new_a = str_1.substring(0,1).toUpperCase() + str_1.substring(1).toLowerCase();
    String new_b = str_2.substring(0,1).toUpperCase() + str_2.substring(1).toLowerCase();

    System.out.println(new_a + " " +new_b);
    }
    
}
