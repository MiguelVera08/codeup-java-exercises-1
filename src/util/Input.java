package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
         this.scanner = new Scanner(System.in);
    }

    public void clear() {
        this.scanner.nextLine();
    }

    public String getString() {
        System.out.println("Input string...");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Yes or No?");
        String input = this.scanner.nextLine();
        input = input.toLowerCase();
        switch(input) {
            case ("no"):
                return false;
            case ("n"):
                return false;
            case ("nope"):
                return false;
            case ("denied"):
                return false;
            case ("uh uh"):
                return false;
            case ("yes"):
                return true;
            case ("y"):
                return true;
            case ("yep"):
                return true;
            case ("sure"):
                return true;
            case ("si"):
                return true;
            case ("uh huh"):
                return true;
            case ("approved"):
                return true;
            case ("maybe"):
                System.out.println("Ain't you cute?");
                return yesNo();
            default:
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

    public int getIntegerSecret(int min, int max) {
        int input;
        do {
            System.out.println("Enter a number between " + min + " and " + (max - 1) + ".");
            input = this.scanner.nextInt();
            if (input < min || input > max) {
                System.out.println("Input invalid");
            }
        } while (input < min || input > max);
        System.out.println("Input acceptable");
        return input;
    }

    public int getInt() {
        System.out.println("Input number...");
        if(!this.scanner.hasNextInt()) {
            System.out.println("Invalid. Input not an integer. Try again.");
            this.scanner.nextLine();
            return getInt();
        } else {
            return this.scanner.nextInt();
        }
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
        System.out.println("Input number...");
        if(!this.scanner.hasNextDouble()) {
            System.out.println("Invalid. Input not a double. Try again.");
            this.scanner.nextLine();
            return getDouble();
        } else {
            return this.scanner.nextDouble();
        }
    }
}
