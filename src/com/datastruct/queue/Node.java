package com.datastruct.queue;

public class Node {
	private int data;
	private Node reference;
	
	public Node() {
	}
	
	public Node(int data) {
		this.data = data;
		this.reference = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getReference() {
		return reference;
	}

	public void setReference(Node reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
}
