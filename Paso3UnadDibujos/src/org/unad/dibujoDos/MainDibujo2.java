/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unad.dibujoDos;

import java.awt.Font;
import java.awt.Label;
import org.unad.dibujoDos.*;
import javax.swing.*;

/**
 *
 * @author David
 */
public class MainDibujo2 {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Dibujo 2");
        Trazos trazos = new Trazos();

        JLabel l1 = new JLabel("DAVID");
        l1.setFont(new Font("Serif", Font.PLAIN, 30));
        l1.setBounds(185, 225, 200, 100);
        jFrame.add(l1);

        jFrame.add(trazos);
        jFrame.setSize(480, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
