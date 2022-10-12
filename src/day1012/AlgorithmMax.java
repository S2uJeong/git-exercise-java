package day1012;

public class AlgorithmMax {

    public int getMax(int[] arr) {
        // int maxValue = 0;
        int maxValue = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }

        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};

        AlgorithmMax max = new AlgorithmMax();
        int resault = max.getMax(arr);

        if (resault == 85) {
            System.out.println("테스트 통과");
        } else {
            System.out.println("테스트 실패 입니다. result" + resault);
        }

    }
}
