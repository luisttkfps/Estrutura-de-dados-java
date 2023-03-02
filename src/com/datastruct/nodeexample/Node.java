package com.datastruct.nodeexample;

public class Node<T> {
	private T content;
	private Node<T> nextNode;
	
	public Node(T content) {
		this.content = content;
		this.nextNode = null;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public Node getnextNode() {
		return nextNode;
	}

	public void setnextNode(Node node) {
		this.nextNode = node;
	}

	@Override
	public String toString() {
		return "Node [content=" + content + "]";
	}
	
}
