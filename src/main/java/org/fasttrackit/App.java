package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        RecreationalActivity recreationalActivity = new RecreationalActivity();
        recreationalActivity.name = "Frisby";

        AnimalFood animalFood1 = new AnimalFood();
        animalFood1.name = "Friskies";
        animalFood1.price = 10; //price/kilo
        animalFood1.amount = 10;
        animalFood1.expirationDate.setTime(10/10/2020);
        animalFood1.inStoc = true;

        Animal firstAnimal = new Animal();
        firstAnimal.name = "Lucky";
        firstAnimal.age = 15; //numar de luni
        firstAnimal.healthyLvl=10;// foarte sanatos
        firstAnimal.hungryLvl=1; // nu ii e deloc foame
        firstAnimal.moodLvl=10; // foarte fericit
        firstAnimal.favoriteFoodName = animalFood1;
        firstAnimal.favoriteRecreationalActivity= recreationalActivity ;

        Adopter fistAdopter = new Adopter();
        fistAdopter.name = "Dorina";
        fistAdopter.moneyAvailable = 2500;


        Veterinarian veterinarian1 = new Veterinarian();
        veterinarian1.name = "Sibisan";
        veterinarian1.specialization = "parasitology";

    }
}