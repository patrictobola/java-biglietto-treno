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
		
		
		// Calcolo il prezzo del biglietto al km e lo salvo in due variabili diverse per gestire lo sconto
        double partialPrice = kms * 0.21;      
        double finalPrice = partialPrice;

        // Se ci sono, applico uno sconto
        if (age < 18) {
        	finalPrice -= partialPrice * 0.20;
        } else if (age >= 65) {
        	finalPrice -= partialPrice * 0.40;
        }
		
		
        System.out.println("Il costo del biglietto è: " + finalPrice + "€");
		
	}

}
