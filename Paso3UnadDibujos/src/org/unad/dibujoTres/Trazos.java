/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unad.dibujoTres;

import org.unad.dibujoTres.*;
import org.unad.dibujoTres.*;
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
        int[] xPointsLeftEar = { 70, 140, 66, 20}; 
        int[] yPointsLeftEar = { 53, 99, 240, 134};
        g.drawPolygon(xPointsLeftEar, yPointsLeftEar, xPointsLeftEar.length);
        
        int[] xPointsRightEar = {346 , 415, 465, 416}; 
        int[] yPointsRightEar = { 103, 53, 133, 239};
        g.drawPolygon(xPointsRightEar, yPointsRightEar, yPointsRightEar.length);

        int[] xPointsFace = {241 , 346, 446, 400, 310, 287, 239, 183, 173,  80,  39, 139}; 
        int[] yPointsFace = { 71 , 103, 300, 400, 441, 473, 482, 465, 441, 403, 293, 103};
        g.drawPolygon(xPointsFace, yPointsFace, xPointsFace.length);

        int[] xPointsFaceInPartOne = {140, 200, 81, 39}; 
        int[] yPointsFaceInPartOne = { 99, 200, 403, 293};
        g.drawPolygon(xPointsFaceInPartOne, yPointsFaceInPartOne, xPointsFaceInPartOne.length);

        int[] xPointsFaceInPartTwo = {200, 190, 160, 117}; 
        int[] yPointsFaceInPartTwo = {200, 323, 374, 339};
        g.drawPolygon(xPointsFaceInPartTwo, yPointsFaceInPartTwo, xPointsFaceInPartTwo.length);

        int[] xPointsFaceInPartThree = {346, 284, 400, 445}; 
        int[] yPointsFaceInPartThree = {103, 201, 400, 300};
        g.drawPolygon(xPointsFaceInPartThree, yPointsFaceInPartThree, xPointsFaceInPartThree.length);

        int[] xPointsFaceInPartFour = {284, 299, 327, 369}; 
        int[] yPointsFaceInPartFour = {201, 327, 375, 345};
        g.drawPolygon(xPointsFaceInPartFour, yPointsFaceInPartFour, xPointsFaceInPartFour.length);

        int[] xPointsFirstPartMouse = {173, 80, 117, 159}; 
        int[] yPointsFirstPartMouse = {441, 403, 340, 374};
        g.drawPolygon(xPointsFirstPartMouse, yPointsFirstPartMouse, xPointsFirstPartMouse.length);
 
        int[] xPointsSecondPartMouse = {368, 400, 310, 327}; 
        int[] yPointsSecondPartMouse = {347, 400, 441, 372};
        g.drawPolygon(xPointsSecondPartMouse, yPointsSecondPartMouse, xPointsSecondPartMouse.length);       
        
        int[] xPointsThirdPartMouse = {174, 197, 241, 284, 310, 287, 239, 183}; 
        int[] yPointsthirdPartMouse = {445, 452, 435, 454, 441, 473, 482, 465};
        g.drawPolygon(xPointsThirdPartMouse, yPointsthirdPartMouse, yPointsthirdPartMouse.length);       

        int[] xPointsFourPartMouse = {242, 266, 241, 219}; 
        int[] yPointsFourPartMouse = {435, 445, 456, 444};
        g.drawPolygon(xPointsFourPartMouse, yPointsFourPartMouse, xPointsFourPartMouse.length);       
        
    }
}