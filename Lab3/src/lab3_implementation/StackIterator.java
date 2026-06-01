/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 31/05/2026
 * Purpose of the Class: Create an iterator for the Stack class
 * Public Methods:
 * 	- StackIterator (constructor)
 * 	- hasNext: returns true if there is a next Node
 * 	- next: returns the next Node
 */

package lab3_implementation;

public class StackIterator {
	private Element current;
	
	public StackIterator(Element start) {
		this.current = start;
	}
	
	public boolean hasNext() {
		return current != null;
	}
	
	public Node next() {
		Node data = current.getData();
		current = current.getNext();
		return data;
	}
}