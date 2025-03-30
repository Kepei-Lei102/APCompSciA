import java.util.ArrayList;
import java.util.List;

public class Class2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        doSomething(arr); //arr is the parameter
        System.out.print(arr[1] + " ");
        System.out.print(arr[3]);

    }

    public static void mcqQ3() {
        int[] arr = new int[10];

        int sum = arr[0], i = 0;

        while (i < arr.length) {
            i++;
            sum += arr[i];
//            sum = sum + arr[i];
        }
        for (int j = 0; j < arr.length; j++) {

        }



        System.out.println(sum);
    }

    public static void doSomething(int[] list) {
        int[] b = list;
        for (int i = 0; i < b.length; i ++) {
            b[i] = i;
        }
    }

}
