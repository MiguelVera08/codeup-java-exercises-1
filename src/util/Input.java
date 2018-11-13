package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
         this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String input = this.scanner.nextLine();
        if (input.equalsIgnoreCase("No") || input.equalsIgnoreCase("n")) {
            return false;
        } else if (input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("y")) {
            return true;
        } else {
            return yesNo();
        }
    }

    public int getInteger(int min, int max) {
        int input;
        do {
            System.out.println("Enter a number between " + min + " and " + max + ".");
            input = this.scanner.nextInt();
            if (input < min || input > max) {
                System.out.println("Input invalid");
            }
        } while (input < min || input > max);
        System.out.println("Input acceptable");
        return input;
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double input;
        do {
            System.out.println("Enter a number between " + min + " and " + max + ".");
            input = this.scanner.nextDouble();
            if (input < min || input > max) {
                System.out.println("Input invalid");
            }
        } while (input < min || input > max);
        System.out.println("Input acceptable");
        return input;
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }
}
