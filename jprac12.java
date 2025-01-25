public class SumCommandLineArgs {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg); // Convert string to integer and add to sum
        }
        System.out.println("Sum of command line arguments: " + sum);
    }
}