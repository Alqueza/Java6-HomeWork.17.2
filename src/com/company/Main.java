package com.company;

public class Main {

    public static void main(String[] args) {
        WorkingShape workingShape = new WorkingShape("рабочую форму");
        workingShape.Shape();

        EverydayShape everydayShape = new EverydayShape("спортивку");
        everydayShape.Shape();

        FestiveShape festiveShape = new FestiveShape("праздничную форму");
        festiveShape.Shape();

        MilitaryShape militaryShape = new MilitaryShape("военную форму");
        militaryShape.Shape();

        OfficialShape officialShape = new OfficialShape("оффициальную форму");
        officialShape.Shape();
    }
}
