import java.util.Scanner;

public class AsciiArtGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to ASCII Art Generator!");
        System.out.println("Choose a shape: ");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Diamond");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                drawTriangle();
                break;
            case 2:
                drawSquare();
                break;
            case 3:
                drawDiamond();
                break;
            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
        }

        scanner.close();
    }

    private static void drawTriangle() {
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/____\\");
    }

    private static void drawSquare() {
        System.out.println(" ______");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|______|");
    }

    private static void drawDiamond() {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }
}
