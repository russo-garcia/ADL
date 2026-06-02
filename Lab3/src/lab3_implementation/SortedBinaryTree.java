/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 31/05/2026
 * Purpose of the Class: Create a sorted binary tree for Node objects
 * Public Methods:
 * 	- SortedBinaryTree (constructor)
 * 	- empty: returns true if the tree is empty
 * 	- getRoot: returns the root of the tree
 * 	- insert: inserts a Node into the tree while keeping the sorting order
 * 	- print: prints the tree in sorted order
 * 	- iterator: returns an iterator for the tree
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
	
	public Node getRoot() {
		return root;
	}
	
	public void insert(Node newNode) {
		if(empty()) {
			root = newNode;
			System.out.println("ROOT " + root.getKey());
		}else {
			insert(root, newNode, root);
		}
	}
	
	private void insert(Node kRoot, Node newNode, Node pre) {
		if(newNode.getKey() < kRoot.getKey()) {
			if(kRoot.getLeft() == null) {
				newNode.setLeft(null);
				newNode.setRight(null);
				newNode.setParent(pre);
				kRoot.setLeft(newNode);
				
				/*//FOR DEBUG
				if(pre != null) {
					System.out.println("LEFT NODE " + newNode.getKey() + " PRE " + pre.getKey());
				}*/
			}else {
				insert(kRoot.getLeft(), newNode, kRoot.getLeft());

			}
		}else {
			if(kRoot.getRight() == null) {
				newNode.setLeft(null);
				newNode.setRight(null);
				newNode.setParent(pre);
				kRoot.setRight(newNode);
				
				/*//FOR DEBUG
				if(pre != null) {
					System.out.println("RIGHT NODE " + newNode.getKey() + " PRE " + pre.getKey());
				}*/
			}else {
				insert(kRoot.getRight(), newNode, kRoot.getRight());

			}
		}		
	}
	
	public void insert_deprecated(Node newNode) {
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
	
	public TreeIterator iterator() {
		return new TreeIterator(root);
	}
	
	private void printInOrder(Node current) {
		if(current != null) {
			printInOrder(current.getLeft());
			System.out.print(current.getKey() + " ");
			printInOrder(current.getRight());
		}
	}
}