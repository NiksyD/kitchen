import java.util.ArrayList;

public class Main extends Category {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> dishInventory = new ArrayList<>();
        boolean running = true;
        
        while (running) {
            String category = categoryPrompt();
            String dishName = null;
            String ingredients = null;
            
            if (category.equalsIgnoreCase("Appetizer")) {
            	
                String appetizer = showAppetizer();
                dishName = appetizer;
                
                if (appetizer.equalsIgnoreCase("Lumpiang Shanghai")) {
                    ingredients = lumpiangShanghai();
                } else if (appetizer.equalsIgnoreCase("Kinilaw")) {
                    ingredients = kinilaw();
                } else if (appetizer.equalsIgnoreCase("Chicharon Bulaklak")) {
                    ingredients = chicharonBulaklak();
                }
                
            } else if (category.equalsIgnoreCase("Soups")) {
            	
            	String soup = showSoups();
            	dishName = soup;
            	 if (soup.equalsIgnoreCase("Sinigang na Baboy")) {
                     ingredients = sinigangNaBaboy();
                 } else if (soup.equalsIgnoreCase("Tinola")) {
                     ingredients = tinola();
                 } else if (soup.equalsIgnoreCase("Miswa Soup")) {
                     ingredients = miswaSoup();
                 }
            	 
            } else if (category.equalsIgnoreCase("Desserts")) {
            	String dessert = showDesserts();
            	dishName = dessert;
            	 if (dessert.equalsIgnoreCase("Leche Flan")) {
                     ingredients = lecheFlan();
                 } else if (dessert.equalsIgnoreCase("Mango Float")) {
                     ingredients = mangoFloat();
                 } else if (dessert.equalsIgnoreCase("Bibingka")) {
                     ingredients = bibingka();
                 }
            }
            
            int missingCount = missingIngCalc();
            System.out.println();
            System.out.println(ingredients);
            ArrayList<String> dish = new ArrayList<>();
            dish.add(category);
            dish.add(dishName);
            dish.add(ingredients);
            
            // Collect missing ingredients
            for (int i = 0; i < missingCount; i++) {
                String missingIngredient = missingIng();
                if (!missingIngredient.isEmpty()) {
                    dish.add("Missing: " + missingIngredient);
                }
            }
            
            dishInventory.add(dish);
            
            running = yesNoContinue();
        }
        
        // Display all dishes with missing ingredients
        System.out.println("\nSummary of dishes with missing ingredients:");
        for (ArrayList<String> dish : dishInventory) {
            System.out.println("Category: " + dish.get(0));
            System.out.println("Dish: " + dish.get(1));
            System.out.println("Ingredients: " + dish.get(2));
            System.out.println("Missing Ingredients:");
            for (int i = 3; i < dish.size(); i++) {
                System.out.println("  - " + dish.get(i));
            }
            System.out.println();
        }
    }
}
