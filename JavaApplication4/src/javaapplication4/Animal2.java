/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.awt.image.BufferedImage;

/**
 *
 * @author Hello
 */
public class Animal2 implements ICrosser{

      @Override
    public boolean canSail() {
        return false;
    }

    @Override
    public double getWeight() {
        return 20;
    }

    @Override
    public int getEatingRank() {
        return 0;
    }

    @Override
    public BufferedImage[] getImages() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ICrosser makeCopy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLabelToBeShown(String label) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLabelToBeShown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
