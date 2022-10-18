package codeUp.Q1041_1050;

import java.util.Scanner;

public class Q1050 {

    public boolean compare(int a, int b) {
        if (a == b) {
            return true;
        } else { return false; }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        sc.close();

        Q1050 q = new Q1050();

        int result = q.compare(first,second) ? 1:0;
        System.out.println(result);

    }

}
