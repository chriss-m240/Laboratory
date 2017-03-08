package Excercise3;

import becker.robots.*;
import java.awt.Color;

public class MovRob {

    private City Hola;
    private Robot h;
    private Thing x;

    public MovRob() {

        this.Hola = new City(21, 21);

        this.h = new Robot(Hola, 6, 1, Direction.NORTH, 11);
    }

    public void otro(int i) {
        this.h = new Robot(Hola, 6, i, Direction.NORTH, 12);
    }

    public void RobotH() {
        for (int i = 1; i < 6; i++) {
            h.move();
            h.putThing();
        }
        for (int i = 0; i < 3; i++) {
            h.turnLeft();
        }
        h.move();
        for (int i = 0; i < 3; i++) {
            h.turnLeft();
        }
        for (int i = 1; i < 5; i++) {
            h.move();
            if (i == 2) {
                h.putThing();
            }
        }
        h.turnLeft();
        h.move();
        h.putThing();
        h.turnLeft();
        for (int i = 1; i < 5; i++) {
            h.move();
            h.putThing();
        }
        h.move();
        h.setColor(Color.black);
    }

    public void RobotE() {
        for (int i = 1; i < 6; i++) {
            h.move();
            h.putThing();
        }
        for (int i = 0; i < 3; i++) {
            h.turnLeft();
        }
        h.move();
        h.putThing();
        for (int i = 0; i < 3; i++) {
            h.turnLeft();
        }
        for (int i = 1; i < 5; i++) {
            h.move();
            if (i == 2 || i == 4) {
                h.putThing();
            }
        }
        h.turnLeft();
        h.move();
        h.putThing();
        h.turnLeft();
        for (int i = 1; i < 6; i++) {
            h.move();
            if (i == 2 || i == 4) {
                h.putThing();
            }
        }
        h.setColor(Color.black);
    }

    public void RobotL() {
        for (int i = 1; i < 6; i++) {
            h.move();
            h.putThing();
        }
        for (int i = 0; i < 3; i++) {
            h.turnLeft();
        }
        h.move();
        for (int i = 0; i < 3; i++) {
            h.turnLeft();
        }
        for (int i = 1; i < 5; i++) {
            h.move();
            if (i == 4) {
                h.putThing();
            }
        }
        h.turnLeft();
        h.move();
        h.putThing();
        h.turnLeft();
        for (int i = 1; i < 6; i++) {
            h.move();
        }
        h.setColor(Color.black);
    }

    public void RobotO() {
        for (int i = 1; i < 6; i++) {
            h.move();
            h.putThing();
        }
        for (int i = 0; i < 3; i++) {
            h.turnLeft();
        }
        h.move();
        h.putThing();
        for (int i = 0; i < 3; i++) {
            h.turnLeft();
        }
        for (int i = 1; i < 5; i++) {
            h.move();
        }
        h.putThing();
        h.turnLeft();
        h.move();
        h.putThing();
        h.turnLeft();
        for (int i = 1; i < 5; i++) {
            h.move();
            h.putThing();
        }
        h.move();
        h.setColor(Color.black);
    }

    public static void main(String[] args) {
        MovRob x = new MovRob();
        x.RobotH();
        x.otro(5);
        x.RobotE();
        x.otro(9);
        x.RobotL();
        x.otro(13);
        x.RobotL();
        x.otro(17);
        x.RobotO();
    }
}