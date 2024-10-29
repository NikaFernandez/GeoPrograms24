public class A4_howITurn extends World {

    public void go() {
        plane.pausetime = 0;
        plane.startingAngle(90);
        plane.isTrail = true;
        icecream();


    }
public void icecream(){plane.trailWidth = 55;
    plane.setColor(245, 154, 212);
    plane.move(50);
    plane.turn(90);
    plane.move(50);
    plane.turn(90);
    plane.move(50);
    plane.turn(90);
    plane.move(50);
    plane.teleport(252,252);
    plane.trailWidth = 25;
    plane.setColor(217, 41, 28);
    plane.startingAngle(270);
    plane.move(20);
    plane.turn(90);
    plane.move(20);
    plane.turn(90);
    plane.move(20);
    plane.turn(90);
    plane.move(20);
    plane.teleport(252,229);
    plane.startingAngle(300);
    plane.trailWidth = 6;
    plane.setColor(7, 31, 11);
    plane.move(30);
    plane.teleport(200,358);
    plane.startingAngle(75);
    plane.trailWidth = 10;
    plane.setColor(212, 190, 125);
    plane.move(150);
    plane.turn(145);
    plane.move(160);
    plane.turn(112);
    plane.move(85);
    plane.teleport(216,360);
    plane.startingAngle(67);
    plane.move(95);
    plane.teleport(212,400);
    plane.startingAngle(300);
    plane.move(50);
    plane.teleport(220,452);
    plane.startingAngle(300);
    plane.move(110);
    plane.teleport(251,358);
    plane.startingAngle(67);
    plane.move(50);
    plane.teleport(800,800);}


}
