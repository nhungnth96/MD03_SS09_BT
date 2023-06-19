package BT1;

public class Main {
    public static void main(String[] args) {
        Circle[] circleList = new Circle[3];
        circleList[0] = new Circle(1);
        circleList[1] = new Circle(2);
        circleList[2] = new Circle(3);
        Square[] squareList = new Square[3];
        squareList[0] = new Square(1);
        squareList[1] = new Square(2);
        squareList[2] = new Square(3);
        Rectangle[] rectangleList = new Rectangle[3];
        rectangleList[0] = new Rectangle(4,2);
        rectangleList[1] = new Rectangle(6,3);
        rectangleList[2] = new Rectangle(8,4);
        for(Circle circle11:circleList){
            System.out.println("========");
            System.out.println("old radius: "+ circle11.getRadius());
            System.out.println("old area: "+circle11.getArea());
            double random = Math.round(Math.random()*100);
            circle11.resize(random);
            System.out.println("new radius"+" in "+random+"%: "+circle11.getRadius());
            double newSize = circle11.getArea();
            System.out.println("new area: "+newSize);
        }
       for(Square square11:squareList){
           System.out.println("========");
           System.out.println("old side: "+ square11.getSide());
           System.out.println("old area: "+square11.getArea());
           double random = Math.round(Math.random()*100);
           square11.resize(random);
           System.out.println("new side"+" in "+random+"%: "+square11.getSide());
           double newSize = square11.getArea();
           System.out.println("new area: "+newSize);
      }
        for (Rectangle rectangle11:rectangleList){
            System.out.println("========");
            System.out.println("old width: "+ rectangle11.getWidth());
            System.out.println("old height: "+ rectangle11.getHeight());
            System.out.println("old area: "+rectangle11.getArea());
            double random = Math.round(Math.random()*100);
            rectangle11.resize(random);
            System.out.println("new width"+" in "+random+"%: "+rectangle11.getWidth());
            System.out.println("new height"+" in "+random+"%: "+rectangle11.getHeight());
            double newSize = rectangle11.getArea();
            System.out.println("new area: "+newSize);
        }
   }
}

