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
        Student jason = new Student(183, 80, 18, "Jason");
        List<String> jasonSubjects = jason.getSubjects();
        // This line only assigns the "reference" of such variable

        jason.addSubject("Computer Science");
        jason.addSubject("English");
        jason.addSubject("Calculus");
        jasonSubjects.add("Economics");

        System.out.println(jasonSubjects.toString());

        // primitive type variables change at the place, not the reference
        double height = jason.getHeight();
        height = 177.5;
        System.out.println(jason.getHeight());

        jason.addGrade('A');
        jason.addGrade('B');
        jason.addGrade('C');

        System.out.println("Jason's GPA is: " + jason.calculateGPA());
        System.out.println(jason);

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


        Class4 example = new Class4();
        System.out.println(example.product(3));
        System.out.println(example.product(3, 4));
        System.out.println(example.product(2.5, 8.5));
    }
}
