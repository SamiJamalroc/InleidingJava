// Voorbeeld 6.2

import java.awt.*;
import java.applet.*;


public class Opdracht62 extends Applet {
    int secondeperuur;
    int secondesperdag;
    int secondesperjaar;


    public void init() {
        secondeperuur = 60*60;
        secondesperdag = secondeperuur * 24;
        secondesperjaar = secondesperdag * 365;

    }

    public void paint(Graphics g) {
        secondeperuur++;
        g.drawString("er zitten " + secondeperuur +
                " seconden in een uur.", 50, 60 );

        secondesperdag++;
        g.drawString("er zitten " + secondesperdag +
                " seconden in een dag.", 50, 80 );

        secondesperjaar++;
        g.drawString("er zitten " + secondesperjaar +
                " seconden in een jaar.", 50, 100 );



    }
}