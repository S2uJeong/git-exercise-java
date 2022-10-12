package day1012;

interface Compare {
    boolean dosomething (int valueA, int valueB);
}

// boolean을 이용해서 다형성 적용
public class MaxAndMin {
    public int getMaxOrMin (int[] arr, Compare compare) { // callback

        int targetValue = arr[0];
        for (int i = 1; i < arr.length; i++) {

            boolean isSth = compare.dosomething(arr[i] , targetValue);
            // max인 경우 : arr[i] > targetValue
            // min인 경우 : arr[i] < targetValue

            if (isSth) {
                targetValue  = arr[i];

            }
        }
        return targetValue ;
    }

    public int max(int[] arr) {
        // Template Callback 패턴*
        // 인스턴스를 구현한 클래스를 만들지 않고 아래와 같이 파라매터에 직접 넣어서 할 수있다.
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean dosomething(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }

    public int min(int[] arr) {
        // 인스턴스를 구현한 클래스를 만들지 않고 아래와 같이 파라매터에 직접 넣어서 할 수있다.
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean dosomething(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

    public static void main(String[] args) {

        int [] arr = new int[]{3,29,38,12,57,74,40,85,61};

        MaxAndMin maxAndMin = new MaxAndMin();
        int maxResult = maxAndMin.max(arr);
        int minResult = maxAndMin.min(arr);

        System.out.printf("%d %d" , minResult, maxResult);

    }
}

