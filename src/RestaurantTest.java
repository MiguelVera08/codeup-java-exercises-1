public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish lasagna = new RestaurantDish();
        lasagna.setNameOfDish("Lasagna");
        lasagna.setCostInCents(850);
        lasagna.setWouldRecommend(true);
        System.out.println(lasagna.getNameOfDish());
        System.out.println(lasagna.getCostInCents());
        System.out.println(lasagna.getWouldRecommend());
        RestaurantDish.eat();

        RestaurantDish penne = new RestaurantDish("Penne Pasta with Alfredo Sauce", 650, false);
        System.out.println(penne.getNameOfDish());
        System.out.println(penne.getCostInCents());
        System.out.println(penne.getWouldRecommend());
    }
}
