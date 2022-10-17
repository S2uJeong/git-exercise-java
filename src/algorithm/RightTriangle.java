package algorithm;

public class RightTriangle {

    public void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("\n");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%c", '*');
            }
        }
    }
    public static void main(String[] args) {

        RightTriangle rt = new RightTriangle();

        rt.print(5);
    }
}
