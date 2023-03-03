package com.datastruct.queueexample;

public class Main {

	public static void main(String[] args) {
		Queue<String> myQueue = new Queue<>();
		
		myQueue.enqueue("primeiro");
		myQueue.enqueue("segundo");
		myQueue.enqueue("terceiro");
		myQueue.enqueue("quarto");
		myQueue.enqueue("quinto");
		System.out.println(myQueue);
		
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue);
		
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue);
		
		System.out.println(myQueue.first());

		System.out.println(myQueue.dequeue());
		System.out.println(myQueue);
	}

}
