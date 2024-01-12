package gr.aueb.cf.ch15;

public class Point3D extends Point2D {
    private double z;

    public Point3D () {

    }

    public Point3D(double x, double y, double z) {
        // constructor chaining
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + z + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        z += 10;
    }

    @Override
    protected void movePlus1() {
        super.movePlus1();
        z += 1;
    }

    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY() + this.getZ() * this.getZ());
    }
}
