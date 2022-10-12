package classPractice;

public class WhyClass {
    // 클래스를 무엇인가요?
    // Method는 무엇일까요?

    public static void main(String[] args) {

        // array 활용 코드
        String [] arr = new String[7];
        arr[0] = "A1120837";
        arr[1] = "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)";
        arr[2] = "서울특별시 금천구";
        arr[3] = "C";
        arr[4] = "2";

        // class 활용코드
        Hospital hospital = new Hospital(
                "A1120837",
                "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)",
                "C",
                2,
                "365병원",
                null
        );

        System.out.println(hospital.getDistrict());


    }

}
