package com.datastruct.pile;

public class Pile {
	private int number;
	private Pile reference;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Pile getReference() {
		return reference;
	}
	public void setReference(Pile nextPile) {
		this.reference = nextPile;
	}
	public Pile(int number) {
		this.reference = null;
		this.number = number;
	}
	
	public Pile() {
		
	}
	
	@Override
	public String toString() {
		return "Pile [number=" + number + "]";
	}
	
	
}
