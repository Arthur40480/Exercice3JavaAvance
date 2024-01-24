package fr.fms.entities;

public class Dish extends Article {
	
	// Constructeurs:
	public Dish(String name, double price) {
		super(name, price);
	}
	
	// Méthode:
	public String toString() {
		return "Plat : " + this.getName() + " - Prix : " + this.getPrice() + "€";
	}
}
