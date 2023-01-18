package my_project.control;

import KAGO_framework.control.ViewController;
import my_project.model.*;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute
    private double timer;
    private boolean nextPingus = true;
    private boolean pinguSpaw = true;
    private double howManyPingu;

    //private boolean next = true;
    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.
    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {
        DayAndNightCycle DANC1 = new DayAndNightCycle();
        viewController.draw(DANC1);
        viewController.register(DANC1);

        //Background background = new Background();
        //viewController.draw(background);
        SnowyGround THESNOWYGROUND = new SnowyGround();
        viewController.draw(THESNOWYGROUND);
        for (int i = 0; i < 1000; i++) {
            Snow newSnow = new Snow(Math.random() * 600, Math.random() * -400, 20 + Math.random() * 30, 2 + Math.random() * 2);
            viewController.draw(newSnow);
        }
        GingerbreadHouse g1 = new GingerbreadHouse("src/main/resources/graphic/g1.png");
        viewController.draw(g1);
        Penguin p = new Penguin(600 + Math.random() * 900, 310);//"src/main/resources/graphic/SmallPingu.png"
        viewController.draw(p);
        viewController.register(p);
        //Moon m1 = new Moon(535, 80, 70);
        //viewController.draw(m1);

    }

    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */

    public void updateProgram(double dt) {
        timer += dt;

        if (timer > 5*howManyPingu){
            Penguin p = new Penguin(600 + Math.random() * 900, 310);//"src/main/resources/graphic/SmallPingu.png"
            viewController.draw(p);
            viewController.register(p);
            howManyPingu += 1;
        }
        System.out.println(timer);
        /*for (int i = 0; i < 20 && nextPingus; i++) {
            // System.out.println(p1.isNextPingu());
            //if(NextPingu2)
            Penguin p = new Penguin(600 + Math.random() * 900, 310);//"src/main/resources/graphic/SmallPingu.png"
            viewController.draw(p);
            viewController.register(p);
            nextPingus = false;
        }
        if(p.isNextPingu){
            nextPingus = true;
        }*/

    }
}
