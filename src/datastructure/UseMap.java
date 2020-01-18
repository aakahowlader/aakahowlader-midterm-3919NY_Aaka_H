package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> sweet = new ArrayList<String>();
		dessert.add("ice cream");
		dessert.add("more icecream");
		dessert.add("flan");
		dessert.add("candy");
		dessert.add("cake");
		
		
		List<String> savory = new ArrayList<String>();
		food.add("spagetti");
		food.add("meatballs");
		food.add("chicken");
		food.add("pork");
		food.add("beef");


		Map<String, List<String>> food = new HashMap<String, List<String>>();
		food.put("Menu", food);
		food.put("Dessert Menu", dessert);

		System.out.println("For, each loop");
		for (Map.Entry<String, List<String>> FoodList : food.entrySet()) {
			System.out.println(FoodList.getKey() + " ----> " + FoodList.getValue());
		}
		System.out.println("-----------------------------------");
		System.out.println("Printout values using Iterator");
		Iterator<Map.Entry<String, List<String>>> it = food.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, List<String>> pair = it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}


	}
}
