import java.util.HashMap;
import java.util.Map.Entry;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;

public class Map_HashMap {
 
	public static void main(String[]args)
	{
	Map<String,Integer> numbers = new HashMap<>();   // here hash is generated for
   // Map<String,Integer>numbers = new TreeMap<>(Comparator.reverseOrder());       //here order is sorted
  // Map<String,Integer>numbers = new LinkedHashMap<>();
	
	
	numbers.put("One", 1);
    numbers.put("Two", 2);
    numbers.put("Five",5);
    numbers.put("Three", 3);
    
    
    //Iterating
    for(Map.Entry<String,Integer>entry:numbers.entrySet())
    {
    	Integer value = entry.getValue();
    	String key = entry.getKey();
    	System.out.println("key"+key+" value"+value);
    }
    
    //values only
    LinkedList<Integer> list  = new LinkedList<>();
    for(Integer  v: numbers.values())
    {
          list.add(v);
    }
    
    System.out.println("Values"+list);
    
    //key only
    for(String v: numbers.keySet())
    {
    	System.out.println("Keys"+v);
    }
    
    // Contains******************************************************
    System.out.println(numbers.containsValue(2));
    
    numbers.put("Two",20);
    
    System.out.println("numbers "+numbers);
    
    if(!numbers.containsKey("Four"))
    {
    	numbers.put("Four", 4);
    }
	
    
    //Accessing********************************************************
    System.out.println(numbers.get("Four"));
	
    numbers.remove("Three");
    
    System.out.print(numbers.isEmpty());
	}
	
}
