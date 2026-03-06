/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author rash4
 */
public class Container implements InitInOrder{
    private Container(){}
    
    @Override public void initialize(){
        this.panel = new JPanel(){
            @Override protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Channels.render((Graphics2D)g);
            }
        };
        this.panel.setLayout(null);
        this.panel.setPreferredSize(new Dimension(820, 680));
        this.panel.addComponentListener(new ComponentAdapter(){
            @Override public void componentResized(ComponentEvent ce){
                Channels.resize();
            }
        });
        this.frame = new JFrame();
        this.frame.addWindowFocusListener(new WindowFocusListener() {
            @Override public void windowGainedFocus(WindowEvent e) {
                Container.this.panel.requestFocusInWindow();
            }
            @Override public void windowLostFocus(WindowEvent e){}
        });
        this.frame.setContentPane(this.panel);
        this.frame.pack();
        this.frame.setResizable(true);
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(2);
        this.frame.setVisible(true);
    }
    
    JFrame frame;
    JPanel panel;
    final static Container GUI;
    public static Container g(){return GUI;}
    static{
        GUI = new Container();
    }
}