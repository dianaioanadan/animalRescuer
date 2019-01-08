package org.fasttrackit;

public class Game {
    Adopter adopter;
    Animal dog;
    Veterinary veterinarian;

    public Game(Animal dog) {
        this.dog = dog;
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Animal getDog() {
        return dog;
    }

    public void setDog(Animal dog) {
        this.dog = dog;
    }

    public Veterinary getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinary veterinarian) {
        this.veterinarian = veterinarian;
    }
}
