package day1006;

import java.util.HashSet;
import java.util.Set;

public class IntToAlphabet {
    public static void main(String[] args) {

        HashSet<Character> setChar = new HashSet<>();

        for (int i =0; i < 200; i++) {

            int randNum = (int)(Math.random()*26);
            char randChar = (char) (randNum + 65);

            setChar.add(randChar);

        }

        System.out.println(setChar);

    }
}
