/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8.gameobject.staticcharacter;

import java.awt.Dimension;
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
 * @author Michael
 */
public class Bullet extends GameObject{
    private int damage; 
            
    public Bullet(Dimension location){
        damage = 25; 
        this.x = location.width;
        this.y = location.height; 
        try {
            BufferedImage img = null;
            img = ImageIO.read(new File(".\\src\\images\\bullet.png"));
            sprite = img;
        } catch (IOException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
        alive = true; 
    }
    @Override
    public void update(){
        move();
    }
    private void move() {
        y--;
    }

    public int getDamage() {
        return damage;
    }
    
}
