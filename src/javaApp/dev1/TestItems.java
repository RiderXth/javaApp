package javaApp.dev1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javaApp.dev.Item;


public class TestItems extends Item{

	public TestItems(int itemId, String itemName, float quantity, float rate) {
		super(itemId, itemName, quantity, rate);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		List<Item> itemlist = new ArrayList<Item>();

		Scanner in = new Scanner(System.in);
		int temp_item = 0;
		String temp_name = null;
		float temp_quantity = 0, temp_rate = 0f;
		int idx = 0;
		retry_step:
		do  {
			System.out.println("Item No = " + (idx+1));
			System.out.print("Enter Item id  : " );
			if (in.hasNextInt()) {
		    	temp_item = in.nextInt();
			    in.nextLine();
			}
			
			System.out.print("Enter Item name : ");
			if (in.hasNext()) 
				temp_name = in.nextLine();
			System.out.print("Enter Item Quantity : ");
			if (in.hasNextFloat()) {
				temp_quantity = in.nextFloat();
				in.nextLine();
			}
			
			System.out.print("Enter Item Rate : ");
			if (in.hasNextFloat()) {
				temp_rate = in.nextFloat();
				in.nextLine();
			}
			if (temp_quantity < 0 || temp_rate < 0) {
				System.out.println("Invalid value Quantity & Rate should >= zero");
				System.out.println();
				continue retry_step;
			}
			itemlist.add(new Item(temp_item,temp_name,temp_quantity,temp_rate));
			idx++;
		} while (idx < 10);
		
		System.out.println("============ Print Array Lists==============");
		for (Item item : itemlist) {
			System.out.println(item.display());
		}
	}	
}
