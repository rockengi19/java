// This Java code finds the great common divisor of two numbers given by the user

import java.io.*;
import java.util.Scanner;

public class gcd
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number: ");
        int b = scan.nextInt();
        scan.close();
        int rest = 0;
        System.out.println("The great common divisor is " + tgcd(a,b,rest));
    }
    static double tgcd(int a, int b, int rest){
        do{
            rest = a%b;
            a = b;
            b = rest;
        }
        while(rest>0);
        return a;
    }
}
