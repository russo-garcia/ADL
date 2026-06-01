/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 31/05/2026
 * Purpose of the Class: Create a node for a sorted binary tree
 * Public Methods:
 * 	- Node (constructor)
 * 	- key, parent, left and right getters
 * 	- parent, left and right setters
 */

package lab3_implementation;

public class Node {
	private char key;
	private Node parent;
	private Node left;
	private Node right;
	
	public Node(char key) {
		this.key = key;
		this.parent = null;
		this.left = null;
		this.right = null;
	}
	
	public char getKey() {
		return key;
	}
	
	public Node getParent() {
		return parent;
	}
	
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	public Node getLeft() {
		return left;
	}
	
	public void setLeft(Node left) {
		this.left = left;
	}
	
	public Node getRight() {
		return right;
	}
	
	public void setRight(Node right) {
		this.right = right;
	}
}