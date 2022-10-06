package codeUp;

import java.util.Scanner;

public class Q1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Input = sc.next();
        sc.close();

        String [] time = Input.split(":");
        System.out.printf("%s:%s",time[0], time[1]);

    }
}
