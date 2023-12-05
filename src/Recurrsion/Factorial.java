package Recurrsion;

import java.util.Scanner;

public class Factorial {




	public static int factorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		if(n==0)
		{
			return 1;
		}

		else
		{
			return n*factorial(n-1);
		}
		
	}

	public static void main(String args[])
	{

		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=in.nextInt();
		int fact=factorial(n);
		System.out.println(fact);
		
	}

}
