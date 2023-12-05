package Stack;

import java.util.Stack;

public class InsertElement {
	
	
	public static void main(String args[])
	
	
	{
        int count=0;
		Stack<Integer> s=new Stack<Integer>();
		Stack<Integer> s1=new Stack<Integer>();
		
		
		s.push(100);
		s.push(200);
		s.push(180);
		s.push(190);
		s.push(188);
		s.push(156);
		
		System.out.println(s);
		
		while(!s.isEmpty())
		{
			int value=s.peek();
			s1.push(value);
			count=count+1;
			s.pop();
		}
		
		System.out.println(count);
		
		int i=2;
		int element=105;
		int c=0;
		
		while(!s1.isEmpty())
			
		{
			int value=s1.peek();
			if(c==i)
			{  
				
				s.push(element);
				s.push(value);
				
				
			}
			else
			{
				
				s.push(value);
				
			}
			s1.pop();
			c=c+1;
			
			
		}
	
	    System.out.println(s);
	}
	
	

}
