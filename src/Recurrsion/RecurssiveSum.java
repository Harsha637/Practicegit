package Recurrsion;

public class RecurssiveSum {
	
	static int a[]= {1,4,5,34,56};
	public static int sum(int n)
	{
		if(n==0)
		{
			return a[n];
		}
		else
			return a[n]+a[n-1];
	}
	
	
	public static void main(String args[])
	{
		int val=sum(a.length-1);
		System.out.println(val);
	}

}
