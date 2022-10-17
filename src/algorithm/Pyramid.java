package algorithm;

public class Pyramid {


    public void printStar(int n) {

        for (int i = 0; i < n ; i++) {
            // 공백출력
            for (int j = n-1-i ; j > 0 ; j--) {
                System.out.print(" ");
            }
            // 별 출력
            for (int k = 0; k < 2*i+1; k ++) {
                System.out.print("*");
            }

            // 다음 층으로
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();

        pyramid.printStar(5);
    }
}
