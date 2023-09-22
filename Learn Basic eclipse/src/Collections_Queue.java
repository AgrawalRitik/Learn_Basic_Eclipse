import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class Collections_Queue {

	public static void main(String[]args)
	{
		Queue<Integer>q = new LinkedList<>();    // It is basically used as queue
		
		//Initialisation
		for(int i=0;i<5;i++)
		{
			q.offer(i);                        // here offer in c++ there is push pull
		}
		
		//*********************************************
		for(Integer it: q)
		{
			System.out.println("Element"+it);
		}
		
		Iterator<Integer> i = q.iterator();
		
		while(i.hasNext())
		{
			System.out.println("Element"+i.next());
		}
		
		
		
		
		
		//**************************************************
		//POLL()
		System.out.println("POLL"+q.poll());
		
		
		//PEEK()
		System.out.println("PEEK"+q.peek());
		
		
		q.clear();
		
		System.out.println("Clear"+(q.isEmpty()?"Empty":"NOT Empty"));
		
	}
}
