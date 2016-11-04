/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8.gameobject;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;


/**
 *
 * @author szymansm2
 */
public class GameObject {
    protected int x, y;
    protected String name;
    protected BufferedImage sprite;
    protected int moveSpeed = 0;
    protected Rectangle hitBox;
    protected boolean alive; 

    public GameObject() {
        this.alive = true;
    }
    
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public BufferedImage getSprite() {
        return sprite;
    }
    
    public Rectangle getBounds(){
        return new Rectangle(this.x, this.y, this.sprite.getWidth(), this.sprite.getHeight());
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    public int getWidth(){
        return this.sprite.getWidth();
    }
    public int getHeight(){
        return this.sprite.getHeight();
    }
    public Dimension center(){
        return new Dimension(x + sprite.getHeight()/2, y + sprite.getWidth()/2); 
    }
    public void update(){};
    public void setSprite(String fileName){};
}
