class Crop {
    void recommend() {
        System.out.println("General crop recommendation");
    }
}

class Rice extends Crop {
    @Override
    void recommend() {
        System.out.println("Recommended: Rice");
    }
}

class Maize extends Crop {
    @Override
    void recommend() {
        System.out.println("Recommended: Maize");
    }
}

public class CropRecommendation {
    public static void main(String[] args) {
        Crop crop;

        crop = new Rice();
        crop.recommend();

        crop = new Maize();
        crop.recommend();
    }
}
