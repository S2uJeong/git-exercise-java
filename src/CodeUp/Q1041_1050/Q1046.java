package codeUp.Q1041_1050;

import java.util.Scanner;

public class Q1046 {

    public int plus(int a,int b,int c) {
        return a+b+c;
    }

    public float average(int a,int b, int c) {
        return (float) (a+b+c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        sc.close();

        Q1046 q = new Q1046();

        System.out.println(q.plus(first,second,third));
        System.out.printf("%.1f",q.average(first,second,third));
    }
}
