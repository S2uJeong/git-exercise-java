import java.util.Arrays;
import java.util.Scanner;

public class LionTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arrCount = new int[4];

        System.out.print("금액을 넣으세요(천원단위): ");
        int money = sc.nextInt();

        int m50000 = 50000;
        int m10000 = 10000;
        int m5000 = 5000;
        int m1000 = 1000;
        int m500 = 500;
        int m100 = 100;
        int m50 = 50;
        int m10 = 10;

        System.out.println(m50000+"원: "+money/m50000+"개, 나머지: "+money%m50000);
        money = money % 50000;
        System.out.println(m10000+"원: "+money/m10000+"개, 나머지: "+money%m10000);
        money = money % 10000;
        System.out.println(m5000+"원: "+money/m5000+"개, 나머지: "+money%m5000);
        money = money % 5000;
        System.out.println(m1000+"원: "+money/m1000+"개, 나머지: "+money%m1000);
        money = money % 1000;
        System.out.println(m500+"원: "+money/m500+"개, 나머지: "+money%m500);
        money = money % 500;
        System.out.println(m100+"원: "+money/m100+"개, 나머지: "+money%m100);
        money = money % 100;
        System.out.println(m50+"원: "+money/m50+"개, 나머지: "+money%m50);
        money = money % 50;
        System.out.println(m10+"원: "+money/m10+"개, 나머지: "+money%m10);
        money = money % 10;


    }


}

