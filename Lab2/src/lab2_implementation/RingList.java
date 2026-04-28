/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 28/04/2026
 * Purpose of the Class: create a RingList data structure
 * Public Methods: 
 * 	- RingList (constructor)
 * 	- empty: returns true if the RingList is empty
 * 	- addToEnd: adds one element to the end of the RingList
 * 	- addToIndex: adds one element to the position "index" of the RingList sent by parameters
 * 	- print: prints all the elements of the RingList
 * 	- removeFromIndex: returns the element in the position "index" of the RingList sent by parameters and removes it
 * 	- observeFromIndex: returns the element in the position "index" of the RingList sent by parameters without removing it
 */

package lab2_implementation;

public class RingList {
	private Element first;

	public RingList(Element start) {
		this.first = start;
	}
	
	public boolean empty() {
		return first == null;
	}
	
	public void addToEnd(char newData) {
		Element newElement = new Element(newData, null, null);
		if(empty()) {
			adjustElement(newElement, newElement, newElement);
			first = newElement;
		}else {
			adjustElement(newElement, first, getLastElement());
	        // Adjusting last element before first because it depends on first element
			getLastElement().setNextElement(newElement);
			first.setPreviousElement(newElement);
		}
	}
	
	public void addToIndex(int index, char newData) {
		Element newElement = new Element(newData, null, null);
		Element next = getIElement(index);
		if(next != null) {
			Element previous = next.getPreviousElement();
			adjustElement(newElement, next, previous);
			previous.setNextElement(newElement);
			next.setPreviousElement(newElement);
		}else {
			System.out.println("Element out of the list size!");
		}
	}
	
	public void print() {
		Element point = first;
		do {
			System.out.print(point.getData() + " ");
			point = point.getNextElement();
		}while(point != null && point != first);
	}
	
	public char removeFromIndex(int index) {
		Element eToRemove = getIElement(index);
		Element previous = eToRemove.getPreviousElement();
		Element next = eToRemove.getNextElement();
		previous.setNextElement(next);
		next.setPreviousElement(previous);
		if(index == 0) {
			first = next;
		}
		if(first == first.getNextElement() && first == eToRemove) {
			first = null;
		}
		return eToRemove.getData();
	}
	
	public char observeFromIndex(int index) {
		return getIElement(index).getData();
	}
	
	private Element getIElement(int i) {
		Element e = first;
		int j = 0;
		while(j < i && e != null) {
			e = e.getNextElement();
			j++;
		}
		return e;
	}
	
	private Element getLastElement() {
		return first.getPreviousElement();
	}
	
	private void adjustElement(Element e, Element next, Element previous) {
		e.setNextElement(next);
		e.setPreviousElement(previous);
	}
}
