public class StringComparison {
    public static void main(String[] args) {
        String soilType = "Loamy";

        if (soilType.equalsIgnoreCase("loamy")) {
            System.out.println("Loamy soil selected.");
        }

        String water = "High";

        if (water.equalsIgnoreCase("high")) {
            System.out.println("High water availability.");
        }
    }
}
