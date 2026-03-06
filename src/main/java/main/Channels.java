/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author rash4
 */
public final class Channels {
    private Channels(){}
    
    public static void repaint(){Container.GUI.panel.repaint();}
    public static void render(Graphics2D grr){
        grr.drawImage(test, 12, 12, null);
    }
    public static void update(){
        
    }
    public static void resize(){
        
    }
    public static void scale(){
        
    }
    
    private static BufferedImage test;
    static {
        test = mats.Mages.m().getImage(0);
    }
}