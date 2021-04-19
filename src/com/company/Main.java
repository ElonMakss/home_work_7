package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Magic mag = new Magic();
        Warrior warrior = new Warrior();
        Medic medic = new Medic();

        mag.health = 200;
        mag.strike = 100;

        warrior.health = 100;
        warrior.strike = 321;


        medic.health = 98;
        medic.strike = 30;


        Hero[] heroes = {mag, warrior, medic};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            System.out.println(heroes[i].getHealth());

        }
    }
}
