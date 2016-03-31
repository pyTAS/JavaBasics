package com.tudor.person;

public class Professor extends Person {

    private String courseTaught;

    public Professor(String name, String courseTaught) {
        super(name);
        this.courseTaught = courseTaught;
    }

    public String getCourseTaught() {
        return courseTaught;
    }

    public void setCourseTaught(String courseTaught) {
        this.courseTaught = courseTaught;
    }
}
