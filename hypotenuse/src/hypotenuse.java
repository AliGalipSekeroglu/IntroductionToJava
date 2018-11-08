/**
 *
 * @author AliGalipSekeroglu
 * Calculating hypotenuse of a given triangle's edges.
 */

import java.util.Scanner;
public class hypotenuse {
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   int firstEdge;
   int secondEdge;
   double hypotenuse;
   
   System.out.print("Enter the first edge : ");
   firstEdge = input.nextInt();
   System.out.print("Enter the second edge : ");
   secondEdge =input.nextInt();
       
   hypotenuse=Math.sqrt(Math.pow(firstEdge,2)+Math.pow(secondEdge,2));
   
   /* or 
   hypotenuse = Math.sqrt(firstEdge*firstEdge + secondEdge * secondEdge);
   or
   hypotenuse = 0.5 *(firstEdge*firstEdge + secondEdge * secondEdge);
   */
       System.out.println("Hypotenuse is : "+hypotenuse);
   }
}
