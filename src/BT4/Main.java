package BT4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("green",3);
        Rectangle rectangle = new Rectangle("blue",3, 4);
        System.out.println("Diện tích hình tròn: " + circle.getArea());
        System.out.println("Diện tích hình chữ nhật: "+rectangle.getArea());
        circle.display();
        rectangle.display();
    }
}