/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 31/05/2026
 * Purpose of the Class: Create an iterator for a SortedBinaryTree
 * Public Methods:
 * 	- TreeIterator (constructor)
 * 	- hasNext: returns true if there is a next Node
 * 	- next: returns the next Node in sorted order
 */

package lab3_implementation;

public class TreeIterator {
	private Stack stack;
	private Node current;
	
	public TreeIterator(Node root) {
		stack = new Stack();
		current = root;
		goLeft();
	}
	
	public boolean hasNext() {
		return !stack.empty();
	}
	
	public Node next() {
		Node nextNode = stack.pop();
		current = nextNode.getRight();
		goLeft();
		return nextNode;
	}
	
	private void goLeft() {
		while(current != null) {
			stack.push(current);
			current = current.getLeft();
		}
	}
}