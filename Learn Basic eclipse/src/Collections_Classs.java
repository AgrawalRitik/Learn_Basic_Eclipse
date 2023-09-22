import java.util.*;

public class Collections_Classs {

	public static void main(String[]args)
	{
		
//		List<StudentClass> list = new ArrayList<>();
//		list.add(new StudentClass("Ramesh",2));  // As you have to  intialise class every time 
//		list.add(new StudentClass("Ram",1));
//		list.add(new StudentClass("Ramchandra",3));
//		list.add(new StudentClass("bhavesh",4));
//		list.add(new StudentClass("kamlesh",0));
//		
//		
//		//Print
//		System.out.println(list);
//		
//		
//		Collections.sort(list);
//		System.out.println(list);
		
		List<Integer> list = new ArrayList<>();
		
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(5);
		
		System.out.println("Min element "+Collections.min(list));
		System.out.println("Max element "+ Collections.max(list));
		
		
		System.out.println("Frequency"+ Collections.frequency(list, 9)); // 2nd one is element;
		Collections.sort(list,Comparator.reverseOrder());
		
		
		//*******************
		//ListIterator
		
		ListIterator<Integer> it = list.listIterator(list.size()); // define size if normally it not works
		
		while(it.hasPrevious())
		{
			System.out.println("Previous "+ it.previous());
		}  // it print reverse
		
		while(it.hasNext())
		{
			System.out.println("Next "+ it.next());
		}
		
	}
}
