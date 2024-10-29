public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("CharlieBrown.png");
        plane.showBackGround();

        pinkpanel();
        orangepanel();
        yellowpanel();
        greenpanel();
        bluepanel();
        purplepanel();

    }

    public void pinkpanel(){
        for(int y = 89; y < 200; y = y + 1) {
            for (int x = 1; x < 500; x = x + 1){
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red < 215 && green < 80 && blue < 65 ) {
                    plane.setPixelColor(255, 117, 195);
                }
            }
        }
    }
    public void orangepanel(){
        for (int y = 200; y < 320; y = y + 1) {
            for (int x = 1; x < 550; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(x, 488 - y);
                if (red < 220 && red> 175 && green < 100 && blue < 100) {//196,152,422
                    plane.setPixelColor(247, 139, 77);
                }


            }
        }
    }
    public void yellowpanel(){
        for (int y = 320; y < 445; y = y + 1) {
            for (int x = 1; x < 550; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(x, 488 - y);
                if (red < 220 && red> 135 && green < 100 && blue < 100) {//196,152,422
                    plane.setPixelColor(247, 205, 77);
                }


            }
        }
    }
    public void greenpanel(){
        for (int y = 445; y < 490; y = y + 1) {
            for (int x = 95; x < 480; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(x, 488 - y);
                if (red < 220 && red> 135 && green < 100 && blue < 100) {//196,152,422
                    plane.setPixelColor(84, 214, 138);
                }


            }
        }
    }
    public void bluepanel(){
        for (int y = 490; y < 550; y = y + 1) {
            for (int x = 95; x < 480; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(x, 488 - y);
                if (red < 220 && red> 135 && green < 100 && blue < 100) {//196,152,422
                    plane.setPixelColor(84, 164, 214);
                }


            }
        }
    }
    public void purplepanel(){
        for (int y = 550; y < 625; y = y + 1) {
            for (int x = 95; x < 480; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(x, 488 - y);
                if (red < 220 && red> 135 && green < 100 && blue < 100) {//196,152,422
                    plane.setPixelColor(136, 84, 214);
                }


            }
        }
    }
}

