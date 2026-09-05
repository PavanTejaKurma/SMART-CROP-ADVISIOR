public class CropConditions {
    public static void main(String[] args) {
        double temperature = 28;
        double rainfall = 700;

        if (temperature >= 20 && temperature <= 35) {
            System.out.println("Temperature is suitable for Rice.");
        } else {
            System.out.println("Temperature is not suitable for Rice.");
        }

        if (rainfall >= 600) {
            System.out.println("Rainfall is suitable for Rice.");
        } else {
            System.out.println("Additional irrigation may be required.");
        }
    }
}
