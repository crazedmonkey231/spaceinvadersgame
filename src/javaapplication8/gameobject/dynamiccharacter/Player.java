/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8.gameobject.dynamiccharacter;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication8.gameobject.GameObject;
import javaapplication8.gameobject.staticcharacter.Bullet;
import javax.imageio.ImageIO;

/**
 *
 * @author szymansm2
 */
public class Player extends GameObject{
    private boolean left, right, up, down, shoot;
    public LinkedList<Bullet> bullet; 
    private int health; 
    
    @Override
    public void update(){
        move(); 
        
    }
    public Player(){
        health = 75;
        alive = true; 
        bullet = new LinkedList();
    }
   //These 4 functions are able to set the direction
   public void setLeft (boolean newLeft){
      left  = newLeft; 
   }
   public void setRight(boolean newRight){
      right = newRight;
   }
   //Uncomment to add up and down movements
   public void setUp(boolean newUp){
      up = newUp;   
   }
   public void setDown(boolean newDown){
      down = newDown; 
   }
   public void setShoot(boolean newShot){
       shoot = newShot;
   }
   private void move() {
      if(left){
         x -= moveSpeed;
      }if(right){
         x += moveSpeed;
      }if(up){
         y -= moveSpeed;
      }if(down){
         y += moveSpeed;
      } 
      if(shoot){
        if(!(bullet.size() >= 5)){
            bullet.add(new Bullet(center()));
        }
        shoot = false; 
      }
    }
 
    @Override
    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }
    
    public void setDefaultLocation(int x, int y){
        this.x = x;
        this.y = y; 
    }
    @Override
    public void setSprite(String fileName) {
        try {
            BufferedImage img = null;
            img = ImageIO.read(new File(fileName));
            sprite = img;
        } catch (IOException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    
}
