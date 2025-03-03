class Shape {
    public void Area() {
        System.out.println("");
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

  public void Area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
class Square extends Shape {
    private double Side;
    
 public Square(double Side) {
        this.Side = Side;
       
    }
 public void Area() {
        double area = Side * Side;
        System.out.println("Area of Square: " + area);
    }
}
class Triangle extends Shape {
    private double heigth;
    private double width;

    public Triangle(double heigth, double width) {
        this.heigth = heigth;
        this.width = width;
    }

  public void Area() {
        double area =0.5 * heigth * width;
        System.out.println("Area of Triangle:" + area);
    }
}
class Circle extends Shape {
    private double radius;
    
 public Circle(double radius) {
        this.radius = radius;
       
    }

  public void Area() {
        double area = 3.14*radius*radius;
        System.out.println("Area of Circle: " + area);
    }
}
public class Superclass{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10.0, 3.0);
        rect.Area();
        Square sq=new Square(10.0);
        sq.Area();
        Triangle tri =new Triangle(10.0,5.0);
        tri.Area();
        Circle cir=new Circle(7.0);
        cir.Area();
    }
}
