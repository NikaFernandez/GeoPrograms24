public class B0_BasicLoop extends World {

    public void go() {
        plane.isTrail = true;

        for (int x = 1; x < 500; x = x + 5) {
            plane.teleport(x+20, 150);
            heart();
            plane.pausetime = 1;
            plane.setColor(x + 150, x+10, x +1);
            System.out.println("x: " + x);

        }

    }
    public void heart() {
        plane.trailWidth = 45;
        plane.startingAngle(45);
        plane.move(70);
        plane.turn(100);
        plane.move(70);
    }

}
