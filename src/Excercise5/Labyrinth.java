package Excercise5;

import becker.robots.*;

public class Labyrinth {
    public static void pared(int y , int x,int  h, City b){
        Wall o[] = new Wall[y];
        for (int i = 0; i < y; i++) {

            o[i] = new Wall(b, h, i + x, Direction.NORTH);
        }
    }
    public static void muro(int y , int x,int  h, City b){
        Wall o[] = new Wall[y];
        for (int i = 0; i < y; i++) {

            o[i] = new Wall(b, x+i, h, Direction.EAST);
        }
    }

    public static boolean libre(Robot k){
        int y=0;
        for (int i = 0; i < 4; i++) {
            if(k.frontIsClear()){
                y=y+1;
            }
            k.turnLeft();
        }
      return(y==4);

    }

    public static boolean libreD(Robot k){
      int y=0;
        for (int i = 0; i < 2 ; i++) {
            if(!k.frontIsClear()){
                y=y+1;
            }
            k.turnLeft();
        }
           k.turnLeft();
              k.turnLeft();
        return (y==2);
    }
     public static boolean libreI(Robot k){
      int y=0;
       k.turnLeft();
        for (int i = 0; i < 3 ; i++) {
            if(k.frontIsClear()){
                y=y+1;
            }
            k.turnLeft();
        }


        return (y==3);
    }
    public static void main(String[] args) {
        // Set up the initial situation
        City prague = new City(15, 15);
        Thing parcel = new Thing(prague, 6, 7);
        Thing parce2 = new Thing(prague, 8, 5);
        Thing parce3 = new Thing(prague, 10, 4);
        Robot karel = new Robot(prague, 10, 7, Direction.NORTH, 5);
         pared(4,3,5,prague);
        pared(2,4,6,prague);
        pared(1,7,6,prague);
        pared(1,2,7,prague);
        pared(1,6,7,prague);
        pared(1,8,7,prague);
        pared(1,1,8,prague);
        pared(1,3,8,prague);
        pared(1,5,8,prague);
        pared(1,7,8,prague);
        pared(1,2,9,prague);
        pared(1,4,9,prague);
        pared(2,6,9,prague);
        pared(1,1,10,prague);
        pared(1,5,10,prague);
        pared(1,8,10,prague);
        pared(2,2,11,prague);
        pared(1,7,11,prague);
        muro(2,5,2,prague);
        muro(2,8,2,prague);
        muro(1,7,1,prague);
        muro(1,10,1,prague);
        muro(2,8,0,prague);
        muro(2,6,3,prague);
        muro(2,9,3,prague);
        muro(2,7,4,prague);
        muro(1,10,4,prague);
        muro(1,9,5,prague);
        muro(1,6,5,prague);
        muro(1,5,6,prague);
        muro(1,7,6,prague);
        muro(2,9,6,prague);
        muro(1,6,7,prague);
        muro(1,10,7,prague);
        muro(3,7,8,prague);



        while(!libre(karel)){
        if(karel.frontIsClear()){
        karel.move();
        }
        else{
            if(libreI(karel) ||libreD(karel)){
              karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            }
            else{

                karel.turnLeft();
            }
            }

        if (karel.canPickThing()){
            karel.pickThing();
        }
        }
               System.out.println(karel.countThingsInBackpack());
    }
}
