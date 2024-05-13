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
     
     public String setNome() {
         return nome;
     }
     
     public String getMarca() {
         return marca;
     }
     
     public String setMarca() {
         return marca;
     }
     
     public double getPrezzo() {
         return prezzo;
     }
     
     public double setPrezzo() {
         return prezzo;
     }
     
     public double getIva() {
         return iva;
     }
     
     public double setIva() {
         return iva;
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
     
     public void caratteristicheProdotto() {
	 System.out.println("Il prodotto " + nome + ":" + "/n" + "Marca: " + marca + "/n"
		 + "Prezzo: " + prezzo + "/n" + "Iva: " + iva + "/n");
     }
     
     
};
