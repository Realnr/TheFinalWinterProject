package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Moon extends GraphicalObject {
    public Moon(double x, double y,double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(180,180,180,100);
        drawTool.drawFilledCircle(x,y,radius+2);
        drawTool.setCurrentColor(190,190,190,100);
        drawTool.drawFilledCircle(x,y,radius);


    }
}
