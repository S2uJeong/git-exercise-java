package day1006_file;

import java.io.*;
import java.util.Scanner;

public class FileExercise {

    //private String filename = "C:\\Users\\sj980\\Downloads\\temp.txt";
    private String filename;

    public FileExercise(String filename) {
        this.filename = filename;
    }

    public void printFiles() {
        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    } // 현재 디렉토리의 파일명을 출력하는 메서드

    public char readChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);

        return (char)fileReader.read();
    } // 한 글자씩 불러오는 메서드

    public String read2Chars(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);

        String str = "";
        str += (char)fileReader.read();
        str += (char)fileReader.read();
        return str;

    } // 두 글자씩 불러오는 메서드

    public String readNChars(int N) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        for (int i = 0; i < N; i++) {
            // -가 나올 경우 break
            int asciiCd = fileReader.read();
            if (asciiCd == -1) {
                return str;
            }
            str += (char) asciiCd;
        }
        return str;
    } // N 글자씩 불러오는 메서드

    public String readALine () throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader(this.filename),
                16 * 1024
        );

        String str = br.readLine();
        return str;
    } // 한 라인만 불러오는 메서드

    public static void main(String[] args) throws IOException {
        // FileReader fileReader = new FileReader("C:\\Users\\sj980\\Downloads\\temp.txt");
        // System.out.println((char) fileReader.read());
        // 단순하게 한 글자씩 가져오는 코드

        FileExercise fileExercise = new FileExercise("C:\\Users\\sj980\\Downloads\\temp.txt");

        char c = fileExercise.readChar("C:\\Users\\sj980\\Downloads\\temp.txt");
        System.out.println(c);

        String str2 = fileExercise.read2Chars("C:\\Users\\sj980\\Downloads\\temp.txt");
        System.out.println(str2);

        Scanner sc = new Scanner(System.in);
        System.out.println("몇 글자를 출력하시겠습니까?: ");
        int numN = sc.nextInt();
        String strN = fileExercise.readNChars(numN);
        System.out.println(strN);

        String str = fileExercise.readALine();
        System.out.print("한 줄 출력 : ");
        System.out.println(str);




    }

}
