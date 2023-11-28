/**
 * Lab04_Q1
 */
import java.util.Scanner;
public class ReverseTheInteger
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in) ;
        System.out.print("Enter input n: ");
    
        while (scan.hasNextInt()) 
        {
            int number = scan.nextInt() ;
            while ( number > 0 )
            {
                int reversing = number % 10 ;
                number = number / 10 ;
                System.out.print(reversing); 
            }
        }
    scan.close();
    }
}