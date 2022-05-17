package com.company;

public class EverydayShape extends Shape{
    private String name;

    public EverydayShape(String name) {
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
        System.out.println("Я одену "+name+" на прогулку\n");
    }
}
