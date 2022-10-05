package Day1005;

public class Calculator {

    private int a = 10;
    private int b = 20;

    public Calculator() {
        this.a = a;
        this.b = b;
    }

    public void plus() {
        System.out.println(a + b);
    }

    public void minus () {
        System.out.println(a-b);
    }

    public void multiple () {
        System.out.println(a*b);
    }

    public void divide () {
        double result = ((double)a / b);
        System.out.println(result);
    }

}
