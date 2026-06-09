package tree;


// Disclaimer: aca faltan metodos porque el prof ya habia hecho esto en una clase pasada y no llegue a copiar todo
// El prof recomendo que lo hagamos con Nodes en vez de integers
public class BinaryCompleteTree {
	private int[] a;
	final private int NOTEXISTS = -1;
	
	public BinaryCompleteTree() {
		a = new int[0];
	}	
	
	public void moveLastToRoot() {
		int last =  a[a.length-1];
		int[] temp = new int[a.length-1];
		for(int i = 0; i < a.length-1; i++) {
			temp[i] = a[i];
		}
		temp[0] = last;
		a = temp;
	}
	
	public int getRoot() {
		return a[0];
	}
	
	public int left(int k) {
		if(((2*k) + 1) < a.length) {
			return ((2*k) + 1);
		}else {
			return NOTEXISTS;
		}
	}
	
	public int right(int k) {
		if(((2*k) + 2) < a.length) {
			return ((2*k) + 2);
		}else {
			return NOTEXISTS;
		}
	}
}
