public class CropScores {
    public static void main(String[] args) {
        String[] crops = {"Rice", "Maize", "Groundnut"};
        int[] scores = {80, 60, 40};

        for (int i = 0; i < crops.length; i++) {
            System.out.println(crops[i] + " : " + scores[i] + "%");
        }
    }
}
