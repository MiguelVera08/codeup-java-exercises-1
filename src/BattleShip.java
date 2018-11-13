import java.util.Scanner;

public class BattleShip {
    private Scanner sc = new Scanner(System.in);

    public int oneOrTwo() {
        return (int) (Math.random() * 1) + 1;
    }

    private int oneThruTen() {
        return (int) (Math.random() * 9) + 1;
    }

    public String giveALetter() {
        int magicNumber = this.oneThruTen();
        switch (magicNumber) {
            case(1):
                return "A";
            case(2):
                return "B";
            case(3):
                return "C";
            case(4):
                return "D";
            case(5):
                return "E";
            case(6):
                return "F";
            case(7):
                return "G";
            case(8):
                return "H";
            case(9):
                return "I";
            default:
                return "J";
        }
    }


}
