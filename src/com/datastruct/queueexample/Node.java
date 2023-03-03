package com.datastruct.queueexample;

public class Node<T> {
	private T data;
	private Node<T> reference;
	
	public Node() {
	}
	
	public Node(T data) {
		this.data = data;
		this.reference = null;
	}

	public Object getData() {
		return data;
	}

	public void setData(T data) {
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
