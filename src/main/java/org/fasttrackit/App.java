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
        animalFood1.setPrice(10); //price/kilo
        animalFood1.setAmount(10);
        animalFood1.setExpirationDate(LocalDate.of(2020,10,10));
        animalFood1.setInStoc(true);

        System.out.println(animalFood1.name);
        System.out.println(animalFood1.price);
        System.out.println(animalFood1.amount);
        System.out.println(animalFood1.expirationDate);
        System.out.println(animalFood1.inStoc);

        Animal firstAnimal = new Animal("Lucky");
        firstAnimal.setAgeInMonths(15);
        firstAnimal.setHealthyLvl(10);// foarte sanatos
        firstAnimal.setHungryLvl(1); // nu ii e deloc foame
        firstAnimal.setMoodLvl(10); // foarte fericit
        firstAnimal.setFavoriteFoodName(animalFood1);
        firstAnimal.setFavoriteRecreationalActivity(recreationalActivity);

        System.out.println(firstAnimal.name);
        System.out.println(firstAnimal.ageInMonths);
        System.out.println(firstAnimal.healthyLvl);
        System.out.println(firstAnimal.hungryLvl);
        System.out.println(firstAnimal.moodLvl);
        System.out.println(firstAnimal.favoriteFoodName);
        System.out.println(firstAnimal.favoriteRecreationalActivity);

        Adopter fistAdopter = new Adopter();
        fistAdopter.setName("Dorina");
        fistAdopter.setMoneyAvailable(2500);
        fistAdopter.feed(firstAnimal,animalFood1);
        fistAdopter.play(firstAnimal,recreationalActivity);

        System.out.println(fistAdopter.name);
        System.out.println(fistAdopter.moneyAvailable);

        Veterinary veterinary1 = new Veterinary("Sibisan");
        veterinary1.setSpecialization("parasitology");

        System.out.println(veterinary1.name);
        System.out.println(veterinary1.specialization);


        Dog fistDog = new Dog("Lucky");
        fistDog.moodSpirit(fistDog.getName()," is happy and shake his tail");

        Cat fistCat = new Cat("Suzy");
        fistCat.moodSpirit(fistCat.getName()," is sleeping and purrs");
    }
}