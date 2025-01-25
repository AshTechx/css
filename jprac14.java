import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadStringUsingBufferedReader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a line of text: ");
        try {
            String input = reader.readLine(); // Read a line of text
            System.out.println("You entered: " + input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}