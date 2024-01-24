package fr.fms.data;

import java.util.ArrayList;
import java.util.Arrays;

import fr.fms.entities.*;

public class Menu {
	// Liste des entrées:
	public static ArrayList<Entry> getEntry() {
		Entry salade = new Entry("Salade César", 7);
		Entry soupe = new Entry("Soupe aux Choux", 6.50);
		Entry quiche = new Entry("Quiche au thon", 7.60);
//		Entry aucune = new Entry("Aucune", 0);
		
		ArrayList<Entry> entryList = new ArrayList<>(Arrays.asList(salade, soupe, quiche));
		return entryList;
	}
	// Liste des plats:
	public static ArrayList<Dish> getDish() {
		Dish poulet = new Dish("Poulet Curry Coco", 12);
		Dish boeuf = new Dish("Boeuf Bourguignon", 14.5);
		Dish poisson = new Dish("Poisson du Jour", 14);
		Dish vegetarien = new Dish("Curry de Légume (Végétarien)", 11.90);
		Dish vegan = new Dish("Lentille à la Marocaine", 10.60);
//		Dish aucun = new Dish("Aucun", 0);
		
		ArrayList<Dish> dishList = new ArrayList<>(Arrays.asList(poulet, boeuf, poisson, vegetarien, vegan));
		return dishList;
	}
	// Liste des accompagnements:
	public static ArrayList<Side> getSide() {
		Side riz = new Side("Riz thaï", 3.8);
		Side pates = new Side("Cannelloni", 4.2);
		Side frites = new Side("Frite à la graisse de boeuf", 4.7);
		Side legume = new Side("Légume de saison", 3.4);
//		Side aucun = new Side("Aucun", 0);
		
		ArrayList<Side> sideList = new ArrayList<>(Arrays.asList(riz, pates, frites, legume));
		return sideList;
	}
	// Liste des boissons:
	public static ArrayList<Drink> getDrink() {
		Drink eau = new Drink("Eau plate", 2);
		Drink eauGazeuse = new Drink("Eau gazeuse", 2.6);
		Drink vin = new Drink("Vin (Au verre)", 3.5);
		Drink biere = new Drink("Bierre blonde (33cl)", 3);
		Drink soda = new Drink("Soda", 2.8);
//		Drink aucune = new Drink("Aucune", 0);
		
		ArrayList<Drink> drinkList = new ArrayList<>(Arrays.asList(eau, eauGazeuse, vin, biere, soda));
		return drinkList;
	}
	// Liste des desserts:
	public static ArrayList<Dessert> getDessert() {
		Dessert tarte = new Dessert("Tarte aux fraises maison", 4.5);
		Dessert mousse = new Dessert("Mousse au chocolat", 4.9);
		Dessert tiramisu = new Dessert("Tiramisu", 4.3);
		Dessert salade = new Dessert("Salade de fruit de saison", 3.9);
//		Dessert aucun = new Dessert("Aucun", 0);
		
		ArrayList<Dessert> dessertList = new ArrayList<>(Arrays.asList(tarte, mousse, tiramisu, salade));
		return dessertList;
	}
}
