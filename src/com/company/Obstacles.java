package com.company;

import java.awt.*;
import java.util.Random;

public class Obstacles extends Rectangle {

    private int y = -100;


    Random rndY = new Random();
    int fallingSpeed = rndY.nextInt(6) + 3;




    //rnd obstacles spawn
    Random rnd1 = new Random();
    int x = rnd1.nextInt(500);



    public void drawObstacle1(Graphics g) {

        g.setColor(Color.RED);
        g.fillRect(x, y, 30, 30);
    }

    public int setX(int x) {
        this.x = x;
        return x;
    }

    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    public int setY(int y) {
        this.y = y;
        return y;
    }

    public void gravity() {

        this.y += fallingSpeed;
    }

    public Rectangle bounds(){
        return (new Rectangle(x, y, 30,30));
    }

}