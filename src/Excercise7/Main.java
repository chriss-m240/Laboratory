package Excercise7;

import becker.robots.*;


public class Main {
   public static void main( String[] args){
       City Prague = new City(15,15);
       Robot Karel = new Robot(Prague,6,1, Direction.NORTH);
       Map a = new Map();
       Inverse i = new Inverse();
       
       a.map(Prague,-1,0,9,9);
       i.getPoints(Prague,Karel);
       i.getBack(Karel);
       i.reDraw(Karel);
       
    }
   }
