package Day1005;

public class RandomCalculator {

    public int randomNum() {
        int num = (int)(Math.random()*100);
        return num;
    }

    public void plus(int a) {
        System.out.println(a + randomNum());
    }

    public void minus (int a) {
        System.out.println(a-randomNum());
    }

    public void multiple (int a) {
        System.out.println(a*randomNum());
    }

    public void divide (int a) {
        try {
            double result = ((double) a / randomNum());
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.printf("나누는 수는 0일 수 없습니다. 한번 더 실행바랍니다.");
        }
    }

}
