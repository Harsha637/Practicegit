package Recurrsion;

public class sum {
	public static int a[]= {10,23,45,67,89};
	
	public static void main(String args[])
	{
	
		
		System.out.println(sum(a.length-1));
	}

	private static int sum(int n) {
		
		if(n==0)
		{
			return a[n];
		}
		else
			return a[n]+sum(n-1);
		
	}

}
