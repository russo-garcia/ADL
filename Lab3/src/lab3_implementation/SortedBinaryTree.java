/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 31/05/2026
 * Purpose of the Class: Create a sorted binary tree for Node objects
 * Public Methods:
 * 	- SortedBinaryTree (constructor)
 * 	- empty: returns true if the tree is empty
 * 	- insert: inserts a Node into the tree while keeping the sorting order
 * 	- print: prints the tree in sorted order
 */

package lab3_implementation;

public class SortedBinaryTree<E> {
	private Node root;
	
	public SortedBinaryTree() {
		root = null;
	}
	
	public boolean empty() {
		return root == null;
	}
	
	public void insert(Node newNode) {
		if(empty()) {
			root = newNode;
		}else {
			Node current = root;
			Node parent = null;
			
			while(current != null) {
				parent = current;
				
				if(newNode.getKey() < current.getKey()) {
					current = current.getLeft();
				}else {
					current = current.getRight();
				}
			}
			
			newNode.setParent(parent);
			
			if(newNode.getKey() < parent.getKey()) {
				parent.setLeft(newNode);
			}else {
				parent.setRight(newNode);
			}
		}
	}
	
	public void print() {
		if(empty()) {
			System.out.println("Tree is empty!");
		}else {
			printInOrder(root);
			System.out.println();
		}
	}
	
	private void printInOrder(Node current) {
		if(current != null) {
			printInOrder(current.getLeft());
			System.out.print(current.getKey() + " ");
			printInOrder(current.getRight());
		}
	}
}