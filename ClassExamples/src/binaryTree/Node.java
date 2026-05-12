package binaryTree;

public class Node {
    private int data;
    private Node left, right, parent;

    public Node(int data, Node parent) {
        this.data = data;
        left = null;
        right = null;
        this.parent = parent;
    }

    public void addLeft(Node newNode) {
        left = newNode;
    }

    public void addRight(Node newNode) {
        right = newNode;
    }

    public Node getParent() {
    	return this.parent;
    }
    
    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getData() {
        return data;
    }
}