package Stack;

import java.util.Stack;

public class Reversestack {

	public static void main(String args[])
	{

		Stack<Integer> s=new Stack<Integer>();
		Stack<Integer> s1=new Stack<Integer>();
		Stack<Integer> s2=new Stack<Integer>();
		
		s.push(100);
		s.push(200);
		s.push(180);
		s.push(190);
		s.push(188);
		s.push(156);
		
		System.out.println(s);
		
		Movestack(s,s1);
		Movestack(s1,s2);
		Movestack(s2,s);
		System.out.println(s);
		
	}
	
	public static void Movestack(Stack<Integer> source,Stack<Integer> destination)
	{
		
		while(!source.empty())
		{
			int i=source.peek();
			destination.push(i);
			source.pop();
		}
	}





}
