package javaApp.dev;
import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your number : ");
		number = in.nextInt();
		in.nextLine();
		
		String strnum = Integer.toString(number);
		for (int i =0; i < strnum.length(); i++) {
			System.out.println("the number of digit = " + strnum.charAt(i));	
		}	
	}
}
