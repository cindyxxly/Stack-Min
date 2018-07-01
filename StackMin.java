
public class StackMin {
	Node top;
	int data;
	
	public void push(int data)
	{
		Node node = new Node(data);
		node.next = top;
		top = node;
	}

	public int peek()
	{
		return top.data;
	}
	
	public int pop()
	{
		data = top.data;
		top = top.next;
		return data;
		
	}
	
	public int min()
	{
		int min = pop();
		int temp = 0;
		while(top.next!=null)
		{
			temp = pop();
			if (temp < min)
			{
				min = temp;
				
			}
		}
			int fin = pop();
		if (min < fin)
		{
			return min;
		}
		else
		{
			return fin;
		}
	}
	
	public static void main(String[] args)
	{
		StackMin s = new StackMin();
		s.push(0);
		s.push(9);
		s.push(1);
		s.push(3);
		s.push(10);
		System.out.println(s.min());
	}
}
