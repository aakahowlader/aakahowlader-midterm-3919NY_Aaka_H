package datastructure;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> array = new ArrayList<>();

		System.out.println("Using add methods");
		array.add("Aaka");
		array.add("Howlader");
		System.out.println(Array);

		array.add(1,"Aana");
		array.add(3,"Howlader");
		array.add("--------");

		System.out.println(" ");
		System.out.println("values using while loop  ");
		Iterator it = array.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		array.remove(3);
		array.remove("-----");

		System.out.println(" ");
		System.out.println("Values using Each loop");

		for (String st : array
		) {
			System.out.println(st);

		}




	}

}


	
