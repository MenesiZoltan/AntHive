package com.codecool.anthive.ant;

import java.util.Random;

public class Queen extends Ant{

    private boolean mating = false;
    private boolean matingSeason = false;
    static Queen single_instance = null;

    public Queen() {
        single_instance = this;
        setStartingPosition(0, 0);
    }


    protected void setMatingSeason(boolean action) {
        this.matingSeason = action;
    }

    private void wantToMate() {
        Random rand = new Random();
        int chance = rand.nextInt(100);
        if (chance < 5 && !mating) {
            matingSeason = true;
        }
    }

    protected boolean getMating() {
        return mating;
    }

    protected void setMating(boolean action) {
        mating = action;
    }

    protected boolean getMatingSeason() {
        return matingSeason;
    }


    @Override
    public void stepOne() {
        wantToMate();
        if (mating) {
            System.out.println("come and get me");
            setMatingSeason(true);
        }


    }
}
