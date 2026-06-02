/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 31/05/2026
 * Purpose of the Class: Test the Stack with Node objects and the SortedBinaryTree
 * Public Methods:
 * 	- main: starts the program and makes the call to the testing methods
 * 	- testStack: tests the methods and functionality of the class Stack
 * 	- testTree: tests the insertion of Stack nodes into the SortedBinaryTree
 */

package lab3_implementation;

public class Test {

	public static void main(String[] args) {
		Test test = new Test();
		//test.testStack();
		test.testTree();
	}
	
	public void testStack() {
		char[] dataSet = {'y', 'a', 's', 'c', 'd', 'e', 'g', 'f', 'h', 'a', 'i', 'w', 'k'};
		Stack stack = new Stack();
		
		System.out.println("Testing Stack...");
		System.out.println("Stack is empty: " + stack.empty());
		
		System.out.println("Pushing nodes into stack...");
		
		for(int i = 0; i < dataSet.length; i++) {
			CharNode node = new CharNode(dataSet[i]);
			stack.push(node);
		}
		
		System.out.println("Stack is empty: " + stack.empty());
		
		System.out.println("Printing stack...");
		stack.print();
		
		System.out.println("Popping one node from stack...");
		Node poppedNode = stack.pop();
		System.out.println("Popped node: " + poppedNode.getKey());
		
		System.out.println("Printing stack after pop...");
		stack.print();
		
		System.out.println("Testing StackIterator...");
		StackIterator iterator = stack.iterator();

		while(iterator.hasNext()) {
			Node currentNode = iterator.next();
			System.out.print(currentNode.getKey() + " ");
		}

		System.out.println();
		System.out.println();
	}
	
	public void testTree() {
		char[] dataSet = {'y', 'a', 's', 'c', 'd', 'e', 'g', 'f', 'h', 'a', 'i', 'w', 'k'};
		Stack stack = new Stack();
		SortedBinaryTree<Node> tree = new SortedBinaryTree<Node>();
		
		System.out.println("Testing SortedBinaryTree...");
		System.out.println("Tree is empty: " + tree.empty());
		
		System.out.println("Creating CharNodes and pushing them into stack...");
		
		for(int i = 0; i < dataSet.length; i++) {
			CharNode node = new CharNode(dataSet[i]);
			stack.push(node);
		}
		
		System.out.println("Printing stack before inserting into tree...");
		stack.print();
		
		System.out.println("Iterating through stack and inserting nodes into tree...");
		
		StackIterator iterator = stack.iterator();
		
		while(iterator.hasNext()) {
			Node currentNode = iterator.next();
			tree.insert(currentNode);
		}
		
		System.out.println("Tree is empty: " + tree.empty());
		
		System.out.println("Printing tree in sorted order...");
		tree.print();
	}
}