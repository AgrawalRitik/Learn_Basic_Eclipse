import java.util.PriorityQueue;
import java.util.Comparator;
public class Collections_PriorityQueue {

	public static void main(String[]args)
	{
		PriorityQueue<Integer>pq = new PriorityQueue<>(Comparator.reverseOrder());  // by default it is  min heap opposite to c++

		pq.offer(43);
		pq.offer(63);
		pq.offer(34);
		
		
		System.out.println(pq);
		
		//POLL & PEEK
		System.out.println("POLL"+pq.poll());
		
		//PEEK
		System.out.println("PEEK"+pq.peek());
		
		
		System.out.println("PriorityQueue"+pq);
		
	}
}
