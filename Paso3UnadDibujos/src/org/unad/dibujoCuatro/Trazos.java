/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unad.dibujoCuatro;

import org.unad.dibujoCuatro.*;
import Models.Cordenate;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author David
 */
public class Trazos extends JPanel{
        
    @Override
    public void paint(Graphics g){
        Graphics2D graphics2D = (Graphics2D) g;
        AffineTransform originalTransformation = graphics2D.getTransform();
        //graphics2D.setTransform(originalTransformation);
        
        Line2D montain1 = new Line2D.Double();
        montain1.setLine(0, 237.25,
                         37.5, 257.04);
        graphics2D.draw(montain1);
        
        Line2D montain2 = new Line2D.Double();
        montain2.setLine(0, 274.24, 
                         84.82, 235.53);        
        graphics2D.draw(montain2);
        
        Line2D montain3 = new Line2D.Double();
        montain3.setLine(322.26, 200.26, 
                         371.3, 178.75);
        graphics2D.draw(montain3);

        
        Line2D montain4 = new Line2D.Double();
        montain4.setLine(416.03, 203.7, 
                         372.16, 178.75);
        graphics2D.draw(montain4);

        Line2D montain5 = new Line2D.Double();
        montain5.setLine(427.22, 195.96, 
                         415.17, 203.7);
        graphics2D.draw(montain5);
        
        Line2D montain6 = new Line2D.Double();
        montain6.setLine(506.36, 238.11, 
                         428.08, 195.96);
        graphics2D.draw(montain6);

        
        Line2D montain7 = new Line2D.Double();
        montain7.setLine(554.54, 216.61, 
                         435.4, 277.23);
        graphics2D.draw(montain7);

        Line2D montain8 = new Line2D.Double();
        montain8.setLine(637.99, 256.18, 
                         555.4, 216.61);
        graphics2D.draw(montain8);
        
        Line2D montain9 = new Line2D.Double();
        montain9.setLine(682.73, 236.39, 
                         602, 276.18);
        graphics2D.draw(montain9);
        
        Line2D montain10 = new Line2D.Double();
        montain10.setLine(767.89, 274.24, 
                          682.73, 237.25);
        graphics2D.draw(montain10);

        Line2D montain11 = new Line2D.Double();
        montain11.setLine(970.06, 180.47, 
                          768.76, 275.11);
        graphics2D.draw(montain11);        
        
        Line2D montain12 = new Line2D.Double();
        montain12.setLine(1014, 202.84, 
                          970.06, 179.61);
        graphics2D.draw(montain12);    
        
        Line2D floor = new Line2D.Double();
        floor.setLine(1014.38, 278.09, 
                      0, 278.95);
        graphics2D.draw(floor);
                
        Rectangle2D rectangle1 = new Rectangle2D.Float();
        rectangle1.setFrame(85, 230, 238.3, 48);
        graphics2D.draw(rectangle1);
        
        Line2D linerectangle1 = new Line2D.Double();
        linerectangle1.setLine(85, 240, 
                          323, 240);
        graphics2D.draw(linerectangle1);   
        
        int[] xPointsRectangle2 = {212, 398, 398, 323, 323, 212}; 
        int[] yPointsRectangle2 = {200, 200, 278, 278, 229, 229};
        g.drawPolygon(xPointsRectangle2, yPointsRectangle2, xPointsRectangle2.length);

        Line2D linerectangle2 = new Line2D.Double();
        linerectangle2.setLine(212, 210, 
                          398, 210);
        graphics2D.draw(linerectangle2);   
        
        int[] xPointsRectangle3 = {906, 1014, 1014, 906}; 
        int[] yPointsRectangle3 = {221, 221, 278, 278};
        g.drawPolygon(xPointsRectangle3, yPointsRectangle3, xPointsRectangle3.length);
        
        Line2D linerectangle3 = new Line2D.Double();
        linerectangle3.setLine(906, 231, 
                          1013, 231);
        graphics2D.draw(linerectangle3);   
        
        Ellipse2D cloud1 = new Ellipse2D.Float();
        cloud1.setFrame(434, 107, 39, 17);
        graphics2D.draw(cloud1);

        Ellipse2D leftEyeCloud1 = new Ellipse2D.Float();
        leftEyeCloud1.setFrame(447, 112, 2, 5);
        graphics2D.draw(leftEyeCloud1);

        Ellipse2D rightEyeCloud1 = new Ellipse2D.Float();
        rightEyeCloud1.setFrame(452, 112, 2, 5);
        graphics2D.draw(rightEyeCloud1);
        
        Ellipse2D cloud2 = new Ellipse2D.Float();
        cloud2.setFrame(755, 164, 39, 17);
        graphics2D.draw(cloud2);

        Ellipse2D leftEyeCloud2 = new Ellipse2D.Float();        
        leftEyeCloud2.setFrame(168, 168, 2, 5);
        graphics2D.draw(leftEyeCloud2);

        Ellipse2D rightEyeCloud2 = new Ellipse2D.Float();
        rightEyeCloud2.setFrame(173, 168, 2, 5);
        graphics2D.draw(rightEyeCloud2);

        Ellipse2D cloud3 = new Ellipse2D.Float();
        cloud3.setFrame(5, 125, 39, 17);
        graphics2D.draw(cloud3);
        
        Ellipse2D leftEyeCloud3 = new Ellipse2D.Float();
        leftEyeCloud3.setFrame(18, 129, 2, 5);
        graphics2D.draw(leftEyeCloud3);
        
        Ellipse2D rightEyeCloud3 = new Ellipse2D.Float();
        rightEyeCloud3.setFrame(22, 129, 2, 5);
        graphics2D.draw(rightEyeCloud3);
        
        Ellipse2D cloud4 = new Ellipse2D.Float();
        cloud4.setFrame(157, 163, 39, 17);
        graphics2D.draw(cloud4);

        Ellipse2D leftEyeCloud4 = new Ellipse2D.Float();
        leftEyeCloud4.setFrame(764, 169, 2, 5);
        graphics2D.draw(leftEyeCloud4);
        
        Ellipse2D rightEyeCloud4 = new Ellipse2D.Float();
        rightEyeCloud4.setFrame(769, 169, 2, 5);
        graphics2D.draw(rightEyeCloud4);
        
        
    }
}