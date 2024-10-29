public class A5_square extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 70;
        plane.pausetime = 2;
        plane.setColor(70, 50, 140);
        plane.startingAngle(90);
        square();//call the method
    }


    public void square() {//define square method
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 150;
        plane.move(111);
        plane.turn(90);
        plane.move(111);
        plane.turn(90);
        plane.move(111);
        plane.turn(90);
        plane.move(111);
        plane.turn(90);
    }

}


