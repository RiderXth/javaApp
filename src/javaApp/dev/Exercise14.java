package javaApp.dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise14 {
	
	public static void main(String[] args) {
		
		List<Integer> num_list = new ArrayList<Integer>();
		// Integer[] number_array = new Integer[10];
		int num;
		Scanner in = new Scanner(System.in);
		do  {
			System.out.print("Enter Number  : ");
			// System.out.println(" NextLine = "+ in.nextLine());
			 if (in.hasNextInt()) 
			    	num_list.add(in.nextInt());
			// if (! in.hasNextLine())
			 else 
    		 if ( (in.hasNextLine()) || in.nextLine().equals(""))
//			 if (in.hasNextLine())
     		 {
//				 in.close();
				 System.out.println("End Add Num list " + num_list);
				 break;
			 }
		   
			System.out.println("Add Num list " + num_list);
	      } while (true);
			
		System.out.println("========== Result =======");

		Integer sum = 0;
	    for (Integer i : num_list) {
			 System.out.println("Array list = "+ i);
			 sum += i;
			}
		float avg = ((float) sum/(float) num_list.size());	
        System.out.println("Max Value in Array List = " + Collections.max(num_list));
        System.out.println("Min Value in Array List = " + Collections.min(num_list));
        System.out.printf("Avg Value in Array List = % ,.3f", avg);
        
		
//		System.out.println("Find Max Value = " + m.max(number_array));
//		System.out.println("Find Min Value = " + m.min(number_array));
//		System.out.println("Find Avg Value = " + m.avg(number_array));
		
	}
}
