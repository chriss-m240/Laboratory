package becker;


import becker.robots.*;

/**
 * Clase con Funciones para solucionar cualquier laberinto
 * @author Stephan
 */
public class DeliverParcel {

    /**
     * metodo para hacer paredes a partir de arreglos 
     * @param y tamaño de la pared
     * @param x coordenada en x
     * @param h coordenada en y
     * @param b ciudad a la cual se le hara la pared
     */
    public static void pared(int y , int x,int  h, City b){
        Wall o[] = new Wall[y];
        for (int i = 0; i < y; i++) {
        
            o[i] = new Wall(b, h, i + x, Direction.NORTH);
        }
    }
 
   /**
     * metodo para hacer muros a partir de arreglo de paredes
     * @param y tamaño del muro
     * @param x coordenada en x
     * @param h coordenada en y
     * @param b ciudad a la cual se le hara el muro
     */
    public static void muro(int y , int x,int  h, City b){
        Wall o[] = new Wall[y];
        for (int i = 0; i < y; i++) {
        
            o[i] = new Wall(b, x+i, h, Direction.EAST);
        }
    }

    /**
     *meotodo pra saber si la derecha de karel esta libre
     * @param k
     * @return verdadero si esta libre, falso si hay pared
     */
    public static boolean libreDerecha(Robot k){
      int y;
       k.turnLeft();
       k.turnLeft();
       k.turnLeft();
            if(k.frontIsClear()){
                y=5;
            }else{
                
            y=7;
        }  
         
          k.turnLeft();   
        return (y==5);
    }

    /**
     * metodo que hace que karel se pegue a una pared, para el caso en el que este este ubicado en un lugar sin paredes
     * @param karel
     */
    public static void inicio (Robot karel){
            int y=0;
       while(libreDerecha(karel)==true){
           karel.turnLeft();
           y++;
           if (y%4==0) {
               karel.move();
           }
       } 
       }

    /**
     * metodo para encontar la salida del laberinto
     * @param karel
     */
    public static void BuscarSalida(Robot karel){
          while(!karel.canPickThing()){
        if(karel.frontIsClear()&& !libreDerecha(karel)){
        karel.move();    
        }
        else{
            if(libreDerecha(karel)){
              karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft(); 
            karel.move();
            }
            else{
            
                karel.turnLeft();
            }
            }
        }
     }

    /**
     * metodo para pegar a karel a una pared y que luego halle una salida
     * @param karel
     */
    public static void laberinto(Robot karel){
         inicio(karel);
   BuscarSalida(karel);
     }

    /**
     *metodo para crear las paredes y muros de laberinto
     * @param prague ciudad de karel
     */
    public static void CrearEscenario(City prague) {
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
     }

    /**
     * Se crea la ciudad, a karel y un Thing luego se ejecutan funcionen para solucionar el problema
     * @param args
     */
    public  static void main(String[] args) {                
    City prague = new City(50, 50);
    Thing parcel = new Thing(prague, 11,3);
    Robot karel= new Robot(prague,10,7,Direction.NORTH);
    CrearEscenario(prague);
    laberinto(karel);
    }
}