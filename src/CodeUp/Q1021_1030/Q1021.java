package codeUp.Q1021_1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for (int i=0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
        }

    }
}
