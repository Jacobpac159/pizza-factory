package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class VectorBullet implements Bullet {
    private double x, y;
    private boolean visible = true;

    public VectorBullet(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics g) {
        if (visible) {
            g.setColor(Color.WHITE);
            g.drawLine((int) x, (int) y, (int) x, (int) y - 5); // Línea pequeña para bala
        }
    }

    @Override
    public void update() {
        y -= 5; // Mover hacia arriba
        if (y < 0) visible = false;
    }

    @Override
    public boolean isVisible() {
        return visible;
    }
}