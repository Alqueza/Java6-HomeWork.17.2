package com.company;

public class WorkingShape extends Shape{
    private String name;

    public WorkingShape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Shape() {
        System.out.println("Я одену "+name+" на работу\n");
    }
}
