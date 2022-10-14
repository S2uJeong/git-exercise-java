package algorithm;

import java.util.Arrays;

public class InsertionSort {
    public int[] sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        InsertionSort is = new InsertionSort();

        int[] arr = {8, 5, 6, 2, 4};

        System.out.println(Arrays.toString((is.sort(arr))));

    }

}