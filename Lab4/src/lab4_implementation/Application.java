package lab4_implementation;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class Application {
	private Node testNode1, testNode2, testNode3, testNode4, testNode5, testNode6, testNode7;
	private VisualEdge testEdge;
	private Graph g = new Graph();

	public Application() {
		// construct your graph
		/*testNode1 = new VisualNode(1, new Point(100, 100));
		testNode2 = new VisualNode(2, new Point(300, 300));
		testEdge = new VisualEdge(testNode1, testNode2);*/
		testNode1 = new Node(5, 1, new Point(100, 100));
		testNode2 = new Node(2, 2, new Point(300, 300));
		testNode3 = new Node(4, 3, new Point(100, 400));
		testNode4 = new Node(8, 4, new Point(400, 100));
		testNode5 = new Node(6, 5, new Point(200, 500));
		testNode6 = new Node(2, 6, new Point(500, 600));
		testNode7 = new Node(1, 7, new Point(700, 700));
		
		g.add(testNode1);
		g.add(testNode2);
		g.add(testNode3);
		g.add(testNode4);
		g.add(testNode5);
		g.add(testNode6);
		g.add(testNode7);
		g.addEdge(testNode1, testNode2, 8);
		g.addEdge(testNode1, testNode3, 4);
		g.addEdge(testNode2, testNode4, 3);
		g.addEdge(testNode4, testNode5, 9);
		g.addEdge(testNode6, testNode7, 5);
		g.addEdge(testNode5, testNode7, 2);
		g.addEdge(testNode4, testNode7, 2);
	}

	public void draw() { 
		// just a too simple minimal example 
		// to draw a graph with two vertices
		// testEdge.draw();
		// testNode1.draw();
		// testNode2.draw();

		/*
		 * here you would include appropriate getters 
		 * for the components of your graph,
		 * which you are going to draw
		 */
		
		/*ArrayList<Node> neighboursNode1 = g.getNeighboursFor(0);
		testNode1.draw();
		for(int i = 0; i < neighboursNode1.size(); i++) {
			Node n = neighboursNode1.get(i);
			n.draw();
			testEdge = new VisualEdge(testNode1, n);
			testEdge.draw();
			
		}*/
		
		ArrayList<Node> path = g.somePath(0, 11);
		Node prevN = testNode1;
		for(Node n: path) {
			n.draw();
			testEdge = new VisualEdge(prevN, n);
			testEdge.draw();
			prevN = n;
			
		}
	}
}
