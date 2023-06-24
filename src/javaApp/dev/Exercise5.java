package javaApp.dev;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		int number = -1;
		int sum = 0;
		String numstr;
		while (number < 0 || number > 1000) {
			System.out.println("Input - ");
			System.out.print("Input an integer between 0 and 1000 : ");
			try (Scanner in = new Scanner(System.in)) {
				number = in.nextInt();
				in.nextLine();
			}
			if ((number < 0) || (number > 1000)) {
				number = -1;
				System.out.println("Invalid number, Please entry number again ");
			}
		}
		numstr = Integer.toString(number);
		int j;
		String temp;
		for (int i = 0; i < numstr.length(); i++) {
			j = 0;
//			System.out.println("print sum "+sum);
//			System.out.println("numstr = " + numstr.charAt(i));
			temp = numstr.substring(i, i + 1);
			j = Integer.parseInt(temp);
			// j = Integer.parseInt(numstr, numstr.charAt(i), i, i);
			// j = Integer.parseInt(numstr, numstr.charAt(i),10, i);
//			System.out.println("j = " + j);
//			System.out.println("sum = " + sum);
			sum += j;
		}
		System.out.println("Output - ");
		System.out.println("The sum of all digits in " + numstr + " = " + sum);
	}

}