package com.simpli;

import java.util.Scanner;

/* This class demonstrates method creation and method overloading */
public class MethodsExample
{
	//This is a method which calculates area of a rectangle.
	public float area(float l,float b)
	{
		return (l*b);
	}
	//This is a method which calculates are of a circle.
	public double area(float radius)
	{
		return (3.14*radius*radius);
	}

	public static void main(String[] args) 
	{
		float areaRectangle=0;
		double areaCircle=0;
		float length=0;
		float width=0;
		float radius=0;
		Scanner input=new Scanner(System.in);
		MethodsExample methods=new MethodsExample();
		
		//////Area of Rectangle////
		System.out.println("Enter length of the rectangle");
				
		length=input.nextFloat();
		System.out.println("Enter the width of rectangle");
		width=input.nextFloat();
		
		//public int area(int l,int b) will be called			
		areaRectangle=methods.area(length,width);
		System.out.println("Area of square is "+areaRectangle);
		
		/////////Area of Circle////////
		System.out.println("Enter the radius of the circle");
		radius=input.nextFloat();
		
		//public double area(float radius) will be called
		areaCircle=methods.area(radius);		
		System.out.println("Area of square is "+areaCircle);
		
	}

}
