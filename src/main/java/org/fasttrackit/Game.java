package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Adopter adopter;
    Animal dog;
    Veterinary veterinarian;

    private List<AnimalFood> availableFood = new ArrayList<>();
    private RecreationalActivity[] availableActivities = new RecreationalActivity[10];

    public void initFood(AnimalFood animalFood) {
        availableFood.add(animalFood);
    }

    public  void  displayAvailableFood() {
        System.out.println("Available food are: ");
//            for (int i = 0; i < availableFood.size(); i++) {
//                if (availableFood.get(i) != null) {
//                    System.out.println(availableFood.get(i).getName());
//                }
//            }
        for ( AnimalFood food: availableFood){
            if (availableFood != null){
                System.out.println(food.getName());
           }
      }
    }


    private void initActivities (int index, RecreationalActivity recreationalActivity){
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

    public void start(){
        initActivities(0, new RecreationalActivity("Swimming"));
        initActivities(1, new RecreationalActivity("Running"));

        displayAvailableActivities();

        initFood(new AnimalFood("Purina"));
        initFood(new AnimalFood("Pedigree"));
        initFood(new AnimalFood("Chappi"));

        displayAvailableFood();
    }

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
