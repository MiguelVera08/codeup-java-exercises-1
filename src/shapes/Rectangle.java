package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (2*length) + (2*width);
    }

    public Rectangle() { }

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
