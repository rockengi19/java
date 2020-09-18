
// This Java code calculates the average, the standard deviation 
// and the variance of random numbers' list which amount and
// upper bound are given by the user

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class avgstdvar {

	public static void main(String[] args) 
	{
		Random r = new Random();
		double sum = 0;
		double avg = 0;
		double sum2 = 0;
		double std = 0;
		double vrc = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the amount of the list: ");
		int amount = scan.nextInt();
		System.out.print("Enter the upper board of the list: ");
		int ub = scan.nextInt();
		scan.close();
		
		for (int g = 0; g < amount; g++)
		{
			int next = r.nextInt(ub) + 1;
			System.out.println("The random number is " + next);
			
			sum += next;
			avg = sum/amount;
			sum2 += Math.pow((next-avg), 2);
			std = Math.sqrt(sum2/amount);
			vrc = sum2/amount;
		}
		System.out.println("The average is " + Math.round(avg * 100.0)/100.0);
		System.out.println("The standard deviation is " + Math.round(std * 100.0)/100.0);
		System.out.println("The variance is " + Math.round(vrc * 100.0)/100.0);

	}

}
