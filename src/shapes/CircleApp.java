package shapes;

public class CircleApp {
    public static void main(String[] args) {
        Circle fred = new Circle(7);
        System.out.println(fred.getArea());
        System.out.println(fred.getRadius());
        fred.setRadius(8.64);
        System.out.println(fred.getCircumference());
        System.out.println(fred.getRadius());
    }

}
