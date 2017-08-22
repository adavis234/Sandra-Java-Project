/*
 * @author: Andrew Davis
 *
*/

import java.util.*;

/*
 * This program calculates whether a user is underweight, at-weight or overweight using 
 * the BMI formula.
*/

public class BMI
{
	public static void main (String [] args)
	{
		System.out.println();
  		System.out.println("BMI Calculator");
  		
  		//This section prompts the user to input their height from the keyboard.
		Scanner keyboard = new Scanner(System.in);
		System.out.println();
		System.out.println ("Please enter your height (Ex. 5ft 5in is 5.5): ");
	
		/* This section returns a statement when the user inputs a value other than an 
		 * integer.
		 */ 
		if (!keyboard.hasNextDouble())
		{
			System.out.println();	
			System.out.println("Please enter a height, and try again.");
			return;
		}
		  
  		// This section prompts the user to input their weight from the keyboard.
  		Scanner keyboardTwo = new Scanner(System.in);
		System.out.println();
		System.out.println ("Please enter your weight: ");
			
		/* This section returns a statement when the user inputs a value other than an 
		 * integer.
		 */
		if (!keyboardTwo.hasNextDouble())
		{
			System.out.println();	
			System.out.println("Please enter a weight, and try again.");
			return;
		}	
		
		double height = keyboard.nextDouble();
		double h = height * 12;
		double weight = keyboardTwo.nextDouble();
		double bmi = Math.round((((weight) / ((h) * (h))) * 703) * 100)/100.0;
		System.out.println("Your BMI is " + (bmi));
		System.out.println();
		System.out.println(calc(bmi));
	}
	
	//This section computes a user's BMI.
	public static String calc(double bmi)
	{
		if (bmi > 18.5 && bmi < 24)
		{
			return "Congtatulations, you are at a Healthy Weight!!!";
		}
		else if (bmi < 30 && bmi > 24)
		{
			return "You are currently overweight,remember your only limit is you..";
		}
		else if (bmi > 30)
		{
			return "You are currently obese, remember losing weight is hard, being obese is hard, pick your hard...";
		}
		else
		{
			return "You are currently underweight.";
		}
	}
}
		
		
		
  	