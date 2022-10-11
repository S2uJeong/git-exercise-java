package codeUp.Q1021_1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();

        char [] chars = input.toCharArray();

        for (char c : chars ) {
            System.out.printf("\'%c\'\n",c);
        }
    }

}
