package gr.aueb.cf.ch15;

public class Point {
    private double x;

    public Point() {

    }

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "(" + x + ')';
    }

    public void movePlus10() {
        //x += 10;
        for (int i = 1; i <= 10; i++) {
            movePlus1();
        }
    }

    protected void movePlus1(){
        x += 1;
    }

    protected void printTypeOf() {
        System.out.println(this.getClass().getSimpleName());
    }

    private void reset() {
        x= 0;
    }

    public double getDistanceFromOrigin() {
        return getX() - 0;
    }
}
