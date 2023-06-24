package javaApp.dev;

import java.util.Scanner;

public class Exercise12 {
	
	public int max(int [] array) {
	      int max = 0;
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]>max) {
	            max = array[i];
	         }
	      }
	      return max;
	   }
	   public int min(int [] array) {
	      int min = array[0];
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]<min) {
	            min = array[i];
	         }
	      }
	      return min;
	   }
	   public float avg(int [] array) {
		      float sum = 0f;
		     
		      for(int i=0; i<array.length; i++ ) {
		            sum += array[i];
		         }
		      return sum/array.length;
		   }
	public static void main(String[] args) {
		
		int[] number_array = new int[10];
		// Integer[] number_array = new Integer[10];
		System.out.println("Please Entry 10 numbers ");
		for (int i=0; i < 10 ;i++) {
			System.out.print("Enter Number " + (i+1) + " : ");
			Scanner in = new Scanner(System.in);
			number_array[i] = in.nextInt();
		    in.nextLine();
		}
		Exercise12 m = new Exercise12();
		System.out.println("========== Result =======");
		System.out.println("Find Max Value = " + m.max(number_array));
		System.out.println("Find Min Value = " + m.min(number_array));
		System.out.println("Find Avg Value = " + m.avg(number_array));
		
	}
}
