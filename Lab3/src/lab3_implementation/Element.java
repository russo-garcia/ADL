/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 31/05/2026
 * Purpose of the Class: Create an element that stores a Node object
 * Public Methods:
 * 	- Element (constructor)
 * 	- data and next getters
 * 	- next setter
 */

package lab3_implementation;

public class Element {
	private Element next;
	private Node data;
	
	public Element(Element next, Node data) {
		this.next = next;
		this.data = data;
	}
	
	public Node getData() {
		return data;
	}
	
	public Element getNext() {
		return next;
	}
	
	public void setNext(Element next) {
		this.next = next;
	}
}