package gr.aueb.cf.ch17;

import java.io.Serializable;

public class Rectangle extends AbstractShape implements IRectangle, Serializable, Cloneable {
    private static final long serialVersionUID = 100L;
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(Long id, double width, double height) {
        super(id);
        this.width = width;
        this.height = height;
    }

    //copy constructor
    public Rectangle(Rectangle rectangle) {
        super(rectangle.getID());
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public long getCircumference() {
        return (long) (2 * (this.width + this.height));
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }

}
