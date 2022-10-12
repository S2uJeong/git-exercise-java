package day1012;

public class AlgorithmMax {

    public int [] getMax(int[] arr) {
        int maxIdx = 0;
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIdx = i;
            }
        }
        return new int [] {maxValue, maxIdx};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};

        AlgorithmMax max = new AlgorithmMax();
        int [] result = max.getMax(arr);

        if (result[0] == 85 && result[1] == 7) {
            System.out.println("테스트 통과");
        } else {
            System.out.println("테스트 실패 입니다. result: " + result[1]);
        }

    }
}
