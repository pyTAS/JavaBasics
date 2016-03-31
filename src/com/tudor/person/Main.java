package com.tudor.person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Tudor");
        person.printName();
        String modifiedName = person.getName() + " Stefan";
        person.setName(modifiedName);
        person.printName();

        List<Person> peopleAtUTCN = new ArrayList<Person>();

        peopleAtUTCN.add(new Student("George", "Computer Science"));
        peopleAtUTCN.add(new Student("Alex", "Automation"));
        peopleAtUTCN.add(new Professor("Mihaela", "Software Engineering"));

        System.out.println("People at UTCN, present yourself!");

        for(int i = 0; i < peopleAtUTCN.size(); i++) {
            peopleAtUTCN.get(i).printName();
        }
    }
}
