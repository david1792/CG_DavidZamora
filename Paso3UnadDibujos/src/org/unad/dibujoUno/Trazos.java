/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unad.dibujoUno;

import Models.Cordenate;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author David
 */
public class Trazos extends JPanel{
    
    private ArrayList<Cordenate> cordenates = new ArrayList<Cordenate>();
    
    @Override
    public void paint(Graphics g){
        createFloppyHat(g);
        createHair(g);
        createFace(g);
        createBody(g);
        drawSweeper(g);
    }
    private void drawWitch(Graphics g){
        cordenates.forEach((c) -> {
            g.drawLine(c.getX1(), c.getY1(), c.getX2(), c.getY2());
        });
        cordenates.clear();
    } 

    private void createFloppyHat(Graphics g){
        g.setColor(new Color(160, 0, 255));
        cordenates.add(new Cordenate(20, 250, 450, 250));
        cordenates.add(new Cordenate(20, 250, 20, 270));
        cordenates.add(new Cordenate(450, 250, 450, 270));
        cordenates.add(new Cordenate(20, 270, 450, 270));
        
        cordenates.add(new Cordenate(120, 250, 240, 30));
        cordenates.add(new Cordenate(240, 30, 320, 90));
        cordenates.add(new Cordenate(320, 90, 280, 90));
        cordenates.add(new Cordenate(280, 90, 360, 250));
        drawWitch(g);
        
        g.setColor(new Color(210, 210, 0));
        cordenates.add(new Cordenate(200, 150, 275, 150));
        cordenates.add(new Cordenate(200, 150, 200, 230));
        cordenates.add(new Cordenate(275, 150, 275, 230));
        cordenates.add(new Cordenate(200, 230, 275, 230));

        cordenates.add(new Cordenate(220, 170, 255, 170));
        cordenates.add(new Cordenate(220, 170, 220, 210));
        cordenates.add(new Cordenate(255, 170, 255, 210));
        cordenates.add(new Cordenate(220, 210, 255, 210));
        drawWitch(g);

        g.setColor(new Color(0, 0, 0));
        cordenates.add(new Cordenate(200, 170, 165, 170));
        cordenates.add(new Cordenate(200, 210, 147, 210));

        cordenates.add(new Cordenate(275, 170, 320, 170));
        cordenates.add(new Cordenate(275, 210, 340, 210));
        drawWitch(g);
    }
    private void createHair(Graphics g){
        g.setColor(Color.BLACK);
        cordenates.add(new Cordenate(110, 270, 0, 360));
        cordenates.add(new Cordenate(0, 360, 18, 390));
        cordenates.add(new Cordenate(18, 390, 80, 320));
        cordenates.add(new Cordenate(80, 320, 40, 390));
        cordenates.add(new Cordenate(40, 390, 60, 400));
        cordenates.add(new Cordenate(60, 400, 110, 330));
        cordenates.add(new Cordenate(110, 330, 75, 430));
        cordenates.add(new Cordenate(75, 430, 100, 450));
        cordenates.add(new Cordenate(100, 450, 160, 270));
        
        cordenates.add(new Cordenate(320, 270, 380, 450));
        cordenates.add(new Cordenate(380, 450, 400, 430));
        cordenates.add(new Cordenate(400, 430, 370, 350));
        cordenates.add(new Cordenate(370, 350, 420, 410));
        cordenates.add(new Cordenate(420, 410, 440, 390));
        cordenates.add(new Cordenate(440, 390, 390, 325));
        cordenates.add(new Cordenate(390, 325, 460, 390));
        cordenates.add(new Cordenate(460, 390, 480, 370));
        cordenates.add(new Cordenate(480, 370, 370, 270));
        drawWitch(g);
    }
    private void createFace(Graphics g){
        g.setColor(Color.GREEN);
        cordenates.add(new Cordenate(120, 400, 120, 430));
        cordenates.add(new Cordenate(120, 430, 180, 490));
        cordenates.add(new Cordenate(360, 400, 360, 430));
        cordenates.add(new Cordenate(360, 430, 300, 490));
        drawWitch(g);
        
        g.setColor(Color.BLACK);
        cordenates.add(new Cordenate(160, 290, 220, 290));
        cordenates.add(new Cordenate(160, 290, 160, 345));
        cordenates.add(new Cordenate(220, 290, 220, 345));
        cordenates.add(new Cordenate(220, 310, 180, 310));
        cordenates.add(new Cordenate(180, 310, 180, 345));
        
        
        cordenates.add(new Cordenate(260, 290, 320, 290));
        cordenates.add(new Cordenate(260, 290, 260, 345));
        cordenates.add(new Cordenate(320, 290, 320, 345));
        cordenates.add(new Cordenate(260, 310, 300, 310));
        cordenates.add(new Cordenate(300, 310, 300, 345));
   
        cordenates.add(new Cordenate(320, 345, 140, 345));
        cordenates.add(new Cordenate(140, 345, 140, 390));
        cordenates.add(new Cordenate(140, 390, 260, 390));

        cordenates.add(new Cordenate(180, 410, 180, 430));
        cordenates.add(new Cordenate(180, 430, 200, 450));
        cordenates.add(new Cordenate(200, 450, 280, 450));
        cordenates.add(new Cordenate(280, 450, 300, 430));
        cordenates.add(new Cordenate(300, 430, 300, 410));

        drawWitch(g);
    }
    private void createBody(Graphics g){
        g.setColor(new Color(160, 0, 255));
        cordenates.add(new Cordenate(180, 490, 300, 490));
        cordenates.add(new Cordenate(300, 490, 360, 650));
        cordenates.add(new Cordenate(360, 650, 360, 665));
        cordenates.add(new Cordenate(360, 665, 120, 665));
        cordenates.add(new Cordenate(120, 665, 120, 650));
        cordenates.add(new Cordenate(120, 650, 180, 490));
        
        cordenates.add(new Cordenate(300, 490, 415, 465));
        cordenates.add(new Cordenate(415, 465, 440, 485));
        cordenates.add(new Cordenate(440, 485, 325, 550));
        
        cordenates.add(new Cordenate(180, 490, 60, 600));
        cordenates.add(new Cordenate(60, 600, 80, 625));
        cordenates.add(new Cordenate(80, 625, 155, 550));
    
        drawWitch(g);
        
        g.setColor(Color.GREEN);
        
        cordenates.add(new Cordenate(80, 625, 80, 650));
        cordenates.add(new Cordenate(60, 600, 40, 625));
        cordenates.add(new Cordenate(40, 625, 40, 650));
        
        cordenates.add(new Cordenate(440, 485, 470, 470));
        cordenates.add(new Cordenate(470, 470, 440, 430));
        cordenates.add(new Cordenate(440, 430, 420, 450));
        cordenates.add(new Cordenate(420, 450, 420, 430));
        cordenates.add(new Cordenate(420, 430, 410, 430));
        cordenates.add(new Cordenate(410, 430, 415, 465));
        
        drawWitch(g);
        
        g.setColor(Color.GREEN);
        cordenates.add(new Cordenate(300, 665, 320, 705));
        cordenates.add(new Cordenate(320, 705, 340, 705));
        drawWitch(g);
        
        g.setColor(Color.YELLOW);
        cordenates.add(new Cordenate(340, 705, 360, 705));
        drawWitch(g);

        g.setColor(Color.BLACK);
        cordenates.add(new Cordenate(340, 705, 400, 705));
        cordenates.add(new Cordenate(400, 705, 400, 765));
        cordenates.add(new Cordenate(400, 765, 375, 730));
        cordenates.add(new Cordenate(375, 730, 340, 730));
        cordenates.add(new Cordenate(340, 730, 340, 705));
        drawWitch(g);

        g.setColor(Color.GREEN);
        cordenates.add(new Cordenate(340, 730, 300, 730));
        cordenates.add(new Cordenate(300, 730, 260, 665));

        cordenates.add(new Cordenate(340, 730, 300, 730));
        cordenates.add(new Cordenate(220, 665, 240, 730));
        cordenates.add(new Cordenate(240, 730, 260, 730));
        
        cordenates.add(new Cordenate(260, 730, 260, 750));
        cordenates.add(new Cordenate(260, 750, 220, 750));
        cordenates.add(new Cordenate(220, 750, 180, 665));
        drawWitch(g);
        
        g.setColor(Color.BLACK);
        cordenates.add(new Cordenate(260, 730, 320, 730));
        cordenates.add(new Cordenate(320, 730, 320, 785));
        cordenates.add(new Cordenate(320, 785, 300, 750));
        cordenates.add(new Cordenate(320, 785, 300, 750));
        cordenates.add(new Cordenate(300, 750, 260, 750));
        cordenates.add(new Cordenate(260, 750, 260, 730));
        drawWitch(g);
    }
    private void drawSweeper(Graphics g){
        g.setColor(new Color(102, 51, 0));
        cordenates.add(new Cordenate(120, 665, 20, 665));
        cordenates.add(new Cordenate(120, 650, 20, 650));
        cordenates.add(new Cordenate(20, 665, 20, 650));
        
        cordenates.add(new Cordenate(360, 665, 460, 665));
        cordenates.add(new Cordenate(360, 650, 460, 650));
        cordenates.add(new Cordenate(460, 665, 460, 650));
        drawWitch(g);
        
        g.setColor(Color.YELLOW);
        cordenates.add(new Cordenate(460, 650, 480, 590));
        cordenates.add(new Cordenate(480, 590, 665, 590));
        cordenates.add(new Cordenate(665, 590, 665, 730));
        cordenates.add(new Cordenate(665, 730, 480, 730));
        cordenates.add(new Cordenate(480, 730, 460, 665));
        
        drawWitch(g);
    }

}