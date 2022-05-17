package com.company;

public class FestiveShape extends Shape{
    private String name;

    public FestiveShape(String name) {
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
        System.out.println("Я одену "+name+" на праздник\n");
    }
}
