package codeUp.Q1021_1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] inArr = input.split("\\.");

        System.out.printf("%d\n%d",
                Integer.valueOf(inArr[0]),
                Integer.valueOf(inArr[1])
        );

    }
}
