package gr.aueb.cf.ch17;

import java.io.Serializable;

public class Line extends AbstractShape implements Serializable, Cloneable {
    private static final long serialVersionUID = 10000L;
    private double length;

    public Line() {
    }

    public Line(Long id, double length) {
        super(id);
        this.length = length;
    }

    //copy constructor
    public Line(Line line) {
        super(line.getID());
        this.length = line.length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }
}
