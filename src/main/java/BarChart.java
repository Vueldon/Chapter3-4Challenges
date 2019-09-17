
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
public class BarChart
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter today's sales for 5 stores rounded to the nearest hundred\n\nStore 1:");
        int store1 = keyboard.nextInt();
        System.out.println("Store 2:");
        int store2 = keyboard.nextInt();
        System.out.println("Store 3:");
        int store3 = keyboard.nextInt();
        System.out.println("Store 4:");
        int store4 = keyboard.nextInt();
        System.out.println("Store 5:");
        int store5 = keyboard.nextInt();
        
        System.out.println("\nSALES BAR CHART");
        
        String store1String = "";
        String store2String = "";
        String store3String = "";
        String store4String = "";
        String store5String = "";
        
        do
        {
            if (store1 > 0)
            {
                store1String += "*";
                store1 -= 100;
            } else if (store1 == 0)
                    {
                        System.out.println("Store 1: " + store1String);
                        store1 -= 100;
                    }
        } while (store1 >= 0);
        
        do
        {
            if (store2 > 0)
            {
                store2String += "*";
                store2 -= 100;
            } else if (store2 == 0)
                    {
                        System.out.println("Store 2: " + store2String);
                        store2 -= 100;
                    }
        } while (store2 >= 0);
        
        do
        {
            if (store3 > 0)
            {
                store3String += "*";
                store3 -= 100;
            } else if (store3 == 0)
                    {
                        System.out.println("Store 3: " + store3String);
                        store3 -= 100;
                    }
        } while (store3 >= 0);
        
        do
        {
            if (store4 > 0)
            {
                store4String += "*";
                store4 -= 100;
            } else if (store4 == 0)
                    {
                        System.out.println("Store 4: " + store4String);
                        store4 -= 100;
                    }
        } while (store4 >= 0);
        
        do
        {
            if (store5 > 0)
            {
                store5String += "*";
                store5 -= 100;
            } else if (store5 == 0)
                    {
                        System.out.println("Store 5: " + store5String);
                        store5 -= 100;
                    }
        } while (store5 >= 0);
    }
}
