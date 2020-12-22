package com.company;

import javax.swing.*;
import java.awt.*;

class Snow extends JComponent {
    void snow (Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D)g;

        BresenhamLine d1 = new BresenhamLine();
        d1.drawBresenhamLine(150,300,450,300, g2d);
        d1.drawBresenhamLine(300,150,300,450, g2d);

        DDALine d2 = new DDALine();
        d2.DDA(200, 200, 400, 400, g2d);
        d2.DDA(200, 400, 400, 200, g2d);

        BY d3 = new BY();
        d3.BYLine(150, 300, 125, 275, g2d);
        d3.BYLine(150, 300, 125, 325, g2d);

        d3.BYLine(300, 150, 325, 125, g2d);
        d3.BYLine(300, 150, 275, 125, g2d);

        d3.BYLine(450, 300, 475, 325, g2d);
        d3.BYLine(450, 300, 475, 275, g2d);

        d3.BYLine(300, 450, 325, 475, g2d);
        d3.BYLine(300, 450, 275, 475, g2d);

        d3.BYLine(186, 216, 218, 217, g2d);
        d3.BYLine(215, 185, 218, 217, g2d);

        d3.BYLine(385, 217, 417, 216, g2d);
        d3.BYLine(383, 217, 380, 185, g2d);

        d3.BYLine(185, 380, 218, 381, g2d);
        d3.BYLine(216, 382, 217, 414, g2d);

        d3.BYLine(385, 381, 418, 382, g2d);
        d3.BYLine(384, 414, 383, 382, g2d);


        Circle c = new Circle();
        c.CircleDraw(300, 300,75, g2d);
        c.CircleDraw(300, 300,116, g2d);

        Ellipse e = new Ellipse();
        e.DrawEllipse(300, 300, 100, 150, g2d);
        e.DrawEllipse(300, 300, 150, 100, g2d);

        g2d.setColor(Color.black);
        String str = "Шабунина";
        g2d.drawString(str,272,20);

    }
}