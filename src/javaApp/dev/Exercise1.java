package javaApp.dev;

import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		int number;
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter your number : ");
			number = in.nextInt();
			in.nextLine();
		}
		System.out.println("echo number : " + number);
		System.out.println("If Condition");
		if (number > 0) {
			System.out.println("positive");
		} else
			if (number < 0) {
				System.out.println("negative");
			} else {
				System.out.println("zero");
			}
		System.out.println("===============================");
		System.out.println("switch Condition");
		switch(number) {
		case 0 :
			System.out.println("zero");
			break;
		default :
			// switch (number>>31) {
			int sign = (number > 0) ? 0 : 2;
			switch (sign) {
			case 0 :
				System.out.println("positive");
				break;
			default :
				System.out.println("negative");
				break;
			}
				
		}
	}
}