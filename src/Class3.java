import java.util.ArrayList;
import java.util.List;

public class Class3 {
    public static void main(String[] args) {
        String s = "ThisIsAPassword123!@#";
        /*
        BaronP359 is an example of static usage
        The methods are stored into the RAM once when
        the program starts running
         */
        System.out.println(BaronP359.numLetters(s));
        System.out.println(BaronP359.numDigits(s));
        System.out.println(BaronP359.numSymbols(s));

        /*
        jason is an example of dynamic usage
        The class, data, and methods are stored into RAM
        only when initiator is called
        initiator: new Student();
         */
        Student jason = new Student();
        jason.addSubject("Computer Science");
        jason.addSubject("English");
        jason.addSubject("Calculus");

        jason.addGrade('A');
        jason.addGrade('B');
        jason.addGrade('C');

        System.out.println("Jason's GPA is: " + jason.calculateGPA());

        Schedule jasonSchedule = new Schedule();
        String[][] classes = {{"M", "E", "P", "Ec", "M", "E", "E", "E", "E"},
                {"M", "E", "P", "Ec", "M", "E", "E", "E", "E"},
                {"M", "E", "P", "Ec", "M", "E", "E", "E", "E"},
                {"M", "E", "P", "Ec", "M", "E", "E", "E", "E"},
                {"M", "E", "P", "Ec", "M", "E", "E", "E", "E"}};
        jasonSchedule.addClass(classes);


        int number = 5;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(number); // Auto Boxing
    }
}
