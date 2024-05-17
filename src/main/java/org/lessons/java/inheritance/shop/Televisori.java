package org.lessons.java.inheritance.shop;

public class Televisori extends Prodotto {
    private String dimensioni;
    private String smartTv;
    
    //costruttore
    public Televisori(String nome, String marca, double prezzo, double iva, String dimensioni, String smartTv) {
	super (nome, marca, prezzo, iva);
	this.dimensioni = dimensioni;
	this.smartTv = smartTv;
	
    }
    
    public String getDimensioni() {
	return dimensioni;
    }
    
    public void setDimensioni(String nuoveDimensioni) {
	this.dimensioni = nuoveDimensioni;
    }
    
    public String getSmartTv() {
	return smartTv;
    }
    
    public void setSmartTv(String nuovoSmartTv) {
	this.smartTv = nuovoSmartTv;
    }
    
    @Override
    public String toString() {
	return super.toString() + 
		", Dimensioni=" + dimensioni + ", SmartTv" + smartTv;
    }
    
}
