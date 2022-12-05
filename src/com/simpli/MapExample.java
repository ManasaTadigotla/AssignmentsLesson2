package com.simpli;

import java.util.*;

public class MapExample 
{

	public static void main(String[] args)
	{
	 //Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Tim");    
	      hm.put(5,"Mary");    
	      hm.put(3,"Catie");   
	      hm.put(4,null );
	      //hm.put(4,null );
	      //The old value is replaced by new value of the same key
	      hm.put(4,"adhya" );
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet())
	      {    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	     
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Ales");  
	      ht.put(5,"Rosy");  
	      ht.put(6,"Jack");  
	      ht.put(7,"John");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet())
	      {    
	      //Displays in Descending order
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(1,"Annie");    
	      map.put(6,"Carlotte");    
	      map.put(5,"Catie");  
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet())
	      {    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      


	}

}
