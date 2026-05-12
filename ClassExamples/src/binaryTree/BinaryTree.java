package binaryTree;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public boolean empty() {
        return root == null;
    }
    
    public Node succ(int k) {
    	Node nodeK = find(k);
    	if(nodeK != null) {
    		if(nodeK.getRight() != null) {
        		return min(nodeK.getRight());
        	}else {
        		Node pred = nodeK.getParent();
        		while(pred != null && pred.getData() <= nodeK.getData()) {
        			pred = pred.getParent();
        		}
        		return pred;
        	}
    	}else {
    		return null;
    	}
    }
    
    public Node min() {
    	return min(root);
    }
    
    private Node min(Node k) {
    	Node current = k;
    	while(current.getLeft() != null) {
    		current = current.getLeft();
    	}
    	return current;
    }

    public void add(int data) {
        if (empty()) {
        	root = new Node(data, null);
        } else {
            add(data, root);
        }
    }

    private void add(int data, Node current) {
        if (data < current.getData()) {
            if (current.getLeft() == null) {
                current.addLeft(new Node(data, current));
            } else {
                add(data, current.getLeft());
            }
        } else {
            if (current.getRight() == null) {
                current.addRight(new Node(data, current));
            } else {
                add(data, current.getRight());
            }
        }
    }

    public void print() {
        print(root);
    }
    
    public Node find(int k) {
    	if(k < root.getData()) {
    		return find(k, root.getLeft());
    	}else if(k == root.getData()) {
    		return root;
		}
		else{
			return find(k, root.getRight());
		}
    }
    
    private Node find(int k, Node current) {
    	if(current != null) {
    		if(k < current.getData()) {
        		return find(k, current.getLeft());
        	}else if(k == current.getData()){
        		return current;
        	}
        	else {
        		return find(k, current.getRight());
        	}
    	}else {
    		return null;
    	}
    }

    private void print(Node current) {
        if (current != null) {
            System.out.print("current: " + current.getData());
            
            if(current != root) {
            	System.out.print(" parent: " + current.getParent().getData());
            }

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