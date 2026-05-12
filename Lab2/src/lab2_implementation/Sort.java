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
	private int comparisons;
	
	public Sort() {
		this.comparisons = 0;
	}
	
	public int getComparisons(){
		return this.comparisons;
	}
	
	public void resetComparisons() {
		this.comparisons = 0;
	}

	public Queue sortQueue(Queue qToSort) {
		char val = ' ';
		Queue nextQ = new Queue();
		// Take first value if queue is not empty
		if (!qToSort.empty()) {
			val = qToSort.dequeue();
		}
		nextQ = getNextQueue(val, qToSort);
		
		Queue finalQ = qToSort;
		Queue sortedQ = new Queue();
		if (!nextQ.empty()) {
			sortedQ = sortQueue(nextQ);
		}
		// Append all sorted queues to final queue
		orderFinalQueue(finalQ, sortedQ);

		return finalQ;
	}
	
	private Queue getNextQueue(char nextVal, Queue qToSort) {
		Queue nextQ = new Queue();
		// While queue is not empty
		while (!qToSort.empty()) {
			// Compare it with second value
			if (nextVal <= qToSort.front()) { // if we use >= the sorting is reversed
				// If first is bigger, second value goes to next iteration
				nextQ.enqueue(qToSort.dequeue());
			} else {
				// If first is smaller, keep second and first goes to next iteration
				nextQ.enqueue(nextVal);
				nextVal = qToSort.dequeue();
			}
			comparisons++;
			//For debug 
			//System.out.println("QToSort"); qToSort2.print();
			//System.out.println("nextQ"); nextQ2.print();
		}
		qToSort.enqueue(nextVal);
		return nextQ;
	}
	
	private void orderFinalQueue(Queue finalQueue, Queue sortedQueue) {
		while (!sortedQueue.empty()) {
			finalQueue.enqueue(sortedQueue.dequeue());
		}
	}
	
}
