package org.lessons.java.inheritance.shop;

public class Shop {

    public static void main(String[] args) {
	
	Smartphone cellulare = new Smartphone(null, null, 0, 0, null, 0);
	System.out.println(cellulare);
	System.out.println(" ");
	
	Televisori tv = new Televisori(null, null, 0, 0, null, null);
	System.out.println(tv);
	System.out.println(" ");
	
	Cuffie auricolari = new Cuffie(null, null, 0, 0, null, null);
	System.out.println(auricolari);
	System.out.println(" ");
	
    }
    
    
}
