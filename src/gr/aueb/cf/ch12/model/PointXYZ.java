package gr.aueb.cf.ch12.model;

public class PointXYZ {
    private int x;
    private int y;
    private int z;

    public PointXYZ() {
        x = 0;
        y = 0;
        z = 0;
    }

    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }

    public String convertToString() {
        return "PointXYZ{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
