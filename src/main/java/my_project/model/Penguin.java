package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

public class Penguin extends InteractiveGraphicalObject {

    private boolean nextPingu;
    private String pinguPicture = "src/main/resources/graphic/SmallPingu.png";
    private int pinguPictureId;

    public Penguin(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool) {
        drawTool.drawImage(this.getMyImage(), x, y);
        this.setNewImage(pinguPicture);
    }

    public void update(double dt) {

        x -= 180 * dt;

        if (x < -120) {
            x = 650;
            nextPingu = true;
        }
        if(pinguPictureId == 0){
            pinguPicture = "src/main/resources/graphic/SmallPingu.png";
        }
        if(pinguPictureId == 1){
            pinguPicture = "src/main/resources/graphic/spaceship.png";
        }
        if(pinguPictureId == 2){
            pinguPicture = "src/main/resources/graphic/clubPenguin.png";
        }
        if(pinguPictureId >= 3){
            pinguPictureId = 0;
        }
    }

    public boolean isNextPingu() {
        return nextPingu;
    }

    public void setNextPingu(boolean nextPingu) {
        this.nextPingu = nextPingu;
    }

    @Override
    public void keyPressed(int key) {
        System.out.println(key);
        if(key == 32){

            pinguPictureId += 1;
        }
    }
}
