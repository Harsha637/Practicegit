package Stack;

import java.util.Stack;

public class MinimumElement {
	
	static Stack<Integer> Mainstack=new Stack<Integer>();
	static Stack<Integer> Temp=new Stack<Integer>();

	public static void main(String args[])
	{
		CustomPush(12);
		CustomPush(5);
		CustomPush(22);
		CustomPop();
		CustomPush(23);
		CustomPush(25);//pushed 25
		CustomPush(28);//pushed 28
		CustomPush(6);
		
		System.out.println(Temp.peek());
	}
	
	private static void CustomPush(int i)
	{
		Mainstack.push(i);
		if(Temp.isEmpty())
		{
			Temp.push(i);
		}
		else if(Temp.peek()>i)
		{
			Temp.push(i);
		}
	}

	//Custom pop
	private static void CustomPop()
	{
		int item=Mainstack.peek();
		Mainstack.pop();
		if(Temp.peek()==item)
		{
			Temp.pop();
		}
		
	}
	
	//Just for git purpose
	private static void CustomPop1()
	{
		int item=Mainstack.peek();
		Mainstack.pop();
		if(Temp.peek()==item)
		{
			Temp.pop();
		}
		
	}


}
