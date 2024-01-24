package fr.fms.entities;

public class Drink extends Article{
	
	// Constructeurs:
	public Drink(String name, double price) {
		super(name, price);
	}
	
	// Méthode:
	public String toString() {
		return "Boisson : " + this.getName() + " - Prix : " + this.getPrice() + "€";
	}
}
