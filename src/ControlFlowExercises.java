import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i < 15) {
//            i++;
//            System.out.println(i);
//        }

//        double counter = 2;
//        do {
//            counter = Math.pow(counter, 2);
//            System.out.printf("%n%.0f", counter);
//        } while (counter < 65536);

        for (int i = 4; i <= 15; i++) {
            System.out.println(i);
        }

        System.out.println("---------------------------------------");

        for (double counter = 2; counter < 1000000; counter = Math.pow(counter, 2)) {
            System.out.printf("%n%.0f", counter);
        }
        System.out.println(" ");
        System.out.println("---------------------------------------");

        for (int i = 1; i < 101; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("---------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("What number should we go up to?");
        double userNum = sc.nextDouble();
        System.out.println("number|squared|cubed ");
        System.out.print("\n------|-------|------");
        for (double i = 1; i<=userNum; i++) {
            System.out.printf("%n%-5.0f |%-6.0f |%.0f", i, Math.pow(i,2), Math.pow(i,3));
        }
        System.out.println(" ");
        System.out.println("Want to continue? [Y/N]");
        String answer = sc.next();
        while (answer.equalsIgnoreCase("y")) {
            System.out.println("What number should we go up to?");
            double newNum = sc.nextDouble();
            System.out.println("number|squared|cubed ");
            System.out.print("\n------|-------|------");
            for (double i = 1; i<=newNum; i++) {
                System.out.printf("%n%-5.0f |%-6.0f |%.0f", i, Math.pow(i,2), Math.pow(i,3));
            }
            System.out.println(" ");
            System.out.println("Want to continue? [Y/N]");
            answer = sc.next();
        }

        System.out.println("---------------------------------------");

        System.out.println("Enter a number between 0-100:");
        int grade = sc.nextInt();
        if (grade > 87) {
            System.out.println("User gets an A!");
        } else if (grade > 79) {
            System.out.println("User gets a B.");
        } else if (grade > 67) {
            System.out.println("User gets a C...");
        } else if (grade > 59) {
            System.out.println("User gets a D......");
        } else {
            System.out.println("User is a failure in the game of life...");
        }
    }
}
