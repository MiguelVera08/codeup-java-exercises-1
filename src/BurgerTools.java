public class BurgerTools {
    public static String mostPopularTopping = "Cheese";
    public static int averageDaysBeforeExpiration = 16;
    public static int temperatureWhenCooked = 160;

    public static void grill(){
        System.out.println("Grilling burger...");
    }

    public String burgerName;
    public int priceInCents;
    public int calorieCount;

    public BurgerTools () {}

    public BurgerTools (String burgerName, int priceInCents, int calorieCount) {
        this.burgerName = burgerName;
        this.priceInCents = priceInCents;
        this.calorieCount = calorieCount;
    }
}
