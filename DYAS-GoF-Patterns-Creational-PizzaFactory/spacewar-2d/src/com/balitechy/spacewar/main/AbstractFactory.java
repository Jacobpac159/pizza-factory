package com.balitechy.spacewar.main;

public interface AbstractFactory {
    Player createPlayer(GameCanvas canvas);
    Bullet createBullet(double x, double y);
    BackgroundRenderer createBackground(GameCanvas canvas);
}