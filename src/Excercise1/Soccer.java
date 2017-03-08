package Excercise1;

import becker.robots.*;


public class Soccer {

    private Robot joe;
    private City unal;
    private Thing balon;

    public Soccer() {
        this.unal = new City(10, 10);
        this.balon = new Thing(this.unal, 9, 9);
        this.joe = new Robot(unal, 9, 9, Direction.WEST);
    }

    public void advance() {
        for (int i = 0; i < 2; i++) {
            joe.pickThing();
            joe.move();
            joe.putThing();

        }
    }

    public void advanceleft() {
        joe.turnLeft();
        joe.pickThing();
        joe.move();
        joe.putThing();
        for (int i = 0; i < 3; i++) {

            joe.turnLeft();
        }
        this.advance();
    }

    public void advanceright() {
        this.advance();
        for (int i = 0; i < 3; i++) {
            joe.turnLeft();
        }
        joe.pickThing();
        joe.move();
        joe.putThing();
        joe.turnLeft();

    }

}