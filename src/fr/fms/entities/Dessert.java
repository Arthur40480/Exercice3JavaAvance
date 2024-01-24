package fr.fms.entities;

public class Dessert extends Article {
	
	// Constructeurs:
	public Dessert(String name, double price) {
		super(name, price);
	}
	
	// Méthode:
	public String toString() {
		return "Dessert : " + this.getName() + " - Prix : " + this.getPrice() + "€";
	}
}
