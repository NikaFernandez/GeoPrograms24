public class A2_Thickness extends World {

    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("A2 Thickness");
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 15;
        plane.move(75);
        plane.trailWidth = 5;
        plane.move(75);
        plane.trailWidth = 25;
        plane.move(75);
    }

}