import java.util.ArrayList;

public class Class4 {
    // Class vs. Object
    // Class is an abstraction of a type of objects
    // Objects are instances of a class

    public ArrayList<Double> temperatures;

    //access specifier
    //     modifier
    //            return type
    //                 method name
    //                      parameter list
    public static void main(String[] args) {
        Student jason = new Student(183.0, "Jason");
    }

    public int product(int n) {
        return n * n;
    }
    public double product(double x, double y) {
        return x * y;
    }
    public int product(int x, int y) {
        return x * y;
    }


    public boolean isMinuteFree(int period, int minutes) {
        return false;
    }

    public int findFreeBlock(int period, int duration) {
        int startIndex = 0;

        while (startIndex < 60) {
            if (isMinuteFree(period, startIndex)) {

                int freeLength = 0;
                //The amount of minutes free starting from startIndex
                int endIndex = startIndex;

                while (endIndex < 60) {
                    if (isMinuteFree(period, endIndex)) {
                        freeLength++;
                        endIndex ++;
                        if (freeLength == duration)
                            return startIndex;
                    } else {
                        startIndex = endIndex + 1;
                    }
                }

            } else {
                startIndex ++;
            }
        }
        return -1;
    }

    public void reserveBlock(int period, int startMinute, int duration) {

    }

    public boolean makeAppointment(int startPeriod, int endPeriod, int duration) {
        int targetPeriod = startPeriod;
        int startTime = -1;

        while (targetPeriod <= endPeriod) {
            startTime = findFreeBlock(targetPeriod, duration);
            if (startTime >= 0) {
                break;
            } else {
                targetPeriod ++;
            }
        }

        if (startTime == -1) {
            return false;
        } else {
            reserveBlock(targetPeriod, startTime, duration);
            return true;
        }
    }
}
