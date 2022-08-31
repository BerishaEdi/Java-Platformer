package com.company;

import java.awt.*;

public class Platform extends Rectangle {



    public Platform(){

    }


    public void drawP(Graphics g){

        g.setColor(Color.BLACK);
        g.fillRect(0,0,500,400);

        g.setColor(Color.WHITE);
        g.fillRect(0,400,500,500);

    }



}
