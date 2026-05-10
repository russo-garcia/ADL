/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 12/05/2026
 * Purpose of the Class: Sort a Queue of type character
 * Public Methods: 
 * 	- Sort (constructor)
 * 	- sortQueue: Sorts a character queue from smaller ('a') to bigger ('z') and returns the sorted queue
 */

package lab2_implementation;

public class Sort {
	public Sort() {
		
	}
	
	public Queue sortQueue(Queue qToSort) {
		Queue nextQ = new Queue();
		char val = ' ';
		// Take first value if queue is not empty
		if(!qToSort.empty()) {
			val = qToSort.dequeue();
		}
		// While queue is not empty
		while(!qToSort.empty()) {
			// Compare it with second value
			if(val <= qToSort.front()) {		// if we use >= the sorting is reversed
				// If first is bigger, second value goes to next iteration
				nextQ.enqueue(qToSort.dequeue());
			}else {
				// If first is smaller, keep second and first goes to next iteration
				nextQ.enqueue(val);
				val = qToSort.dequeue();
			}
			/*  For debug
			System.out.println("QToSort");
			qToSort.print();
			System.out.println("nextQ");
			nextQ.print();
			*/
		}
		Queue finalQ = new Queue();
		finalQ.enqueue(val);
		Queue sortedQ = new Queue();
		if(!nextQ.empty()) {
			 sortedQ = sortQueue(nextQ);
		}
		// Append all sorted queues to final queue
		while(!sortedQ.empty()) {
			finalQ.enqueue(sortedQ.dequeue());
		}
		return finalQ;
	}
}
