package com.codecool.anthive.ant;

import static com.codecool.anthive.ant.Queen.single_instance;

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
        boolean queenWantsToMate = single_instance.getMatingSeason();
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
        } else if (getDistanceFromQueen() == 1 && queenWantsToMate && !this.mating && !single_instance.getMating()){
            System.out.println("OOH YOU TOUCH MY TRALLALAAH");
            single_instance.setMating(true);
            this.mating = true;
            this.matingCounter += 1;
        } else if (this.mating && single_instance.getMating()) {
            System.out.println("OOH YOU TOUCH MY TRALLALAAH");
            this.matingCounter += 1;
            if (matingCounter > 9 && mating) {
                mating = false;
                matingCounter = 0;
                kickAway();
                single_instance.setMating(false);
                single_instance.setMatingSeason(false);
                System.out.println("DOOH");
            }
        } else {
            System.out.println("DOOH");
            kickAway();
        }
        stepsFromQueen();
    }
}
