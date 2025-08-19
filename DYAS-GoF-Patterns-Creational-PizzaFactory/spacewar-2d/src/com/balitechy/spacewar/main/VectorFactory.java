package com.balitechy.spacewar.main;

public class VectorFactory implements AbstractFactory {
    @Override
    public Player createPlayer(GameCanvas canvas) {
        return new VectorPlayer(canvas);
    }

    @Override
    public Bullet createBullet(double x, double y) {
        return new VectorBullet(x, y);
    }

    @Override
    public BackgroundRenderer createBackground(GameCanvas canvas) {
        return new VectorBackgroundRenderer(canvas);
    }
}