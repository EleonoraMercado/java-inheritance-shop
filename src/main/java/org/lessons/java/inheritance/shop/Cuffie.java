package org.lessons.java.inheritance.shop;

public class Cuffie extends Prodotto {
    
    private String colore;
    private String wireless;
    
    
    public Cuffie(String nome, String marca, double prezzo, double iva, String colore, String wireless) {
    	super(nome, marca, prezzo, iva);
    	this.colore = colore;
    	this.wireless = wireless;
    }
    
    public String getColore() {
	return colore;
    }
    
    public String setColore() {
	return colore;
    }
    
    public String getWireless() {
	return wireless;
    }
    
    public String setWireless() {
	return wireless;
    }
    
    
}
