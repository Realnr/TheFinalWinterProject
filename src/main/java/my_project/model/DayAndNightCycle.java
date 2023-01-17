package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class DayAndNightCycle extends InteractiveGraphicalObject {
    //Attribute
    private double timer;
    private double brightness;
    private int brightnessf;
    public DayAndNightCycle(){

    }

    @Override
    public void draw(DrawTool drawTool) {
        //drawTool.setCurrentHSBColor(191, 100, brightnessf);
        drawTool.setCurrentColor(0, 194, 242,brightnessf);
        drawTool.drawFilledRectangle(0,0,600,629);
    }

    @Override
    public void update(double dt) {
        timer += dt;
        brightness = Math.abs(Math.sin(timer))*100;
        brightnessf = (int) brightness;
    }

    public double getBrightness() {
        return brightness;

    }
}
