package com.company;

import java.awt.*;


public class Player extends Rectangle {


    private int x = 250;
    public int veloX = 0;


    public Player() {


    }

    public void move() {
        this.x += veloX;
    }

    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(this.x, 375, 15, 25);
    }

    public int setVeloX(int veloX) {
        this.veloX = veloX;
        return veloX;
    }

    public double getX() {

        return x;
    }

    public Rectangle bounds(){
        return (new Rectangle(x, 375, 15,25));
    }

}




