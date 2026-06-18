/*
 * Authors: Gustavo Russo Garcia, Juan Grondona Caimi
 * Date: 23/06/2026
 * Purpose of the Class: Represents a vertix of a Graph
 * Public Methods:
 * 	- Node (constructor)
 * 	- getter of Value
 */package lab4_implementation;

import java.awt.Point;

public class Node extends VisualNode {
	private int value;
	
	public Node(int value, int id, Point position) {
		super(id, position);
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}
