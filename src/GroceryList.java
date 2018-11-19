import util.Input;

import java.util.HashMap;
import java.util.Map;

public class GroceryList {
    public static void main(String[] args) {
        Input sc = new Input();
        HashMap<String,HashMap> gList = new HashMap<>();
        boolean isWholeSeller = false;


        System.out.println("Welcome to GrubLand! Let's make your list!");
        System.out.println("Would you like to get started?");
        boolean answer = sc.yesNo();
        while (answer) {
            int origLength = gList.size();
            System.out.println("Please select category of item...");
            System.out.println("1 - dairy");
            System.out.println("2 - produce");
            System.out.println("3 - bread");
            System.out.println("4 - eggs");
            System.out.println("5 - canned goods");
            System.out.println("6 - frozen foods");
            System.out.println("7 - beer and wine");
            System.out.println("8 - not actually food");
            int num = sc.getInteger(1,8);
            String category;
            switch (num) {
                case(1):
                    category = "Dairy";
                    break;
                case(2):
                    category = "Produce";
                    break;
                case(3):
                    category = "Bread";
                    break;
                case(4):
                    category = "Eggs";
                    break;
                case(5):
                    category = "Canned Goods";
                    break;
                case(6):
                    category = "Frozen Foods";
                    break;
                case(7):
                    category = "Beer and Wine";
                    break;
                default:
                    category = "Not Actually Food";
                    break;

            }
            sc.clear();
            System.out.println("Please give name of item...");
            String itemName = sc.getString();
            System.out.println("How many of this item were you wishing to purchase?");
            int numOfItems = sc.getInt();
            if (numOfItems >= 20 && !isWholeSeller) {
                System.out.println("Customer identified as whole-seller");
                isWholeSeller = true;
            }
            sc.clear();
            HashMap<String, Integer> catAndQuant = new HashMap<>();
            catAndQuant.putIfAbsent(category, numOfItems);
            gList.putIfAbsent(itemName, catAndQuant);
            if (origLength != gList.size()) {
                System.out.println("Item added!");
                boolean subAnswer = true;
                System.out.println("Add another item?");
                subAnswer = sc.yesNo();
                if (!subAnswer) {
                    System.out.println("Are you finished building your list?");
                    answer = sc.yesNo();
                    if (answer) {
                        System.out.println("Closing list builder...");
                        answer = false;
                    }
                } else {
                    System.out.println("Preparing list builder...");
                }
            } else {
                System.out.println("Item already on list...");
            }
        }
        System.out.println("List built! See you soon at GrubLand!");
        for (String item : gList.keySet()) {
            String kevin = gList.get(item).keySet().toString();
            int endPoint = kevin.length() - 1;
            kevin = kevin.substring(1, endPoint);
            String ted = gList.get(item).get(kevin).toString();
            System.out.println(item + " - " + kevin + " - " + ted);
        }
    }
}
