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
    private double mx = 300;
    private double my = 80;
    private double mr = 70;
    private int moonCounter;
    private boolean moon;
    public DayAndNightCycle(){

    }

    @Override
    public void draw(DrawTool drawTool) {
        //background
        drawTool.setCurrentHSBColor(191, 100, brightnessf);
        //drawTool.setCurrentColor(0, 194, 242,brightnessf);
        drawTool.drawFilledRectangle(0,0,600,629);

        if(moon) {
            //Moon
            drawTool.setCurrentColor(180, 180, 180, 100);
            drawTool.drawFilledCircle(mx, my, mr + 2);
            drawTool.setCurrentColor(190, 190, 190, 100);
            drawTool.drawFilledCircle(mx, my, mr);
        }else {
            //Sun
            drawTool.setCurrentColor(245, 245, 0, 100);
            drawTool.drawFilledCircle(mx, my, mr + 2);
            drawTool.setCurrentColor(255, 255, 0, 100);
            drawTool.drawFilledCircle(mx, my, mr);
        }
    }

    @Override
    public void update(double dt) {
        timer += 0.1*dt;
        mx += (Math.PI/4*0.1*dt)*-600;
        if (mx <= -70){
            mx = 670;
            moonCounter += 1;
        }
        if (moonCounter % 2 == 0){
            moon = true;
        }else if(moonCounter % 2 != 0){
            moon = false;
        }
        brightness = Math.abs(Math.sin(timer))*100;
        brightnessf = (int) brightness;
       // System.out.println(mx);
        //System.out.println(brightness);
    }

    public double getBrightness() {
        return brightness;

    }
}
