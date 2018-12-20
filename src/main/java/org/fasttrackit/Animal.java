package org.fasttrackit;

public class Animal {
    String name;
    int ageInMonths;
    int healthyLvl;
    int hungryLvl;
    int moodLvl;
    AnimalFood favoriteFoodName;
    RecreationalActivity favoriteRecreationalActivity;
    int friendlyLvl;
    boolean loveKids;

    public Animal(String name) {
        this.name = name;
    }
}
