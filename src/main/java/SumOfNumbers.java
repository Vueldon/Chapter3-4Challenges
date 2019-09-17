
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vueld
 */
public class SumOfNumbers 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a positive integer above 0");
        int positiveInteger = keyboard.nextInt();
        
        int integerSum = 0;
        
        if (positiveInteger < 1)
        {
            System.out.println("That integer is less than 1");
            System.exit(1);
        } else
        {
            do
            {
                integerSum += positiveInteger;
                positiveInteger--;
                
                if (positiveInteger == 0)
                {
                    System.out.println("The sum is " + integerSum);
                }
            } while (positiveInteger > 0);
        }
    }
}
