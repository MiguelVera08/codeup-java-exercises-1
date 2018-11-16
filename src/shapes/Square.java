package shapes;

public class Square extends Quadrilateral implements Measurable {

    public Square() { }

    public Square(double side) {
        this.length = side;
        this.width = side;
    }

    public double getArea() {
        return Math.pow(this.length,2);
    }

    public double getPerimeter() {
        return 4 * this.length;
    }

    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    public double getSide() {
        return this.length;
    }

}
