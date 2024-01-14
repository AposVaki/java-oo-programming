package gr.aueb.cf.ch16.exc2;

public class Circle extends AbstractShape implements ICircle{
    private double radius;

    public Circle() {
    }

    public Circle(Long id, double radius) {
        super(id);
        this.radius = radius;
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
}
