package fr.fms.entities;

public class Entry extends Article {
	
	// Constructeurs:
	public Entry(String name, double price) {
		super(name, price);
	}
	
	// M�thode:
	public String toString() {
		return "Entr�e : " + this.getName() + " - Prix : " + this.getPrice() + "�";
	}
}
