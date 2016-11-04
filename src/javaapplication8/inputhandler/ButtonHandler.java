/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8.inputhandler;

import javaapplication8.Graphics.Instances;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author szymansm2
 */
public class ButtonHandler extends KeyAdapter {

    public ButtonHandler() {

    }

    public void keyTyped(KeyEvent arg0) {

        //This one we wont use. Its unreliable for making a game handler      
    }

    //This function will be used as soon as a key is released. they KeyEvent key we can use to determine what key we just released
    public void keyReleased(KeyEvent key) {
        switch (key.getKeyCode()) {
           case KeyEvent.VK_UP:
               Instances.player.setUp(false);
               break;
           case KeyEvent.VK_DOWN:
              Instances.player.setDown(false);
               break;
           case KeyEvent.VK_LEFT:
              Instances.player.setLeft(false);
               break;
           case KeyEvent.VK_RIGHT:
              Instances.player.setRight(false);
               break;
           case KeyEvent.VK_SPACE:
              Instances.player.setShoot(true);
            break;
        
        }
    }
    //This function will be used as soon as a key is pressed.

    public void keyPressed(KeyEvent key) {
        switch (key.getKeyCode()) {
            case KeyEvent.VK_UP:
                Instances.player.setUp(true);
                break;
            case KeyEvent.VK_DOWN:
                Instances.player.setDown(true);
                break;
            case KeyEvent.VK_LEFT:
                Instances.player.setLeft(true);
                break;
            case KeyEvent.VK_RIGHT:
                Instances.player.setRight(true);
                break;
        }
    }
}
