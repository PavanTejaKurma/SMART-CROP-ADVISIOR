public class Groundnut extends Crop {
    @Override
    void display() {
        System.out.println("Groundnut");
        System.out.println("Water Requirement: Low-Medium");
        System.out.println("Duration: 100-120 days");
    }

    public static void main(String[] args) {
        Groundnut groundnut = new Groundnut();
        groundnut.display();
    }
}
