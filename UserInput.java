import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Soil Type: ");
        String soil = sc.nextLine();

        System.out.print("Enter Soil pH: ");
        double ph = sc.nextDouble();

        System.out.print("Enter Farm Area: ");
        double area = sc.nextDouble();

        System.out.println("\nSoil Type : " + soil);
        System.out.println("Soil pH   : " + ph);
        System.out.println("Farm Area : " + area + " acres");

        sc.close();
    }
}
