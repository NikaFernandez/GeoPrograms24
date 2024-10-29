import java.awt.*;
import java.awt.event.KeyEvent;

public class B1_MoreLoop extends World {

    public void go() {
        plane.pausetime = 0;

        for(int y=1; y < 800; y++) {

            for (int x = 0; x < 1000; x = x + 1) {
                plane.startingAngle(90);
                plane.teleport(x, y);
//              plane.setColor(x+5*y,50+y-x , 100-(x/5+x/5))
                plane.setPixelColor(200,5 , 250-x/4);
//                square(20);
                System.out.println("x: " + x);
            }
            plane.teleport(300, 300);

        }

    }


    public void square(int distance) {//distance is the parameter
        for (int z = 0; z < 4; z = z + 1) {
            plane.isTrail = true;
            plane.trailWidth = 20;
            plane.move(distance);
            plane.turn(90);
            System.out.println("z: " + z);
        }
    }
}

// public void hexagon(int distance) {
//   for (int n = 0; n < 6; n = n + 1) {
//     plane.isTrail = true;
//  plane.move(distance);
//  plane.turn(60);
//   System.out.println("n: " + n);





