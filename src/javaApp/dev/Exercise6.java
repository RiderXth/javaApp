package javaApp.dev;

import java.util.Scanner;

public class Exercise6 {
	public static void  main(String[] args) {
		int distance;
		float avg_speed,tot_time ;
		int hh,mm,ss;
// ==================== User Input ===========================================================================		
	 do {
			
		   Scanner in = new Scanner(System.in); 
		   System.out.print("Input Distance (Meters) = ");
		   System.out.print("Input an integer between 0 and 1000 : ");
		   distance = in.nextInt();
		   in.nextLine();
		   System.out.print("Input Hours used = ");
		   hh = in.nextInt();
		   in.nextLine();
		   System.out.print("Input Minutes used = ");
		   mm = in.nextInt();
		   in.nextLine();
		   System.out.print("Input second used = ");
		   ss = in.nextInt();
		   in.nextLine();
			
			if (distance < 0) {
					System.out.println("Invalid Distance, Please entry distance again ");
			} 
			else
				if ((hh < 0) && (hh > 23)) {
					  System.out.println("Invalid Hour, Please entry Hour again ");
			     }
				else
					if ((mm < 0) && (mm > 59)) {
						 System.out.println("Invalid Mintues, Please entry minutes again ");
					     }
					else
						if ((ss < 0) && (ss > 59)) {
						 System.out.println("Invalid Second, Please entry second again ");
						 } 
						else break;
		} while (true);
	 
// ====================== Main Process =========================================================================
	 tot_time  = (float) hh + 0f;
	 tot_time += (float) (mm/60f);
	 tot_time  += (float) (ss/(60f*60f));
	 System.out.printf("Total time (Hr) = %.2f%n ", tot_time);
	 avg_speed = (float) ((distance/1000f)/tot_time);
	 System.out.println();
	 System.out.printf("Speed KM/Hr = %.3f%n ", avg_speed);
		
	}
}
						