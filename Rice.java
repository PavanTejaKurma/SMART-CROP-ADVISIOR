public class Rice extends Crop {
    @Override
    void display() {
        System.out.println("Rice");
        System.out.println("Water Requirement: High");
        System.out.println("Duration: 120-150 days");
    }

    public static void main(String[] args) {
        Rice rice = new Rice();
        rice.display();
    }
}
