/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 31/05/2026
 * Purpose of the Class: Create a stack data structure that stores Node objects
 * Public Methods:
 * 	- Stack (constructor)
 * 	- empty: returns true if the stack is empty
 * 	- push: adds a Node to the top of the stack
 * 	- pop: removes and returns the top Node of the stack
 * 	- print: prints all Nodes of the stack
 * 	- iterator: returns an iterator for the stack
 */

package lab3_implementation;

public class Stack {
	private List l;
	
	public Stack() {
		l = new List();
	}
	
	public boolean empty() {
		return l.empty();
	}
	
	public void push(Node item) {
		l.addToEnd(item);
	}
	
	public Node pop() {
		return l.removeLastElem();
	}
	
	public void print() {
		l.print();
	}
	
	public StackIterator iterator() {
		return new StackIterator(l.getHead());
	}
}