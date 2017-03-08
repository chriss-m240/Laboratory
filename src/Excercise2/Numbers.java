package Excercise2;

import becker.robots.*;
import java.awt.Color;

public class Numbers {

    public static boolean A, B, C, D, E, F, G;

    private Robot x;
    private City cuartos;
    private Thing numeros;
    private Wall muros;

    public Numbers() {
        this.cuartos = new City(15,15);
        this.x = new Robot(cuartos, 6, 2, Direction.NORTH, 5);
        //cero
        for (int i = 1; i < 6; i = i + 4) {
            for (int j = 1; j < 4; j++) {
                this.numeros = new Thing(cuartos, i, j);
                this.numeros = new Thing(cuartos, i, j);
            }
        }
        for (int i = 1; i < 4; i = i + 2) {
            for (int j = 2; j < 5; j++) {
                this.numeros = new Thing(cuartos, j, i);
                this.numeros = new Thing(cuartos, j, i);
            }
        }
        //cinco
        for (int i = 1; i < 6; i = i + 2) {
            for (int j = 4; j < 7; j++) {
                this.numeros = new Thing(cuartos, i, j);
                this.numeros = new Thing(cuartos, i, j);
            }
        }
        this.numeros = new Thing(cuartos, 2, 4);
        this.numeros = new Thing(cuartos, 4, 6);
        //cero
        for (int i = 1; i < 6; i = i + 4) {
            for (int j = 7; j < 10; j++) {
                this.numeros = new Thing(cuartos, i, j);
                this.numeros = new Thing(cuartos, i, j);
            }
        }
        for (int i = 7; i < 10; i = i + 2) {
            for (int j = 2; j < 5; j++) {
                this.numeros = new Thing(cuartos, j, i);
                this.numeros = new Thing(cuartos, j, i);
            }
        }
        for (int i = 1; i < 10; i++) {
            this.muros = new Wall(cuartos, 1, i, Direction.NORTH);
            for (int j = 1; j < 6; j++) {
                for (int k = 1; k < 11; k = k + 3) {
                    this.muros = new Wall(cuartos, j, k, Direction.WEST);
                }
            }
            this.muros = new Wall(cuartos, 5, 1, Direction.SOUTH);
            this.muros = new Wall(cuartos, 5, 3, Direction.SOUTH);
            this.muros = new Wall(cuartos, 5, 4, Direction.SOUTH);
            this.muros = new Wall(cuartos, 5, 6, Direction.SOUTH);
            this.muros = new Wall(cuartos, 5, 7, Direction.SOUTH);
            this.muros = new Wall(cuartos, 5, 9, Direction.SOUTH);
        }
    }

    public void derecha() {
        for (int i = 0; i < 3; i++) {
            x.turnLeft();
        }
        x.move();
    }

    public void explorar() {
        x.move();
        x.turnLeft();
        x.move();
        this.derecha();
        x.canPickThing();
        A = x.canPickThing() == true;
        x.move();
        x.move();
        x.canPickThing();
        B = x.canPickThing() == true;
        x.move();
        this.derecha();
        C = x.canPickThing() == true;
        this.derecha();
        x.move();
        x.canPickThing();
        D = x.canPickThing() == true;
        x.move();
        x.move();
        x.canPickThing();
        E = x.canPickThing() == true;
        x.turnLeft();
        x.move();
        x.turnLeft();
        x.move();
        x.canPickThing();
        F = x.canPickThing() == true;
        x.move();
        x.move();
        x.canPickThing();
        G = x.canPickThing() == true;
        x.move();
        x.setColor(Color.CYAN);
        if ((A == true) && (B == true) && (C == true) && (D == false) && (E == true) && (F == true) && (G == true)) {
            System.out.println("0");
        }
        if ((A == false) && (B == false) && (C == false) && (D == false) && (E == false) && (F == true) && (G == true)) {
            System.out.println("1");
        }
        if ((A == true) && (B == false) && (C == true) && (D == true) && (E == true) && (F == false) && (G == true)) {
            System.out.println("2");
        }
        if ((A == false) && (B == false) && (C == true) && (D == true) && (E == true) && (F == true) && (G == true)) {
            System.out.println("3");
        }
        if ((A == false) && (B == true) && (C == false) && (D == true) && (E == false) && (F == true) && (G == true)) {
            System.out.println("4");
        }
        if ((A == false) && (B == true) && (C == true) && (D == true) && (E == true) && (F == true) && (G == false)) {
            System.out.println("5");
        }
        if ((A == true) && (B == true) && (C == true) && (D == true) && (E == true) && (F == true) && (G == false)) {
            System.out.println("6");
        }
        if ((A == false) && (B == false) && (C == true) && (D == false) && (E == false) && (F == true) && (G == true)) {
            System.out.println("7");
        }
        if ((A == true) && (B == true) && (C == true) && (D == true) && (E == true) && (F == true) && (G == true)) {
            System.out.println("8");
        }
        if ((A == false) && (B == true) && (C == true) && (D == true) && (E == false) && (F == true) && (G == true)) {
            System.out.println("9");
        }
    }

    public void otro(int i) {
        this.x = new Robot(cuartos, 6, i, Direction.NORTH, 5);
    }

    public static void main(String[] args) {
        Numbers z = new Numbers();
        z.explorar();
        z.otro(5);
        z.explorar();
        z.otro(8);
        z.explorar();

    }
}