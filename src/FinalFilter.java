import java.awt.event.KeyEvent;

public class FinalFilter extends World {

    public int red;
    public int blue;
    public int green;

    public void go() {

        plane.loadBackGround("hauntedhouse.png");
        plane.showBackGround();
        plane.pausetime = 0;
        plane.isTrail = true;
        lefttree();
        righttree();
        brick();
        roof();
        bottomroof();
        sky();
        white();
        windows();
        web();
        plane.teleport(800,800);
    }

    public void lefttree() {
        for (int y = 20; y < 619; y = y + 1) {
            for (int x = 1; x < 238; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red > 85 && red < 175 && green > 97 && green < 180 && blue > 0 && blue < 60) {
                    plane.setPixelColor(87, 52, 9);
                }
                if (red > 170 && red < 190 && green > 170 && green < 190 && blue > 0 && blue < 60) {
                    plane.setPixelColor(181, 113, 29);
                }

            }
        }
    }

    public void righttree() {
        for (int y = 20; y < 619; y = y + 1) {
            for (int x = 606; x < 800; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red > 80 && red < 175 && green > 90 && green < 180 && blue > 0 && blue < 60) {
                    plane.setPixelColor(87, 52, 9);
                }
                if (red > 170 && red < 190 && green > 170 && green < 190 && blue > 0 && blue < 60) {
                    plane.setPixelColor(181, 113, 29);
                }

            }
        }
    }

    public void brick() {
        for (int y = 20; y < 619; y = y + 1) {
            for (int x = 200; x < 615; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red > 165 && red < 240 && green > 70 && green < 95 && blue > 40 && blue < 75) {
                    plane.setPixelColor(0, 0, 0);
                }
            }
        }
    }

    public void roof() {
        for (int y = 94; y < 235; y = y + 1) {
            for (int x = 175; x < 626; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red > 90 && red < 165 && green > 35 && green < 93 && blue > 10 && blue < 45) {
                    plane.setPixelColor(66, 4, 110);
                }
            }
        }
        for (int y = 94; y < 155; y = y + 1) {
            for (int x = 175; x < 626; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red > 85 && red < 170 && green > 35 && green < 100 && blue > 10 && blue < 55) {
                    plane.setPixelColor(66, 4, 110);
                }
            }
        }
    }

    public void bottomroof() {
        for (int y = 395; y < 430; y = y + 1) {
            for (int x = 139; x < 665; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red > 90 && red < 170 && green > 35 && green < 100 && blue > 10 && blue < 65) {
                    plane.setPixelColor(66, 4, 110);
                }
            }
        }
    }

    public void white() {
        for (int y = 90; y < 240; y = y + 1) {
            for (int x = 189; x < 460; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red > 145 && red < 256 && green > 145 && green < 256 && blue > 145 && blue < 256) {
                    plane.setPixelColor(0, 0, 0);
                }
            }
        }
        for (int y = 240; y < 400; y = y + 1) {
            for (int x = 155; x < 626; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red > 145 && red < 256 && green > 145 && green < 256 && blue > 145 && blue < 256) {
                    plane.setPixelColor(0, 0, 0);
                }
            }
        }
        for (int x = 135; x < 670; x = x + 1) {
            for (int y = 400; y < 480; y = y + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red > 145 && red < 256 && green > 145 && green < 256 && blue > 145 && blue < 256) {
                    plane.setPixelColor(0, 0, 0);
                }
            }
        }
        for (int y = 475; y < 627; y = y + 1) {
            for (int x = 186; x < 622; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red > 145 && red < 256 && green > 145 && green < 256 && blue > 145 && blue < 256) {
                    plane.setPixelColor(0, 0, 0);
                }
            }
        }
        for (int y = 626; y < 648; y = y + 1) {
            for (int x = 480; x < 565; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red > 145 && red < 256 && green > 145 && green < 256 && blue > 145 && blue < 256) {
                    plane.setPixelColor(0, 0, 0);
                }
            }
        }
    }

    public void windows() {
        for (int y = 1; y < 800; y = y + 1) {
            for (int x = 1; x < 800; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red > 19 && red < 100 && green > 90 && green < 220 && blue > 100 && blue < 200) {
                    plane.setPixelColor(245, 215, 24);
                }
            }
        }
    }

    public void web() {
        plane.isTrail = true;
        plane.trailWidth = 4;
        plane.startingAngle(180);
        plane.teleport(601, 95);
        plane.setColor(250, 250, 250);
        plane.move(100);
        plane.teleport(601, 95);
        plane.startingAngle(150);
        plane.move(100);
        plane.teleport(601, 95);
        plane.startingAngle(120);
        plane.move(100);
        plane.teleport(601, 95);
        plane.startingAngle(85);
        plane.move(100);
        plane.teleport(533, 94);
        plane.startingAngle(75);
        plane.move(40);
        plane.turn(25);
        plane.move(40);
        plane.turn(30);
        plane.move(40);
        plane.teleport(562, 96);
        plane.startingAngle(75);
        plane.move(20);
        plane.turn(25);
        plane.move(20);
        plane.turn(30);
        plane.move(20);


    }

    public void sky() {
        for (int y = 1; y < 658; y = y + 1) {
            for (int x = 1; x < 800; x = x + 1) {
                plane.teleport(x, y);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red > 200 && red < 256 && green > 200 && green < 256 && blue > 200 && blue < 256) {
                    plane.setPixelColor(x/5 + 1 / 50, x/5 + 1 / 50, x/5 + 1 / 50);
                }
            }
        }
    }
}