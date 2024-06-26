package org.lessons.java.inheritance.shop;

import java.util.Random;

public class Prodotto {
 
     int codice;
     private String nome;
     private String marca;
     private double prezzo;
     private double iva;
     
     //Costruttore
     public Prodotto(String nome, String marca, double prezzo, double iva) { 
     
         this.codice = codiceRandom();
         this.nome = nome;
         this.marca = marca;
         this.prezzo = prezzo;
         this.iva = iva;
     }
     
     //Getter e Setter
     public int getCodice() {
         return codice;
     }
     
     public String getNome() {
         return nome;
     }
     
     public void setNome(String nuovoNome ) {
	 this.nome = nuovoNome;
     }
     
     public String getMarca() {
         return marca;
     }
     
     public void setMarca(String nuovaMarca) {
         this.marca = nuovaMarca;
     }
     
     public double getPrezzo() {
         return prezzo;
     }
     
     public void setPrezzo(double nuovoPrezzo) {
          this.prezzo = nuovoPrezzo;
     }
     
     public double getIva() {
         return iva;
     }
     
     public void setIva(double nuovaIva) {
          this.iva = nuovaIva;
     }
     
   //Metodo prezzo+iva
     public String getPrezzoIva() {
	 double prezzoConIva = prezzo * (1 + iva / 100);
 	return String.format("%.2f", prezzoConIva);
     }
     
     //metodo per il codice random
     private int codiceRandom() {
		Random random = new Random();
		return random.nextInt(90000000) + 10000000;
	    }
     
     public void messaggioSceltaUtente() {
	 System.out.println("Il prodotto che hai scelto è nel carrello!\n"
		 + "ora puoi proseguire con i tuoi acquisti.");
     }

    @Override
    public String toString() {
	return "Prodotto codice=" + codice + ", nome=" + nome 
		+ ", marca=" + marca + ", prezzo=" + prezzo + ", iva="
		+ iva;
    }
    
     
     
}
