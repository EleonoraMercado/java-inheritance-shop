package org.lessons.java.inheritance.shop;

import java.util.Scanner;

public class Carrello {

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
		    p = new Smartphone();
		    break;
		case "televisori":
		    p = new Televisori();
		    break;
		case "cuffie":
		    p= new Cuffie();
		    break;
		default: 
		   System.out.println("Inserimento non valido");    
	    //Alessio devo ancora sistemare questa zona e rivedere bene la successiva.
		   //Ho fatto dicerse modifiche ai costruttori perche ho difficolta, sto ancora provando.
	    
	}
	
	if (p != null) {
	    p.toString();
	    p.messaggioSceltaUtente();
	}
	scan.close();
    }
    
    public static void ProdottiDaAcquistare() {
	Prodotto prodottoScelto = new Prodotto(null, null, 0, 0);
	prodottoScelto.toString();
	prodottoScelto.messaggioSceltaUtente();
	System.out.println(prodottoScelto);
	
	Prodotto smartphone = new Smartphone(null, null, 0, 0, null, 0);
	smartphone.toString();
	smartphone.messaggioSceltaUtente();
	System.out.println(smartphone);
	
	Prodotto televisori = new Televisori(null, null, 0, 0, null, null);
	televisori.toString();
	televisori.messaggioSceltaUtente();
	System.out.println(televisori);
	
	Prodotto cuffie = new Cuffie(null, null, 0, 0, null, null);
	cuffie.toString();
	cuffie.messaggioSceltaUtente();
    }

}
