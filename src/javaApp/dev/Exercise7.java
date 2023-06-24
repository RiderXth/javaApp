package javaApp.dev;
import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		int num1, num2;
		int choice;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your number # 1 : ");
		num1 = in.nextInt();
		in.nextLine();
		System.out.print("Enter your number # 2 : ");
		num2 = in.nextInt();
		in.nextLine();
		
		while (true) {
			System.out.println("=======Manin Menu===========");
            System.out.println("       1. Add               ");
            System.out.println("       2. Subtract          ");
            System.out.println("       3. Divide            ");
		    System.out.println("       4  Reminder          ");
		    System.out.println("       5. Exit              ");
		   
		    System.out.print(" Enter your choice: "); 
			choice = in.nextInt();
			in.nextLine();
			
		    System.out.printf("The First number = %d\n", num1);
		    System.out.printf("The second number = %d\n", num2);
		    switch(choice) {
			case 1 :{
				int temp = num1 + num2;
				System.out.printf("Result of " + num1 + " + " + num2 + " = % ,d \n  ", temp );
				break;
			}
			case 2 :{
				int temp = num1 - num2;
				System.out.printf("Result of " + num1 + " - " + num2 + " = % ,d \n",  temp );
				break;
			}
			case 3 :{
				float temp =  ((float) num1/ (float) num2);
				System.out.printf("Result of " + num1 + " / " + num2 + " = % ,.3f \n" ,  temp);
				break;
			}
			case 4 : {
				int temp = (num1 % num2);
				System.out.printf("Result of " + num1 + " %% " + num2  + " = % ,d \n", temp );
				break;
			}
			case 5 :
				System.out.println("Exit Program");
				return;	
			default :
				System.out.println("Invalid Choice");
			} 
		}
	}
}
