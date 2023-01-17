package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Background extends GraphicalObject {
    private float e;

    public Background(){

    }


    public void draw(DrawTool drawTool) {
       // drawTool.setCurrentColor(Color.BLACK);
        drawTool.setCurrentHSBColor(191, 100, 0);
        drawTool.drawFilledRectangle(0,0,600,629);
    }

    @Override
    public void update(double dt) {
        //e += dt;
    }
}