package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        Rectangle box2 = new Square(5);

        System.out.println("Area of Box 1 is: " + box1.getArea());
        System.out.println("Perimeter of Box 1 is: " + box1.getPerimeter());
        System.out.println("===~~~---~~~===~~~---~~~===");
        System.out.println("Area of Box 2 is: " + box2.getArea());
        System.out.println("Perimeter of Box 2 is: " + box2.getPerimeter());
    }

}
