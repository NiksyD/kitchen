import java.util.Scanner;

public class Category extends Ingredients{
	static Scanner scanner = new Scanner(System.in);
	static String dishesArr[][] = {
			{"Lumpiang Shanghai", "Kinilaw", "Chicharon Bulaklak"}, {"Sinigang na Baboy", "Tinola", "Miswa Soup"}, {"Leche Flan", "Mango Float", "Bibingka"}
	};
	
	public static String categoryPrompt() {
		String categoryArr[] = {
				"Appetizer", "Soups", "Desserts"
		};
		
		String category;
		while(true) {
			System.out.println(">> SELECT CATEGORY <<");
			System.out.println("[Appetizer], [Soups], [Desserts]");
			System.out.print(">> ");
			category = scanner.nextLine();
			if(category.isEmpty() || category.equalsIgnoreCase(categoryArr[0]) || category.equalsIgnoreCase(categoryArr[1]) || category.equalsIgnoreCase(categoryArr[2])) {
				return category;
			} else {
				System.out.println("Invalid Input. Try Again!");
			}
		}
	}
	
	public static String showAppetizer() {
		
		String appetizer;
		while(true) {
			System.out.println(">> SHOW APPETIZER DISHES <<");
			System.out.println("[Lumpiang Shanghai], [Kinilaw], [Chicharon Bulaklak]");
			System.out.print(">> ");
			appetizer = scanner.nextLine();
			if(appetizer.isEmpty() || appetizer.equalsIgnoreCase(dishesArr[0][0]) || appetizer.equalsIgnoreCase(dishesArr[0][1]) || appetizer.equalsIgnoreCase(dishesArr[0][2])) {
				return appetizer;
			} else {
				System.out.println("Invalid Input. Try Again!");
			}
		}
	}
	
	public static String showSoups() {
		
		String appetizer;
		while(true) {
			System.out.println(">> SHOW SOUP DISHES <<");
			System.out.println("[Sinigang na Baboy], [Tinola], [Miswa Soup]");
			System.out.print(">> ");
			appetizer = scanner.nextLine();
			if(appetizer.isEmpty() || appetizer.equalsIgnoreCase(dishesArr[1][0]) || appetizer.equalsIgnoreCase(dishesArr[1][1]) || appetizer.equalsIgnoreCase(dishesArr[1][2])) {
				return appetizer;
			} else {
				System.out.println("Invalid Input. Try Again!");
			}
		}
	}
	
	public static String showDesserts() {
		
		String dessert;
		while(true) {
			System.out.println(">> SHOW DESSERTS DISHES <<");
			System.out.println("[Leche Flan], [Mango Float], [Bibingka]");
			System.out.print(">> ");
			dessert = scanner.nextLine();
			if(dessert.isEmpty() || dessert.equalsIgnoreCase(dishesArr[2][0]) || dessert.equalsIgnoreCase(dishesArr[2][1]) || dessert.equalsIgnoreCase(dishesArr[2][2])) {
				return dessert;
			} else {
				System.out.println("Invalid Input. Try Again!");
			}
		}
	}
	
	
	public static boolean yesNoContinue() {
		 while(true) {
        	 System.out.print("Would you like to continue? Yes/No >> ");
             String select = scanner.nextLine();
             System.out.println();

             if (select.equalsIgnoreCase("No")) {
            	 System.out.println("Program terminated...");
            	 return false;
             } else if (select.equalsIgnoreCase("Yes")) {
            	 return true;
             } else {
            	 System.out.println("Invalid Option.");
             }
             
        }
	}
	
}
