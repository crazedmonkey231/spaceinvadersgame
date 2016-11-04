/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8.gameinstance;

import javaapplication8.Graphics.Instances;
import javaapplication8.Graphics.Draw;
import javaapplication8.gameobject.GameObject;
import javaapplication8.gameobject.staticcharacter.Alien;
import javaapplication8.gameobject.staticcharacter.Bullet;

/**
 *
 * @author szymansm2
 */
public class Game implements Runnable{
    public Draw drawing = new Draw();
    
    public void setSprites(){
        Instances.player.setSprite(".\\src\\images\\ship.png");
    }
    
    public void setLocations(){
        Instances.player.setDefaultLocation(25, 400);
    }
    public void setMoveSpeed(){
        Instances.player.setMoveSpeed(3);
    }
    public void checkCollision(GameObject o){
        if(o.getY() < 0 - o.getSprite().getHeight() && o.getClass().equals(Bullet.class)){
            o.setAlive(false);
        }
        else if(o.getY() < 0 - o.getSprite().getHeight()){
            o.setY(drawing.getHEIGHT());
        }
        if(o.getX() > drawing.getWIDTH()){
            o.setX(0 - o.getSprite().getWidth());
        }
        if(o.getY() > drawing.getHEIGHT()){
            o.setY(0 - o.getSprite().getHeight());
        }
        if(o.getBounds().intersects(Instances.alien1.getBounds()) && o.getClass().equals(Bullet.class)){
            Bullet b = (Bullet) o; 
            Instances.alien1.setDamageHealth(b.getDamage());
            o.setAlive(false);
        }
    }
 
     @Override
    public void run() {
        setSprites();
        setLocations();
        setMoveSpeed();
        
        
        while(true){
            if(Instances.alien1.isAlive()){
                Instances.alien1.update();
                checkCollision(Instances.alien1);
            }
            
            Instances.player.update();
            checkCollision(Instances.player);
            
            
            for (Bullet bullet : Instances.player.bullet) {
                bullet.update();
                checkCollision(bullet);
            } 
            drawing.render();
    try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
        }
    }
    
}
