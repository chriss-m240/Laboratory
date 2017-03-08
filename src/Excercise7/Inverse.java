/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise7;

import becker.robots.*;

/**
 *
 * @author Invitado1
 */
public class Inverse {
    
   private int[] Points;
    
    public void getPoints(City c, Robot Karel){
        int nPoints = 0;
        Points = new int[9];
        for (int j = 0; Karel.canPickThing(); j++) {
            for (int i = 0; Karel.canPickThing(); i++) {
                Karel.pickThing();
                Karel.move();
                nPoints = i;
                
            }
             Karel.turnLeft();
             Karel.turnLeft();
             int n = nPoints + 1;
             while (n != 0) {
                 Karel.move();
                 n--;
             }
             
             Karel.turnLeft();
             Karel.move();
             Karel.turnLeft();
            this.Points[j] = nPoints+1;
            System.out.println(Points[j]);
        }  
    }
    
    public void getBack(Robot Karel){
         Karel.turnLeft();
        for (int i = 0; i < 9; i++) {
            Karel.move();  
        }
         Karel.turnLeft();
         Karel.turnLeft();
         Karel.turnLeft();
    }
    
    public void reDraw(Robot Karel){
        for (int i = Points.length-1;i > -1; i--) {
            if (Points[i] == 0){
                i--;
            }
            int n = Points[i];
            while (Points[i]-1 >= 0){
                Karel.putThing();
                Karel.move();
                Points[i]--;
            }
            
            Karel.turnLeft();
             Karel.turnLeft();
             
             while (n != 0) {
                 Karel.move();
                 n--;
             }
             
             Karel.turnLeft();
             Karel.move();
             Karel.turnLeft();
           
            
        }
    }
    
        
    }