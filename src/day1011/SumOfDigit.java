package day1011;

public class SumOfDigit {
   // 방법 2) % 연산 이용 몫, 나머지

    public int solution(int n) {String str = String.valueOf(n);
        int result = 0;

        while (n > 0) {

            result += n % 10; // '/'연산보다 나머지 구하는 행을 먼저 써줘야 한다.

            n = n / 10 ;

        }

        return result;
    }

    public static void main(String[] args) {

        SumOfDigit sod = new SumOfDigit();
        int result1 = sod.solution(1234);

        if (result1 == 10) {
            System.out.println("테스트통과하였습니다.");
        } else {
            System.out.printf("테스트실패 resault:%d \n", result1);
        }
    }
}
