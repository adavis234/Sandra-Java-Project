/*
 * Title: Bottles of Beer
 * @author: Andrew Davis
*/

import java.util.*;

public class BottlesofBeer
{
	public static void main(String[] args) 
	{
        bottleSong();
    }
    public static void bottleSong()
    {
         for(int i = 99; i >= 1; i--){
         	System.out.println(i + " bottles of beer on the wall!");
         	System.out.println(i + " bottles of beer!!");
         	System.out.println("Take one down pass it around " + (i - 1) + " bottles of beer on the wall!!!");
         }
    }
}