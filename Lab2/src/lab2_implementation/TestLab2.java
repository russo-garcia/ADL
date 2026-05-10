/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 12/05/2026
 * Purpose of the Class: Test the class Sort
 * Public Methods: 
 * 	- main: starts the program and makes the call the testing methods
 * 	- testSort: tests the methods and functionality of the class Sort
 */

package lab2_implementation;

import lab2_implementation.Queue;

public class TestLab2 {

	public static void main(String[] args) {
		TestLab2 test = new TestLab2();
		char[] dataSet = {'y', 'a', 's', 'c', 'd', 'e', 'g', 'f', 'h', 'a', 'i', 'w', 'k'};
		Queue testQueue = new Queue();
		
		Sort testSort = new Sort();
		
		test.testSort(testQueue, testSort, dataSet);
		
	}
	
	public void testSort(Queue q, Sort s, char[] ds) {
		System.out.println("Queue values from dataset...");
		for(int i = 0; i<ds.length; i++) {
			System.out.println(i);
			q.enqueue(ds[i]);
			q.print();
			System.out.println();
		}
		System.out.println("Sorting queue...");
		Queue sorted = s.sortQueue(q);
		System.out.println("Printing sorted queue...");
		sorted.print();
	}

}
