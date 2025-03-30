import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Class1 {
    public static void main(String[] args) {
        int[] firstTest = {1, 1, 2, 3};

        if (findUnique(firstTest) == 3) {
            System.out.println("Answer correct");
        } else {
            System.out.println("Answer wrong");
        }


        int[] secondTest = {0,0,2,4,4,5,7};

        if (findUnique(secondTest) == 5) {
            System.out.println("Answer correct");
        } else {
            System.out.println("Answer wrong");
        }

        int[] thirdTest = {1,4,5,6,6,2};
        System.out.println(findUnique(thirdTest));

    }

    /*
    [1, 1, 2, 3] should return 3
    [0, 0, 2, 4, 4, 5, 7] should return 5
     */
    public static int findUnique(int[] nums){
        List<Integer> uniqueNums = new ArrayList<>(); // instantiater
        for (int i = 0; i < nums.length; i ++) {
            if (!uniqueNums.contains(nums[i])) {
                uniqueNums.add(nums[i]);
            }
        }
        return uniqueNums.size();
    }

    public static void characterAndString() {
        char ch = 'A';  // The character 'A'
        char ch2 = 68; // The character that has ASCII code 68
        char ch3 = '3'; // The character '3'
        String animal = "cat";

        char[] possibleGrades = new char[6];
        for (int i = 0; i < 6; i++){
            possibleGrades[i] = (char) (ch + i);
        }

        System.out.println(possibleGrades);
    }

    public static void list(){ // List as variable length (or named size())
        List<String> items = new ArrayList<>();
        // List<int> intItems = new ArrayList<>();
        // Illegal, cannot contain primitive types
        // List<Integer> intItems = new ArrayList<>();
        // This is legal

        items.add("McMuffin");
        items.add("Americano");
        items.add("Milk");
        items.set(2, "Latte");
        items.add(1, "Hash Brown");
        boolean bool = items.contains("双吉");
        System.out.println(bool);
        items.remove(0);
        items.remove("Milk");
        System.out.println(items.get(2));
    }

    public static void multipleChoice0316() {
        for (int j = 1; j <= 5; j++)
        {
            for (int k = 5; k >= j; k--){
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }

    public static void primitiveType() {
        int i = 0;
        double d = 2.8;
        char ch = 'a';
        boolean bool = true;

        int[] intArray = new int[8];
    }

}
