public class Crop {
    String name;
    int suitability;
    String waterRequirement;

    void displayCrop() {
        System.out.println("Crop Name: " + name);
        System.out.println("Suitability: " + suitability + "%");
        System.out.println("Water Requirement: " + waterRequirement);
    }

    public static void main(String[] args) {
        Crop rice = new Crop();

        rice.name = "Rice";
        rice.suitability = 80;
        rice.waterRequirement = "High";

        rice.displayCrop();
    }
}
