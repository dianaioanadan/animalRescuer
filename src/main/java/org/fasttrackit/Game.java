package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {
    Adopter adopter;
    Animal dog;
    Veterinary veterinarian;

    private List<AnimalFood> availableFood = new ArrayList<>();
    private RecreationalActivity[] availableActivities = new RecreationalActivity[10];

    private void initAnimal() {
        dog = new Dog("Lady");
        dog.setName(nameAnimal());
        dog.setAgeInMonths(5);
        dog.setHealthyLvl(5); //average
        dog.setHungryLvl(5); //average
        dog.setMoodLvl(5); //average
        dog.setFavoriteFoodName("Darling");
        dog.setFavoriteRecreationalActivity("Running");
        dog.friendlyLvl = 5;//average
        dog.loveKids = true;
    }

    private void initAdopter() {

        try {
            System.out.println("Hi! Please insert your name: ");
            Scanner keyboard = new Scanner(System.in);
            String name = keyboard.nextLine();
            if (name == null || name.length() < 2) {
                throw new NullPointerException();
            } else {
                adopter = new Adopter();
                adopter.setName(name);
            }
        } catch (NullPointerException e) {
            System.out.println("Please insert a valid name!");
            initAdopter();
        }
    }

    private void requiredFeed() {
        AnimalFood animalFood = new AnimalFood();
        Scanner keyboard = new Scanner(System.in);
        displayAvailableFood();
        System.out.println("Please insert used food: ");
        String name = keyboard.nextLine();
        animalFood.setName(name);
        System.out.println("Used food is: " + animalFood.name);
        adopter.feed(dog, animalFood);

    }

    private void requiredPlay() {
        RecreationalActivity recreationalActivity = new RecreationalActivity();
        Scanner keyboard = new Scanner(System.in);
        displayAvailableActivities();
        System.out.println("Please insert what game you play: ");
        String name = keyboard.nextLine();
        recreationalActivity.setName(name);
        System.out.println("You are playing:" + recreationalActivity.name);
        adopter.play(dog, recreationalActivity);
    }

    private String nameAnimal() {
        Scanner keyboard = new Scanner(System.in);
        String name;
        System.out.println("Insert the name of the rescued animal: ");
        name = keyboard.nextLine();
        return name;
    }


    public void initFood() {
        AnimalFood animalFood = new AnimalFood("Purina");
        AnimalFood animalFood1 = new AnimalFood("Pedigree");
        AnimalFood animalFood2 = new AnimalFood("Chappi");
        availableFood.add(animalFood);
        availableFood.add(animalFood1);
        availableFood.add(animalFood2);
    }

    public void displayAvailableFood() {
        System.out.println("Available food are: ");
//            for (int i = 0; i < availableFood.size(); i++) {
//                if (availableFood.get(i) != null) {
//                    System.out.println(availableFood.get(i).getName());
//                }
//            }
        for (AnimalFood food : availableFood) {
            if (availableFood != null) {
                System.out.println(food.getName());
            }
        }
    }


    private void initActivities(int index, RecreationalActivity recreationalActivity) {
        availableActivities[index] = recreationalActivity;
    }

    private void displayAvailableActivities() {
        System.out.println("Available activities are: ");
//        for ( RecreationalActivity activity: availableActivities){
//            if (availableActivities != null){
//                System.out.println(activity.getName());
//            }
//        }

        for (int i = 0; i < availableActivities.length; i++) {
            if (availableActivities[i] != null) {
                System.out.println(availableActivities[i].getName());
            }
        }
    }

    public void start() {
        initActivities(0, new RecreationalActivity("Swimming"));
        initActivities(1, new RecreationalActivity("Running"));

        initFood();

        initAnimal();

        System.out.println("Name of the rescued animal is: " + dog.name);
        System.out.println(dog.name + " have " + dog.getAgeInMonths() + " months old");
        System.out.println(dog.name + " have " + dog.getHealthyLvl() + " healthy level");
        System.out.println(dog.name + " have " + dog.getHungryLvl() + " hungry level");
        System.out.println(dog.name + " have " + dog.getMoodLvl() + " mood level");
        System.out.println(dog.name + " loves " + dog.getFavoriteFoodName() + " food");
        System.out.println(dog.name + " loves to play " + dog.getFavoriteRecreationalActivity());

        initAdopter();

        System.out.println("Hi, " + adopter.name);

//        requiredPlay();
//        requiredFeed();

        int maxNoRoundsToPlay = 3;

        for (int i = 0; i < maxNoRoundsToPlay; i++) {
            requiredFeed();
            requiredPlay();
        }

        if ((dog.moodLvl <= 10) && (dog.getHungryLvl() <= 10)) {
            System.out.println(adopter.name + " you are denied as adopter!");
        } else {
            System.out.println(adopter.name + " you are accepted as adopter");
        }
    }

    public Game(Animal dog) {
        this.dog = dog;
    }

//    public Adopter getAdopter() {
//        return adopter;
//    }
//
//    public void setAdopter(Adopter adopter) {
//        this.adopter = adopter;
//    }

//    public Animal getDog() {
//        return dog;
//    }
//
//    public void setDog(Animal dog) {
//        this.dog = dog;
//    }

//    public Veterinary getVeterinarian() {
//        return veterinarian;
//    }
//
//    public void setVeterinarian(Veterinary veterinarian) {
//        this.veterinarian = veterinarian;
//    }
}
