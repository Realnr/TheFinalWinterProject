package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;
public class SnowyGround extends GraphicalObject {

    public SnowyGround(){

    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledRectangle(0,449,600,180);
    }
}





