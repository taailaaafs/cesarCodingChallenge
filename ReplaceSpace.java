/* Created by Taila on 14/06/2020
---------------------------------------------------------------------------------------
Replacing characters in place:

Given an array of characters, write a method to replace all the spaces with "&32"
---------------------------------------------------------------------------------------
 */

package src;

import java.util.Scanner;

public class ReplaceSpace {

	public static void main(String[] args) {
			
		    Scanner sc = new Scanner(System.in);
		    //Prompt user to ask a string
			System.out.print("Digite um texto:");
			
			String input = sc.nextLine();
			
			// replace blank space with required character(&32)
			String replacedInput = input.replaceAll(" ","&32");
			
			System.out.println(replacedInput);
		
		
	}

}
