package org.lessons.java.inheritance.shop;

public class Shop {

    public static void main(String[] args) {
	
	Smartphone smartphone1 = new Smartphone(null, null, 0, 0, null, 0);
	System.out.println(smartphone1);
	System.out.println(" ");
	
	Televisori televisori1 = new Televisori(null, null, 0, 0, null, null);
	System.out.println(televisori1);
	System.out.println(" ");
	
	Cuffie cuffie1 = new Cuffie(null, null, 0, 0, null, null);
	System.out.println(cuffie1);
	System.out.println(" ");
	
    }
    
    
}
