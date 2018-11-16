package shapes;

public class Circle extends Shape implements Measurable {
    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return this.radius * Math.PI * 2;
    }

    public double getCircumference() {
        return this.getPerimeter();
    }

    public double getArea() {
        return Math.PI * (Math.pow(this.radius, 2));
    }
}
