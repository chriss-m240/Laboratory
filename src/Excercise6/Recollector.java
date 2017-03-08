package Excercise6;

import becker.robots.*;

public class Recollector {
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
        Thing parcel = new Thing(prague, 10, 2);
        Thing parce2 = new Thing(prague, 8, 2);
        Thing parce3 = new Thing(prague, 7, 5);
        Thing parce4 = new Thing(prague, 11, 5);
        Thing parce5 = new Thing(prague, 7, 3);
        Thing parce6 = new Thing(prague, 8, 6);
        Thing parce7 = new Thing(prague, 11, 3);
        Thing parce8 = new Thing(prague, 10, 6);
        Robot karel = new Robot(prague, 12, 2, Direction.NORTH, 5);
       muro(5,7,1,prague);
       muro(5,7,6,prague);
       pared(5,2,7,prague);
       pared(4,3,12,prague);
        muro(5,2,9,prague);
       muro(5,2,14,prague);
       pared(5,10,2,prague);
       pared(4,11,7,prague);
       
       boolean[] y= new boolean[17];
       karel.move();
       int i=0;
       while(!libre(karel)){
           if (karel.canPickThing()){
            karel.pickThing();
            y[i]=true;
        }
        if(karel.frontIsClear()){
        karel.move();    
        }
        else{
            i=i-1;
            if(libreD(karel)){
              karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft(); 
            }
            else{
            
                karel.turnLeft();
            }
            }
        
        
        i++;
        }
       int g=8;
       
        for (int p = 0; p < 2; p++) {
            karel.turnLeft();
        for (int j = 0; j < g; j++) {
            karel.move();
        }
    
        g=g-2;
    }
        i=0;
        while(!libre(karel)){
             
   
           if (y[i]==true){
            karel.putThing();
        }
       
           
        if(karel.frontIsClear()){
        karel.move();    
        }
        else{
          
            if(libreD(karel)){
              karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft(); 
            i=i-1;
            }
            else{
            i=i-1;
                karel.turnLeft();
            }
            }
        i++;
            }
        
        
        
        }
    }
   