package fr.fms.entities;

public class Side extends Article {
	
	// Constructeurs:
	public Side(String name, double price) {
		super(name, price);
	}
	
	// M�thode:
	public String toString() {
		return "Accompagnement : " + this.getName() + " - Prix : " + this.getPrice() + "�";
	}
}
