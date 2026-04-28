/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 28/04/2026
 * Purpose of the Class: Test the classes RingList and Queue
 * Public Methods: 
 * 	- main: starts the program and makes the call the testing methods
 * 	- ringListTet: tests the methods and functionality of the class RingList
 * 	- queueTest: tests the methods and functionality of the class Queue
 */

package lab1_implementation;

public class Test {

	public static void main(String[] args) {
		Test test = new Test();
		// TODO Auto-generated method stub
		char[] dataSet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};
		RingList testRingList = new RingList(null);
		Queue testQueue = new Queue();
		
		test.queueTest(testQueue, dataSet);
		//test.ringListTest(testRingList, dataSet);
		
	}
	
	public void ringListTest(RingList rl, char[] ds) {
		System.out.println("Adding values from dataset...");
		for(int i = 0; i<ds.length; i++) {
			System.out.println(i);
			rl.addToEnd(ds[i]);
			rl.print();
			System.out.println();
		}
		
		System.out.println("Adding char x to 7th position...");
		rl.addToIndex(7, 'x');
		rl.print();
		System.out.println();
		
		System.out.println("Removing 7th position character and printing it...");
		char c = rl.removeFromIndex(7);
		System.out.println(c);
		rl.print();
		System.out.println();
		
		System.out.println("Just observing 7th position character and printing it...");
		char c2 = rl.observeFromIndex(7);
		System.out.println(c2);
		rl.print();
		System.out.println();
	
	}
	
	public void queueTest(Queue q, char[] ds) {
		System.out.println("Queue values from dataset...");
		for(int i = 0; i<ds.length; i++) {
			System.out.println(i);
			q.enqueue(ds[i]);
			q.print();
			System.out.println();
		}
		
		System.out.println("Dequeue character and printing it...");
		char c = q.dequeue();
		System.out.println(c);
		q.print();
		System.out.println();
		
		System.out.println("Front character and printing it...");
		char c2 = q.front();
		System.out.println(c2);
		q.print();
		System.out.println();
		
		System.out.println("Change the queue to a stack and print the stack");
		Stack s = q.toStack();
		s.print();
		
		System.out.println("Take the element of the stack and print it");
		s.pop();
		s.print();
		
		System.out.println("Change the stack to a queue and print the queue");
		Queue q2 = s.toQueue();
		q2.print();
	}
}
