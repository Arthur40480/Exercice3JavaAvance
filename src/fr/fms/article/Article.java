package fr.fms.article;

public class Article {
	// Propri�t�s de classe:
	private String name;
	private double price;
	
	// Constructeur:
	public Article(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// M�thode:
	public String toString() {
		return "Article : " + this.name + " - Prix : " + this.price + "�";
	}
	
	// Accesseurs:
	public void setPrice(double price) {
		if(price < 0) {
			throw new IllegalArgumentException("Le prix ne peut �tre inf�rieur � 0� ");
		} else {
			this.price = price;
		}
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
}
