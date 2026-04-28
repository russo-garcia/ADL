/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 28/04/2026
 * Purpose of the Class: create a Stack data structure
 * Public Methods: 
 * 	- Stack (constructor)
 * 	- push: pushes an item into the Stack
 *  - pop: returns the last item pushed into the Stack
 * 	- print: prints all the elements of the Stack
 *  - toQueue: transforms the Stack into a Queue and returns it
 */

package lab2_implementation;

public class Stack {
	private List l;
	
	public Stack() {
		l = new List();
	}
	
	public void push(char item) {
		l.addToEnd(item);
	}
	
	public char pop() {
		return l.removeLastElem();
	}
	
	public void print() {
		l.print();
	}
	
	public Queue toQueue() {
		Queue q = new Queue();
		while(!l.empty()) {
			char i = this.pop();
			q.enqueue(i);
		}
		return q;
	}
}