package com.tudor.computer;

/**
 * Created by andrei on 31.03.2016.
 */
public abstract class Computer {
    private String cpu;
    private int cores;
    public static String keyboard="qwerty";

    public Computer(String cpu, int cores) {
        this.cpu = cpu;
        this.cores = cores;
    }

    public Computer(String cpu) {
        this.cpu = cpu;
    }

    public void start(){
        System.out.println("Computer is on.");
    }

    public abstract void shutDown();

    public static void getVoltage(){
        System.out.println("12V");
    }
}
