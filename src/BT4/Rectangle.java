package BT4;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }
    @Override
    public void display() {
        System.out.println(
                "Màu sắc: "+super.getColor()+
                        " | Diện tích: " + getArea());
    }
}
