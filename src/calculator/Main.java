package calculator;

public class Main {
    public static void main(String[] args) {
        Calculator passCalculator = new Calculator(new ByPassNumberCreator());
        passCalculator.plus(10);

        Calculator randomCalculator = new Calculator(new RandomNumberCreator());
        randomCalculator.plus(10);

        // 오버로딩한 함수이용
        Calculator passCalculator2 = new Calculator(new ByPassNumberCreator(),20);
        passCalculator.plus(10);

        Calculator randomCalculator2 = new Calculator(new RandomNumberCreator(),20);
        randomCalculator.plus(10);
    }
}
