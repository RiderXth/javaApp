package javaApp.dev;
import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		String string1, string2;
		String string3;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your The first String : ");
		string1 = in.nextLine();
		System.out.print("Enter your The second String : ");
		string2 = in.nextLine();
		// ======= Compare String ====================
		int strlen1 = string1.length(); 
		//System.out.println("String1 = " + string1);
		//System.out.println("Strlen1 = " + strlen1);
		int strlen2 = string2.length();
		//System.out.println("String2 = "+ string2);
		//System.out.println("Strlen2 = " + strlen2);
		if (strlen1 == strlen2) 
			{ 
			 System.out.println("Two strings are the same length");		
			 if (string1.contentEquals(string2)) 
			 	System.out.println(" Two strings are identical");
			 else
				System.out.println("Contains of two Strings are not the same contents");
			}
		else {
			System.out.println("Two Strings are not the same length");
			}
		System.out.println("String 1 = " + string1);
		System.out.println("String 2 = " + string2);
		string3 = string1 + string2;
		System.out.println("String1 concatenate String2 = " + string3);
	}	
}
