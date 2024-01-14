package gr.aueb.cf.ch16.exc1;

public class Circle extends AbstractShape implements ITwoDimensional {
    private double radius;

    public Circle() {
    }

    public Circle(Long id, double radius) {
        super(id);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
