import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import fr.fms.data.*;
import fr.fms.entities.*;

public class Commande {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] categories = {"Entrée", "Plat", "Accompagnement", "Boisson", "Dessert"};
		ArrayList<ArrayList<Article>> listMenu = new ArrayList<>();
		listMenu.add(Menu.getEntry());
		listMenu.add(Menu.getDish());
		listMenu.add(Menu.getSide());
		listMenu.add(Menu.getDrink());
		listMenu.add(Menu.getDessert());
		
		System.out.println("Bonjour et bienvenue ! Combien êtes-vous ?");
		int nbrMenu = validationService(scanner, Integer.MAX_VALUE, "Veuillez saisir un nombre valable: ");
		takeOrder(scanner, nbrMenu, listMenu, categories);
	}
	
	// Méthode qui vérifie les entrées saisie par l'utilisateur:
	public static int validationService(Scanner scanner, int maxValue, String errorMsg) {
		int userChoice = 0;
		
		while(true) {
			try {
				userChoice = scanner.nextInt();
				if(userChoice > 0 && userChoice < maxValue) {
					break;
				} else {
					System.out.print(errorMsg);
				}
			} catch(InputMismatchException e) {
				System.out.print("Erreur : Entrée invalide. Veuillez entrer un nombre entier: ");
				scanner.next();
			}
		}
		return userChoice;
	}
	
	// Méthode qui permet de prendre une commande
	public static void takeOrder(Scanner scanner, int nbrMenu, ArrayList<ArrayList<Article>> listMenu, String[] categories) {
		Order order = new Order();
		
		for(int i = 0; i < nbrMenu; i++) {	
			for(int j = 0; j < listMenu.size(); j++) {
				System.out.println("------  " + categories[j] + "  ------");
				Menu.displayMenu(listMenu.get(j));
				System.out.print("Veuillez saisir votre choix : ");
				int userChoice = validationService(scanner, listMenu.get(j).size(), "Veuillez saisir un choix valable: ");
				order.addArticle(listMenu.get(j).get(userChoice - 1));;
				System.out.println();
			}
			
			System.out.println(order);
			System.out.println("Voici votre commande :");
			System.out.println(order.getArticleList());
			System.out.println(order.getTotalPrice());
		}
	}
}
