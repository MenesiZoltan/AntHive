package com.codecool.anthive.ant;

public class Drone extends Ant {

    private boolean mating = false;
    private int matingCounter = 0;

    public Drone() {
        setStartingPosition();
        stepsFromQueen();

    }

    private void kickAway() {
        setStartingPosition();
        /*Will randomize 100 unit distance, now re-sets a new starting position*/
    }


    @Override
    public void stepOne() {
        if (getDistanceFromQueen() != 1) {
            if (getxCoordinate() > 0) {
                setxCoordinate(-1);
            } else if (getxCoordinate() < 0) {
                setxCoordinate(1);
            } else if (getyCoordinate() > 0) {
                setyCoordinate(-1);
            } else if (getyCoordinate() < 0) {
                setyCoordinate(1);
            }
        } else {
            mating = true;
            matingCounter += 1;
            System.out.println("OOH YOU TOUCH MY TRALLALAAH");
        }
        if (matingCounter > 9) {
            mating = false;
            matingCounter = 0;
            kickAway();
            System.out.println("DOOH");
        }
        stepsFromQueen();
    }
}
