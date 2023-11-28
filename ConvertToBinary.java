/**
 * This implementation converts an integer in range [0,1023] to its binary representation. 
 */
import java.util.Scanner;
public class  ConvertToBinary
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please input n: ");
        int n = scn.nextInt();
        int sum = 0;
        int digit = 0;
        
        while ( n > 0 ) 
        {
            int r = n % 2 ; 
            n = n / 2 ;
            digit++ ;
            if ( r == 1  ) 
            {
                sum = sum + (int)Math.pow(10, (digit - 1)) ;
            }
        }
        System.out.println(sum);

    scn.close();
    }
}
