package com.balitechy.spacewar.main;

public class SpriteFactory implements AbstractFactory {
    @Override
    public Player createPlayer(GameCanvas canvas) {
        return new SpritePlayer(canvas); // Asume constructor original
    }

    @Override
    public Bullet createBullet(double x, double y) {
        return new SpriteBullet(x, y);
    }

    @Override
    public BackgroundRenderer createBackground(GameCanvas canvas) {
        return new BitmapBackgroundRenderer(canvas);
    }
}