package org.fasttrackit;

public class Game {
    Adopter adopter;
    Animal dog;
    Veterinarian veterinarian;

    public Game(Animal dog) {
        this.dog = dog;
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }
}
