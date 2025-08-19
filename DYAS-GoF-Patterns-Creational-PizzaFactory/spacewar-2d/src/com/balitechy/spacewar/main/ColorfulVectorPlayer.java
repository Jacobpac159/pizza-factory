package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class ColorfulVectorPlayer implements Player {
    private double x, y;
    private GameCanvas canvas;

    public ColorfulVectorPlayer(GameCanvas canvas) {
        this.canvas = canvas;
        this.x = canvas.getWidth() / 2.0;
        this.y = canvas.getHeight() - 50;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.RED);
        int[] xPoints = {(int) x, (int) (x - 10), (int) (x + 10)};
        int[] yPoints = {(int) (y - 10), (int) (y + 10), (int) (y + 10)};
        g.drawPolygon(xPoints, yPoints, 3);
    }

    // Los métodos moveLeft, moveRight, shoot, getX, getY son iguales a VectorPlayer
    // Copia de VectorPlayer, pero cambia shoot a new ColorfulVectorBullet(x, y - 10);
}