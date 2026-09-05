public class CropScoreCalculator {

    public static int calculateRiceScore(
            String soilType,
            double ph,
            double temperature,
            double rainfall,
            String water) {

        int score = 0;

        if (soilType.equalsIgnoreCase("loamy") ||
            soilType.equalsIgnoreCase("clay")) {
            score += 20;
        }

        if (ph >= 5.5 && ph <= 7.0) {
            score += 20;
        }

        if (temperature >= 20 && temperature <= 35) {
            score += 20;
        }

        if (rainfall >= 600) {
            score += 20;
        }

        if (water.equalsIgnoreCase("high")) {
            score += 20;
        }

        return score;
    }

    public static void main(String[] args) {
        int riceScore = calculateRiceScore(
                "loamy", 6.5, 28, 750, "high");

        System.out.println("Rice Score: " + riceScore + "%");
    }
}
