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

import java.util.Iterator;

public class Stack implements Iterable<Node> {
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
	
	public Node peek() {
		return l.getNext();
	}
	
	public void print() {
		l.print();
	}

	@Override
	public Iterator<Node> iterator() {
		return new Iterator<Node>(){
			private int pos = -1;
			private boolean empty = false;
			private Stack helper = new Stack();
			
			@Override
			public boolean hasNext() {
				return !empty;				
			}
			
			@Override
			public Node next() {
				pos ++;
				Node n = pop();
				helper.push(n);
				if(empty()) {
					this.empty = true;
					while(!helper.empty()) {
						Node n2 = helper.pop();
						push(n2);
					}
				}
				return n;	
			}
		};
	}
	
	/*
	public StackIterator iterator() {
		return new StackIterator(l.getHead());
	}*/
}