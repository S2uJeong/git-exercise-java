package algorithm;

public class RightTriangle {

    private String letter = "*";

    public RightTriangle() {}

    public RightTriangle(String letter) {
       this.letter = letter;
    }

    public void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("\n");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%s", letter);
            }
        }
    }
    public static void main(String[] args) {

        RightTriangle rt1 = new RightTriangle("#");

        rt1.print(5);

    }
}
