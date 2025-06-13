class Shape {
    public void area() {
        System.out.println();
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Circle Area: " + result);
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void area() {
        double result = width * height;
        System.out.println("Rectangle Area: " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(3);
        Shape s2 = new Rectangle(4, 5);

        s1.area();
        s2.area();

        Shape[] shapes = { s1, s2 };
        for (Shape shape : shapes) {
            shape.area();
        }
    }
}