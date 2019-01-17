package org.fasttrackit;

import java.util.Currency;

public class Adopter extends Person{

    int moneyAvailable;
    boolean courtYard;

    public void feed(Animal animal, AnimalFood animalFood){

        System.out.println(name + " just gave some " + animalFood.name + " to " + animal.name);

        animal.hungryLvl=animal.hungryLvl - 1;

        System.out.println("The new hungry level is: " +animal.hungryLvl);

    }

    public void play (Animal animal, RecreationalActivity recreationalActivity){

        System.out.println(name + " play " + recreationalActivity.name + " with " + animal.name);

        animal.moodLvl = animal.moodLvl + 1;

        System.out.println("The new mood level is: " +animal.moodLvl);
    }

    public int getMoneyAvailable() {
        return moneyAvailable;
    }

    public void setMoneyAvailable(int moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }

    public boolean isCourtYard() {
        return courtYard;
    }

    public void setCourtYard(boolean courtYard) {
        this.courtYard = courtYard;
    }
}
