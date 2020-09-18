// This Java code calculates the area of a triangle 
// which base and altitude are given by the user

import java.io.*;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of the base: ");
		double b = scan.nextDouble();
		System.out.print("Enter the value of the altitude: ");
		double a = scan.nextDouble();
		scan.close();
		System.out.println("The area is " + Math.round(area(b,a)) + " cm^2");
		
	}
	static double area(double b,double a)
	{
		return (b*a)/2;
	}
}
