package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        RecreationalActivity recreationalActivity = new RecreationalActivity("Frisby");

        System.out.println(recreationalActivity.name);

        AnimalFood animalFood1 = new AnimalFood("Friskies");
        animalFood1.price = 10; //price/kilo
        animalFood1.amount = 10;
        animalFood1.expirationDate = LocalDate.of(2020,10,10);
        animalFood1.inStoc = true;

        System.out.println(animalFood1.name);
        System.out.println(animalFood1.price);
        System.out.println(animalFood1.amount);
        System.out.println(animalFood1.expirationDate);
        System.out.println(animalFood1.inStoc);

        Animal firstAnimal = new Animal("Lucky");
        firstAnimal.ageInMonths = 15;
        firstAnimal.healthyLvl=10;// foarte sanatos
        firstAnimal.hungryLvl=1; // nu ii e deloc foame
        firstAnimal.moodLvl=10; // foarte fericit
        firstAnimal.favoriteFoodName = animalFood1;
        firstAnimal.favoriteRecreationalActivity= recreationalActivity;

        System.out.println(firstAnimal.name);
        System.out.println(firstAnimal.ageInMonths);
        System.out.println(firstAnimal.healthyLvl);
        System.out.println(firstAnimal.hungryLvl);
        System.out.println(firstAnimal.moodLvl);
        System.out.println(firstAnimal.favoriteFoodName);
        System.out.println(firstAnimal.favoriteRecreationalActivity);

        Adopter fistAdopter = new Adopter();
        fistAdopter.name = "Dorina";
        fistAdopter.moneyAvailable = 2500;

        System.out.println(fistAdopter.name);
        System.out.println(fistAdopter.moneyAvailable);

        Veterinarian veterinarian1 = new Veterinarian();
        veterinarian1.name = "Sibisan";
        veterinarian1.specialization = "parasitology";

        System.out.println(veterinarian1.name);
        System.out.println(veterinarian1.specialization);
    }
}