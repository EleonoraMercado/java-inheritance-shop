package org.lessons.java.inheritance.shop;

public class Shop {

    public static void main(String[] args) {
	
	Smartphone smartphone1 = new Smartphone("Galaxy S21", "Samsung", 800, 22, "123456789ABCDEF", 256);
	System.out.println(smartphone1);
	System.out.println(" ");
	
	Televisori televisori1 = new Televisori("OLED55B9", "LG", 1200, 22, "55 polici", "Smart tv");
	System.out.println(televisori1);
	System.out.println(" ");
	
	Cuffie cuffie1 = new Cuffie("WH-1000XM4", "Sony", 350, 22, "Blu", "Wireless");
	System.out.println(cuffie1);
	System.out.println(" ");
	
    }
    
    
}
