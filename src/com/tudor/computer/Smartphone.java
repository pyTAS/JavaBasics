package com.tudor.computer;

/**
 * Created by andrei on 31.03.2016.
 */
public class Smartphone extends Computer implements Phone {
    private String os;
    private String brand;

    public Smartphone(String cpu, int cores, String os, String brand) {
        super(cpu, cores);
        this.os = os;
        this.brand = brand;

    }

    public void takePhoto(){
        System.out.println("You can take photos with a smartphone");
    }

    public void shutDown(){
        System.out.println("Shutdown smartphone");
    }

    public void takePhoto(String resolution){
        System.out.println("The resolution is " + resolution);
    }

    public void takePhoto(int burst){
        System.out.println("The number of burst pictures is: " + burst);
    }

    public void takeCall(){
        System.out.println("Receive a phone call");
    }

    public void sendSMS(){
        System.out.println("Send a SMS");
    }
}
