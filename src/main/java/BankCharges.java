
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
public class BankCharges 
{
    public static void main(String[] args) 
    {
        int baseFee = 10;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the number of checks written this month");
        int numberOfChecks = keyboard.nextInt();
        
        if (numberOfChecks < 20)
        {
            float serviceFees = (float) (numberOfChecks * 0.1 + baseFee);
            System.out.printf("Service Fees:\n$%.2f", serviceFees);
        } else if (numberOfChecks < 40)
        {
            float serviceFees = (float) (numberOfChecks * 0.08 + baseFee);
            System.out.printf("Service Fees:\n$%.2f", serviceFees);
        } else if (numberOfChecks < 60)
        {
            float serviceFees = (float) (numberOfChecks * 0.06 + baseFee);
            System.out.printf("Service Fees:\n$%.2f", serviceFees);
        } else
        {
            float serviceFees = (float) (numberOfChecks * 0.04 + baseFee);
            System.out.printf("Service Fees:\n$%.2f", serviceFees);
        }
    }
}
