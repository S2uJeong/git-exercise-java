package codeUp.Q1011_1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q1014 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String first = br.readLine();
        char c1  = first.charAt(0);

        String second = br.readLine();
        char c2  = second.charAt(0);

        System.out.printf("%c %c",c2,c1);

//        Scanner sc = new Scanner(System.in);
//        char first = sc.next().charAt(0);
//        char second = sc.next().charAt(0);
//        System.out.printf("%c %c",second, first);

    }
}