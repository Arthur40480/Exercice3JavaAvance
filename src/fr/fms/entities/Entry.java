package fr.fms.entities;

public class Entry extends Article {
	
	// Constructeurs:
	public Entry(String name, double price) {
		super(name, price);
	}
	
	// Méthode:
	public String toString() {
		return "Entrée : " + this.getName() + " - Prix : " + this.getPrice() + "€";
	}
}
