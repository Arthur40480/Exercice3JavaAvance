import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import fr.fms.data.*;
import fr.fms.entities.*;

public class Commande {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bonjour et bienvenue ! Combien êtes-vous ?");
		String errorMsg = "Veuillez saisir un nombre valable: ";
		validationService(scanner, 4, errorMsg);
	}
	
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
}
