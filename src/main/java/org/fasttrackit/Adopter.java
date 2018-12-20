package org.fasttrackit;

import java.util.Currency;

public class Adopter extends Person{

    int moneyAvailable;
    boolean courtYard;

    public void feed(Animal animal, AnimalFood animalFood){

        System.out.println(name + " just gave some " + animalFood.name + " to " + animal.name);
    }

    public void play (Animal animal, RecreationalActivity recreationalActivity){

        System.out.println(name + " play " + recreationalActivity.name + " with " + animal.name);
    }
}
