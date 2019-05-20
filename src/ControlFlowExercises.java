import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i < 15) {
//            System.out.println(i++);
//        }
//
//        double countNum = 2;
//        do {
//            countNum = Math.pow(countNum, 2);
//            System.out.printf("%n%.0f", countNum);
//        } while (countNum < 65536);

        for (int j = 4; j <= 15; j++) {
            System.out.println(j);
        }

        System.out.println("---------------------------------------");

        for (int counter = 2; counter < 1000000; counter = (int) Math.pow(counter, 2)) {
            System.out.printf("%n%d", counter);
        }
        System.out.println(" ");
        System.out.println("---------------------------------------");

        for (int k = 1; k < 101; k++) {
            if (k % 5 == 0 && k % 3 == 0) {
                System.out.println("Fizzbuzz");
            } else if (k % 3 == 0) {
                System.out.println("Fizz");
            } else if (k % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(k);
            }
        }

        System.out.println("---------------------------------------");

        Scanner sc = new Scanner(System.in);
        String answer;
         do {
            System.out.println("What number should we go up to?");
            double newNum = sc.nextDouble();
            System.out.println("number|squared|cubed ");
            System.out.print("\n------|-------|------");
            for (double w = 1; w<=newNum; w++) {
                System.out.printf("%n%-5.0f |%-6.0f |%.0f", w, Math.pow(w,2), Math.pow(w,3));
            }
            System.out.println(" ");
            System.out.println("Want to continue? [Y/N]");
            answer = sc.next();
        } while (answer.equalsIgnoreCase("y"));

        System.out.println("---------------------------------------");

        System.out.println("Enter a number between 0-100:");
        int grade = sc.nextInt();
        if (grade > 87) {
            System.out.println("User gets an A!");
        } else if (grade > 79) {
            System.out.println("User gets a B.");
        } else if (grade > 67) {
            System.out.println("User gets a C.");
        } else if (grade > 59) {
            System.out.println("User gets a D.");
        } else {
            System.out.println("User gets an F...");
        }
    }
}
