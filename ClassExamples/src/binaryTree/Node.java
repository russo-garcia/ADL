package binaryTree;

public class Node {
    private int data;
    private Node left, right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public void addLeft(Node newNode) {
        left = newNode;
    }

    public void addRight(Node newNode) {
        right = newNode;
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