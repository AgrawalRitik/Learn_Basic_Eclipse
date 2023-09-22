import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
import java.util.List;

// Basic difference   ArrayList is singly ended and Linked list is dobly ended like here we can insert element between list
//Linked list also come in queue 

public class Collections_ArrayList
{   
	public static void arrayList()
	{
		//Initialization
				//ArrayList<Integer>list = new ArrayList<>();
				List<Integer>list = new ArrayList<>();   
				// As List is interface and ArrayList is class so we can do this;
				
				
				
				
				//Adding Element in Array List              // Add(in place of insert in C++)
				for(int i=0;i<5;i++)
				{
					list.add(i);
				}
				//*************************************************************
				
				
				
				
				//Accessing Element                       // get(in c++ direct indexing)
				System.out.println("Getting "+list.get(1));
				//****************************************************************
				
				
				
				
				
				// Iterating over Array List
				// 1st ---> For LOOP
				for(int i=0;i<list.size();i++)
				{
					System.out.println("Element "+list.get(i));
				}
				//*******************************************************************
				
				
				// 2nd ===> for each loop
				for(Integer element : list)
				{
					System.out.println("Element : "+element);
				}
				
				//***********************************************************************
				
				// 3rd ==> Iterator
			     Iterator<Integer> it = list.iterator();
			    
			     while(it.hasNext())
			     {
			    	 System.out.println("Iterator Element"+it.next());
			     }
			     //************************************************************************
			     
			     
			     
			     
			     //Changing element at index            (in c++ we directly use indexing but in Java there is not)
			     list.set(2, 1000);
			     System.out.println("After using set"+list);
			     
			     
			     
			     
			     //********************************************************************
			     //for finding element present        (in c++ we have find here in java we have contains)
			     System.out.println("Contains "+list.contains(3));
			     
			     
			     //************************************************************************
			     //for remove at index and value       (in c++ we have  erase )
			     list.remove(1);
			     list.remove(Integer.valueOf(1000));
			     
			     
			     
			     //**************************************************************************
			     //using clear()   //this is basically use in testing purpose where we need to test different case so at every iteration list get empty)
			     list.clear();
			     
			     System.out.println("Check empty "+(list.isEmpty()?"Empty":"Not Empty"));
			     
			     
			     
			 
			   
			     
				
				//*********************************************************************
				
				//We can print list directly because System.out.println directly use to_String () to convert all the variables of
			    // any datatype in list;
			     
			     //******************************************************
			     //lets adding new list
			     List<Integer>newList = new ArrayList<>();
			     newList.add(1);
			     newList.add(3);
			     
			     list.addAll(newList);
			     //********************************************************
				
				System.out.println("ArrayList "+list);  
	}
	
	public static void linkedList()
	{
		//Intialisation
		//LinkedList<Integer>list  = new LinkedList<>();
		List<Integer>list = new LinkedList<>(); // as list is interface;
		
		//Iteration to add
		for(int i=0;i<5;i++)
		{
			list.add(i);
		}
		
		//***************########################################***************
		
		//Main difference
		list.add(1,1000); // All Other element will shifted towards right;
		
		//Adding whole list
		LinkedList<Integer>newList = new LinkedList<>();
		newList.add(50);
		newList.add(70);
		
		list.addAll(newList);
		
		System.out.println("After adding new List"+list);
		
		
		
		
		
		//*******************########################################***************
		
		//************************************************
		//Access element
		System.out.println(list.get(2));
		
		
		// Iterating over linked list
		//1st
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Element : "+list.get(i));
		}
		
		//2nd 
		for(Integer element:list)
		{
			System.out.println("Element: "+element);
		}
		
		//3rd
		Iterator<Integer>it = list.iterator();
		while(it.hasNext())
		{
			System.out.println("Element: "+it.next());
		}
		
		
		//***************************************************************
		//Setting element
		list.set(2, 1000);
		System.out.println("AfterSetting "+list);
		
		
		
		
		
		//***********************************************************
		//checking contain
		System.out.println("Contain "+list.contains(3));
		
		
		
		//*************************************************************
		//remove
		list.remove(2);
		list.remove(Integer.valueOf(4));
		System.out.println("List after removing "+list);
		
		
		//***************************************************************
		list.clear();
		System.out.println("Empty: "+(list.isEmpty()?"Emtpy":"Not Empty"));
		
		
		
	}
	
	public static void main(String[]args)
	{   
		arrayList();
		//linkedList();
	}
	
	
	
}