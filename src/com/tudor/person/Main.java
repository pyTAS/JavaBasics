package com.tudor.person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Tudor");
        person.printName();
        String modifiedName = person.getName() + " Stefan";
        person.setName(modifiedName);
        person.printName();
    }
}
