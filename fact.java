
import java.io.*;
import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		int fact = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive integer number: ");
		int n = scan.nextInt();
		scan.close();
		for (int i = 1; i <= n; i++)
		{
			fact *= i;
		}
		System.out.println("The factorial is " + fact);
	}

}
