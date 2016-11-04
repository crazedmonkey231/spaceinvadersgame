/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8.Graphics;

/**
 *
 * @author szymansm2
 */
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import javaapplication8.gameobject.staticcharacter.Bullet;
import javaapplication8.inputhandler.ButtonHandler;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Draw {
   JFrame frame;
   Canvas canvas;

   BufferStrategy bufferStrategy;

   private int WIDTH = 640;
   private int HEIGHT = 480;
   
    public Draw(){
        frame = new JFrame("Basic Game");
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panel.setLayout(null);
        
        canvas = new Canvas();
        canvas.setBounds(0, 0, WIDTH, HEIGHT);
        canvas.setIgnoreRepaint(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
        panel.add(canvas);
        canvas.createBufferStrategy(2);
        bufferStrategy = canvas.getBufferStrategy();
        canvas.requestFocus();
        canvas.setBackground(Color.black);
        
        canvas.addKeyListener(new ButtonHandler());
        
    }
    public void render() {
      Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
      g.clearRect(0, 0, WIDTH, HEIGHT);
      render(g);
      g.dispose();
      bufferStrategy.show();
   }
    protected void render(Graphics2D g){
        g.setColor(Color.RED);

        for(int i = 0; i < Instances.player.bullet.size(); i++){
            Bullet b = Instances.player.bullet.get(i);
            if(b.isAlive()){
                g.drawImage(b.getSprite(), null, b.getX() - b.getWidth()/4, b.getY() - b.getHeight());
            }else{
                Instances.player.bullet.remove(i);
            }
        }
        g.drawImage(Instances.player.getSprite(), null, Instances.player.getX(), Instances.player.getY());
        
        if(Instances.alien1.isAlive()){
            g.drawImage(Instances.alien1.getSprite(), null, Instances.alien1.getX(), Instances.alien1.getY());
        }
        
   }

    public JFrame getFrame() {
        return frame;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }
    
    
}
