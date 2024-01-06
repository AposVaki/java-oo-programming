package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.PointXYZ;

public class PointXYZApp {
    public static void main(String[] args) {
        PointXYZ points1 = new PointXYZ(51, -55, 0);

        points1.setZ(366);

        System.out.println(points1.convertToString());


    }
}
