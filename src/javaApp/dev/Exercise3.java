package javaApp.dev;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		int number = -1;
		int sum=0;
		while (number != 0) {
			number = sum = 0;
			System.out.println("Enter number : ");
			try (Scanner in = new Scanner(System.in)) {
				number = in.nextInt();
				in.nextLine();
			}
			if (number < 0) {
				System.out.println("Invalid number, Please entry Positive number again ");
			}
			else 
			{
				for (int i=0;i<=number;i++) {
					sum += i;
				}
				if (sum > 0) {
				   System.out.println("Total Sum is : "+ sum);
				}
			}
		}	
	}
}