package classPractice;

public class MultiplicationTable {

    public void printTable(int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan * i);  // 구구단은 몇단인지만 바뀌기 떄문에 매개변수로 받는다.
        }
    }

    public static void main(String[] args) {

        // 다형성을 고려한 코드
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        // multiplicationTable.printTable(3);
        for (int j = 2; j <= 9; j++) {
            multiplicationTable.printTable(j);
        }

        // 알고리즘적으로 구구단 짤 때 쓰던 코드
        /*int multi;

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                multi = i * j;
                System.out.printf("%d * %d = %d \n",i,j,multi);
            }
            System.out.println();*/

    }
}

