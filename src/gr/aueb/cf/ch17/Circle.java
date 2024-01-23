package gr.aueb.cf.ch17;

import java.io.Serializable;

public class Circle extends AbstractShape implements ICircle, Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private double radius;

    public Circle() {
    }

    public Circle(Long id, double radius) {
        super(id);
        this.radius = radius;
    }

    //copy constructor
    public Circle(Circle circle) {
        super(circle.getID());
        this.radius = circle.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getDiameter() {
        return this.radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public long getCircumference() {
        return (long) (getDiameter() * Math.PI);
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }


}
