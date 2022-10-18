package codeUp.Q1031_1040;

import java.util.Scanner;

public class Q1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();

        sc.close();

        if ((first+second) >= 2147483647 || (first+second) <= -2147483648) {
            System.out.println((long) first + second);
        } else {
            System.out.println(first + second);
        }
    }
}
