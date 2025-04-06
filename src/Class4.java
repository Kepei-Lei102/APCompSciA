public class Class4 {
    // Class vs. Object
    // Class is an abstraction of a type of objects
    // Objects are instances of a class

    //access specifier
    //     modifier
    //            return type
    //                 method name
    //                      parameter list
    public static void main(String[] args) {
        Student jason = new Student();
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
}
