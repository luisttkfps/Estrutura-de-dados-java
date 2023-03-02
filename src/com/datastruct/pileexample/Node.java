package com.datastruct.pileexample;

public class Node {
	private int data;
	private Node referenceNode;
	
	
	
	public Node() {
	}

	public Node(int data) {
		this.data = data;
	}

	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getReferenceNode() {
		return referenceNode;
	}

	public void setReferenceNode(Node referenceNode) {
		this.referenceNode = referenceNode;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
	
	
}
