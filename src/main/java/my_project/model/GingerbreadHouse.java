package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class GingerbreadHouse extends GraphicalObject {

    public GingerbreadHouse(String Picture){
        this.setNewImage(Picture);
    }


    public void draw(DrawTool drawTool) {
        drawTool.drawImage(this.getMyImage(), 300,255);
    }
}