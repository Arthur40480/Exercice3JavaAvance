package fr.fms.entities;

public class Dessert extends Article {
	
	// Constructeurs:
	public Dessert(String name, double price) {
		super(name, price);
	}
	
	// M�thode:
	public String toString() {
		return this.getName() + " - " + this.getPrice() + "�";
	}
}
