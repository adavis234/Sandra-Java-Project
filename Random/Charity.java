/**
  *	Unit22, Problem 5, Charity.java
  *	@author: Andrew Davis
  */

import java.util.*;

/**
  * This program asks the user to enter the amount of a contribution, and then passes this
  *	value on to the donor method (which then prints the correct result).
  */
  
public class Charity

{	

/**
  * donor () prompts the user for a double value and returns the value with a designated
  * string value.
  */
  
	static void donor ()
	
	{
		System.out.println();
		
		//This section is prompting user for double value
		
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Hello, I am Sandra.  I am here to grant the titles for charity contributers, please enter the amount of money you have contributed to charities for last year: ");
		
		System.out.println();
		
		if (!keyboard.hasNextDouble())
		
		{
			
			System.out.println("I am sorry, you did not enter a number.  Please enter a number and try again.");
			
			return;
		
		}
		
		double contribution = keyboard.nextDouble();
	
		//This section is evaluating double value and printing out string value.
		
		if (contribution >= 10000.00) System.out.println("Wow, you contributed a lot, you are given the title of Benefactor!!!");
		
		else if (contribution >= 1000.00) System.out.println("Pretty good, but I bet you could contribute more.  You are given the title of Patron.");
		
		else if (contribution >= 500.00) System.out.println("Hmm.. I suspect that you could find more change in your pockets, never the less you are given the title of Supporter.");
		
		else if (contribution >= 100.00) System.out.println("Alright, but I think you could contribute more.  You are given the title of Friend.");
		
		else if (contribution < 100.00) System.out.println("You can keep that I will match you.  You are given the title of Cheapskate.");
		
	}
	
	public static void main (String [] args)
	{
		donor ();
	}
}
	