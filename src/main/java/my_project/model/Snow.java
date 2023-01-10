package my_project.model;

        import KAGO_framework.model.GraphicalObject;
        import KAGO_framework.view.DrawTool;

        import java.awt.*;

public class Snow extends GraphicalObject {

    private double speed;

    public Snow(double x,double y,double speed,double radius){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.radius = radius;
    }


    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledCircle(x,y,radius);
    }

    public void update(double dt) {
        y = y + speed*dt;
        if(y>449){
            y = -50;
        }
    }
}
