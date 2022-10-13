package codeUp.Q1021_1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();


        String [] strArr = input.split("\\.");
        int [] intArr = new int[3];

        for (int i=0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        System.out.printf("%02d-%02d-%04d",intArr[2],intArr[1],intArr[0]);


    }
}
