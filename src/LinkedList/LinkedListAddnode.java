package LinkedList;

public class LinkedListAddnode {
	
	class Node
	{
		int value;
		Node next;
		public  Node(int value)
		{
			this.value=value;
		}
	}
	
	Node head;
	Node tail;
	
	//Insert node
	public  void insertNode(int value)
	{
		Node newnode=new Node(value);
		
		//if there are no nodes
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			
			tail.next=newnode;
			newnode.next=null;
			tail=newnode;
			
		}
		
	}
	
	Node current;
	//verify if node is present or not
	public boolean VerifyValuePresentInList(int value)
	{
		current=head;
		while(current!=null)
		{
			if(current.value==value)
			{
				return true;
			}
			current=current.next;
			
			//if it reaches here it means value is not present
			
			
		}
		return false;
	}
	//print all the nodes in the linked list
	
	public void printAllValues()
	{
		current=head;
		while(current!=null)
		{
			System.out.println(current.value);
			current=current.next;
		}
	}
	
	//Add node at specific index
	public void AddNodeAtIndex(int value,int index)
	{
		current=head;
		int count=1;
		while(current!=null && count!=index-1)
		{
			current=current.next;
			count++;
		}
		Node newnode=new Node(value);
		Node Temp;
		Temp=current.next;
		current.next=newnode;
		newnode.next=Temp;
		
	}
	//Delete Node at Specific index
	public void deleteNodeAtIndex(int index)
	{
		current=head;
		int count=1;
		while(current.next!=null && count!=index-1)
		{
			current=current.next;
			count++;
		}
		
		current.next=current.next.next;
	}
	int NoOfNodes=0;
	public void Nodecount()
	{
		current=head;
		while(current!=null)
		{
			current=current.next;
			
			NoOfNodes++;
		}
		System.out.println("No of Nodes:"+NoOfNodes);
	}
	
	//Delete node at end
	public void deleteNodeAtEnd()
	{
		current=head;
		while(current.next.next!=null)
		{
			current=current.next;
			
		}
		System.out.println("Deleted Node:"+current.next.value);
		
		current.next=null;
		tail=current;
	}
	//delete Node At begining
	public void DeleteNodeAtbegining()
	{
		head=head.next;
	}
	
	//delete node at specific value
	public void deleteValue(int value)
	{
		if (head.value == value) {
			DeleteNodeAtbegining();
	    } else if (tail.value == value) {
	        //case when we need to remove the tail node
	    	deleteNodeAtEnd();
	    }
	    else
	    {
	    	Node current=head;
	    	Node previous=null;
	    	while(current!=null && current.value!=value)
	    	{
	    		previous=current;
	    		current=current.next;
	    	}
	    	previous.next=current.next;
	    }
	}
	
	public void reverseLinkedlist()
	{
		Node current=head;
		Node prev=null;
		Node Temp=null;
		
		while(current!=null)
		{
			Temp=current.next;
			current.next=prev;
			prev=current;
			
			current=Temp;
			
			
		}
		
		PrintlinkedList(prev);
	}
	
	public  void PrintlinkedList(Node head)
	{
		current=head;
		while(current!=null)
		{
			System.out.println(current.value);
			current=current.next;
		}
	}
	
	//Add node at begining
	public void InsertNodeAtBegining(int value)
	{
		
		Node newnode=new Node(value);
		if(head==null)
		{
			head=newnode;
		}
		newnode.next=head;
		head=newnode;
	}
	
	public static void main(String args[])
	{
		LinkedListAddnode add=new LinkedListAddnode();
		add.insertNode(1);
		add.insertNode(2);
		add.insertNode(3);
		add.insertNode(4);
		add.insertNode(5);
		
		System.out.println(add.VerifyValuePresentInList(2));
		
		//Add node at begining
		//add.InsertNodeAtBegining(10);
		
		//add.AddNodeAtIndex(12, 3);
		System.out.println("Value in linked list");
		
		
		
		//add.deleteNodeAtEnd();
		//add.deleteNodeAtIndex(2);
		//add.DeleteNodeAtbegining();
		add.printAllValues();
		
		System.out.println("In revrese order");
		add.reverseLinkedlist();
		
		
		
		
	
		
		add.Nodecount();
		
		
		
		
	}

}
