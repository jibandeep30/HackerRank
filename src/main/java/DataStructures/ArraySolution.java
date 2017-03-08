package DataStructures;

import java.util.Scanner;

public class ArraySolution {
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a [] = new int[n];
		for(int i = 0; i < n; i++)
		{
			int val = s.nextInt();
			a[i] = val;
		}
		System.out.println("The elements of array are : ");
		for(int i = 0; i < n; i++)
		{
			System.out.println(a[i]);
		}
	}

}
