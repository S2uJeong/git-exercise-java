package codeUp.Q1041_1050;

import java.util.Scanner;

public class Q1045 {

    public void plus(int second, int first) {
        System.out.println(first + second);
    }

    public void minus(int first, int second) {
        System.out.println(first - second);
    }

    public void multiple(int first, int second) {
        System.out.println(first * second);
    }

    public void body (int first, int second) {
        System.out.println((int)first / second);
    }

    public void tail (int first, int second) {
        System.out.println(first % second);
    }

    public void division (int first, int second) {
        System.out.printf("%.2f\n" , (float)first / second);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        sc.close();

        Q1045 q = new Q1045();

        q.plus(first,second);
        q.minus(first,second);
        q.multiple(first,second);
        q.body(first,second);
        q.tail(first,second);
        q.division(first,second);

    }
}
