package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class ColorfulVectorBullet implements Bullet {
    private double x, y;
    private boolean visible = true;

    public ColorfulVectorBullet(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics g) {
        if (visible) {
            g.setColor(Color.YELLOW);
            g.drawLine((int) x, (int) y, (int) x, (int) y - 5);
        }
    }

    // update e isVisible iguales a VectorBullet
}