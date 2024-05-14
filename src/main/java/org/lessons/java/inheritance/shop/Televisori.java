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
    
    public String setDimensioni() {
	return dimensioni;
    }
    
    public String getSmartTv() {
	return smartTv;
    }
    
    public String setSmartTv() {
	return smartTv;
    }
    
    @Override
    public String toString() {
	return super.toString() + 
		", Dimensioni=" + dimensioni + ", SmartTv" + smartTv;
    }
    
}
