package day1006;

import java.util.HashSet;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();

        Set<Integer> setInteger = new HashSet<>();

        for (int i =0; i < 50; i++) {

            int r = randomNumberCreator.creat(10);
            setInteger.add(r);

        }

        System.out.println("랜덤한 숫자는" + setInteger + "이 중에서 나옵니다.");

    }
}
