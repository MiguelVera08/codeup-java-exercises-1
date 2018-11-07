import java.util.Scanner;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class CodeupExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f", pi);

//        System.out.print("\nEnter an integer: ");
//        int userInput = scanner.nextInt();
//
//        System.out.printf("You entered: --> \"%s\" <--", userInput);

//        System.out.print("\nEnter 3 words: ");
//        String userInput = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//
//        System.out.printf("You entered: --> \"%s, %s, %s\" <--", userInput, userInput2, userInput3);

//        System.out.print("\nEnter a sentence: ");
//        String userInput = scanner.nextLine();
//
//        System.out.printf("You entered: --> \"%s\" <--", userInput);

        System.out.print("\nEnter in length:");
        float length = scanner.nextFloat();
        System.out.print("\nEnter in width:");
        float width = scanner.nextFloat();
        System.out.print("\nEnter in height:");
        float height = scanner.nextFloat();
        System.out.printf("\nThe perimeter of the room is %.2f.\nThe Area of the room is %.2f." +
                "\nThe volume of the room is %.2f",
                (length*2)+(width*2), length*width, length*width*height);
    }
}
