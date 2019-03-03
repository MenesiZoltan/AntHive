package com.codecool.anthive.ant;


import java.util.Random;

import static java.lang.StrictMath.abs;


public class Worker extends Ant{

    public Worker() {
        setStartingPosition();
        stepsFromQueen();
    }

    @Override
    public void stepOne() {
        if (abs(getxCoordinate()) != MAXDISTANCEFROMQUEEN && abs(getyCoordinate()) != MAXDISTANCEFROMQUEEN) {
            Random rand = new Random();
            int direction = rand.nextInt(4);
            if (direction == 0) {
                setxCoordinate(1);
            } else if ( direction == 1) {
                setxCoordinate(-1);
            } else if (direction == 2) {
                setyCoordinate(1);
            } else if (direction == 3) {
                setyCoordinate(-1);
            }
        } else if (getxCoordinate() == MAXDISTANCEFROMQUEEN) {
            setxCoordinate(-1);
        } else if (getyCoordinate() == MAXDISTANCEFROMQUEEN) {
            setyCoordinate(-1);
        } else if (getxCoordinate() == (MAXDISTANCEFROMQUEEN) * -1) {
            setxCoordinate(1);
        } else if (getyCoordinate() == (MAXDISTANCEFROMQUEEN) * -1) {
            setyCoordinate(1);
        }
        stepsFromQueen();
    }
}
