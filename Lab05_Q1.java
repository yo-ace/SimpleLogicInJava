/**
 * This implementation takes a number from the user and prints the number of stars for each digit. 
 */
import java.util.Scanner;
public class Lab05_Q1 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter \'falling stars\' : ");
        String stars = scn.next();
        System.out.println("Falling stars: ");
        System.out.println(stars); 
        int length = stars.length();
        int max = 0;
    
        for (int c = 0; length > c; c++ ) // determine how much line you got
        {
            int reminder = Character.getNumericValue(stars.charAt(c));
            if ( reminder > max)
                {
                   max = reminder;
                }
            reminder = 0;
        }

        for ( int line = 1; line <= max; line++) // print the stars line by line
        {   
            for ( int c = 0; length > c; c++ )
            {
                int numericValue = Character.getNumericValue(stars.charAt(c));                
                if ( numericValue > line - 1 ) // because you will continue printing if the numeric value is not exceeded. 
                {                               
                    System.out.print("*");
                }
                else // this means need number of stars are already printed, so you will leave this spot empty. 
                {
                    System.out.print(" ");
                }
                numericValue = 0;
            }
            System.out.println("");
        }
    scn.close();
    }
}