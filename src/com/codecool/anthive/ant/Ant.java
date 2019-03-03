package com.codecool.anthive.ant;

import java.util.Random;

import static java.lang.StrictMath.abs;

abstract class Ant {
    /*This is an abstract class, as all creatures in the hives will be ANTS (except the hornet)*/
    /*all 4 ant types are subclasses of this.*/

    static final int MAXDISTANCEFROMQUEEN = 100;
    private int distanceFromQueen;
    private int xCoordinate;
    private int yCoordinate;

    abstract void stepOne();

    protected void setStartingPosition() {
        Random rand = new Random();
        int posOrNeg = rand.nextInt(2);

        if (posOrNeg == 1) {
            this.xCoordinate = rand.nextInt(MAXDISTANCEFROMQUEEN + 1);
        } else {
            this.xCoordinate = rand.nextInt(MAXDISTANCEFROMQUEEN +1);
            this.xCoordinate = -1 * xCoordinate;
        }

        posOrNeg = rand.nextInt(1);
        if (posOrNeg == 1) {
            this.yCoordinate = rand.nextInt(MAXDISTANCEFROMQUEEN + 1);
        } else {
            this.yCoordinate = rand.nextInt(MAXDISTANCEFROMQUEEN +1);
            this.yCoordinate = -1 * yCoordinate;
        }

    }

    protected void stepsFromQueen() {
        this.distanceFromQueen = abs(xCoordinate) + abs(yCoordinate);
    }

    protected int getxCoordinate() {
        return xCoordinate;
    }

    protected int getyCoordinate() {
        return yCoordinate;
    }

    protected void setxCoordinate(int step) {
        this.xCoordinate += step;
    }

    protected void setyCoordinate(int step) {
        this.yCoordinate += step;
    }

    public void testPrint() {
        System.out.println("Starting position");
        System.out.println(xCoordinate);
        System.out.println(yCoordinate);
        System.out.println("Distance from ORIGO");
        System.out.println(distanceFromQueen);
        System.out.println("");
    }

    protected int getDistanceFromQueen() {
        return distanceFromQueen;
    }



}
