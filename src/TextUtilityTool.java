import java.util.Scanner;

public class TextUtilityTool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to Text Utility Tool");

        while (running) {
System.out.println("\nPlease choose an option:");
            System.out.println("1. Count characters");
            System.out.println("2. Reverse text");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    String text = scanner.nextLine();
                    System.out.println("Number of characters: " + countCharacters(text));
                    break;

                case 2:
                    System.out.print("Enter text: ");
                    String reverseText = scanner.nextLine();
                    System.out.println("Reversed text: " + reverseText(reverseText));
                    break;

                case 3:
                    running = false;
                    System.out.println("Thank you for using the tool.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static int countCharacters(String text) {
        return text.length();
    }

    public static String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}