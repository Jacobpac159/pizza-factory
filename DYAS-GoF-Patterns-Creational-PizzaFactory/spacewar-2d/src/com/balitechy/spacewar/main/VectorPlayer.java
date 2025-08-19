package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class VectorPlayer implements Player {
    private double x, y;
    private GameCanvas canvas; // Asume que existe GameCanvas para bounds y width/height

    public VectorPlayer(GameCanvas canvas) {
        this.canvas = canvas;
        this.x = canvas.getWidth() / 2.0;
        this.y = canvas.getHeight() - 50; // Posición inicial típica
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.WHITE);
        int[] xPoints = {(int) x, (int) (x - 10), (int) (x + 10)};
        int[] yPoints = {(int) (y - 10), (int) (y + 10), (int) (y + 10)};
        g.drawPolygon(xPoints, yPoints, 3); // Triángulo para la nave
    }

    @Override
    public void moveLeft() {
        x -= 5;
        if (x < 0) x = 0;
    }

    @Override
    public void moveRight() {
        x += 5;
        if (x > canvas.getWidth()) x = canvas.getWidth();
    }

    @Override
    public Bullet shoot() {
        return new VectorBullet(x, y - 10);
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }
}