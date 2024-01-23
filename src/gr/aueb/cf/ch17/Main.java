package gr.aueb.cf.ch17;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Rectangle rectangle1 = new Rectangle(2L, 3, 4);
        System.out.println("the Circumference of the rectangle1 is : " + rectangle1.getCircumference());
        System.out.println("the area of the rectangle1 is : " + rectangle1.getArea());

        Rectangle rectangle2 = rectangle1.clone();
        rectangle2.setHeight(10);
        System.out.println("the Circumference of the rectangle2 is : " + rectangle2.getCircumference());
        System.out.println("the area of the rectangle2 is : " + rectangle2.getArea());


    }
}
