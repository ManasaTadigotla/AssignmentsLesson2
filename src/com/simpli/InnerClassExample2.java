package com.simpli;

public class InnerClassExample2 {

	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	public static void main(String[] args) 
	{
		InnerClassExample2  ob=new InnerClassExample2();  
		ob.display();  
		


	}

}
