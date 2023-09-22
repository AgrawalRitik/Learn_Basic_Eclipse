import java.util.Stack;
import java.util.List;

public class Collections_Stack {
	
	public static void iteraton(Stack<Integer>stk)
	{
		Stack<Integer> s = new Stack<>();
	    //***********
		//s = stk; // IN java there is no copy  so tend to avoid this tend to use addAll to make copy;
		s.addAll(stk);
		
		while(!s.isEmpty())
		{
			System.out.println("Element"+s.peek());
			s.pop();
		}
		//System.out.println(" At POP "+s.pop());
	}
	
public static void main(String[]args)
{    //Initialization
	Stack<Integer>st = new Stack<>();
	//List<Integer>st = new Stack<>(); // Although Stack is part of list but give error because list have some different methods
	// like add and push is specifically for stack so avoid using  intialising through list;
	
	
	// 3 main operations  
	//push()
	//peek()
	//pop()
	 //Pushing 
	for(int i=0;i<5;i++)
	{
		st.push(i);
	}
	System.out.println(st);
	
	
	//**********************************
	//Iterating
	iteraton(st);
	
	//First element
	System.out.println(st.peek());
	
	
	//Popping element
	System.out.println(st.pop());  // In Java pop is not void it return element;
	
	
	
	System.out.println(st);
	
	
	
}

}
