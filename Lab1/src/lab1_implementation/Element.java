/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 28/04/2026
 * Purpose of the Class: Create an iterable element of type char
 * Public Methods: 
 * 	- Element (constructor)
 * 	- Data, next and previous getters
 * 	- next and previous setters
 */

package lab1_implementation;

public class Element {
	private char data;
	private Element next;
	private Element previous;
	
	public Element(char value, Element nextElement, Element previousElement) {
		super();
		this.data = value;
		this.next = nextElement;
		this.previous = previousElement;
	}
	
	public char getData() {
		return data;
	}

	public Element getNextElement() {
		return next;
	}

	public void setNextElement(Element nextElement) {
		this.next = nextElement;
	}

	public Element getPreviousElement() {
		return previous;
	}

	public void setPreviousElement(Element previousElement) {
		this.previous = previousElement;
	}
}
