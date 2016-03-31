package com.tudor.computer;

/**
 * Created by andrei on 31.03.2016.
 */
public class Laptop extends Computer {
    private int screen;
    private int storage;

    public Laptop(String cpu, int cores, int screen, int storage) {
        super(cpu, cores);
        this.screen = screen;
        this.storage = storage;
    }

    public void develop(){
        System.out.println("You can develop on a laptop.");
    }

    public void shutDown(){
        System.out.println("Shutdown");
    }


}
