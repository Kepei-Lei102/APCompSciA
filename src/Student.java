import java.util.ArrayList;
import java.util.List;



public class Student {
    // Constants
    // A special type of instance "variables"
    public static final int MAX_SCORE = 100;

    //Instance variables
    private List<String> subjects;
    private List<Character> grades;
    private double height;

    // Constructor
    public Student(){ // Instantiater
        subjects = new ArrayList<>();
        grades = new ArrayList<>();
        height = 0;
    }

    public double getHeight() {
        return height;
    }

    public void addSubject(String subject){
        subjects.add(subject);
    }

    public void addGrade(char grade) {
        grades.add(grade);
    }


    /**
     * Write a methods that calculates the student's GPA
     * A is 4.0, B is 3.0, C is 2.0...
     */
    public double calculateGPA() {
        int numSubjects = subjects.size();
        double total = 0;
        for (char grade: grades){
            if (grade == 'A')
                total += 4;
            else if (grade == 'B')
                total += 3;
            else if (grade == 'C')
                total += 2;
            else if (grade == 'D')
                total += 1;
            else
                total += 0;
        }
        return total / numSubjects;
    }
}
