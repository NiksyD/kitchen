import java.util.Scanner;
import java.util.InputMismatchException;

public class Ingredients {
	static Scanner scanner = new Scanner(System.in);
	// APPETIZERS
	public static String lumpiangShanghai() {
	    return "{Ground pork, Spices, Sweet chili sauce}";
	}

	public static String kinilaw() {
	    return "{Fish, Spices, Lime, Ginger, Spices}";
	}

	public static String chicharonBulaklak() {
	    return "{Pork intestine, Vinegar}";
	}

	// SOUPS
	public static String sinigangNaBaboy() {
	    return "{Pork, Radish, Eggplant, String beans, Tamarind, Tomatoes, Onion, Salt, Pepper}";
	}

	public static String tinola() {
	    return "{Chicken, Green papaya, Malunggay leaves, Ginger, Onion, Garlic, Fish sauce, Salt, Pepper}";
	}

	public static String miswaSoup() {
	    return "{Miswa noodles, Chicken or pork, Garlic, Onion, Spinach, Salt, Pepper}";
	}

	// DESSERTS
	public static String lecheFlan() {
	    return "{Eggs, Sweetened Condensed Milk, Evaporated Milk, Sugar}";
	}

	public static String mangoFloat() {
	    return "{Ripe Mangoes, Graham Crackers, All-Purpose Cream, Condensed Milk}";
	}

	public static String bibingka() {
	    return "{Rice Flour, Sugar, Coconut Milk, Eggs}";
	}

    
    //	CALCS
	public static int missingIngCalc() {
		int count;
		while(true) {
			try {
				System.out.print("Enter how many ingredients are missing >> ");
				count = scanner.nextInt();
				scanner.nextLine();
				break;
			} catch(InputMismatchException e) {
				System.out.println("Invalid Input. Try Again!");
				scanner.next();
			}
		}
		return count;
	}
	
	public static String missingIng() {
		String missing;
		while(true) {
				System.out.println("Input missing ingredients eg..[Spices, 1kg]");
				System.out.println("(Click [Enter] if nothing is missing)");
				System.out.print(">> ");
				missing = scanner.nextLine();
				if(missing.isEmpty()) {
					System.out.println("No missing ingredients");
					break;
				} else {
					return missing;
				}
		}
		return missing;
	}
}
