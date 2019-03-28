package shapes;

public class Square extends Rectangle {

    public Square() { }

    public Square(int side){
        super(side, side);
    }

//    public Square(int side) {
//        this.side = side;
//    }

//    public int getArea() {
//        return (int) Math.pow(this.getLength(),2);
//    }
//
//    public int getPerimeter() {
//        return 4 * this.getLength();
//    }

    public int getSide() {
        return getLength();
    }

    public void setSide(int side) {
        this.setLength(side);
        this.setWidth(side);
    }

    public static void main(String[] args) {
        Square sq = new Square(3);
        System.out.println(sq.getPerimeter());
        System.out.println(sq.getArea());
    }
}
