package Project;

import java.util.Scanner;

public class SmartCropAdvisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("        SMART CROP ADVISOR");
        System.out.println("======================================");

        System.out.print("Enter Soil Type (loamy/clay/sandy): ");
        String soilType = sc.nextLine();

        System.out.print("Enter Soil pH: ");
        double ph = sc.nextDouble();

        System.out.print("Enter Nitrogen (N): ");
        double nitrogen = sc.nextDouble();

        System.out.print("Enter Phosphorus (P): ");
        double phosphorus = sc.nextDouble();

        System.out.print("Enter Potassium (K): ");
        double potassium = sc.nextDouble();

        System.out.print("Enter Temperature (°C): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter Humidity (%): ");
        double humidity = sc.nextDouble();

        System.out.print("Enter Rainfall (mm): ");
        double rainfall = sc.nextDouble();

        System.out.print("Enter Farm Area (acres): ");
        double area = sc.nextDouble();

        System.out.print("Enter Water Availability (low/medium/high): ");
        String water = sc.next();

        System.out.print("Enter Season (kharif/rabi): ");
        String season = sc.next();

        System.out.println("\n======================================");
        System.out.println("       CROP RECOMMENDATION");
        System.out.println("======================================");

        int riceScore = 0;
        if (soilType.equalsIgnoreCase("loamy") ||
            soilType.equalsIgnoreCase("clay")) riceScore += 20;
        if (ph >= 5.5 && ph <= 7.0) riceScore += 20;
        if (temperature >= 20 && temperature <= 35) riceScore += 20;
        if (rainfall >= 600) riceScore += 20;
        if (water.equalsIgnoreCase("high")) riceScore += 20;

        int maizeScore = 0;
        if (soilType.equalsIgnoreCase("loamy")) maizeScore += 20;
        if (ph >= 5.5 && ph <= 7.5) maizeScore += 20;
        if (temperature >= 18 && temperature <= 32) maizeScore += 20;
        if (rainfall >= 500 && rainfall <= 1000) maizeScore += 20;
        if (water.equalsIgnoreCase("medium") ||
            water.equalsIgnoreCase("high")) maizeScore += 20;

        int groundnutScore = 0;
        if (soilType.equalsIgnoreCase("sandy") ||
            soilType.equalsIgnoreCase("loamy")) groundnutScore += 20;
        if (ph >= 5.5 && ph <= 7.0) groundnutScore += 20;
        if (temperature >= 20 && temperature <= 30) groundnutScore += 20;
        if (rainfall >= 400 && rainfall <= 800) groundnutScore += 20;
        if (water.equalsIgnoreCase("low") ||
            water.equalsIgnoreCase("medium")) groundnutScore += 20;

        System.out.println("\nRice       : " + riceScore + "%");
        System.out.println("Maize      : " + maizeScore + "%");
        System.out.println("Groundnut  : " + groundnutScore + "%");

        String bestCrop;
        int bestScore;

        if (riceScore >= maizeScore && riceScore >= groundnutScore) {
            bestCrop = "Rice";
            bestScore = riceScore;
        } else if (maizeScore >= riceScore &&
                   maizeScore >= groundnutScore) {
            bestCrop = "Maize";
            bestScore = maizeScore;
        } else {
            bestCrop = "Groundnut";
            bestScore = groundnutScore;
        }

        System.out.println("\n======================================");
        System.out.println("             BEST CROP");
        System.out.println("======================================");

        System.out.println("Recommended Crop : " + bestCrop);
        System.out.println("Suitability      : " + bestScore + "%");
        System.out.println("Farm Area        : " + area + " acres");

        if (bestCrop.equals("Rice")) {
            System.out.println("Growing Duration : 120-150 days");
            System.out.println("Water Requirement: High");
        } else if (bestCrop.equals("Maize")) {
            System.out.println("Growing Duration : 90-120 days");
            System.out.println("Water Requirement: Medium");
        } else {
            System.out.println("Growing Duration : 100-120 days");
            System.out.println("Water Requirement: Low-Medium");
        }

        System.out.println("\nNote: This is decision-support guidance,");
        System.out.println("not a guaranteed prediction of yield or profit.");

        sc.close();
    }
}
