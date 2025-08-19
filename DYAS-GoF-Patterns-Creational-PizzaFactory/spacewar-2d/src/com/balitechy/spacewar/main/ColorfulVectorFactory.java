package com.balitechy.spacewar.main;

public class ColorfulVectorFactory implements AbstractFactory {
    @Override
    public Player createPlayer(GameCanvas canvas) {
        return new ColorfulVectorPlayer(canvas);
    }

    @Override
    public Bullet createBullet(double x, double y) {
        return new ColorfulVectorBullet(x, y);
    }

    @Override
    public BackgroundRenderer createBackground(GameCanvas canvas) {
        return new ColorfulVectorBackgroundRenderer(canvas);
    }
}