package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class ColorfulVectorBackgroundRenderer implements BackgroundRenderer {
    private GameCanvas canvas;

    public ColorfulVectorBackgroundRenderer(GameCanvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        g.setColor(Color.GRAY);
        g.drawOval(50, 50, 50, 50); // Luna gris
        // Opcional: agrega estrellas coloridas, ej. g.setColor(Color.WHITE); g.fillOval(random positions)
    }
}