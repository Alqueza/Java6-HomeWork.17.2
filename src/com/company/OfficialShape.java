package com.company;

public class OfficialShape extends Shape{
    private String name;

    public OfficialShape(String name) {
        this.name = name;
    }

    public OfficialShape() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Shape() {
        System.out.println("Я одену "+name+" на собеседование");
    }
}
