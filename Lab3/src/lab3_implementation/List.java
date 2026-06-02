/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 31/05/2026
 * Purpose of the Class: Create a linked list that stores Node objects
 * Public Methods:
 * 	- List (constructor)
 * 	- empty: returns true if the list is empty
 * 	- addToEnd: adds a Node to the end of the list
 * 	- removeLastElem: removes and returns the last Node of the list
 * 	- print: prints all Nodes of the list
 *  - getHead: returns the first element of the list
 */

package lab3_implementation;

public class List {
	private Element head;

	public List() {
		head = null;
	}

	public boolean empty() {
		return head == null;
	}
	
	public Element getHead() {
		return head;
	}

	public void addToEnd(Node newData) {
		Element newElem = new Element(null, newData);
		if (empty()) {
			head = newElem;
		} else {
			getLastElem().setNext(newElem);
		}
	}

	public Node removeLastElem() {
		Element previous = head;
		Element current = head.getNext();
		Node lastItem;

		if (current == null) {
			lastItem = previous.getData();
			head = null;
		} else {
			while (current.getNext() != null) {
				previous = current;
				current = current.getNext();
			}

			lastItem = current.getData();
			previous.setNext(null);
		}

		return lastItem;
	}

	public void print() {
		Element current = head;
		if (empty()) {
			System.out.println("List is empty!");
		} else {
			while (current != null) {
				System.out.print(current.getData().getKey() + " ");
				current = current.getNext();
			}
		}
		System.out.println();
	}

	private Element getLastElem() {
		Element current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		return current;
	}

	public Node getNext() {
		Node next = null;
		if(head.getNext() != null) {
			next = head.getNext().getData();
		}
		return next;
	}
}