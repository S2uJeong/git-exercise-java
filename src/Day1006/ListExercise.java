package Day1006;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

     private List<String> students ;

     public ListExercise() {
         this.students = new ArrayList<>();
         this.students.add("김경록");
         this.students.add("귀요미");
         this.students.add("최수정");
     }

     public List<String> getStudents() {
         return this.students;
     }
}
