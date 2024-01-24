package fr.fms.entities;

import java.util.ArrayList;

public class Order {
	// Propri�t�s de classe:
	private ArrayList<Article> articleList;
	private double totalPrice;
	private static int nextId = 1;
	private int id = 1;
	
	// Constructeurs:
	public Order(ArrayList<Article> articleList, double totalPrice) {
		this.articleList = articleList;
		this.totalPrice = calculateTotalPrice(articleList);
		this.id = nextId;
		nextId++;
	}
	
	// M�thode:
	private double calculateTotalPrice(ArrayList<Article> articleList) {
		double total = 0;
		for(Article article : articleList) {
			total = total + article.getPrice();
		}
		return total;
	}
	
	public String toString() {
		if(this.articleList.size() == 0) {
			return "La commande num�ro " + getId() + " est vide !";
		} else {
			return "Commande num�ro " + getId() + " - Co�t total : " + getTotalPrice();
		}
	}
	// Accesseurs:
	public ArrayList<Article> getArticleList() {
		return articleList;
	}

	public void setArticleList(ArrayList<Article> articleList) {
		this.articleList = articleList;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		if(totalPrice < 0) {
			throw new IllegalArgumentException("Le co�t total de la commande ne peut �tre inf�rieur � 0�");
		} else {
			this.totalPrice = totalPrice;
		}
	}
	
	public int getId() {
		return id;
	}
	// On retire le setter de l'id pour pas que celui-ci soit modifiable.
	//	public void setId(int id) {
	//		this.id = id;
	//	}
}
