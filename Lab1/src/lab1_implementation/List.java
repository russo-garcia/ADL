/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 28/04/2026
 * Purpose of the Class: create a RingList data structure
 * Public Methods: 
 * 	- List (constructor)
 * 	- empty: returns true if the List is empty
 * 	- addToEnd: adds one element to the end of the List
 * 	- print: prints all the elements of the List
 * 	- removeLastElem: returns the element in the last position of the List and removes it
 * 	- getLastElem: returns the element in the last position of the List without removing it
 */

package lab1_implementation;

public class List {
	private Element head;

	public List() {
		head = null;
	}

	public boolean empty() {
		return head == null;
	}

	public void addToEnd(char newData) {
		Element newElem = new Element(newData, null, null);
		if (empty()) {
			head = newElem;
		} else {
			getLastElem().setNextElement(newElem);
		}
	}

	public char removeLastElem() {
		Element previous = head;
		Element current = head.getNextElement();
		char lastItem;
		if (current == null) {
			lastItem = previous.getData();
			head = null;
		} else {
			while (current.getNextElement() != null) {
				previous = current;
				current = current.getNextElement();
			}
			lastItem = current.getData();
		}
		previous.setNextElement(null);
		return lastItem;
	}

	private Element getLastElem() {
		Element current = head;
		while (current.getNextElement() != null) {
			current = current.getNextElement();
		}
		return current;
	}

	public void print() {
		Element current = head;
		if (empty()) {
			System.out.println("List is empty!");
		} else {
			while (current != null) {
				System.out.print(current.getData() + " ");
				current = current.getNextElement();
			}
		}
		System.out.println();
	}
}