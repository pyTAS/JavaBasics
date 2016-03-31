package com.tudor.computer;

/**
 * Created by andrei on 31.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Computer c1 = new Laptop("quad", 4, 13, 320);
        Computer c2 = new Smartphone("octa", 8, "android", "nokia");
        c2.shutDown();
        Computer.getVoltage();
        System.out.println(Computer.keyboard);
    }
}
