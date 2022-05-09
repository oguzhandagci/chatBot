import java.util.Locale;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = greeting(scanner);
        areYouSure(userName, scanner);
        userAge(scanner);
        numCounter(scanner);
        question(scanner);
    }

    public static String greeting(Scanner scanner) {
        System.out.println("Howdy!\n" +
                "What is your name?");
        return scanner.nextLine();
    }

    public static void areYouSure(String name, Scanner scanner) {
        System.out.println("Are you sure your name is " + name + " ?\n Yes / No");
        String response = scanner.nextLine();
        boolean isItYes = false;
        while (!isItYes) {
            if (response.equalsIgnoreCase("yes")) {
                isItYes = true;
            } else {
                System.out.println("What is your name?");
                name = scanner.nextLine();
                System.out.println("Are you sure your name is " + name + " ?\n Yes / No");
                response = scanner.nextLine();
            }
        }
    }

    public static void userAge(Scanner scanner) {
        System.out.println("Pick a number between 0-10");
        int response = Integer.parseInt(scanner.nextLine());
        if (response < 0) {
            System.out.println("You're 5 years old. You had to pick between 0 & 10 !");
        } else if (response <= 10) {
            System.out.println("I think you're 27 years old.");
        } else {
            System.out.println("You're 6 years old. You had to pick between 0 & 10 !");
        }
    }

    public static void numCounter(Scanner scanner) {
        System.out.println("Guess what? I can count! Enter a number and I will count ten  more!");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static void question(Scanner scanner) {
        System.out.println("""
                Which one of the following is not a programming language?
                 A) Python
                 B) Java
                 C) Apple
                 D) C""");
        String rightAnswer = "C";
        String userAnswer = scanner.nextLine();

        while (!rightAnswer.equalsIgnoreCase(userAnswer)) {
            System.out.println("You selected " + userAnswer + ". This was wrong :( Try again!");
            System.out.println("""
                    Which one of the following is not a programming language?
                     A) Python
                     B) Java
                     C) Apple
                     D) C""");
            userAnswer = scanner.nextLine();
        }
        System.out.println("Congrats Apple was right! You're a real programmer!");
    }
}