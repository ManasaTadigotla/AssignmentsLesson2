package com.simpli;
import java.util.*;
public class InnerClassExample 
{

	
		 private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", This is how Inner Classes works");}  
		 }  


		public static void main(String[] args) {

			InnerClassExample obj=new InnerClassExample();
			InnerClassExample.Inner in=obj.new Inner();  
			in.hello();  
		}
	



	

}
