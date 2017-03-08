package Excercise8;

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
    public static void puntos (City p, int x, int y){
        Thing parce[][] = new Thing[5][5];
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 5; j++) {
             parce[i][j]=new Thing(p,i+x,j+y);  
             }
        }
    } 
    public static void avanzar (Robot k){
        for (int i = 0; i < 4; i++) {
            k.pickThing();
            k.move();
        }
    }
    public static void izquierda (Robot k){
       
            k.pickThing();
            k.turnLeft();
            k.turnLeft();
            k.turnLeft();
            k.move();
            k.turnLeft();
            k.turnLeft();
            k.turnLeft();
       
    }
    public static void Derecha (Robot k){
       
            k.pickThing();
            k.turnLeft();
            k.move();
            k.turnLeft();
       
    }
    public static void cambio (Robot k){
       
            k.pickThing();
             k.turnLeft();
            k.turnLeft();
            k.turnLeft();
            k.move();
            k.turnLeft();
            k.move();
            k.move();
            k.turnLeft();
             k.move();
       
    }
    public static void main(String[] args) {
        // Set up the initial situation
        City prague = new City(15, 15);
   
        Robot karel = new Robot(prague, 7, 1, Direction.EAST, 5);
         pared(5,1,7,prague);
         pared(5,1,6,prague);
         pared(5,7,7,prague);
         pared(5,7,6,prague);
         muro(5,7,6,prague);
         muro(5,7,5,prague);
          muro(5,1,6,prague);
         muro(5,1,5,prague);
        puntos(prague,7,1);
        puntos(prague,1,1);
        puntos (prague,1,7);
        puntos(prague,7,7);
        int y=5;
        int q=0;
        for (int j = 0; j < 4; j++) {
        for (int i = q; i < y; i++) {
        avanzar(karel);
        if(i!=y-1){
        if(i%2==0){
            izquierda(karel);
        }else{
            Derecha(karel); }   
        }else{
            cambio(karel); }}}
    }
}