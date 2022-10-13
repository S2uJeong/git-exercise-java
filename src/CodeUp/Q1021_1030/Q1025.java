package codeUp.Q1021_1030;

import java.util.Scanner;

public class Q1025 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        for (int i = 4; i > 0; i--) {

            System.out.println("[" + (input / (int) Math.pow(10, i)) * (int) Math.pow(10, i) + "]");
            input = input % (int) Math.pow(10, i);
        }
        System.out.print("[" + input + "]");

    }
}
