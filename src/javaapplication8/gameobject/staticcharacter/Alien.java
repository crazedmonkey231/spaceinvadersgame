/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8.gameobject.staticcharacter;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication8.gameobject.GameObject;
import javaapplication8.gameobject.dynamiccharacter.Player;
import javax.imageio.ImageIO;

/**
 *
 * @author szymansm2
 */
public class Alien extends GameObject{
    private int health;
    private boolean left, right, down;
    
    public Alien(Dimension location){
        left = false;
        right = true;
        down = false;
        health = 100; 
        this.x = location.width;
        this.y = location.height; 
        try {
            BufferedImage img = null;
            img = ImageIO.read(new File(".\\src\\images\\alien_ship.png"));
            sprite = img;
        } catch (IOException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
        alive = true; 
    }
    
    public Alien(){
        left = false;
        right = true;
        down = false;
        health = 100;
        this.x = 0;
        this.y = 0; 
        try {
            BufferedImage img = null;
            img = ImageIO.read(new File(".\\src\\images\\alien_ship.png"));
            sprite = img;
        } catch (IOException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
        alive = true; 
    }

    @Override
    public void update(){
        if(health <= 0){
            this.setAlive(false); 
        }
        move();
    }
    
    private void move() {
        if(right){
            
        }
        if(left){
            
        }
        if(down){
            
        }
    }

    public int getHealth() {
        return health;
    }

    public void setDamageHealth(int damage) {
        this.health = health - damage;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BufferedImage getSprite() {
        return sprite;
    }

    public void setSprite(BufferedImage sprite) {
        this.sprite = sprite;
    }

    public Rectangle getHitBox() {
        return hitBox;
    }

    public void setHitBox(Rectangle hitBox) {
        this.hitBox = hitBox;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
}
