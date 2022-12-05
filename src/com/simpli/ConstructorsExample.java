package com.simpli;

public class ConstructorsExample
{
	private int id;
	private  String name;
	
	//Default constructor
	ConstructorsExample()
	{
		System.out.println("Default Constructor");
		id=1001;
		name="guest";
	}	
	
	//Parameterized constructor
	ConstructorsExample(int id,String name)
	{
		System.out.println("Parameterized Constructor");
		this.id=id;
		this.name=name;	
	}
	
	public void display()
	{
		System.out.println("Id = "+id+" Name= "+name);
	}

}
