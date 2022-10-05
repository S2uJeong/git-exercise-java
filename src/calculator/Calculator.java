package calculator;

public class Calculator {
    // NumberMaker에서 만들어준 숫자를 가지고
    // 사칙 연산한 결과를 출력한다.

    NumberCreator numberCreator;
    private int baseNum;

    public Calculator(NumberCreator numberCreator) {
        this.numberCreator = numberCreator;
        this.baseNum = 10;
    }
    // 메소드 오버로딩 : 기본값을 넘기고 싶으면 넘길 수 있게 생성해줌
    public Calculator(NumberCreator numberCreator, int baseNum) {
        this.numberCreator = numberCreator;
        this.baseNum = baseNum;
    }

    public void plus(int num) {
        System.out.println(num + numberCreator.creat(this.baseNum));
    }


}
