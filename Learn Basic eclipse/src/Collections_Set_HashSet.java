import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Collections_Set_HashSet {

	enum DayOfWeek {
	    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	public static void main(String[]args)
	{
		//Set<Integer>s = new HashSet<>();            //Not maintain order
		//Set<Integer>s = new LinkedHashSet<>();     //Maintains Order
		//Set<Integer>s = new TreeSet<>();             //It uses binary tree concept in sorted ascending order;
		
		Comparator<Integer>desc = (a,b)->b.compareTo(a);
		Set<Integer>s = new TreeSet<>(desc);       // Arrange in descending order
		
		//***********************
		
		
		EnumSet<DayOfWeek> e = EnumSet.of(DayOfWeek.MONDAY, DayOfWeek.TUESDAY);
		
		e.add(DayOfWeek.FRIDAY);
		
		for(DayOfWeek ele : e)
		{
			System.out.println(ele);
		}
		
		
		
		
		
		
		
		
		//******************
		
		
		
		// add ******* 
		s.add(3);
		s.add(6);
		s.add(4);
		
		//*********************************
//	   for(int i=0;i<3;i++)
//	   {
//		   System.out.println("Element"+s.get(i));       // We cant use get funciton in set 
//	   }
		
		//********************************
		//Iterating
		//1st method 
		for(Integer it:s)
		{
			System.out.println("Element"+it);
		}
		
		//2nd method 
		Iterator<Integer>it = s.iterator();		
		while(it.hasNext())
		{
			System.out.println("Element"+it.next());
		}
		
		
		// Removing element
		s.remove(2);  // no indexing here 
		
		// Contains
		System.out.println("Size"+s.size()+" Contains"+s.contains(3));
		
		
		HashSet<Integer> newSet = new HashSet<>();
		newSet.add(1);
		newSet.add(4);
		
		System.out.println("Contains all"+s.containsAll(newSet));
		
		//Clear()
		s.clear();
		System.out.println("Clear"+ (s.isEmpty()?"Empty":"Non Empty"));
		
		
		System.out.println(s);
	}
}
