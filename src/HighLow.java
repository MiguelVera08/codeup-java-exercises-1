import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        littleGameLoop();
    }

    public static int magicNum() {
        return (int) Math.floor(Math.random() * ((100 - 1) + 1) + 1);
    }

    public static String littleGame(int num1, int num2) {
        if (num1 > num2) {
            return "LOWER";
        } else if (num1 < num2) {
            return "HIGHER";
        } else {
            return "YOU GOT IT!";
        }
    }

    public static void littleGame () {
        Scanner sc = new Scanner (System.in);
        int magicNum = magicNum();
        int userNum = 0;
        int tries = 0;
        while (userNum != magicNum && tries < 10) {
            System.out.println("Guess a number between 1 and 100 You have " + (10 - tries) + " attempts left." );
            userNum = sc.nextInt();
            System.out.println(littleGame(userNum,magicNum));
            tries++;
        }
        if (tries == 10) {
            System.out.println("The magic number was: " + magicNum + ". You have ran out of guesses...");
        } else {
            System.out.println("Thank you so much for to playing my game! You took " + tries + " attempts.");
        }
    }

    public static void littleGameLoop() {
        Scanner sc = new Scanner (System.in);
        String answer;
        do {
            littleGame();
            System.out.println("Play again?");
            answer = sc.nextLine();
            while (!answer.equalsIgnoreCase("No") && !answer.equalsIgnoreCase("Yes")) {
                System.out.println("Please enter valid answer.");
                System.out.println("Play again?");
                answer = sc.nextLine();
            }
            if (answer.equalsIgnoreCase("Yes")) {
                System.out.println("Preparing game...");
            }
        } while(!answer.equalsIgnoreCase("No"));
        System.out.println("Program closed by user.");
    }
}
