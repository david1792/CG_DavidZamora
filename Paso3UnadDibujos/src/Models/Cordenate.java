/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author David
 */
public class Cordenate {
    private int X1 = 0;
    private int X2 = 0;
    private int Y1 = 0;
    private int Y2 = 0;

    public Cordenate(int X1, int Y1, int X2, int Y2) {
        this.X1 = X1;
        this.Y1 = Y1;
        this.X2 = X2;
        this.Y2 = Y2;        
    }

    public void setFirstDot(int X1, int Y1) {
        this.X1 = X1;
        this.Y1 = Y1;
    }

    public void setSecondDot(int X2, int Y2) {
        this.X2 = X2;
        this.Y2 = Y2;
    }
    
    public int getX1() {
        return X1;
    }
    public int getX2() {
        return X2;
    }
    public int getY1() {
        return Y1;
    }
    public int getY2() {
        return Y2;
    }
}
