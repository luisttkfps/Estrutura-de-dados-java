/*
 *  Esta é minha tentativa de criação de uma pilha em java
 *  utilizando apenas meus conhecimentos de algoritmo de pilha
 *  sem consultar o vídeo auxiliar
 * 
 * */
package com.datastruct.pile;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcao = "";
		Pile pile = new Pile();
		
		do {
			System.out.println("---- Informe o que deseja fazer ----");
			System.out.println("0. Sair");
			System.out.println("1. Inserir novo elemento na pilha");
			System.out.println("2. Listar elementos da pilha");
			System.out.println("3. Deletar elemento do topo");
			
			opcao = sc.next();
			
			switch (opcao) {
				case "1": {
					System.out.print("Novo valor: ");
					int value = sc.nextInt();
					pile = AddElement(pile, value);
					break;
				}
				
				case "2":{
					if(pile.getNumber() == 0)
						System.out.println("Sem elementos para listar!");
					ListElements(pile);
					break;
				}
				
				case "3":{
					if(pile.getNumber() == 0)
						System.out.println("Sem elementos para remover!");
					pile = DeleteTop(pile);
					break;
				}
			}
			
		} while(opcao != "a");
		
		sc.close();
	}
	
	public static Pile AddElement(Pile currentPile, int number) {
		Pile pile = new Pile(number);
		Pile refPile = new Pile();
		refPile = currentPile;
		if(refPile == null){
			refPile = pile;
		}
		else {
			pile.setReference(refPile);
			refPile = pile;
		}
		return refPile;
		
	}
	
	public static void ListElements(Pile currentPile) {
		Pile auxPile = new Pile();
		auxPile = currentPile;
		
		while(auxPile.getReference() != null) {
			System.out.println(auxPile);
			auxPile = auxPile.getReference();
		}	
	}
	
	public static Pile DeleteTop(Pile currentPile) {
		Pile auxPile = new Pile();
		auxPile = currentPile.getReference();
			
		return auxPile;
	}
}
