package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class VectorBackgroundRenderer implements BackgroundRenderer {
    private GameCanvas canvas;

    public VectorBackgroundRenderer(GameCanvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, canvas.getWidth(), canvas.getHeight()); // Fondo negro
        g.setColor(Color.WHITE);
        g.drawOval(50, 50, 50, 50); // Círculo para la luna
        // No agrega estrellas para match de la imagen de muestra
    }
}