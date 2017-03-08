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
public class Map {

    public static void map (City p, int x, int y, int z, int u){
        Thing parce[][] = new Thing[u][z];
         for (int i = u-2; i > 0; i--) {
             for (int j = z; j > 0; j--) {
             parce[u-1][z-1]=new Thing(p,i+x,j+y);  
             }
             z=z-1;
        }
    }
    
}