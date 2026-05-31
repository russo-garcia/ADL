package lab3_implementation;

public class Test {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.print();
		System.out.println("pop from stack item " + s.pop());
		s.print();
		
		/*List l = new List();
		l.addToEnd(1);
		l.addToEnd(2);
		l.addToEnd(3);
		l.print();
		l.removeLastElem();
		l.print();
		l.removeLastElem();
		l.print();
		l.removeLastElem();
		l.print();*/
	}

}