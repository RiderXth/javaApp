package javaApp.dev1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DemoMaps {

	public static void main(String[] args) {

		Map<String, Integer> itemMap = new HashMap<String, Integer>();

		Scanner in = new Scanner(System.in);
		String item_key = null;
		Integer noStock = 0;
		int idx = 0;
		do {
			System.out.println("Item No = " + (idx + 1));
			System.out.print("Enter Item Key  : ");
			if (in.hasNextLine()) {
				item_key = in.nextLine();
			}

			System.out.print("Enter Item Stock : ");
			if (in.hasNextInt()) {
				noStock = (Integer) in.nextInt();
				in.nextLine();
			}

			itemMap.put(item_key, noStock);
			idx++;
		} while (idx < 10);

		System.out.println("============ Print Map Lists==============");
		for (Map.Entry<String, Integer> maplist : itemMap.entrySet()) {
			System.out.print("List Map key " + maplist.getKey());
			System.out.println(" Value =" + maplist.getValue());
		}
		System.out.println("===========Remove Stock < 10==============");
		Iterator<Map.Entry<String, Integer>> iterator = itemMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			if (entry.getValue() < 10)
				iterator.remove();
		}
		System.out.println("===== Print Map Lists after Remove =======");
		for (Map.Entry<String, Integer> maplist : itemMap.entrySet()) {
			System.out.print("List Map key " + maplist.getKey());
			System.out.println(" Value =" + maplist.getValue());
		}
	}
}
