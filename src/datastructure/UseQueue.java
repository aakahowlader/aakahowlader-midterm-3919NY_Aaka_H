package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */


		Queue<String> Vegetables =new LinkedList<String>();
		Vegetables.add("squash");
		Vegetables.add("onion");
		Vegetables.add("eggplant");
		Vegetables.add("broccoli");


		Vegetables.size();

		Vegetables.remove();
		Vegetables.peek();
		Vegetables.poll();



		Iterator it=Vegetables.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		for(String str1: Vegetables)
		{
			System.out.println("Remove Vegetable: "+ Vegetables.remove()+" peek Vegetables: "+ Vegetables.peek()+" poll Vegetables: "+ Vegetables.poll());

		}
	}

}
