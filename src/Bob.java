import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey, my name is Bob... My mom said you wanted to talk to me about something. Whatever... " +
                "\nLet's get this over with...");
        String response = " ";
        while (!response.equalsIgnoreCase("QUIT")) {
            System.out.println("Lay it on me...");
            response = sc.nextLine();
            if (response.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (response.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (response.endsWith("?")) {
                System.out.println("Sure.");
            } else if (response.equalsIgnoreCase("QUIT")) {
                System.out.println("Finally...");
            } else {
                System.out.println("Whatever.");
            }
        }
        System.out.println("I'm out of here...");
    }
}
