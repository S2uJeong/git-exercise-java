package Day1006;

import java.util.List;

public class ListExerciseMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();

        List<String> students = listExercise.getStudents();
        // 이름변수만 새로지정

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println(students.size());
    }
}
