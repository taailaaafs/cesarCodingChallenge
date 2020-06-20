/* Created by Taila on 15/06/2020
-----------------------------------------------------------------------------------------------------
Replacing characters in place:

Given two strings, write a method to decide if one is a partial permutation of the other. Consider a
partial permutation only if:

1)The first letter hasn’t changed place
2)If word has more than 3 letters, up to 2/3 of the letters have changed place

Examples:
you, yuo > true
probably, porbalby > true
despite, desptie > true
moon, nmoo > false
misspellings, mpeissngslli > false
------------------------------------------------------------------------------------------------------
 */

package src;

import java.util.Scanner;

public class JumbledLetters {

	public static void main(String[] args) {
		
		int count = 0; 
		float partial_perm = (float) 0.0;
	    float base = (float) 0.0;
			
		Scanner sc = new Scanner(System.in);
		//Prompt user to ask the first string
	    System.out.print("Digite a primeira string:");
	    String firstString = sc.nextLine();
	    String str1 = firstString;
	    char string1 = str1.charAt(0);
	 	
	    //Prompt user to ask the second string
	    Scanner sc2 = new Scanner(System.in);
	    System.out.print("Digite a segunda string:");
	    String secondString = sc2.nextLine();
	    String str2 = secondString;
	    char string2 = str2.charAt(0);
	    
	    if (string1 == string2 && str1.length() == str2.length() && str1.length() >= 3 ) {
	    	
	    	for (int i = 0; i < str1.length(); i++) {
	    		
	    		if (str1.charAt(i) != str2.charAt(i)) {
	    			// count position when letters have changed at some position
	    			count = count + 1 ; 
	    			float div = str1.length();
	    			// calculating the ratio of letters changed
	    			partial_perm = (count/div)*100; 
	    			float x = 2;
	    			float y = 3;
	    			base = (x/y)*100;
	    		}
	    	}
	    	
			// if the ratio <= 2/3, partial permutation
	    			if (partial_perm <= base) {
		    			System.out.println("Verdadeiro - permutação parcial"); //
	
	    			} else
	    				System.out.println("Falso - permutação não é parcial");
	    		
	    	
	    } else 
	    	System.out.println("Falso - permutação não é parcial");
	} 

}
