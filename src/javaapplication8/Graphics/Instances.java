/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8.Graphics;



import java.awt.Dimension;
import javaapplication8.gameobject.dynamiccharacter.Player;
import javaapplication8.gameobject.staticcharacter.Alien;


/**
 *
 * @author szymansm2
 */
public class Instances{

    /**
     *
     */
    public static Alien alien1 = new Alien(new Dimension(50, 50));
    public static Player player = new Player();
}
