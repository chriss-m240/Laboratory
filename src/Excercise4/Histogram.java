/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise4;

import becker.robots.*;
   
/**
 *
 * @author chris
 */
public class Histogram {
    
  

    public Histogram() {
    }
    
    public void draw(Robot karel, City c, Data d){
        for (int i = 0; i < d.getnColumns().length; i++) {
            int counter = d.getnColumns()[i];
            while (counter-1 != 0) {
                karel.move();
                karel.putThing();
                counter--;
            }
            
            karel.turnLeft();
            karel.turnLeft();
            for (int j = 0; j < d.getnColumns()[i]-1; j++) {
                karel.move();
            }
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
        }
        
        
        
    }
    
}
