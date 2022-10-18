package codeUp.Q1041_1050;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1041 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char input = (char) br.read();

        br.close();

        System.out.println((char) (input + 1));
    }
}
