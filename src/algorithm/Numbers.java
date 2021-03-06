package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[1000000];
		//1 million milli seconds
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
        
		int n = num.length;
		randomize (num, n);
		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//By following above, Continue for rest of the Sorting Algorithm....
		
		int n= num.length 
			randomize (num,n);
		algo.insertionSort(num);
		long insertionSortExecutionTime= algo.executionTime; 
		System.out.println("The total execute time is" + num.length+ "numbers take"+ insertionSortExecutionTime+ "milli seconds");
		
		//continuing the rest 
		
		storeRandomNumbers(num);
		
		randomize (num, n);
		
		//Heap sort 
		
		randomize (num, n);
		
		algo.heapSort(num);
		long heapSortExecutionTime= algo.executionTime;
		System.out.println("The total execution time is" + num.length + "numbers take" + heapSortExecutionTime + "milli seconds");
		
		//Bubble sort 
		
		algo.bubbleSort(num);
		long bubbleSortExecutionTime= algo.execution.Time;
		System.out.println("The total execution time is"+ num.length + "numbers take"+ bubbleSortExecutionTime + "milli seconds");
		
		//Bucket Sort 
		
		randomize (num, 1000000);
		System.out.println("The total execution time is" + num.length + "numbers take:" + algo.executionTime + "milli seconds");
		
		//Quick Sort 
		
		randomize (num, n);
		algo.quickSort(num, 0, n-1);
		long quickSortExecutionTime = algo.executionTime;
		
		System.out.println("The total execution time is" + num.length + "numbers take:" + quickSortExecutionTime + "milli seconds");


		//Shell Sort 
		
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime; 
		System.out.println("The total execution time is" +  num.length + "numbers take:" + shellSortExecutionTime + "milli seconds");
 );
		
		//Come to conclusion about which Sorting Algo is better in given data set.

 //	Quick sort is the best method becuase it is faster.
 
	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
