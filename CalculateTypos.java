/* Created by Taila on 17/06/2020
--------------------------------------------------------------------------------------------
Check words with typos: 

Given two strings, check if they are one typo
(or zero typos) away. Three types of typos: insert a character, remove a character
or replace a character.
one typo -> True
zero typos -> False

pale, ple -> one typo
pale, pale
pale, bake
---------------------------------------------------------------------------------------------
 */

package src;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateTypos {

	public static void main(String[] args) {
		
		int count = 0;
			
		Scanner sc = new Scanner(System.in);
		//Prompt user to ask the first string
	    System.out.print("Digite a primeira string:");
	    String firstString = sc.nextLine();
	 
	 	
	    //Prompt user to ask the second string
	    Scanner sc2 = new Scanner(System.in);
	    System.out.print("Digite a segunda string:");
	    String secondString = sc2.nextLine();
	    
	    
	    if (firstString.length() > secondString.length()) {
	    	
	    	for (int i = 0; i < secondString.length(); i++) {
	    		
	    		char letter2 = secondString.charAt(i);
	    		
	    		if (firstString.indexOf(letter2) != -1) {
		    		count = count +1;
	    		}
	    		}
	    	
	    	int dif = firstString.length()-count;
	    	
	    	if (dif == 1 || dif == -1 ) { 
	    		 System.out.print("Verdadeiro");
	    	} else {
	    		 System.out.print("Falso");

	    	}
	    		
	    		
	    	}else if (secondString.length() > firstString.length()) {
	    	    	
	    	    	for (int i = 0; i < firstString.length(); i++) {
	    	    		
	    	    		char letter1 = firstString.charAt(i);
	    	    		
	    	    		if (secondString.indexOf(letter1) != -1) {
	    		    		count = count +1;
	    	    		}
	    	    		}
	    	    	
	    	    	int dif = secondString.length()-count;
	    	    	
	    	    	if (dif == 1 || dif == -1 ) { 
	    	    		 System.out.print("Verdadeiro");
	    	    	} else {
	    	    		 System.out.print("Falso");

	    	    	}
	    	} else {
	    		
	    		for (int i = 0; i < firstString.length(); i++) {
	    			char letter2 = secondString.charAt(i);
		    		
		    		if (firstString.indexOf(letter2) == -1) {
			    		count = count +1;
		    		}
	    		} 
	    		
	    		if(count >= 2) {		
		    			System.out.print("Falso");
		    			
		    		}else {
		    			System.out.print("Verdadeiro");
		    		}
	    	}
	    
	    }
}