package com.datastruct.queue;

public class Main {

	public static void main(String[] args) {
		Queue myQueue = new Queue();
		
		myQueue.enqueue(new Node(1));
		myQueue.enqueue(new Node(2));
		myQueue.enqueue(new Node(3));
		myQueue.enqueue(new Node(4));
		myQueue.enqueue(new Node(5));
		System.out.println(myQueue);
		
		myQueue.dequeue();
		System.out.println(myQueue);
		
		myQueue.dequeue();
		System.out.println(myQueue);
		
		myQueue.dequeue();
		System.out.println(myQueue);

		myQueue.dequeue();
		System.out.println(myQueue);
	}

}
