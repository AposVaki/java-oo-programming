package gr.aueb.cf.ch15;

public class Point2D extends Point{
    private double y;

    public Point2D(){
//        super();  // This is the functionality
//        y = 0.0;    // of the default constructor
    }

    public Point2D(double y) {
        this.y = y;
    }

    public Point2D(double x, double y) {
        super(x);        // if we don't get with super
//        setX(x);          // we use the setX(x)

        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return super.toString() + "(" + y + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    protected void movePlus1() {
        super.movePlus1();
        y += 1;
    }

    @Override
    protected void printTypeOf() {
        super.printTypeOf();
    }

    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY());
    }
}
