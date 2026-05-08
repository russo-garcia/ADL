package binaryTree;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public boolean empty() {
        return root == null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (empty()) {
            root = newNode;
        } else {
            add(newNode, root);
        }
    }

    private void add(Node newNode, Node current) {
        if (newNode.getData() < current.getData()) {
            if (current.getLeft() == null) {
                current.addLeft(newNode);
            } else {
                add(newNode, current.getLeft());
            }
        } else {
            if (current.getRight() == null) {
                current.addRight(newNode);
            } else {
                add(newNode, current.getRight());
            }
        }
    }

    public void print() {
        print(root);
    }

    private void print(Node current) {
        if (current != null) {
            System.out.print("current: " + current.getData());

            if (current.getLeft() != null) {
                System.out.print(" left: " + current.getLeft().getData());
            } else {
                System.out.print(" no left");
            }

            if (current.getRight() != null) {
                System.out.println(" right: " + current.getRight().getData());
            } else {
                System.out.println(" no right");
            }

            print(current.getLeft());
            print(current.getRight());
        }
    }

    public void printLeft() {
        System.out.println("Print left part of tree: ");
        Node current = root;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getLeft();
        }
        System.out.println();
    }

    public void printRight() {
        System.out.println("Print right part of tree: ");
        Node current = root;
        if (root != null) {
            System.out.println("Root is " + root.getData());
        }
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getRight();
        }
        System.out.println();
    }
}