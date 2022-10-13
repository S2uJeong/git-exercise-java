package codeUp.Q1021_1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();

        String [] inArr = input.split(":");
        System.out.printf("%d",Integer.valueOf(inArr[1]));

    }
}
