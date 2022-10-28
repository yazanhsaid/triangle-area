/*
 Yazan Hajsaid
 Jiant Li
 Programming Assignment 7
 CSC 222
 */

import java.text.DecimalFormat;
import java.util.*;

public class Triangle {
	
	//data fields
	private double a,b,c;
	
	//input method
	public void input()
	{
		//declare scanner
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter side 1: ");
		a = keyboard.nextDouble();
		
		System.out.println("Please enter side 2: ");
		b = keyboard.nextDouble();
			
		System.out.println("Please enter side 3: ");
		c = keyboard.nextDouble();
			
		//tests if the triangle is possible
		while(a + b < c || b + c < a || c + a < b) 
		{	
			System.out.println("Impossible triangle, please try again");
			
			System.out.println("Please enter side 1: ");
			a = keyboard.nextDouble();
			
			System.out.println("Please enter side 2: ");
			b = keyboard.nextDouble();
				
			System.out.println("Please enter side 3: ");
			c = keyboard.nextDouble();
		}

	}
	
	//perimeter method
	public double perimeter()
	{
	//calculate
	double perimeter = a + b + c; 	
		return perimeter;
	}
	
	//output method
	public void output()
	{
		System.out.println("The three of the triangle are: " + a+", " +b+", "+c );

		System.out.println("The perimeter of the triangle is: " + perimeter() );
		
		isEquilateral();//call equilateral method
		area(); //call area method
		
	}
	//equilateral method
	public boolean isEquilateral()
	{
		//checks if variables are equal to eachother. If they are not, then it is returned and printed as false.
		if(a == b && b == c && c==a) 
		{	
			System.out.println("Triangle is equilateral!!");
			return true;
		}
		else 
		{
			System.out.println("Triangle is NOT equilateral.");
			return false;
		}
	}
	
	//area method
	public double area()
	{
	DecimalFormat df = new DecimalFormat("0.00"); //set decimal format for the answer to 2.

	//calculate s
	double s = (a+b+c)/2;
	//calculate area
	double area = s*(s-a)*(s-b)*(s-c);
	area = Math.sqrt(area);
	
	System.out.println("The area of the triangle is " + df.format(area));
		return area;
	}
	
	
}
