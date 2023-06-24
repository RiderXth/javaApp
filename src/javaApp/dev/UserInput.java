package javaApp.dev;

import java.util.*;

public class UserInput {

	public static void main(String[] args) {
		int number;
		String name, designation;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter your name");
			name = in.nextLine();
			System.out.println("Enter your employee number ");
			number = in.nextInt();
			in.nextLine();
			System.out.println("Enter your designation");
			designation = in.nextLine();
		}
		System.out.println(name);
		System.out.println(number);
		System.out.println(designation);
	}

}