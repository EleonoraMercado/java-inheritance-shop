package org.lessons.java.inheritance.shop;

public class Shop {

    public static void main(String[] args) {
	
	Smartphone cellulare = new Smartphone("Iphone 13", "Apple", 800.00, 0.22, "AAAAAABBCCCCCCD", 256);
	
	System.out.println("CARATTERISTICHE CELLULARE");
	System.out.println("Codice: " + cellulare.getCodice());
	System.out.println("Nome: " + cellulare.getNome());
	System.out.println("Prezzo: " + cellulare.getPrezzo() + "€");
	System.out.println("Iva: " + cellulare.getIva() + "%");
	System.out.println("Prezzo iva inclusa: " + cellulare.getPrezzoIva());
	System.out.println("Codice imei: " + cellulare.getCodiceImei());
	System.out.println("Memoria: " + cellulare.getMemoria() + "GB");
	System.out.println("");
	
	Televisori tv = new Televisori("TV QNED", "LG", 949.00, 0.22, "65 pollici", "smarTv");
	
	System.out.println("CARATTERISTICHE TELEVISORE");    
    	System.out.println("Codice: " + tv.getCodice());
	System.out.println("Nome: " + tv.getNome());
	System.out.println("Prezzo: " + tv.getPrezzo() + "€");
	System.out.println("Iva: " + tv.getIva() + "%");
	System.out.println("Prezzo iva inclusa: " + tv.getPrezzoIva());
	System.out.println("Dimensioni: " + tv.getDimensioni());
	System.out.println("Tipologia: " + tv.getSmartTv());
	System.out.println("");
	
	Cuffie auricolari = new Cuffie("JBL T510BT", "JBL", 49.99, 0.22, "Blu", "Wireless");
	
	System.out.println("CARATTERISTICHE CUFFIE");    
    	System.out.println("Codice: " + auricolari.getCodice());
	System.out.println("Nome: " + auricolari.getNome());
	System.out.println("Prezzo: " + auricolari.getPrezzo() + "€");
	System.out.println("Iva: " + auricolari.getIva() + "%");
	System.out.println("Prezzo iva inclusa: " + auricolari.getPrezzoIva());
	System.out.println("Colore: " + auricolari.getColore());
	System.out.println("Tipologia: " + auricolari.getWireless());
	
	
    }
    
    
}
