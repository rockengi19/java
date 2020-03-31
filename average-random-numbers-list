// This Java code calculates the average  of random numbers' list which amount and upper bound are given by the user 

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class randomList
{
    public static void main(String[] args)
    {
        Random r = new Random();
        double sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of the list: ");
        int amount = scan.nextInt();
        System.out.print("Enter the upper bound of the list: ");
        int ub = scan.nextInt();
        scan.close();
        
        for (int g = 0; g < amount; g++)
        {
            int next = r.nextInt(ub) + 1;
            System.out.println(next);
            
            sum += next;
        }
        
        System.out.println("The average is " + (sum/amount));
    }
}
