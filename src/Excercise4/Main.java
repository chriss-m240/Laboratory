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
public class Main {
    
    public static void main(String[] args){
        City rome = new City();
        Data a = new Data();
        Histogram h = new Histogram();
        a.getData(rome);
        Robot karel = new Robot(rome,1,1, Direction.EAST,a.getTColumns());
        h.draw(karel, rome, a);
    }
    
}
