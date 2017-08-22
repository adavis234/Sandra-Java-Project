/*
 * @author: Andrew Davis
 *
*/

import java.util.*;
import java.io.IOException;

/*
 * This program opens other computer applications.
*/

public class OpenApps
{
	public static void main (String [] args)
	{
		
		callBrowser();
	}
	
	
	private static void callBrowser(){
		System.out.println();
  		System.out.println("OpenApps");
  		
  		//This section prompts the user to input their desired Internet browser.
		Scanner keyboard = new Scanner(System.in);
		System.out.println();
		System.out.println ("Hello, I am Sandra.  What browser would you like to open?");
	
		/* This section returns a statement when the user inputs a value other than a 
		 * string.
		 */ 
		if (!keyboard.hasNextLine())
		{
			System.out.println();	
			System.out.println("I think you entered a number, please type words that a computer can read. Thanks :)");
			return;
		}
		String app = keyboard.nextLine();
		String appOne = app.toLowerCase();
		
		if(appOne.equals("chrome")){
			try{
				Process p = Runtime.getRuntime().exec("C:/Program Files (x86)/Google/Chrome/Application/Chrome.exe");
			}
			catch(IOException e){
				e.printStackTrace();
			}
			System.out.println("Ok, opening " + app + " now......");
			System.out.println();
			System.out.println("Goodbye");
		}
		else if(appOne.equals("firefox")){
			try{
				Process p = Runtime.getRuntime().exec("C:/Program Files (x86)/Mozilla Firefox/firefox.exe");
			}
			catch(IOException e){
				e.printStackTrace();
			}
			System.out.println("Ok, opening " + app + " now......");
			System.out.println();
			System.out.println("Goodbye");
		}
		else if(appOne.equals("internet explorer")){
			try{
				Process p = Runtime.getRuntime().exec("C:/Program Files (x86)/Internet Explorer/iexplore.exe");
			}
			catch(IOException e){
				e.printStackTrace();
			}
			System.out.println("Ok, opening " + app + " now......");
			System.out.println();
			System.out.println("Goodbye");
		}
		else if(appOne.equals("ie") || appOne.equals("internet explorer")){
			try{
				Process p = Runtime.getRuntime().exec("C:/Program Files (x86)/Internet Explorer/iexplore.exe");
			}
			catch(IOException e){
				e.printStackTrace();
			}
			System.out.println("Ok, opening " + app + " now......");
			System.out.println();
			System.out.println("Goodbye");
		}
		else if(appOne.equals("ie") || appOne.equals("internet edge")){
			try{
				Process p = Runtime.getRuntime().exec("C:/Windows/SystemApps/Microsoft.MicrosoftEdge_8wekyb3d8bbwe/MicrosoftEdge.exe");
			}
			catch(IOException e){
				e.printStackTrace();
			}
			System.out.println("Ok, opening " + app + " now......");
			System.out.println();
			System.out.println("Goodbye");
		}
		else{
			System.out.println("I am sorry it seems that " + app + " is currently not installed on this computer.");
		}
	}
}
	
	
	
		
  	