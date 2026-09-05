import java.util.Scanner;
import java.util.InputMismatchException;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Soil pH: ");
            double ph = sc.nextDouble();

            if (ph < 0 || ph > 14) {
                throw new IllegalArgumentException(
                    "pH must be between 0 and 14.");
            }

            System.out.println("Valid pH: " + ph);

        } catch (InputMismatchException e) {
            System.out.println("Please enter a numeric value.");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
