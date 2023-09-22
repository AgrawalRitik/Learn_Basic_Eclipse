import java.util.Queue;
import java.util.ArrayDeque;
import java.util.*;

public class Collections_ArrayDeque {

	
	public static void main(String[]args)
	{
		//Queue<Integer>adq  = new ArrayDeque<>(); // YOu cant use child properties
		ArrayDeque<Integer>adq = new ArrayDeque<>(); 
		
		
		//Initialisation
		for(int i=0;i<10;i++)
		{
			adq.offer(i);
			adq.offerFirst(i);          // offerLast is same is offer
			adq.offerLast(i);
		}
		
		//Iterating
		for(Integer it : adq)
		{
			System.out.print(" Element "+it);
		}
		System.out.println("");
		
		//2nd method
		Iterator<Integer>it = adq.iterator();
		while(it.hasNext())
		{
			System.out.print(" element "+it.next());
		}
		System.out.println("");
		
		
		//*********************************************************
		//POLL and PEEK  //In c++ poll not returns any things
		
		System.out.println("POLLFIRST"+adq.pollFirst());
		System.out.println("POLLLast"+ adq.pollLast());
		System.out.println("POLL"+adq.poll());          // it does same is pollFirst
		
		
		
		System.out.println("PEEK"+adq.peek());
		System.out.println("PEEkFirst"+adq.peekFirst());
		System.out.println("PEEKLast"+adq.peekLast());
		
		//***********************************************************
			
	}
}
