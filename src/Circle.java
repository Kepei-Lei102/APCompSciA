public class Circle implements Shape{
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public int isLargerThan(Shape other) {
        double otherArea = other.area();
        double thisArea = area();
        if (thisArea > otherArea)
            return 1;
        if (thisArea == otherArea)
            return 0;
        return -1;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
