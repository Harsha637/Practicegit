package Recurrsion;

public class Fibonacci {
	
	public static int fibo(int n)
	{
		if(n==1 || n==0)
		{
			return n;
		}
		else
		{
			return fibo(n-1)+fibo(n-2);
		}
	}
	
	public static void main(String args[])
	{
		int n=3;
		
		int val=fibo(n);
		System.out.println(val);
	}

}
