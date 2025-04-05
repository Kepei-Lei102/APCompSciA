import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<String> subjects;
    private List<Character> grades;

    public Student(){
        subjects = new ArrayList<>();
        grades = new ArrayList<>();
    }

    public void addSubject(String subject){
        subjects.add(subject);
    }
}
