/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/**
 *
 * @author rash4
 */
public class Inputs implements KeyListener, MouseListener, MouseMotionListener, MouseWheelListener{
    private Inputs(){}
    
    
    

    @Override public void keyTyped(KeyEvent e) {
    }

    @Override public void keyPressed(KeyEvent e) {
    }

    @Override public void keyReleased(KeyEvent e) {
    }

    @Override public void mouseClicked(MouseEvent e) {
    }

    @Override public void mousePressed(MouseEvent e) {
    }

    @Override public void mouseReleased(MouseEvent e) {
    }

    @Override public void mouseEntered(MouseEvent e) {
    }

    @Override public void mouseExited(MouseEvent e) {
    }

    @Override public void mouseDragged(MouseEvent e) {
    }

    @Override public void mouseMoved(MouseEvent e) {
    }

    @Override public void mouseWheelMoved(MouseWheelEvent e) {
    }
    
    private final static Inputs INS;
    static{
        INS = new Inputs();
    }
}