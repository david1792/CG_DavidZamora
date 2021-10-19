/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unad.dibujoTres;

import org.unad.dibujoDos.*;
import org.unad.dibujoDos.*;
import Models.Cordenate;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.geom.*;
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
        Graphics2D graphics2D = (Graphics2D) g;
        Ellipse2D ellipse2DBody = new Ellipse2D.Float();
        ellipse2DBody.setFrame(100, 150, 250,100);
        graphics2D.draw(ellipse2DBody);

        Ellipse2D ellipse2DLeftEye = new Ellipse2D.Float();
        ellipse2DLeftEye.setFrame(260, 150, 50,50);
        graphics2D.draw(ellipse2DLeftEye);

        Arc2D.Double arc2RightEye = new Arc2D.Double(290, 150, 50, 50, 230, 255, Arc2D.OPEN);
        graphics2D.draw(arc2RightEye);
        
        Ellipse2D ellipse2DLeftPupil = new Ellipse2D.Float();
        ellipse2DLeftPupil.setFrame(280, 170, 10,10);
        graphics2D.draw(ellipse2DLeftPupil);

        Ellipse2D ellipse2DRightPupil = new Ellipse2D.Float();
        ellipse2DRightPupil.setFrame(315, 170, 10,10);
        graphics2D.draw(ellipse2DRightPupil);


        Arc2D.Double firstBodyLine = new Arc2D.Double(255, 155, 30, 90, 80, 180, Arc2D.OPEN);
        graphics2D.draw(firstBodyLine);
        
        Arc2D.Double secondBodyLine = new Arc2D.Double(200, 150, 50, 100, 80, 180, Arc2D.OPEN);
        graphics2D.draw(secondBodyLine);

        Arc2D.Double thirdBodyLine = new Arc2D.Double(150, 155, 50, 90, 80, 180, Arc2D.OPEN);
        graphics2D.draw(thirdBodyLine);
        
        AffineTransform originalTransformation = graphics2D.getTransform();
        
        Arc2D.Double firstWing = new Arc2D.Double(100,100,100,50, 0, 360, Arc2D.OPEN);
        graphics2D.rotate(Math.toRadians(135), 200, 150);
        graphics2D.draw(firstWing);
        
        Arc2D.Double secondWing = new Arc2D.Double(120,130,100,50, 0, 360, Arc2D.OPEN);
        graphics2D.rotate(300, 200, 150);
        graphics2D.draw(secondWing);
        
        Arc2D.Double mouth = new Arc2D.Double(275, 100, 50, 50, 270, 90, Arc2D.OPEN);
        graphics2D.draw(mouth);
        
        graphics2D.setTransform(originalTransformation);

        Line2D upLinePen = new Line2D.Double();
        upLinePen.setLine(100D,250D,350D,250D);  
        graphics2D.draw(upLinePen);

        Line2D downLinePen = new Line2D.Double();
        downLinePen.setLine(100D,300D,350D,300D);  
        graphics2D.draw(downLinePen);        

        CubicCurve2D penEraser = new CubicCurve2D.Float();
        penEraser.setCurve(100F,250F,50F,240F,50F,310F,100F,300F);       
        graphics2D.draw(penEraser);
        
        Arc2D.Double firstPenArc = new Arc2D.Double(95, 250, 10, 50, 80, 180, Arc2D.OPEN);
        graphics2D.draw(firstPenArc);

        Arc2D.Double secondPenArc = new Arc2D.Double(110, 250, 10, 50, 80, 180, Arc2D.OPEN);
        graphics2D.draw(secondPenArc);        

        Arc2D.Double thirdPenArc = new Arc2D.Double(345, 250, 10, 50, 80, 180, Arc2D.OPEN);
        graphics2D.draw(thirdPenArc);
        
        QuadCurve2D woodPencil = new QuadCurve2D.Double(350D,250D,475F,275F,350D,300D);
        graphics2D.draw(woodPencil);

        QuadCurve2D leadPencil = new QuadCurve2D.Double(400D,265,370F,270F,400D,285D);
        graphics2D.draw(leadPencil);
        
    }
}