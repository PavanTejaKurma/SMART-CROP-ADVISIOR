public class Maize extends Crop {
    @Override
    void display() {
        System.out.println("Maize");
        System.out.println("Water Requirement: Medium");
        System.out.println("Duration: 90-120 days");
    }

    public static void main(String[] args) {
        Maize maize = new Maize();
        maize.display();
    }
}
