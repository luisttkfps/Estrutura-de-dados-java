package com.datastruct.queueexample;

public class Queue<T> {
	private Node<T> reference;
	
	public Queue() {
		reference = null;
	}
	
	public void enqueue(T object) {
		Node newNode = new Node(object);
		newNode.setReference(reference);
		reference = newNode;
	}
	
	public T first() {
		if(!this.isEmpty()) {
			Node auxNode = reference;
			while(true) {
				if(auxNode.getReference() != null)
					auxNode = auxNode.getReference();
				else
					break;
			}
			return (T) auxNode.getData();
		}
		return null;
	}
	
	public T dequeue() {
		if(!this.isEmpty()) {
			Node firstNode = reference;
			Node auxNode = reference;
			while(true) {
				if(firstNode.getReference() != null) {
					auxNode = firstNode;
					firstNode = auxNode.getReference();
				}
				else {
					auxNode.setReference(null);
					break;
				}
			}
			return (T) auxNode.getData();
		}
		return null;
		
	}
	
	public boolean isEmpty() {
		return reference == null ? true : false;
	}
	
	@Override
	public String toString() {
		String stringReturn = "---------------\n";
		stringReturn += "      FILA\n";
		stringReturn += "---------------\n";
		
		Node auxNode = reference;
		
		while(true) {
			if(auxNode != null) {				
				stringReturn += " -->| [Node{data= " + auxNode.getData() + "}] | ";
				auxNode = auxNode.getReference();
			}else {
				break;
			}
		}
		return stringReturn;
	}

}
