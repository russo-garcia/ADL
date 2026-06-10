package hashing;

public class Hashing {
	private int[] ht;
	
	public Hashing() {
		ht = new int [11];
	}
	
	public int preHash(String name) {
		int key = 0;
		for(int i = 0; i < name.length(); i++) {
			char s = name.charAt(i);
			int k = (int)s;
			//key += k;
			key += k*(i+1);
			
			
			//System.out.println(s + " casted to int results to " + k);
		}
		System.out.println("key for " + name + " is " + key);
		return key;
	}
	
	public int h(int key) {
		return key % ht.length;
	}
	
	public void insert(DictEntry de) {
		int key = preHash(de.getName());
		int tableIndex = h(key);
		ht[tableIndex] = de.getNumber();
	}
	
	public void search(String name) {
		int key = preHash(name);
		System.out.println("hash-table contents for " + name + " is " + ht[h(key)]);
	}
	
	private void print() {
		for (int i = 0; i < ht.length; i++) {
			System.out.println("ht[" + i + "] = " + ht[i]);
		}
		
			
	}
	
	
	
	
	/*MAIN FUNCTION MUST BE THE LAST FUNCTION*/
	
	public static void main(String[] args) {
		Hashing h = new Hashing();
		h.insert(new DictEntry("Tom", 1234));
		h.insert(new DictEntry("Sally", 2468));
		h.insert(new DictEntry("Gustavo", 1357));
		h.insert(new DictEntry("Ali", 4321));

		
		h.print();
		h.search("Tom");
		h.search("Sally");
		h.search("Ali");
		h.search("Gustavo");
		

		
		
		/*
		int keyTom = h.preHash("Tom");
		System.out.println("Tom's key " + keyTom + " and hashVal is " + h.h(keyTom));
		int keySally = h.preHash("Sally");
		System.out.println("Sally's key " + keySally + " and hashVal is " + h.h(keySally));
		*/
	}



}
