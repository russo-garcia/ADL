/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 28/04/2026
 * Purpose of the Class: create a Queue data structure
 * Public Methods: 
 * 	- Queue (constructor)
 * 	- empty: returns true if the queue is empty
 * 	- enqueue: adds one element to the end of the queue
 * 	- front: returns the first element of the queue without removing it
 * 	- dequeue: returns the first element of the queue and removes it
 * 	- print: prints all the elements of the queue
 *  - toStack: transforms the Queue into a Stack and returns it
 */

package lab1_implementation;

public class Queue {
	private RingList list;
	
	public Queue() {
		list = new RingList(null);
	}
	
	public boolean empty() {
		return list.empty();
	}
	
	public void enqueue(char c) {
		list.addToEnd(c);
	}
	
	public char front() {
		return list.observeFromIndex(0);
	}
	
	public char dequeue() {
		return list.removeFromIndex(0);
	}
	
	public void print() {
		list.print();
	}
	
	public Stack toStack() {
		Stack s = new Stack();
		while(!empty()) {
			char element = this.dequeue();
			s.push(element);
		}
		return s;
	}
}
