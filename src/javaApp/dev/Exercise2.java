package javaApp.dev;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		char[] vowelArray = new char[]{'A','E','I','O','U','a','e','i','o','u'}; 
		char ch;
		boolean found=false;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter Alphabet : ");
			ch = in.next().charAt(0);
		}
		for (char vowel : vowelArray ) {
			if (vowel == ch) {
				System.out.println("This alphabet " + ch + " is Vowel");
				found = true;
			}
		}
		if (!found) {
			System.out.println("This alphabet "+ ch + " is Consonant");
		}	
	}
}