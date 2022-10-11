package day1011;

public class SumOfDigit {
    // 방법1) n을 String으로 변경, String을 loop 돌면서 parseInt 후 더한다.
    // => 정답은 되지만 효율성이 좋지 않음, 변환이 너무 많음
    public int solution(int n) {
        String str = String.valueOf(n);
        int result = 0;
        for(int i =0; i <str.length(); i++) {
            result += Integer.parseInt(String.valueOf((str.charAt(i))));
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
