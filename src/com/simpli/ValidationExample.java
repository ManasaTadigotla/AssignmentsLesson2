package com.simpli;

import java.util.Scanner;
import java.util.regex.*;

public class ValidationExample {

public static void main(String[] args) {

	String check = null;
	Scanner email=new Scanner(System.in);
	check=email.next();
	
	String pattern = ("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");
	
	Pattern p = Pattern.compile(pattern);
	Matcher c = p.matcher(check);
	if(c.matches())
		System.out.println("valid");
	else
		System.out.println("not valid");
	while (c.find())
      	System.out.println( check.substring( c.start(), c.end() ) );
	}
}

