package com.codecool.anthive;

import com.codecool.anthive.ant.Drone;
import com.codecool.anthive.ant.Queen;
import com.codecool.anthive.ant.Soldier;
import com.codecool.anthive.ant.Worker;
import com.codecool.anthive.hornet.Hornet;

import java.util.ArrayList;

public class Hive {

    private ArrayList<Worker> workers = new ArrayList();
    private ArrayList<Drone> drones = new ArrayList();
    private ArrayList<Soldier> soldiers = new ArrayList();
    private Queen queen = new Queen();
    private Hornet hornet;
    private boolean hornetPresent = false;


    public Hive() {
        for (int e = 0; e < 10; e++) {
            Worker worker = new Worker();
            workers.add(worker);
        }

        for (int e = 0; e < 5; e++) {
            Soldier soldier = new Soldier();
            soldiers.add(soldier);
        }

        for (int e = 0; e < 10; e++) {
            Drone drone = new Drone();
            drones.add(drone);
        }

    }

    public void startStepCycle() {
        queen.stepOne();
        for (Drone drone : drones) {
            drone.stepOne();
        }

        for (Worker worker : workers) {
            worker.stepOne();
        }

    }

}
