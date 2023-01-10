package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Penguin extends GraphicalObject {

    private boolean goingright;
    private boolean goingleft;

    public Penguin(String Picture,double x, double y){
        this.x = x;
        this.y = y;
        this.setNewImage(Picture);
    }

    public void draw(DrawTool drawTool) {
        drawTool.drawImage(this.getMyImage(),x,y);
    }

    public void update(double dt) {
        if (goingright == true){
            x += 180*dt;
        }
        if (goingleft == true){
            x -= 180*dt;
        }
        if(x > 500){
            goingleft = true;
            goingright = false;
        }
        if(x < 0){
            goingright = true;
            goingleft = false;
        }
    }
}
