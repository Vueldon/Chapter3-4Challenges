
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
public class TestScoresAndGrade 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter 3 test scores");
        float testScore1 = keyboard.nextFloat();
        float testScore2 = keyboard.nextFloat();
        float testScore3 = keyboard.nextFloat();
        
        float testScoreAverage = (testScore1 + testScore2 + testScore3)/3;
        
        if (testScoreAverage >= 90)
        {
            System.out.printf("Your average grade was an A at %.2f%%", testScoreAverage);
        } else if (testScoreAverage >= 80)
        {
            System.out.printf("Your average grade was a B at %.2f%%", testScoreAverage);
        } else if (testScoreAverage >= 70)
        {
            System.out.printf("Your average grade was a C at %.2f%%", testScoreAverage);
        } else if (testScoreAverage >= 60)
        {
            System.out.printf("Your average grade was a D at %.2f%%", testScoreAverage);
        } else
        {
            System.out.printf("Your average grade was an F at %.2f%%", testScoreAverage);
        }
    }
}
