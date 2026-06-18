/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 23/06/2026
 * Purpose of the Class: Represents an adjacency matrix
 * Public Methods:
 * 	- AdjacencyMatrix (constructor)
 * 	- addNode: adds new node to the graph (unconnected to any other node)
 * 	- addEdge: adds an edge between two nodes
 *  - getNeigbours: gets all neighbors of a specific node
 *  - numOfEdges: returns amount of edges from Adj matrix
 *  - getWeight: returns weight of a specific edge
 */
package lab4_implementation;

public class AdjacencyMatrix {
	private int[][] adjMatrix;
	private int currSize;
	
	public AdjacencyMatrix() {
		adjMatrix = new int[0][0];
		currSize = 0;
	}
	
	public void addNode() {
		currSize += 1;
		int[][] tempMatrix = adjMatrix;						// Storing all matrix values into a temp matrix
		adjMatrix = new int[currSize][currSize];			// expanding by 1 the size of the matrix
		if(currSize > 1) {									// only when matrix has already some values
			for(int i = 0; i < currSize - 1; i++) {
				for(int j = 0; j < currSize - 1; j++) {				
					adjMatrix[i][j] = tempMatrix[i][j];			// Copying previous values of the matrix
				}
			}
			for(int i = 0; i < currSize; i++) {
				adjMatrix[currSize - 1][i] = -1;						// setting new vertix weight to -1 to show it is not connected to anything
				adjMatrix[i][currSize - 1] = -1;
			}
		}
		else {
			adjMatrix[0][0] = -1;
		}
	}
	
	public int[] getNeighbours(int v) {
		return adjMatrix[v];
	}
		
	
	public void addEdge(int node1, int node2, int weight) {
		adjMatrix[node1][node2] = weight;
	}
	
	public int numOfEdges() {
		int r = 0;
		for(int i = 0; i < currSize; i++) {
			for(int j = 0; j < currSize; j++) {				
				if(adjMatrix[i][j] != -1) {
					r++;
				}
			}
		}
		return r;
	}
	
	public int getWeight(int u, int v) {
		return adjMatrix[u][v];
	}
	
	
}
