package fr.fms.data;

import java.util.ArrayList;
import java.util.Arrays;

import fr.fms.entities.*;

public class Menu {
	// Méthode qui retourne la liste des entrées:
	public static ArrayList<Article> getEntry() {
		Entry salade = new Entry("Salade César", 7);
		Entry soupe = new Entry("Soupe aux Choux", 6.50);
		Entry quiche = new Entry("Quiche au thon", 7.60);
		Entry aucune = new Entry("Aucune", 0);
		
		ArrayList<Article> entryList = new ArrayList<>(Arrays.asList(salade, soupe, quiche, aucune));
		return entryList;
	}
	// Méthode qui retourne la liste des plats:
	public static ArrayList<Article> getDish() {
		Dish poulet = new Dish("Poulet Curry Coco", 12);
		Dish boeuf = new Dish("Boeuf Bourguignon", 14.5);
		Dish poisson = new Dish("Poisson du Jour", 14);
		Dish vegetarien = new Dish("Curry de Légume (Végétarien)", 11.90);
		Dish vegan = new Dish("Lentille à la Marocaine", 10.60);
		Dish aucun = new Dish("Aucun", 0);
		
		ArrayList<Article> dishList = new ArrayList<>(Arrays.asList(poulet, boeuf, poisson, vegetarien, vegan, aucun));
		return dishList;
	}
	// Méthode qui retourne la liste des accompagnements:
	public static ArrayList<Article> getSide() {
		Side riz = new Side("Riz thaï", 3.8);
		Side pates = new Side("Cannelloni", 4.2);
		Side frites = new Side("Frite à la graisse de boeuf", 4.7);
		Side legume = new Side("Légume de saison", 3.4);
		Side aucun = new Side("Aucun", 0);
		
		ArrayList<Article> sideList = new ArrayList<>(Arrays.asList(riz, pates, frites, legume, aucun));
		return sideList;
	}
	// Méthode qui retourne la liste des boissons:
	public static ArrayList<Article> getDrink() {
		Drink eau = new Drink("Eau plate", 2);
		Drink eauGazeuse = new Drink("Eau gazeuse", 2.6);
		Drink vin = new Drink("Vin (Au verre)", 3.5);
		Drink biere = new Drink("Bierre blonde (33cl)", 3);
		Drink soda = new Drink("Soda", 2.8);
		Drink aucune = new Drink("Aucune", 0);
		
		ArrayList<Article> drinkList = new ArrayList<>(Arrays.asList(eau, eauGazeuse, vin, biere, soda, aucune));
		return drinkList;
	}
	// Méthode qui retourne la liste des desserts:
	public static ArrayList<Article> getDessert() {
		Dessert tarte = new Dessert("Tarte aux fraises maison", 4.5);
		Dessert mousse = new Dessert("Mousse au chocolat", 4.9);
		Dessert tiramisu = new Dessert("Tiramisu", 4.3);
		Dessert salade = new Dessert("Salade de fruit de saison", 3.9);
		Dessert aucun = new Dessert("Aucun", 0);
		
		ArrayList<Article> dessertList = new ArrayList<>(Arrays.asList(tarte, mousse, tiramisu, salade, aucun));
		return dessertList;
	}
	// Méthode pour afficher un menu:
	public static void displayMenu(ArrayList<Article> articleList) {
		for(int i = 0; i < articleList.size(); i++) {
			System.out.print("[" + (i + 1) + " - " + articleList.get(i).getName() +"]");
		}
	}
}
