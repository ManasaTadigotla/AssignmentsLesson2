package com.simpli;

public class ConstructorTest
{

	public static void main(String[] args)
	{
		//Calls default constructor
		ConstructorsExample test=new ConstructorsExample();		
		test.display();
		
		//Calls parameterized constructor
		ConstructorsExample testParameter=new ConstructorsExample(9999,"Madhu");
		testParameter.display();
		ConstructorsExample testDifferent=new ConstructorsExample(5555, "Sohan");
		testDifferent.display();
		
	}

}
