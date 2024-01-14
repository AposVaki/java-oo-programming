package gr.aueb.cf.ch16.exc1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1L, 2);
        System.out.println("the area is of the circle: " + circle.getArea());

        Rectangle rectangle = new Rectangle(2L, 3, 4);
        System.out.println("the area is the rectangle: " + rectangle.getArea());
    }
}
