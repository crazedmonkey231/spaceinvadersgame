/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8.Main;

import javaapplication8.gameinstance.Game;


/**
 *
 * @author szymansm2
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args)
    {
       
        Game ex = new Game();               //Creates new object of type Game, and name it ex.
        new Thread(ex).start();
        
    }
}
