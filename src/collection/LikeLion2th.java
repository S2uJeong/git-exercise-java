package collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    private List<String> students = new ArrayList<>();

    Names names = new Names();
    public LikeLion2th() {

        names.getName(students);

    }
    
    // 멋사자 2기 학생의 이름이 들어있는 list를 return하는 method
    public List<String> getStudentList() {
        return this.students; // list의 구현제로 arraylist를 많이 이용한다.
    }
}
