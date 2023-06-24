package javaApp.dev;
import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your number : ");
		number = in.nextInt();
		in.nextLine();
		
		String strnum = Integer.toString(number);
		System.out.println("The original digit = " + strnum);
		System.out.print("The reverse digit = ");
		for (int i = (strnum.length() - 1); i >= 0; i--) {
			System.out.print(strnum.charAt(i));	
		}
		System.out.println();
	}
}
