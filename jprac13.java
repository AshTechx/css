import java.util.Scanner;

public class ReadStringUsingScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Read a line of text
        System.out.println("You entered: " + input);
        scanner.close();
    }
}