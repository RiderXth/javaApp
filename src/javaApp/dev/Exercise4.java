package javaApp.dev;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		int multi = -1;
		while (multi < 0) {
			multi = -1;
			System.out.println("Enter Multiplication number : ");
			try (Scanner in = new Scanner(System.in)) {
				multi = in.nextInt();
				in.nextLine();
			}
			if (multi < 0) {
				System.out.println("Invalid number, Please entry Positive number again ");
			}
		}
		for (int i=0;i<=5;i++) {
			System.out.print(multi);
			System.out.print( " X ");
			System.out.print(i);
			System.out.print(" = ");
			System.out.println(multi * i);		
		}
	}
}