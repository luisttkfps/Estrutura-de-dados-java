package com.datastruct.nodeexample;

public class Main {

	public static void main(String[] args) {
		
		Node<String> firstNode = new Node<>("this is node 1");
		
		Node<String> secondNode = new Node<>("this is node 2");
		
		firstNode.setnextNode(secondNode);
		
		Node<String> thirdNode = new Node<>("this is node 3");
		
		secondNode.setnextNode(thirdNode);
		
		Node<String> fourthNode = new Node<>("this is node 4");
		
		thirdNode.setnextNode(fourthNode);
		
		System.out.println(firstNode);
		System.out.println(firstNode.getnextNode());
		System.out.println(firstNode.getnextNode().getnextNode());
		System.out.println(firstNode.getnextNode().getnextNode().getnextNode());
		
	}

}
