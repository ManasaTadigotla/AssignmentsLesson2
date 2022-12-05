package com.simpli;

import java.util.*;



public class CollectionsExample
{
		public static void main(String[] args) 
		{
		//creating arraylist
		  System.out.println("ArrayList");
		  ArrayList<String> city=new ArrayList<String>();   
	      city.add("Bangalore");
	      city.add("Delhi");  
	      city.add("andaman");
	      city.add("hyderabad");
	      //inserts "USA" at index 2 and "andaman" and the next elements will be shifted to right
	      city.add(2,"USA");
	      //displays in which they are stored 
	      System.out.println(city);
	      if(city.contains("Delhi"))
	      System.out.println(" City Exists");	      
	      if(city.remove("Bangalore"))
	    	  System.out.println("Bangalore is removed from the list");
	     //after removing Bangalore,the element at index 2 is Andaman.
	      city.remove(2);
	      System.out.println("The ramaining elements are: "+city);
	     // city.get(3);
	      System.out.println("Element at index 3 ="+city.get(1).toString());
	      
		
		//creating vector////////
	      
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(15); 
	      vec.addElement(30); 
	      vec.addElement(43);
	      System.out.println(vec.get(1).toString());
	     Vector<String> city1=(Vector<String>)vec.clone();
	      city1.add("Adhya");
	      System.out.println(vec);
	      System.out.println(city1);
	      
	      Vector v=new Vector();
			System.out.println(v.capacity());//10
			for(int i=1;i<=10;i++)
			{
				v.addElement(i);
			}
		System.out.println(v.capacity());//10
		//adding eleventh element creates new vector of double capacity 
		v.addElement("A");
		System.out.println(v.capacity());//20
		System.out.println(v);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
		
		
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Alex");  
	      names.add("John"); 
	      names.add("Sohan");
	      names.add("Adhya");
	      names.add("Adhya");
	      names.add("Aarya");
	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext())
	      {  
	       System.out.println(itr.next());  
	      }
	      ListIterator<String> ltr=names.listIterator();
	      while(ltr.hasNext())
	      {
	    	  if(ltr.next()=="Adhya")
	    	  {
	    		  //Removes the first instance of Adhya
	    		  ltr.remove();
	    		  //System.err.println(ltr.next());
	    	  }
	    	  
	      }
	      System.out.println(names);
	      
	      
	    		  
	    		  
	    //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>(); 
	       for(int i=1;i<=11;i++)
	       {
	    	   set.add(i);
	       }
	       set.add(15);
	       set.add(13);
	       System.out.println("Size is "+set.size());
	     //here insertion order is not preserved
	       System.out.println(set);
	       //Duplicates are not allowed
	       if(!set.add(11))
	    	   System.out.println("Duplicates are not allowed");
	       set.add(0);
	       	       
	      
	       //forEach performs an action (Here printing) on each element of HashSet
	       set.forEach(i -> System.out.println(i)); 
	      // System.out.println(set.hashCode());
	       System.out.println("Size is "+set.size());
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);
	      //Insertion order is preserved
	       System.out.println(set2);
	       set2.forEach(i->System.out.println(i));
	       
	       
	           	   
	       //System.out.println(i);
		      
	    	  
	      }      
	       
	      	
	       
}



	


