import java.util.Scanner;

public class TextUtilityTool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to Text Utility Tool");

        while (running) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Count characters");
            System.out.println("2. Exit");
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
}