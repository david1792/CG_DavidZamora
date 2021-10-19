/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unad.dibujoTres;

import org.unad.dibujoUno.*;
import javax.swing.*;

/**
 *
 * @author David
 */
public class MainDibujo3 {
    
    
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Dibujo 1");
        Trazos trazos = new Trazos();
        jFrame.add(trazos);
        jFrame.setSize(700, 850);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
