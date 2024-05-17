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
    
    public void setColore(String nuovoColore) {
	this.colore = nuovoColore;
    }
    
    public String getWireless() {
	return wireless;
    }
    
    public void setWireless(String nuovoWireless) {
	this.wireless = nuovoWireless;
    }
   
    @Override
    public String toString() {
	return super.toString() + 
		", Colore=" + colore + ", Wireless" + wireless;
    }
    
}
