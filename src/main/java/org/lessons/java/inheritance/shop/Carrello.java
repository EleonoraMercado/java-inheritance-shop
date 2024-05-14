package org.lessons.java.inheritance.shop;

import java.util.Scanner;

public class Carrello{

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Scegli quale prodotto vuoi inserire nel carrello:\n"
		+ "Puoi scegliere tra questi prodotti :\n"
		+ "- Smartphone\n "
		+ "- Televisore\n"
		+ "- Cuffie\n");
	
	System.out.println("quale dei tre vuoi inserire nel carrello?");
	
	String prodottoAggiunto = scan.nextLine();
	
	Prodotto p = null;
	
	switch(prodottoAggiunto) {
		case "smartphone":
		    p = new Smartphone("Galaxy S21", "Samsung", 800, 22, "123456789ABCDEF", 256);
		    break;
		case "televisori":
		    p = new Televisori("OLED55B9", "LG", 1200, 22, "55 polici", "Smart tv");
		    break;
		case "cuffie":
		    p= new Cuffie("WH-1000XM4", "Sony", 350, 22, "Blu", "Wireless");
		    break;
		default: 
		   System.out.println("Inserimento non valido");    
	   
	}
	
	if (p != null) {
	    System.out.println(p.toString());
	    p.messaggioSceltaUtente();
	}
	scan.close();
    }
    
    
    
    
    
    
    
    //Il codice commentato a seguito l'ho scritto a seguito della lezione
    //ma non riesco a istanziare nel modo corretto. lo lascio comunque per poterlo
    //affrontare in sede ticket.
    
    /*public static void ProdottiDaAcquistare() {
	Prodotto prodottoScelto = new Prodotto();
	prodottoScelto.toString();
	prodottoScelto.messaggioSceltaUtente();
	System.out.println(prodottoScelto);
	
	Prodotto smartphone = new Smartphone();
	smartphone.toString();
	smartphone.messaggioSceltaUtente();
	System.out.println(smartphone);
	System.out.println(smartphone.toString());
	
	Prodotto televisori = new Televisori();
	televisori.toString();
	televisori.messaggioSceltaUtente();
	System.out.println(televisori);
	
	Prodotto cuffie = new Cuffie();
	cuffie.toString();
	cuffie.messaggioSceltaUtente();
	System.out.println(cuffie);
    }*/
    
}
