//This is a calorie count program
/*
 * @author: Andrew Davis
 *
*/

import java.util.*;

public class CalorieCount
{
	public static void main(String [] args)
	{
		System.out.println();
  		System.out.println("Calorie Counter: See how many calories you can have to lose weight!");
  		
  		// This section prompts the user to input their gender from the keyboard.
  		Scanner keyboardFour = new Scanner(System.in);
		System.out.println();
		System.out.println ("Please enter your gender(Male or Female): ");
			
		/* This section returns a statement when the user inputs a value other than a 
		 * string.
		 */
		if (!keyboardFour.hasNextLine())
		{
			System.out.println();	
			System.out.println("Please enter your gender and try again.");
			return;
		}	
  		
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
			System.out.println("Please enter your height and try again.");
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
			System.out.println("Please your weight and try again.");
			return;
		}	
		
		// This section prompts the user to input their weight from the keyboard.
  		Scanner keyboardThree = new Scanner(System.in);
		System.out.println();
		System.out.println ("Please enter your age: ");
			
		/* This section returns a statement when the user inputs a value other than an 
		 * integer.
		 */
		if (!keyboardThree.hasNextDouble())
		{
			System.out.println();	
			System.out.println("Please your age and try again.");
			return;
		}	
		
		String g = keyboardFour.next();
		String m = new String("male");
		String ma = new String("Male");
		double height = keyboard.nextDouble();
		double h = (height * 12)*(2.54);
		double weight = keyboardTwo.nextDouble();
		double w = ((weight)/(2.2));
		double a =  keyboardThree.nextDouble();	
		double mBMR = ((66.47)+ ((13.75) * (w)) + ((5.0) * (h)) - ((6.75) * (a)));
		long mBMRR = Math.round(mBMR);
		double wBMR = ((665.09) + ((9.56) * (w)) + ((1.84) * (h)) - ((4.67) * (a)));
		long wBMRR = Math.round(wBMR);
			
		if((g == m) || (g == ma))
		{
			System.out.println();
			System.out.println("To lose one pound per week you can only have " + ((mBMRR) - (500)) + " calories per day.");
			System.out.println();
			System.out.println("To stay at your same weight you can only have " + mBMRR + " calories per day.");
		}
		else
		{
			System.out.println();
			System.out.println("To lose one pound per week you can only have " + ((wBMRR) - (500)) + " calories per day.");
			System.out.println();
			System.out.println("To stay at your same weight you can only have " + wBMRR + " calories per day.");
		}
	}
}