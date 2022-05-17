package com.company;

public class MilitaryShape extends Shape{
    private String name;

    public MilitaryShape(String name) {
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
        System.out.println("Я одену "+name+" в поход\n");
    }
}
