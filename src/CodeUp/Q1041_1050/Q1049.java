package codeUp.Q1041_1050;

import java.util.Scanner;

public class Q1049 {

    public boolean compare(int left, int right) {
        if (left > right) {
            return true;
        }else { return false; }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        sc.close();

        Q1049 q = new Q1049();

        // boolean to int 하는 방법. 아래 두가지는 오류. 세번째만 사용가능
        // System.out.println((int)q.compare(left,right));
        // System.out.printf("%d",q.compare(left,right));
        int result = q.compare(left,right) ? 1:0;
        System.out.println(result);


    }

}
