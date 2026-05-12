/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 12/05/2026
 * Purpose of the Class: Test the class Sort
 * Public Methods: 
 * 	- main: starts the program and makes the call the testing methods
 * 	- testSort: tests the methods and functionality of the class Sort
 */

package lab2_implementation;

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
			q.enqueue(ds[i]);
		}
		q.print();
		System.out.println();
		System.out.println("Sorting queue...");
		Queue sorted = s.sortQueue(q);
		System.out.println("Printing sorted queue...");
		sorted.print();
		
		System.out.println();
		System.out.println("Amount of comparisons made: " + s.getComparisons());
		
		System.out.println("Testing efficiency");
		
		s.resetComparisons();
		
		String[][] table = {{"","","","",""},{"","","","",""},{"","","","",""},{"","","","",""},
				{"","","","",""},{"","","","",""},{"","","","",""},{"","","","",""},
				{"","","","",""},{"","","","",""},{"","","","",""},{"","","","",""},
				{"","","","",""},};
		
		for(int i = 0; i < ds.length; i++) {
			Queue qTest = new Queue();
			table[i][0] = Integer.toString(i);
			for(int j = 0; j < i+1; j++) {
				qTest.enqueue(ds[j]);
			}
			table[i][2] = qTest.toString();
			s.sortQueue(qTest);
			table[i][3] = qTest.toString();
			for(int k = 0; k < 13 - i; k++) {
				table[i][2] += "  ";
				table[i][3] += "  ";
			}
			table[i][1] = Integer.toString(s.getComparisons()) + "\t";
			table[i][4] = Double.toString(s.getComparisons() / (double)(i+1));
			s.resetComparisons();
		}
		String msg = "|Length\t|#Comparisons\t|input\t\t\t\t|output\t\t\t\t|ratio\t|";
		for(int i = 0; i < (msg.length() * 2) - 5; i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.println(msg);
		for(int i = 0; i < (msg.length() * 2) - 5; i++) {
			System.out.print("=");
		}
		System.out.println();
		for(int i = 0; i < 13; i++) {
			System.out.print("|");
			for(int j = 0; j < 5; j++) {
				System.out.print(table[i][j]+ "\t|");
			}
			System.out.println("");
			for(int w = 0; w < (msg.length() * 2) - 5; w++) {
				System.out.print("-");
			}
			System.out.println();
		}
		for(int i = 0; i < (msg.length() * 2) - 5; i++) {
			System.out.print("=");
		}
		System.out.println();
	}

}
