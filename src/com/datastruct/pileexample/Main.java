package com.datastruct.pileexample;

public class Main {

	public static void main(String[] args) {
		Pile myPile = new Pile();
		
		myPile.Push(new Node(1));
		myPile.Push(new Node(2));
		myPile.Push(new Node(3));
		myPile.Push(new Node(4));
		myPile.Push(new Node(5));
		myPile.Push(new Node(6));
		System.out.println(myPile);
		
		
		myPile.Pop();
		System.out.println(myPile);
		
		myPile.Push(new Node(99));
		System.out.println(myPile);

	}

}
