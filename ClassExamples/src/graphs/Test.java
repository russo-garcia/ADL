package graphs;

public class Test {

	public static void main(String[] args) {
		
		AdjacencyMatrix am = new AdjacencyMatrix(3);
		am.setEntry(0, 1, 1);
		am.setEntry(1, 2, 1);
		am.setEntry(2, 0, 1);
		am.setEntry(2, 2, 1);
		am.print();
		
		//int i = 1;
		//boolean hasCycle = am.detectCycle(i);
		//System.out.println("Starting with "+i+" there is a cycle: " + hasCycle);
		
		
	
	}
	

}
