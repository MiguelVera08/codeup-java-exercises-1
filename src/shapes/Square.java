package shapes;

public class Square extends Rectangle {
    private int side;

    public Square() { }

    public Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return (int) Math.pow(this.side,2);
    }

    public int getPerimeter() {
        return 4 * this.side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
