//This Java code calculates the area and the volume of a dodecahedron

import java.io.*;
import java.util.Scanner;

public class dodecahedron
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of the side: ");
        int b = scan.nextInt();
        scan.close();
        System.out.println("The area is " + Math.round(area(b)) + " cm^2");
        System.out.println("The volume is " + Math.round(volume(b)) + " cm^3");
    }
    static double area(int b)
    {
        return ((3*Math.sqrt(25 +10*(Math.sqrt(5))))*(Math.pow(b,2)));
    }
    static double volume(int b)
    {
        return (((15 + (7 * Math.sqrt(5))))/4 * (Math.pow(b,3)));
    }
}
