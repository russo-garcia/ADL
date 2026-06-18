/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 23/06/2026
 * Purpose of the Class: Create a graph of nodes, using an Adjacency Matrix
 * Public Methods:
 * 	- Graph (constructor)
 * 	- add: adds new node to the graph (unconnected to any other node)
 * 	- addEdge: adds an edge between two nodes
 *  - getNeigboursFor: gets all neighbors of a specific node
 *  - numOfEdges: returns amount of edges from Adj matrix
 *  - numOfVertices: returns amount of vertices (Nodes)
 *  - getWeight: returns weight of a specific edge
 *  - somePath: follows an arbitrary path from vertex u which has the provided length
 */
package lab4_implementation;

import java.util.ArrayList;

public class Graph {
	private AdjacencyMatrix neighboursMatrix;
	private ArrayList<Node> nodes;
	
	public Graph() {
		neighboursMatrix = new AdjacencyMatrix();
		nodes = new ArrayList<Node>();
	}
	
	public void add(Node n) {
		neighboursMatrix.addNode();
		nodes.add(n);
	}
	
	public void addEdge(Node n1, Node n2, int weight) {	
		int i1 = nodes.indexOf(n1);						// finding index of node 1
		int i2 = nodes.indexOf(n2);						// finding index of node 2
		
		neighboursMatrix.addEdge(i1, i2, weight);		// adding it to the adjacency matrix
	}
	
	public ArrayList<Node> getNeighboursFor(int v){
		ArrayList<Node> r = new ArrayList<Node>();
		int[] neighbours = neighboursMatrix.getNeighbours(v);
		for(int i = 0; i < nodes.size(); i++) {
			if(neighbours[i] != -1) {
				r.add(nodes.get(i));
			}
		}
		return r;
	}
	
	public int numOfEdges() {
		return neighboursMatrix.numOfEdges();
	}
	
	public int numOfVertices() {
		return nodes.size();
	}
	
	public int getWeight(int u, int v) {
		return neighboursMatrix.getWeight(u, v);
	}
	
	public ArrayList<Node> somePath(int u, int length){
		ArrayList<Node> path = new ArrayList<Node>();
		int currLength = 0;
		path.add(nodes.get(u));
		path = getPath(nodes.get(u), length, 0, path);			// call to recursive function
		return path;
	}
	
	private ArrayList<Node> getPath(Node n, int length, int currLength, ArrayList<Node> path) {
	    ArrayList<Node> tempPath = getNeighboursFor(nodes.indexOf(n));						// first we get all neighbors of the node
	    for (Node node : tempPath) {														// we iterate though all the neighbors
	        int tempLength = currLength + getWeight(nodes.indexOf(n), nodes.indexOf(node));	// we check the distance that we have to that neighbor + total distance accumulated so far
	        path.add(node);																	// we add the node to the path to show that we went there
	        if (tempLength == length) {
	            return new ArrayList<>(path);												// if we get the correct distance, we return the path
	        }
	        ArrayList<Node> result = getPath(node, length, tempLength, path);				// if correct distance was not reached, we go to next iteration of function
	        if (result != null) {
	            return result;																// if in the iteration we got the result we need, we return it
	        }
	        path.remove(path.size() - 1); 													// if we did not, then we remove the node from the path to continue with next neighbor
	    }
	    return null;
	}
}
