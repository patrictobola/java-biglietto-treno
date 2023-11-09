package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
//		Importo lo scanner
		Scanner in = new Scanner(System.in);
		
//		Salvo il prezzo del biglietto al km
		double price = 0.21;
		
//		Chiedo all'utente i km e l'età e li salvo in delle variabili
		System.out.print("Quanti km vuoi percorrere? ");
		int kms = in.nextInt();
		System.out.println(kms);
		
		System.out.print("Quanti anni hai? ");
		int age = in.nextInt();
		System.out.println(age);
		
		
		
	}

}
