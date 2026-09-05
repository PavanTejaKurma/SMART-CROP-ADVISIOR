public class Farm {
    private double area;
    private String soilType;

    public void setArea(double area) {
        if (area > 0) {
            this.area = area;
        }
    }

    public double getArea() {
        return area;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    public String getSoilType() {
        return soilType;
    }

    public static void main(String[] args) {
        Farm farm = new Farm();

        farm.setArea(5);
        farm.setSoilType("Loamy");

        System.out.println("Farm Area: " + farm.getArea() + " acres");
        System.out.println("Soil Type: " + farm.getSoilType());
    }
}
