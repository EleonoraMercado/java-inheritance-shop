package org.lessons.java.inheritance.shop;

public class Smartphone extends Prodotto {
    
    private String codiceImei;
    private int memoria;
    
    public Smartphone(String nome, String marca, double prezzo, double iva, String codiceImei, int memoria) {
	super (nome, marca, prezzo, iva);
	this.codiceImei = codiceImei;
	this.memoria = memoria;
	
    }
    
    public String getCodiceImei() {
    return codiceImei;
    }
    
    
    public int getMemoria() {
	return memoria;
    }
    
    public void setMemoria(int memoria) {
	this.memoria = memoria;
    }
    
    
    @Override
    public String toString() {
	return super.toString() + 
	", Codice Imei=" + codiceImei + ", Memoria=" + memoria;
    }
    

}
