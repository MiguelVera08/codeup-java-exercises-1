public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools turkey = new BurgerTools("Turkey Burger", 450, 560);

        BurgerTools bacon = new BurgerTools();
        bacon.burgerName = "Bacon Super Meat Burger";
        bacon.calorieCount = 780;
        bacon.priceInCents = 675;

        System.out.println(bacon.burgerName);
        System.out.println(turkey.burgerName);

        BurgerTools.grill();
    }
}
