package com.company;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    boolean gameOver = false;


    public Frame(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Platformer_V4");
        setSize(500,500);
        setBackground(Color.BLACK);
        setResizable(false);
        init();

    }

    public void init(){

        setLocationRelativeTo(null);
        Fenster s = new Fenster();
        add(s);
        setVisible(true);
    }





}
