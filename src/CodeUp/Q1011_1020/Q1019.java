package codeUp.Q1011_1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1019 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String [] inArr = input.split("\\.");

        System.out.printf("%04d.%02d.%02d",
                Integer.valueOf(inArr[0]),
                Integer.valueOf(inArr[1]),
                Integer.valueOf(inArr[2])
         );

    }
}
