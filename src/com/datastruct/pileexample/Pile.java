package com.datastruct.pileexample;

public class Pile {
	private Node reference;
	
	public Pile() {
		reference = null;
	}
	
	public Node Pop() {
		if(!this.isEmpty()) {
			Node popedNode = reference;
			reference = reference.getReferenceNode();
			return popedNode;
		}
		return null;
	}
	
	public void Push(Node newNode) {
		Node auxNode = reference;
		reference = newNode;
		reference.setReferenceNode(auxNode);
	}
	
	public Node PileTop() {
		return reference;
	}
	
	public boolean isEmpty() {
		return reference == null ? true : false;
	}
	
	@Override
	public String toString() {
		
		String stringReturn = "------------\n";
		stringReturn += "      PILHA\n";
		stringReturn += "------------\n";
		
		Node auxNode = reference;
		
		while(true) {
			if(auxNode != null) {
				stringReturn += "[Node{data= " + auxNode.getData() + "}]\n";
				auxNode = auxNode.getReferenceNode();
			}else {
				break;	
			}
		}
		
		stringReturn += "============\n";
		return stringReturn;
		
	}
	
}
