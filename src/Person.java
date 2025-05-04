public class Person {
    int height;
    int weight;
    int age;

    public Person(int height, int weight, int age){
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public boolean isOverWeight() {
        return weight / Math.pow((double)(height)/100, 2) > 25;
    }
}
