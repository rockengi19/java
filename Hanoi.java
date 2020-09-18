
import java.io.*;
import java.util.Scanner;

class EST
{
	static void HanoiTower(int n, char f_rod, char t_rod, char a_rod)
	{
		if (n==1)
		{
			System.out.println("Move disk 1 from rod " + f_rod + " to rod " + t_rod);
			return;
		}
		HanoiTower(n-1, f_rod, a_rod, t_rod);
		System.out.println("Move disk " + n + " from rod " + f_rod + " to rod " + t_rod);
		HanoiTower(n-1, a_rod, t_rod, f_rod);
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of disks: ");
		int n = scan.nextInt();
		scan.close();
		HanoiTower(n, 'A','C','B');
	}
}