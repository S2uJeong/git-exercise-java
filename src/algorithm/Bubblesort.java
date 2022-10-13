package algorithm;

import java.util.Arrays;

public class Bubblesort {
    public int [] sort(int [] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ( arr[i] > arr[j] ) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int [] arr = new int[]{7, 2, 3, 9, 28, 11};

        Bubblesort bubblesort = new Bubblesort();

        System.out.print(Arrays.toString(bubblesort.sort(arr)));

    }
}
