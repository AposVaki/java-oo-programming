package gr.aueb.cf.ch16.exc2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1L, 3);
        System.out.println("the Circumference of the circle is : " + circle.getCircumference());
        System.out.println("the area of the circle is : " + circle.getArea());


        Rectangle rectangle = new Rectangle(2L, 3, 4);
        System.out.println("the Circumference of the rectangle is : " + rectangle.getCircumference());
        System.out.println("the area of the rectangle is : " + rectangle.getArea());
    }
}
