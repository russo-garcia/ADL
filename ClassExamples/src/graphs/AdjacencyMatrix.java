package graphs;

public class AdjacencyMatrix {

	private int[][] m;
	
	public AdjacencyMatrix (int size) {
		m = new int[size][size];
	}

	public void setEntry(int i, int j, int value) {
		m[i][j] = value;
	}
	
	public void print() {
		for (int i=0; i< m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}

	public boolean detectCycle(int i) {
		int next = i;
		int j = 0;
		do {
			j++;
			next = goToNextNeighbour(next);
		} while(next != i && next != -1);
		return m.length < j;
	}

	private int goToNextNeighbour(int current) {
		int next = 0;
		boolean found = false;
		while (next < m.length && !found) {
			if(next != current && m[current][next] == 1) {
				found = true;
			} else {
				next++;
			  }
		}
		if (found) {
		return next;
		} else {
			return -1;
		  }
	}
}







