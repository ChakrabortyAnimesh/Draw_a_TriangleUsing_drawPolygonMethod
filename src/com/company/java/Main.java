package com.company.java;

import java.applet.Applet;
import java.awt.*;
/*<applet code="Main.class" width="520" height="550" </applet> */
public class Main extends Applet {
    @Override
    public void paint(Graphics g) {
        int x[] = {250, 750, 500};
        int y[] = {300, 800, 500};
        //g.drawPolygon(x,y,3);
        g.fillPolygon(x,y,3);
    }
}
