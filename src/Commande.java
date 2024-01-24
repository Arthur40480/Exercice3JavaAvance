import java.util.Scanner;

public class Commande {

	public static void main(String[] args) {
		// On déclare notre scanner :
		Scanner scanner = new Scanner(System.in);
		
		// On déclare nos variables Tableau de String / Tableau à plusieurs dimensions de String :
		String[] categories = {"Entrée", "Plat", "Accompagnement", "Boisson", "Dessert"};
		String[][] choices = {
				{"salade", "soupe", "quiche", "aucune"},
				{"poulet", "boeuf", "poisson", "végétarien", "vegan", "aucun"},
				{"riz", "pates", "frites", "legumes", "aucun"},
				{"eau plate", "eau gazeuse", "soda", "vin", "aucun"},
				{"tarte maison", "mousse au chocolat", "tiramisu", "aucun"}
		};
		
		// On récupère le nombre de menu:
		System.out.print("Bonjour, combien de menus souhaitez vous ? : ");
		
		// On assigne à notre variable la valeur retourner de notre méthode verification :
		// Integer.MAX_VALUE est une constante statique qui représente la valeur max que peut avoir un int :
		int nbrMenus = verification(scanner, Integer.MAX_VALUE, "Veuillez saisir un nombre valable : "); 
		
		// On boucle sur le nombre de menu:
		for(int i = 0; i < nbrMenus; i++) {
			String[] menuChoose = new String[categories.length];
			
			// On boucle sur le nombre de catégorie:
			for( int j = 0; j < categories.length; j++) {
				// On affiche les différents choix de la catégorie:
				displayList("Choix " + categories[j] + " :", choices[j]);
				// On viens ajouter chaque choix de l'utilisateur dans notre variable menuChoose:
				menuChoose[j] = choices[j][verification(scanner, choices[j].length, "Choisissez un choix valable (1 - " + choices.length + ") :") - 1];
			}
			// On affiche la commande qui viens d'être prise (menuChoose):
			displayCommand(i + 1, menuChoose);
						
		}
		
		scanner.close();	
	}
	
	// Méthode pour afficher les différents menus:
	public static void displayList(String titleChoice, String[] list) {
		
		// On affiche le titre :
		System.out.println(titleChoice);
		
		// On boucle sur le nombre de choix que contient la liste :
		for(int i = 0; i < list.length; i++) {
			
			// A chaque itération nous affichons le choix qui à l'indice i
			System.out.print("[" + (i + 1) + " - " + list[i].toUpperCase() + "]");
		}
		System.out.println();
	}
	
	// Méthode de test pour gérer les entrées utilisateurs :
	public static int verification(Scanner scanner, int maxValue, String errorMsg) {
		int numberChoice = 0;
		
		// On boucle tant que true :
		while(true) {
			// On test si la saisi est bien un nombre entier :
			if(scanner.hasNextInt()) { // SI oui :
				// On assigne la saisie de l'utilisateur a notre variable :
				numberChoice = scanner.nextInt();
				
				// Si on test la saisie pour le nombre de menu =>
				// On test si la saisie et superieur à 0 ET la variable maxValue est égale à Integer.MAX_VALUE :
				// Si on test la saisie pour le numéro du choix proposer =>
				// On test si la saisie et supérieur à 0 ET si elle est inférieur ou égale à la variable maxValue :
				if(numberChoice > 0 && maxValue == Integer.MAX_VALUE || numberChoice > 0 && numberChoice <= maxValue) { // SI oui :
					// On sort de la boucle
					break;
				}
				System.out.println(errorMsg);
			}else { // SINON :
				System.out.println(errorMsg);
				scanner.next();
			}
		}
		// On retourne le nombre saisie par l'utilisateur :
		return numberChoice;
	}
	
	// Méthode pour afficher la commande qui viens d'être prise :
	public static void displayCommand(int commandNumber, String[] command) {
		
		System.out.println("~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~");
		System.out.println("Résumé de la commande " + (commandNumber));
		System.out.println("[" + command[0] + ", " + command[1] + ", " + command[2] + ", " + command[3] + ", " + command[4] + "]");
		System.out.println("~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~");
	}

}
