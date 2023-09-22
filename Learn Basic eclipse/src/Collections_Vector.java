import java.util.Vector;

import java.util.*;


public class Collections_Vector {

	public static void main(String []args)
	{
		Vector<Integer> vec  = new Vector<>();
		
		//Initialisation & declaration
		for(int i=0;i<5;i++)
		{
			vec.add(i);
		}
		
		
		
		//*************************************************************
		// Printing & Iterating
		for(int i=0;i<5;i++)
		{
			System.out.print("Element"+vec.get(i));       //here we not use direct indexing
		}
		
		System.out.println("");
		
		
		//2nd method
		for(Integer element:vec)
		{
			System.out.println("Element"+element);
		}
		System.out.println("");
		
		
		//3rd method Iterator
		Iterator<Integer>it = vec.iterator();	
	    while(it.hasNext())
	    {
	    	System.out.print("Element"+it.next());
	    }
	    System.out.println("");
	
		//*************************************************************
		//Setting element
	    vec.set(2, 100);
	    
	    
	    //*************************************************************
	    //Remove element
	    vec.remove(3);
	    
	    
	    vec.remove(Integer.valueOf(2));  // remove nothing;
	    
	    System.out.println(vec);
	    
	    //*************************************************************
	    //Adding all
	     List<Integer>newlist = new Vector<>();
	     newlist.add(1);
	     newlist.add(2);
	     
	     vec.addAll(newlist);
	     
	     
	     //***************************************************************
	     //Clear all
	     vec.clear();
	     
	     
	     //**************************************************************
	     System.out.println((vec.isEmpty()?0:vec.size()));
	     
		
		
		
		
		
		
	}
	
}
