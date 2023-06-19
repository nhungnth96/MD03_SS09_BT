package BT4;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return  radius * radius * Math.PI;
    }

    @Override
    public void display() {
        System.out.println(
                "Màu sắc: "+super.getColor()+
                " | Diện tích: " + getArea());
    }
}
