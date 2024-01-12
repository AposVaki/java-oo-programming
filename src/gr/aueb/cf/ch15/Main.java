package gr.aueb.cf.ch15;

public class Main {
    public static void main(String[] args) {
        Point randomPoint3D = new Point3D(3, 3, 3);
        System.out.println("randomPoint3D: " + randomPoint3D.getDistanceFromOrigin());
        Point randomPoint2D = new Point2D(4, 3);
        System.out.println("randomPoint2D: " + randomPoint2D.getDistanceFromOrigin());


        //Using util
        System.out.println("randomPoint3D: " + PointUtil.distanceFromOrigin(randomPoint3D));
        System.out.println("randomPoint2D: " + PointUtil.distanceFromOrigin(randomPoint2D));

    }
}
