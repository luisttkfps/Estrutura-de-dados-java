package com.datastruct.queue;

public class Queue {
	private Node reference;
	
	public Queue() {
		if(isEmpty()) {
			reference = new Node();
			reference = reference.getReference();	
		}else {
			reference = reference.getReference();			
		}
			
	}
	
	public Node last() {
		return reference;
	}
	
	public void enqueue(Node newNode) {
		if(isEmpty())
			reference = newNode;
		else {
			Node auxNode = reference;
			while(true) {
				if(auxNode.getReference() != null)
					auxNode = auxNode.getReference();
				else {
					auxNode.setReference(newNode);
					break;
				}
			}
		}
	}
	
	public Node dequeue() {
		if(!isEmpty()) {
			Node dequeuedNode = reference;
			reference = reference.getReference();
			return dequeuedNode;
		}else {
			return null;
		}
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
				stringReturn += " | [Node{data= " + auxNode.getData() + "}] |";
				auxNode = auxNode.getReference();
			}else {
				break;
			}
		}
		return stringReturn;
	}

}
