package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Fenster extends JPanel implements ActionListener, KeyListener {


    private int score = 0;


    private final Timer t1 = new Timer(10, this);
    private final Player player1 = new Player();
    private final Platform pf1 = new Platform();
    private final Obstacles obst1 = new Obstacles();
    private final Obstacles obst2 = new Obstacles();
    private final Obstacles obst3 = new Obstacles();
    private final Obstacles obst4 = new Obstacles();
    private final Obstacles obst5 = new Obstacles();
    private final Obstacles obst6 = new Obstacles();
    private final Obstacles obst7 = new Obstacles();
    private final Obstacles obst8 = new Obstacles();
    private final Obstacles obst9 = new Obstacles();

    private Random rnd = new Random();


    public Fenster(){
        addKeyListener(this);
        setFocusable(true);
        t1.start();
    }


    @Override
    public void actionPerformed(ActionEvent k) {
        repaint();
        player1.move();
        obst1.gravity();
        obst2.gravity();
        obst3.gravity();
        obst4.gravity();
        obst5.gravity();
        obst6.gravity();
        obst7.gravity();
        obst8.gravity();
        obst9.gravity();






        if(obst1.getY() > 500){
            obst1.setY(rnd.nextInt(50)-50);
            obst1.setX(rnd.nextInt(440)+30);
            score++;
        }

        if(obst2.getY() > 500){
            obst2.setY(0);
            obst2.setX(rnd.nextInt(500));
            score++;
        }

        if(obst3.getY() > 500){
            obst3.setY(rnd.nextInt(50)-50);
            obst3.setX(rnd.nextInt(500));
            score++;
        }

        if(obst4.getY() > 500){
            obst4.setY(rnd.nextInt(50)-50);
            obst4.setX(rnd.nextInt(500));
            score++;
        }

        if(obst5.getY() > 500){
            obst5.setY(rnd.nextInt(50)-50);
            obst5.setX(rnd.nextInt(500));
            score++;
        }

        if(obst6.getY() > 500){
            obst6.setY(0);
            obst6.setX(rnd.nextInt(500));
            score++;
        }

        if(obst7.getY() > 500){
            obst7.setY(0);
            obst7.setX(rnd.nextInt(500));
            score++;
        }

        if(obst8.getY() > 500){
            obst8.setY(rnd.nextInt(50)-50);
            obst8.setX(rnd.nextInt(500));
            score++;
        }

        if(obst9.getY() > 500){
            obst9.setY(0);
            obst9.setX(rnd.nextInt(500)-50);
            score++;
        }



        //collider with player

        Rectangle playerRect1 = player1.bounds();


        Rectangle obsRect1 = obst1.bounds();
        Rectangle obsRect2 = obst2.bounds();
        Rectangle obsRect3 = obst3.bounds();
        Rectangle obsRect4 = obst4.bounds();
        Rectangle obsRect5 = obst5.bounds();
        Rectangle obsRect6 = obst6.bounds();
        Rectangle obsRect7 = obst7.bounds();
        Rectangle obsRect8 = obst8.bounds();
        Rectangle obsRect9 = obst9.bounds();


        if(playerRect1.intersects(obsRect1)){
            JOptionPane.showMessageDialog(null,
                    "GameOver \nDein Score: "+ score ,
                    "Game Over",
                    JOptionPane.WARNING_MESSAGE);

            System.exit(0);

        }


        if(playerRect1.intersects(obsRect2)){
            JOptionPane.showMessageDialog(null,
                    "GameOver \nDein Score:" + score,
                    "Game Over",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

        if(playerRect1.intersects(obsRect3)){
            JOptionPane.showMessageDialog(null,
                    "GameOver \nDein Score: "+ score,
                    "Game Over",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

        if(playerRect1.intersects(obsRect4)){
            JOptionPane.showMessageDialog(null,
                    "GameOver \nDein Score: "+ score,
                    "Game Over",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

        if(playerRect1.intersects(obsRect5)){
            JOptionPane.showMessageDialog(null,
                    "GameOver \nDein Score: "+ score,
                    "Game Over",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

        if(playerRect1.intersects(obsRect6)){
            JOptionPane.showMessageDialog(null,
                    "GameOver \nDein Score: "+ score,
                    "Game Over",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

        if(playerRect1.intersects(obsRect7)){
            JOptionPane.showMessageDialog(null,
                    "GameOver \nDein Score: "+ score,
                    "Game Over",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

        if(playerRect1.intersects(obsRect8)){
            JOptionPane.showMessageDialog(null,
                    "GameOver \nDein Score: "+ score,
                    "Game Over",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

        if(playerRect1.intersects(obsRect9)){

            JOptionPane.showMessageDialog(null,
                    "GameOver \nDein Score: "+ score,
                    "Game Over",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }



    }



    public void paint(Graphics g) {

        g.clearRect(0, 0, getWidth(), getHeight());
        pf1.drawP(g);
        player1.draw(g);
        obst1.drawObstacle1(g);
        obst2.drawObstacle1(g);
        obst3.drawObstacle1(g);
        obst4.drawObstacle1(g);
        obst5.drawObstacle1(g);
        obst6.drawObstacle1(g);
        obst7.drawObstacle1(g);
        obst8.drawObstacle1(g);
        obst9.drawObstacle1(g);
        g.drawString("Score: " + score,5,15);
    }

    @Override
    public void keyTyped(KeyEvent k) {

    }

    @Override
    public void keyPressed(KeyEvent k) {

        switch (k.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                player1.setVeloX(3);
                break;
            case KeyEvent.VK_LEFT:
                player1.setVeloX(-3);
                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent k) {

        switch (k.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                player1.setVeloX(0);
                break;
            case KeyEvent.VK_LEFT:
                player1.setVeloX(0);
                break;
        }
    }
}

