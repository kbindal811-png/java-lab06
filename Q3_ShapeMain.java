class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

public class Q3_ShapeMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);

        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}