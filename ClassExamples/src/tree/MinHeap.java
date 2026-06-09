package tree;

// Disclaimer: mirar clase BinaryCompleteTree
public class MinHeap extends BinaryCompleteTree{
	public int getSmallest() {
		int smallest = getRoot();
		moveLastToRoot();
		repair(0, getRoot());
		return smallest;
	}
	
	private void repair(int toBeMovedDown, int val){
		int leftSon = left(toBeMovedDown);
		int rightSon = right(toBeMovedDown);
		int smallerSon = Math.min(leftSon,  rightSon);
		if(toBeMovedDown > smallerSon) {
			// exchange toBeMovedDown with smaller Son
			// until we reach a leaf
		}
	}
}
